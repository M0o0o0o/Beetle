package com.beetle.backend.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue
    @Column(name = "payment_id")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private PaymentStatus paymentStatus;


}
