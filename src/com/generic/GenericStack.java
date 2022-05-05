package com.generic;

public class GenericStack<T> {
    private static final int TOP = 0;

    private GenericCollection<T> collection = new GenericCollection<T>();

    public void push(T element) {
        collection.insert(element, TOP);
    }

    public T pop() {
        return collection.delete(TOP);
    }

    public int length() {
        return collection.getNumObjects();
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < collection.getNumObjects(); i++) {
            out += collection.getElement(i).toString();
            out += "\n";

        }
        return out;
    }
}
