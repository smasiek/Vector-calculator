package com.miloszmomot.vectors;

import static java.lang.Math.*;

public class Vector2D implements IVector{
    private double x;
    private double y;

    public Vector2D(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double abs() {
        return sqrt(pow(x,2)+pow(y,2));
    }

    public double[] getComponents() {
        return new double[]{x,y};
    }

    public double[] getAngles() {
        double r =abs();
        double fi=acos(x/r)*signum((y));
        return new double[]{r,fi};
    }

    public double cdot(IVector vector) {
        double[] components=vector.getComponents();
        return (this.x*components[0]+this.y*components[1]);
    }
}
