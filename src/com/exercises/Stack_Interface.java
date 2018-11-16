package com.exercises;

public interface Stack_Interface<T> {

    /**
     * Add an item to the top of the stack
     * @param item item to be added
     */
    void push(T item);

    /**
     * Remove an item from the top of the stack
     * @return the removed item
     */
    T pop();

    /**
     *
     * @return the item on top of the stack
     */
    T peek();

    /**
     *
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();
}
