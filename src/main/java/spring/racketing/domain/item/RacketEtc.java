package spring.racketing.domain.item;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("E")
public class RacketEtc extends Item {

    private String Brand;
    private String Description;
}
