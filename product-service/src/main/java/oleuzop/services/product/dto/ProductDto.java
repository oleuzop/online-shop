package oleuzop.services.product.dto;

public class ProductDto {

	private Long id;
	private String name;
	private Float price;
	private String photo;

	public ProductDto() {
	}
	
	public ProductDto(Long id, String name, Float price, String photo) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.photo = photo;
	}

	public Long getId() { return id; }

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
