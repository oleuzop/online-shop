package oleuzop.services.transaction.model;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class Transaction {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;

	@Column(name = "customerId", nullable = false)
	private Long customerId;

	@Column(name = "productId", nullable = false)
	private Long productId;

	@Column(name = "price", nullable = false)
	private Float price;

	public Transaction() {
	}
	
	public Transaction(Long customerId, Long productId, Float price) {
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
		return "Transaction [id=" + id + ", customerId=" + customerId + ", productId=" + productId + "]";
	}

}
