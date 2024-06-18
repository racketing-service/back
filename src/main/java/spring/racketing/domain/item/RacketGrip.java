package spring.racketing.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("G")
public class RacketGrip extends Item{

    private String Colors;

    private String Brand;

    private String Description;
}
