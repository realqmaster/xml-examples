package com.example.xbdemo.model;

import jakarta.xml.bind.annotation.XmlSeeAlso;
import lombok.Data;
import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

@Data
@XmlDiscriminatorNode("@Type")
@XmlSeeAlso({BillingAddress.class, ShippingAddress.class})
public abstract class Address {}
