package utm.edu.ec.practica1.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;
    private String lastname;
    private String phone;
    private String email;
    private String address;
}
