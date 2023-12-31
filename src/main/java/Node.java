/**
 * The Node class is a private inner class of the <code>MyLinkedList</code> class.
 * Since none of the methods of <code>MyLinkedList</code> will return a node,
 * it is safe to make the instance fields here public. Please do not modify
 * this class.
 */
public class Node
{
    public String value;
    private Node next;
    private Node prev;

    public Node(String item) {
        value = item;
        next = null;
        prev = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}

