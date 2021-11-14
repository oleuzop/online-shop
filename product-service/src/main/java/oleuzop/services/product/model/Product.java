package oleuzop.services.product.model;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "price", nullable = false)
	private Float price;

	@Column(name = "photo", nullable = false)
	private String photo;

	public Product() {
	}

	public Product(String name, Float price, String photo) {
		super();
		this.name = name;
		this.price = price;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", photo=" + photo + "]";
	}

}
