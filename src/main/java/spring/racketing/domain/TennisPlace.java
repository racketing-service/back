package spring.racketing.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class TennisPlace {

    @Id
    @GeneratedValue
    @Column(name = "tennis_place_id")
    private Long id;

    private String name;

    @Embedded
    private Address placeAddress;

    @OneToMany(mappedBy = "tennisplace")
    private List<Order> orders = new ArrayList<>();

}
