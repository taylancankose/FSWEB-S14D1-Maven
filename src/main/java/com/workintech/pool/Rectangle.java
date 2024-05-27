package com.workintech.pool;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int width, int length) {
        if(length < 0){
            this.length = 0;
            this.width = width;
        }else if(width < 0){
            this.width = 0;
            this.length = length;
        }else {
            this.length = length;
            this.width = width;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return length*width;
    }
}
