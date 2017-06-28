package com.example.lee.FourFP;


public abstract class AbstractShapeFactory {

    public static ShapeFactory getShapeFactory(int x, int y, int r, int z, int style){

        return new ShapeFactory(x, y, r, z, style);
    }
}
