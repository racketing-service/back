package spring.racketing.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "orders")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;


    //연관 관계 member의 id와 연관
    // X to One 관계의 연관관계 주인 / Lazy로딩 사용
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "order", cascade = ALL)
    private List<OrderItem> orderItems = new ArrayList<>();


    //연관 관계 tennis_place의 id와 연관
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "tennis_place_id")
    private TennisPlace tennisPlace;

    private LocalDateTime orderDate;

    private Enum OrderStatus;


    @OneToOne(fetch = LAZY)
    private Delivery delivery;



}
