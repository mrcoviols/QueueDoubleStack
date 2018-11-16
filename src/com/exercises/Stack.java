package com.exercises;

import java.util.ArrayList;

public class Stack<T> implements Stack_Interface<T>{

    private ArrayList<T> arrayList;

    Stack(){
        arrayList = new ArrayList<>();
    }

    @Override
    public T pop(){
        return arrayList.remove(arrayList.size()-1);
    }

    @Override
    public T peek() {
        return arrayList.get(arrayList.size()-1);
    }

    @Override
    public void push(T elem){
        arrayList.add(elem);
    }

    @Override
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
}
