package com.project.springbatch._56_reader_jpaPaging;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class PagingCustomer {

    @Id
    @GeneratedValue
    private Long Id;
    private String username;
    private int age;

    @OneToOne(mappedBy = "pagingCustomer")
    private Address address;

}
