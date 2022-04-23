package utm.edu.ec.practica1.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
@Builder
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

}
