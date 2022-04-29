package utm.edu.ec.practica1.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity

public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID idProvider;
    private UUID idProduct;
    private String Description;
    private String NFact;
    private String amount;
    private String total;
    @OneToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
