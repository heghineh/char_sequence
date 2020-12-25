package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MyString implements CharSequence {

    private String text;

    //region Constructors
    MyString(){}

    public MyString(String text) {
        this.text = text;
    }
    //endregion

    //region Override methods
    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return text.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
    //endregion

    //region Public methods
    public StringBuilder reverseTheString() {
        StringBuilder text1 = new StringBuilder();
        text1.append(text);
        text1 = text1.reverse();
        return text1;
        }
    //endregion

    //region Getter and setter
    public String getText() {
        return text;
    }

    public void setText( String text ) {
        this.text = text;
    }
    //endregion
}