package utm.edu.ec.practica1.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  UUID id;

    @ManyToOne
    private  Customer cliente;
    @OneToMany
    private List<Product> producto;
    private Integer cantidad;
    private Double total;
    private Date fecha;
}