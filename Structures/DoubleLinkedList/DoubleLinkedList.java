package DoubleLinkedList;

import java.util.Iterator;

class NoSuchDataException extends Exception {
    public NoSuchDataException(String error) {
        super(error);
    }

    public NoSuchDataException() {
        super();
    }
}

/**
 * Source: https://www.geeksforgeeks.org/java-implementing-iterator-and-iterable-interface/
 * Utilisation : pouvoir utiliser for each sur mes structures.
 * USER: sejalpawar
 */
class lkListIterator<T> implements Iterator<T> {
    Element<T> current;

    public lkListIterator(DoubleLinkedList<T> myList) {
        current = myList.getFirst();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T temp = current.get_value();
        current = current.get_after();
        return temp;
    }
    
}

public class DoubleLinkedList<T> implements Iterable<T>{
    Integer length = 0;
    Element<T> first;
    Element<T> last;

    public Element<T> getFirst() {
        return first;
    }

    public void setFirst(Element<T> first) {
        this.first = first;
    }

    public Element<T> getLast() {
        return last;
    }

    public void setLast(Element<T> last) {
        this.last = last;
    }

    public DoubleLinkedList() {
        super();
    }

    public DoubleLinkedList(T objet) {
        super();
        Element<T> element = new Element<T>(objet);
        length += 1;
        this.first = element;
        this.last = element;
    }

    private void add(T objet) {
        if (!empty()) {
            this.length += 1; 
            Element<T> element = new Element<T>(objet, this.last, null);
            this.last.set_after(element);
            this.last = element;
        } else {
            addFirst(objet);
        }
    }

    public void addToTail(T objet) {
        add(objet);
    }

    public void addToHead(T objet) {
        if (!empty()){
            this.length += 1; 
            Element<T> element = new Element<T>(objet, null, this.first);
            this.first.set_before(element);
            this.first = element;
        } else {
            addFirst(objet);
        }
    }

    public void addFirst(T objet) {
        this.length += 1; 
        Element<T> element = new Element<T>(objet, this.last, null);
        element.set_after(null);
        element.set_before(null);
        this.first = element;
        this.last = element;
    }

    public void removeHead() {
        if (!isOnlyOne()) {
            this.length -= 1;
            this.last.get_before().set_after(null);
            this.last = this.last.get_before();
            return;
        }
        delete();
    }

    public void removeTail() {
        if (!isOnlyOne()) {
            this.length -= 1;
            this.first.get_after().set_before(null);
            this.first = this.first.get_after();
            return;
        }
        delete();
    }

    public void removeByData(T objet) {
        Element<T> toCheck = this.first;
        try {
            boolean found = false;
            for (int i = 0; i < this.length ; i++) {
                if (toCheck.value != objet) {
                    toCheck = toCheck.get_after();
                    continue;
                }

                found = true;

                if (isOnlyOne()) {
                    this.delete();
                    break;
                }
                
                if (isFirst(toCheck)) {
                    toCheck.get_after().set_before(toCheck.get_before());
                    this.length -= 1;
                    this.first = toCheck.get_after();
                    break;
                }
    
                if (isLast(toCheck)) {
                    toCheck.get_before().set_after(toCheck.get_after());
                    this.length -= 1;
                    this.last = toCheck.get_before();
                    break;
                }
    
                toCheck.get_after().set_before(toCheck.get_before());
                toCheck.get_before().set_after(toCheck.get_after());
                this.length -= 1;
                break;
            }
            if (found == false) {
                throw (new NoSuchDataException(objet + " not in list"));
            }
        } catch (NoSuchDataException e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    public T getByData(T objet) {
        Element<T> toCheck = this.first;
        try {
            for (int i = 0; i < length; i++) {
                if (!(toCheck.value == objet)) {
                    toCheck = toCheck.after;
                    continue;
                }
                return toCheck.value;
            }
            throw (new NoSuchDataException(objet + " not found"));
        } catch (NoSuchDataException e) {
            e.printStackTrace();
            System.exit(0);
            return null;
        }
    }

    public T getByIndex(int index) {
        Element<T> toCheck = this.first;
        for (int i = 1; i < index; i++) {
            toCheck = toCheck.get_after();
        }
        return toCheck.get_value();
    }

    public boolean isFirst(Element<T> element) {
        return element == this.first;
    }

    public boolean isLast(Element<T> element) {
        return element == this.last;
    }

    public boolean isOnlyOne() {
        return this.length == 1;
    }

    public boolean empty() {
        return this.length == 0;
    }

    public void delete() {
        this.length = 0;
        this.first = null;
        this.last = null;
    }

    public Integer length(){
        return this.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Element<T> node = this.first;
        str.append("[");
        while (node != null) {
            str.append(node.toString());
            if (node.get_after() != null){
                str.append(", ");
            }
            node = node.get_after();
        }
        str.append("]");
        return str.toString();
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> my_dll = new DoubleLinkedList<Integer>(15);
        my_dll.add(12);
        // System.out.println(my_dll.last.get_before());
        // System.out.println(my_dll.length);
        // my_dll.removeByData(12);
        // my_dll.removeByData(15);
        // System.out.println(my_dll.length);
        // my_dll.add(30);
        // System.out.println(my_dll.first);
        // my_dll.getByData(30);
        // my_dll.removeByData(45);
        System.out.println(my_dll.toString());
    }

    @Override
    public Iterator<T> iterator() {
        return new lkListIterator<T>(this);
    }
}


/**
 * Understanding references in Java : https://stackoverflow.com/questions/1750106/how-can-i-use-pointers-in-java
 */