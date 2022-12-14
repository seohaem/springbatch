package com.project.springbatch._55_reader_jdbcPaging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private String birthdate;
}
