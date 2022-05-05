package com.generic;

import com.generic.GenericCollection;

public class GenericQueue<T> {
    private GenericCollection<T> collection = new GenericCollection<T>();

    public void enqueue(T element) {
        collection.add(element);
    }

    public T dequeue() {
        return collection.delete(0);
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i <= collection.getNumObjects(); i++) {
            if (i == 0) {
                output += "| ";
            }
            output += " _ ";
            if (i == collection.getNumObjects()) {
                output += " |" + "\n";
            }
        }
        for (int j = 0; j < collection.getNumObjects(); j++) {
            output += (j + 1) + "º - " + collection.getElement(j) + "\n";
        }
        return output;
    }

}
