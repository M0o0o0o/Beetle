package com.beetle.backend.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="dtype")
/*
 * LOCAL JOIN : DTYPE(1)
 */
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String userId;
    private String password;
    private String phone;
    private String email;
    private String nickname;
    private LocalDateTime joinDate;
}
