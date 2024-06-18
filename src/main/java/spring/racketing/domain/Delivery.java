package spring.racketing.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;


    //order와 1:1 매핑
    private Order order;


    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
