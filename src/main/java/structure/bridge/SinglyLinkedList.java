package structure.bridge;

import java.awt.geom.Point2D;

// A concrete implmentor.
// This implementation is a classic LinkedList using nodes
// Not thread safe
public class SinglyLinkedList<T> implements LinkedList {

    private class Node {
        private Object data;
        private Node next;
        private Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node top;
    private Node last;


    @Override
    public void addFirst(Object element) {
        if (top == null) {
            last = top = new Node(element, null);
        } else {
            top = new Node(element, top);
        }
        ++size;
    }

    @Override
    public Object removeFirst() {
        if (top == null) {
            return null;
        }

        Object data = top.data;
        top = top.next;
        --size;

        if (top == null) {
            last = null;
        }

        return data;
    }

    @Override
    public void addLast(Object element) {
        if (top == null) {
            last = top = new Node(element, null);
        } else {
            last.next = new Node(element, null);
            last = last.next;
        }
        ++size;
    }

    @Override
    public Object removeLast() {
        if (top == null) {
            return null;
        }

        if (top == last) {
            Object data = top.data;
            top = last = null;
            --size;
            return data;
        }

        // 마지막 이전 노드를 찾기
        Node current = top;
        while (current.next != last) {
            current = current.next;
        }

        Object data = last.data;
        last = current;
        last.next = null;
        --size;

        return data;
    }

    @Override
    public int getSize() {
        return size;
    }
}