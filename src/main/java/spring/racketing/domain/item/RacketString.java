package spring.racketing.domain.item;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("S")
public class RacketString extends Item{

    private String Brand;

    private String Colors;

    private String Description;
}
