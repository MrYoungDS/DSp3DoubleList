import java.util.Iterator;

/**
 * The MyDoubleList class is the implementation of a doubly-linked list of strings.
 * <p>
 * The data in the list will be stored in <code>Node</code> objects, with each node
 * storing one String and two links: one to the next node in the list, and one to the
 * previous node in the list. For this project, the <code>Node</code> class has been
 * implemented for you, but this time we are not using an inner class.
 * Our <code>MyDoubleList</code> will implement the same methods as the <code>MyLinkedList</code>
 * class, as well as a challenge portion, to implement an iterator for the list.
 * <p>
 * Students should not, again, use the <code>java.util.LinkedList</code> Java library class.
 * Also, you will again need to watch for your overzealous friend, the garbage collector -
 * only overwrite a reference if you no longer need the <code>Node</code> that it is referencing.
 * <p>
 * For the challenge portion, you will need to implement the <code>getIterator</code> method,
 * which returns an iterator for a <code>MyDoubleList</code>. In particular, this iterator
 * will need to implement the <code>next</code> and <code>hasNext</code> methods from the
 * <code>Iterator</code> interface.
 */

public class MyDoubleList
{
    private Node first;
    private Node last;

    /**
     * Constructs an empty list.
     */
    public MyDoubleList() {
        // TODO your code here
    }

    /**
     * Appends the specified string to the beginning of the list.
     * @param item String to be appended to this list
     * @throws NullPointerException if item is null
     */
    public void addFirst(String item) {
        // TODO your code here
    }

    /**
     * Appends the specified string to the end of the list.
     * @param item String to be appended to this list
     * @throws NullPointerException if item is null
     */
    public void addLast(String item) {
        // TODO your code here
    }

    /**
     * Inserts the specified string at the specified position in this list.
     * Shifts the element currently in that position (if any) and any subsequent
     * elements to the right (adding one to their indices).
     * @param index index at which the specified String is to be inserted
     * @param item String to be inserted
     * @throws IndexOutOfBoundsException if index is out of bounds
     * @throws NullPointerException if item is null
     */
    public void add(int index, String item) {
        // TODO your code here
    }

    /**
     * Removes the string from the beginning of the list.
     * @return String to be removed from this list
     * @throws IndexOutOfBoundsException if the list is empty
     */
    public String removeFirst() {
        // TODO replace the code here
        return "";
    }

    /**
     * Removes the string from the end of the list.
     * @return String to be removed from this list
     * @throws IndexOutOfBoundsException if the list is empty
     */
    public String removeLast() {
        // TODO replace the code here
        return "";
    }

    /**
     * Removes the string at the specified position in this list. Shifts any
     * subsequent strings to the left (subtracts one from their indices).
     * @param index the index of the String to remove
     * @return the String that was removed from the list
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public String remove(int index) {
        // TODO replace the code here
        return "";
    }

    /**
     * Returns the string at the specified position in this list.
     * @param index index of the element to return
     * @return the String at the specified position in this list
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public String get(int index) {
        // TODO replace the code here
        return "";
    }

    /**
     * Replaces the string at the specified position in this list with the
     * specified string.
     * @param index index of the String to replace
     * @param item String to be stored at the specified position
     * @throws IndexOutOfBoundsException if index is out of bounds
     * @throws NullPointerException if item is null
     */
    public void set(int index, String item) {
        // TODO your code here
    }

    /**
     * Returns the number of strings in this list.
     * @return the number of String items in this list
     */
    public int size() {
        // TODO replace the code here
        return 0;
    }

    /**
     * Returns the index of the first occurrence of the specified string in this list,
     * or -1 if this list does not contain the string.
     * @param item String to search for
     * @return the index of the first occurrence of the specified String in this list,
     * or -1 if this list does not contain the String
     * @throws NullPointerException if item is null
     */
    public int indexOf(String item) {
        // TODO replace the code here
        return 0;
    }

    /**
     * Returns <code>true</code> if this list contains the specified string.
     * @param item String whose presence in this list is to be tested
     * @return true if this list contains the specified String
     * @throws NullPointerException if item is null
     */
    public boolean contains(String item) {
        // TODO replace the code here
        return false;
    }

    /**
     * Removes all the elements from this list. The list will be empty after this
     * call returns.
     */
    public void clear() {
        // TODO your code here
    }

    /**
     * Returns <code>true</code> if this list has no elements.
     * @return true if this list is empty
     */
    public boolean isEmpty() {
        // TODO replace the code here
        return false;
    }

    /**
     * Creates a new {@link Iterator} that traverses the specified
     * {@link MyDoubleList} in pre-order.
     * <p>
     * The remove method of the returned {@link Iterator} is not supported and
     * any call to it will result in an {@link UnsupportedOperationException}.
     * <p>
     * If the data in the underlying {@link MyDoubleList} or its children is
     * modified, using the {@link Iterator} is unknown.
     * @return a new {@link Iterator} that traverses the specified
     *         {@link MyDoubleList} in pre-order.
     * @throws NullPointerException
     *             if root is {@code null}
     */
    Iterator<String> getIterator() {
        // TODO replace the code here
        return null;
    }
}
