package oleuzop.services.transaction.dto;

public class ProductDto {

	private long id;
	private String name;
	private float price;
	private String photo;

	public ProductDto() {
		
	}

	public ProductDto(Long id, String name, Float price, String photo) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.photo = photo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
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
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
