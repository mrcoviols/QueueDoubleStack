package com.exercises;

public interface Queue_Interface<T> {

    /**
     * Add an item to the end of the list
     * @param item item to be added
     */
    void add(T item);

    /**
     * Remove the first item in the list
     * @return the removed item
     */
    T remove();

    /**
     *
     * @return the first item in queue
     */
    T peek();

    /**
     *
     * @return true if the queue is empty
     */
    Boolean isEmpty();
}
