package oleuzop.services.transaction.dto;

public class TransactionDto {

	private Long id;
	private Long customerId;
	private Long productId;
	private Float price;

	public TransactionDto() {
	}

	public TransactionDto(Long id, Long customerId, Long productId, Float price) {
		this.id = id;
		this.customerId = customerId;
		this.productId = productId;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", customerId=" + customerId + ", productId=" + productId + ", price=" + price + "]";
	}

}
