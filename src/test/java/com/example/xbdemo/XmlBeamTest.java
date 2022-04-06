package com.example.xbdemo;

import com.example.xbdemo.model.Sale;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.junit.jupiter.api.Test;
import org.springframework.util.ResourceUtils;


import java.io.File;
import java.io.IOException;

public class XmlBeamTest {

  @Test
  public void test() throws IOException, JAXBException {

    File xml = ResourceUtils.getFile("classpath:sample.xml");
    JAXBContext context = JAXBContext.newInstance(Sale.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    Sale sale  = (Sale) unmarshaller.unmarshal(xml);
    System.out.println(sale.toString());
  }
}
