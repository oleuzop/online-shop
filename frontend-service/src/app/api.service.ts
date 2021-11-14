import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { Product } from './models/product';

@Injectable({
providedIn: 'root'
})
export class ApiService {


  constructor(private httpClient: HttpClient) {}

	public getProducts(){
		return this.httpClient.get("http://localhost:8060/product/" );
	}

	public getTransactions(){
		return this.httpClient.get("http://localhost:8060/transaction/");
	}

	public createTransaction(product: Product){
		return this.httpClient.post("http://localhost:8060/transaction/", product );
	}

}
