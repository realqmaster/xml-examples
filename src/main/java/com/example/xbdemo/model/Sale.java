package com.example.xbdemo.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@XmlRootElement(name = "PurchaseOrders")
public class Sale {

  @XmlElement(name = "PurchaseOrder")
  private List<Purchase> purchases;
}
