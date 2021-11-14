package oleuzop.services.customer;

import oleuzop.services.customer.configuration.BootConfig;
import oleuzop.services.customer.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import oleuzop.services.customer.repository.CustomerRepository;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class CustomerApplication {

	public static void main(String[] args) { SpringApplication.run(CustomerApplication.class, args); }

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage("oleuzop.services.customer.controller"))
					.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Customer API").description("Documentation Customer API v1.0").build());
	}
	
}
