package com.exercises;

public class Queue<T> implements Queue_Interface<T>{

    private Stack<T> first_stack;
    private Stack<T> inverse_stack;

    Queue(){
        first_stack = new Stack<>();
        inverse_stack = new Stack<>();
    }

    @Override
    public void add(T item) {
        first_stack.push(item);
    }

    @Override
    public T remove() {
        if (!inverse_stack.isEmpty()){
            return inverse_stack.pop();
        }
        else if(!first_stack.isEmpty()){
            while(!first_stack.isEmpty()){
                inverse_stack.push(first_stack.pop());
            }
            return inverse_stack.pop();
        }
        else return null;
    }

    @Override
    public T peek() {
        if (!inverse_stack.isEmpty()){
            return inverse_stack.peek();
        }
        else if(!first_stack.isEmpty()){
            while(!first_stack.isEmpty()){
                inverse_stack.push(first_stack.pop());
            }
            return inverse_stack.peek();
        }
        else return null;
    }

    @Override
    public Boolean isEmpty() {
        return (first_stack.isEmpty() && inverse_stack.isEmpty());
    }
}
