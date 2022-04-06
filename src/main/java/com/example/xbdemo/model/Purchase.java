package com.example.xbdemo.model;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import java.util.List;

@Data
public class Purchase {

  @XmlElement(name = "Address")
  private List<Address> addresses;

  private List<Item> items;
}
