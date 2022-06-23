package si.amine.jpa_entity_mappings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import si.amine.jpa_entity_mappings.entities.Customer;
import si.amine.jpa_entity_mappings.entities.Item;
import si.amine.jpa_entity_mappings.repository.CustomerRepository;
import si.amine.jpa_entity_mappings.repository.ItemRepository;

@SpringBootApplication
public class JpaEntityMappingsApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaEntityMappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer = new Customer("Toom");

		Item item = new Item("item1");

		customer.setItem(item);

		customerRepository.save(customer);
	}
}
