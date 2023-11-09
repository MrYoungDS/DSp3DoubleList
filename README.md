# <code>DSp3DoubleList</code> Doubly-Linked List Project

For this assignment you will implement a doubly-linked list of strings.

This time our linked nodes will be doubly-linked, which means that each node will have links to the previous and the
next nodes in the list. These additional links will allow some of our methods to be more efficient, but the programming
challenge of building and maintaining these links adds some complexity to your task. We will also have the <code>Node</code>
class external to the <code>MyDoubleList</code> class, instead of using an inner class.

This time, we will implement a list of strings, which will require a few small changes from project 2, but we will keep
the same setup with exceptions, for simplicity. This project has a challenge part, which is to implement an iterator.
There is a new method called getListIterator that will return a <code>java.util.Iterator<String></code>. This is an object
that gets used in a "for each" loop, our enhanced for loop. <code>Iterator</code> is an interface with four methods, 
but your iterator will only need two of them, <code>next</code> and <code>hasNext</code>. You may assume, and you will want
to assume, that the list you are iterating through will not be modified until the iterator has visited all the
elements. Students may receive the majority of the points for this project without implementing the challenge.
