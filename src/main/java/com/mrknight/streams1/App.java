package com.mrknight.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mrknight.streams1.model.Item;
import com.mrknight.streams1.services.DemoService1;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {

    DemoService1 svc1 = new DemoService1();

    // Some Stream operations
    System.out.println("\n **** Intermediate Operations ****\n");

    // Filter stream
    System.out.println("*** Filter ***");
    svc1.createStreamFromArray().filter(s -> s.startsWith("V")).forEach(System.out::println);

    // Map: new stream applying the function to each element
    System.out.println("*** Map ***");
    svc1.createStreamFromArray().map(s -> s.toUpperCase()).forEach(System.out::println);

    // Distinct: Return stream with only unique elements
    System.out.println("*** Distinct ***");
    svc1.createStreamFromArray().distinct().forEach(System.out::println);

    // Sorted: Return stream sorted according natural order
    System.out.println("*** Sorted ***");
    svc1.createStreamFromArray().sorted().forEach(System.out::println);

    // Some Stream Terminals operations
    System.out.println("\n **** Terminals Operations ****\n");

    // FindFirst: Return a Optional for de FIRST entry in the Stream
    System.out.println("*** FindFirst ***");
    System.out.println("\n\nItems filtradas: " + svc1.createStreamFromEntity()
        .filter(f -> f.getImporte() > 100)
        .peek(System.out::println)
        .findFirst()
        .get()
        .getImporte());

    // FindAny: Return a Optional for ANY entry in the Stream
    System.out.println("*** FindAny ***");
    System.out.println("\n\nFind any: " + svc1.createStreamFromEntity()
        .filter(f -> f.getImporte() > 100)
        .findAny()
        .get()
        .getImporte());

    // Peek: Perform the specified op on EACH elem an return NEW STREAM. Normally is
    // used to debug.
    System.out.println("*** Peek ***");
    svc1.createStreamFromEntity()
        .map(f -> f.getImporte() * 10)
        .peek(System.out::println)
        .collect(Collectors.toList());

    System.out
        .println("*** Stream not modify source ***:: " + svc1.createStreamFromArray().collect(Collectors.toList()));

    // Best optimization, do not iterate whole list, only until find first condition

  }
}
