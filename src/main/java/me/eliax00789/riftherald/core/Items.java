package me.eliax00789.riftherald.core;

import me.eliax00789.riftherald.core.items.Group;
import me.eliax00789.riftherald.core.items.Item;
import me.eliax00789.riftherald.core.items.Tree;

public class Items {
    private static Items instance;

    public Item byKey(int key) {
        return new Item(key);
    }
    public Item byName(String name) {
        return new Item(name);
    }
    public Group groupByKey(int key) {
        return new Group(key);
    }
    public Group groupById(String id) {
        return new Group(id);
    }
    public Tree treeByKey(int key) {
        return new Tree(key);
    }
    public Tree treeByHeader(String header) {
        return new Tree(header);
    }

    public static Items getInstance() {
        if (instance == null) {
            instance = new Items();
        }
        return instance;
    }
}