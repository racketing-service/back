package spring.racketing.domain;


import jakarta.persistence.*;
import lombok.Data;
import racketshare.racketing.domain.item.Item;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Data
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;


    // item의 아이디와 다대일 관계
    // X to One관계에서는 lazy로딩
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    // item의 아이디와 다대일 관계
    // X to One관계에서는 lazy로딩
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;

    private int count;
}
