package com.mrknight.streams1;

import java.util.ArrayList;
import java.util.List;

import com.mrknight.streams1.model.Factura;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    Factura f1 = new Factura("Factura 1", 3000);
    Factura f2 = new Factura("Factura 2", 1000);
    Factura f3 = new Factura("Factura 3", 300);
    Factura f4 = new Factura("Factura 4", 2000);

    List<Factura> lFact = new ArrayList<Factura>();
    lFact.add(f1);
    lFact.add(f2);
    lFact.add(f3);
    lFact.add(f4);

    Factura filtroFactura = lFact.stream()
        .filter(f -> f.getImporte() > 1000)
        .findFirst()
        .get();

    System.out.println("\n\nFacturas filtradas: " + filtroFactura.getImporte());

  }
}
