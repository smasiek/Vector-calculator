package com.miloszmomot.vectors;


public abstract class Vector3DDecorator implements IVector {

    private Vector2D vector2D;

    public Vector3DDecorator(Vector2D vector2D){
        this.vector2D=vector2D;
    }

    public double abs(){
        return vector2D.abs();
    }
    public double[] getComponents() {
        return vector2D.getComponents();
    }

    public double[] getAngles() {
        return vector2D.getAngles();
    }

    public double cdot(IVector vector) {
        return vector2D.cdot(vector);
    }

}
