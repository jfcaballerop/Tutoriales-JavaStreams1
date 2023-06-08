package com.mrknight.streams1.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.mrknight.streams1.model.Item;

public class DemoService1 {

  public Stream<String> createStreamFromArray() {
    String[] strArr = { "Val1", "Demo2", "Val3", "Demo4", "Val3", "Demo4" };
    return Arrays.stream(strArr);
  }

  public Stream<Item> createStreamFromEntity() {
    Item f1 = new Item("Item 1", 200);
    Item f2 = new Item("Item 2", 1000);
    Item f3 = new Item("Item 3", 300);
    Item f4 = new Item("Item 4", 2000);

    List<Item> lItem = new ArrayList<Item>();
    lItem.add(f1);
    lItem.add(f2);
    lItem.add(f3);
    lItem.add(f4);

    return lItem.stream();
  }
}
