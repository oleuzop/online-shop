package oleuzop.services.customer.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "name", nullable = false, length = 64)
	private String name;

	@Column(name = "lastname", nullable = false, length = 128)
	private String lastname;

	public Customer() {
	}
	
	public Customer(String username, String name, String lastname) {
		this.username = username;
		this.name = name;
		this.lastname = lastname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username  + ", name=" + name + ", lastname=" + lastname + "]";
	}

}
