package oleuzop.services.product.configuration;

import oleuzop.services.product.controller._Controller;
import oleuzop.services.product.model._Model;
import oleuzop.services.product.repository._Repository;
import oleuzop.services.product.service._Service;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EntityScan(basePackageClasses = _Model.class)
@ComponentScan(basePackageClasses = {_Service.class, _Controller.class})
@EnableJpaRepositories(basePackageClasses = _Repository.class)
@Configuration
public class BootConfig {
}
