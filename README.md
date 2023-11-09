# <code>DSp3DoubleList</code> Doubly-Linked List Project

For this assignment you will implement a doubly-linked list of strings.

This time our linked nodes will be doubly-linked, which means that each node will have links to the previous and the
next nodes in the list. These additional links will allow some of our methods to be more efficient, but the programming
challenge of building and maintaining these links adds some complexity to your task. We will also have the `Node`
class external to the `MyDoubleList` class, instead of using an inner class.

This time, we will implement a list of strings, which will require a few small changes from project 2, but we will keep
the same setup for the most part. We will add two new methods, `removeFirst` and `removeLast`,
which will complement the existing `remove` method. This project has a challenge part, which is to implement
an iterator. There is a new method called `getIterator` that will return a `java.util.Iterator<String>`.
This is an object that gets used in a "for each" loop, our enhanced for loop. `Iterator` is an interface with
four methods, but your iterator will only need two of them, `next` and `hasNext`. You may assume,
and you will want to assume, that the list you are iterating through will not be modified until the iterator has visited
all the elements. Students may receive the majority of the points for this project without implementing the challenge.
