package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private int maxSize;
    private List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (items.size() >= maxSize) {
            System.out.println("List is full. Cannot add more items.");
            return;
        }
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}