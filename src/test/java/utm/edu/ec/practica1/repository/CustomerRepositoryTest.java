package utm.edu.ec.practica1.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.practica1.entity.Customer;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired ICustomerRepository customerRepository;

    @Test
    public void shouldCreateUser() {
        Customer customerToSave = Customer.builder()
                .name("Name").address("Address")
                .email("email@email.com").phone("052000000")
                .build();

        customerRepository.save(customerToSave);

        Optional<Customer> customerSaved = customerRepository.findById(customerToSave.getId());
        Assertions.assertEquals(customerSaved.get().getName(), customerToSave.getName(),
                "Created customer name is not the same");
    }
}
