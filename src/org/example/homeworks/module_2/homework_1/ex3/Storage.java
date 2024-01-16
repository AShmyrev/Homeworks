package org.example.homeworks.module_2.homework_1.ex3;

import java.util.ArrayList;
import java.util.List;

public class Storage<I extends Item> {
    private ArrayList<I> items = new ArrayList<>();

    public void addItem(I item) {
        items.add(item);
    }

    public void addItems(List<I> items) {
        this.items.addAll(items);
    }

    public List<I> getAllItems() {
        ArrayList<I> evenItems = new ArrayList<I>();
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 == 0) {
                evenItems.add(items.get(i));
            }
        }
        return evenItems;
    }

    public I getItem(int index) {
        if (index >= items.size()) {
            throw new RuntimeException();
        }
        I item = items.get(index);
        items.remove(index);
        return item;
    }

    public void removeAllExceptLast() {
        I lastItem = items.get(items.size() - 1);
        items.clear();
        items.add(lastItem);
    }
}
