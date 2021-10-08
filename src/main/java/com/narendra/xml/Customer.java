package com.narendra.xml;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@NoArgsConstructor
@Setter
@Getter
public class Customer {
    private int custNo;
    private String name;
    private String country;

}
