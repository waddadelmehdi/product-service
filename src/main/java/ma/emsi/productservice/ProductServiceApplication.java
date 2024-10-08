package ma.emsi.productservice;

import ma.emsi.productservice.entities.Product;
import ma.emsi.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ma.emsi.productservice.repositories")
public class ProductServiceApplication implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null,"MacBook Pro",12000.0));
        productRepository.save(new Product(null,"Lenovo X1",14000.0));
        productRepository.save(new Product(null,"Iphone 16",12000.0));
    }
}
