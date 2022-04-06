package com.beetle.backend.domain;

import com.beetle.backend.domain.address.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private DeliveryStatus deliveryStatus;

    @Embedded
    private Address address;

    private LocalDateTime deliveryDate;
}
