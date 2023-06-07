package com.mrknight.streams1.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.mrknight.streams1.model.Factura;

public class DemoService1 {

  public Stream<String> createStreamFromArray() {
    String[] strArr = { "Val1", "Demo2", "Val3", "Demo4" };
    return Arrays.stream(strArr);
  }

  public Stream<Factura> createStreamFromEntity() {
    Factura f1 = new Factura("Factura 1", 3000);
    Factura f2 = new Factura("Factura 2", 1000);
    Factura f3 = new Factura("Factura 3", 300);
    Factura f4 = new Factura("Factura 4", 2000);

    List<Factura> lFact = new ArrayList<Factura>();
    lFact.add(f1);
    lFact.add(f2);
    lFact.add(f3);
    lFact.add(f4);

    return lFact.stream();
  }
}
