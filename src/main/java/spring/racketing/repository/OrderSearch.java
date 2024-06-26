package spring.racketing.repository;


import lombok.Data;
import spring.racketing.domain.OrderStatus;

@Data
public class OrderSearch {

    private String memberName;

    private String tennisPlaceName;

    private OrderStatus orderStatus;

}
