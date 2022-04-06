package com.beetle.backend.domain.address;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Embeddable
@Getter
public class Address {
    private String roadAddress;
    private String jibunAddress;
    private String detailAddress;
    private String zipcode;

    protected Address() {}

    public Address(String roadAddress, String jibunAddress, String detailAddress, String zipcode) {
        this.roadAddress = roadAddress;
        this.jibunAddress = jibunAddress;
        this.detailAddress = detailAddress;
        this.zipcode = zipcode;
    }
}
