package spring.racketing.controller;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MemberForm {

    @NotEmpty
    private String name;

    @Email
    private String email;

    
}
