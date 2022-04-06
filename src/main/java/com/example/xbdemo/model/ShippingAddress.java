package com.example.xbdemo.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorValue;

@Data
@EqualsAndHashCode(callSuper = true)
@XmlDiscriminatorValue("Shipping")
public class ShippingAddress extends Address {

  @XmlAttribute(name = "Type")
  private String type;

  @XmlElement(name = "Name")
  private String name;

  @XmlElement(name = "Street")
  private String street;

  @XmlElement(name = "City")
  private String city;

  @XmlElement(name = "Zip")
  private String zipcode;

  @XmlElement(name = "Country")
  private String country;
}
