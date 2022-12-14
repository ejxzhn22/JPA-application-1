package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
