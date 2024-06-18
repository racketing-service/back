package spring.racketing.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;


    private String password;

    private String name;

    private String nickName;

    @Embedded
    private Address address;

    @Email
    private String email;

    private LocalDateTime createAt;

    private Enum permissionLevel;

    private Enum loginType;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();


}
