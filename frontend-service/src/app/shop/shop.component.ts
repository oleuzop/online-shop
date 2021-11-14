import { Component, OnInit, ViewChild } from '@angular/core';
import { ApiService } from '../api.service';

import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { MatButtonModule } from '@angular/material/button';

import { Product } from '../models/product';

@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.css']
})

export class ShopComponent implements OnInit {

  displayedColumns: string[] = ['id', 'name', 'price', 'photo', 'buy'];
  products = new MatTableDataSource<any>();
  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;

  constructor(private apiService: ApiService) {}

  ngOnInit() {
    this.apiService.getProducts().subscribe((data: any)=>{
      console.log(data);
      this.products.data = data;
      this.products.paginator = this.paginator;
    })
  }

  onBuy(product: Product) {
    this.apiService.createTransaction(product).subscribe((data: any)=>{
      console.log(data);
    })
  }
}
