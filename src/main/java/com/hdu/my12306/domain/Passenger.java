package com.hdu.my12306.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
    private String uPhone;
    private String pPhone;
    private Integer pType;
    private String pIdcard;
    private String pName;
}
