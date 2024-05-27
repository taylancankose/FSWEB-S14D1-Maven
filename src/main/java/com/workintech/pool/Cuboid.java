package com.workintech.pool;

public class Cuboid extends Rectangle{
    private int height;

    public Cuboid(int length, int width, int height) {
        super(length, width);
        if(height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getVolume(){
        return getArea()*height;
    }
}
