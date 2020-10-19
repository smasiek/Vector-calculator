package com.miloszmomot.vectors;

import static java.lang.Math.*;

public class Vector2DPolarCoordsAdapter implements IVector{

    private Vector2D vector2D;

    public Vector2DPolarCoordsAdapter(Vector2D vector2D){
        //Zakladajac, że konstruktor vectora2D przyjmie argumenty: new Vector2D(double r, double fi)
        double[] components=vector2D.getComponents();
        this.vector2D=new Vector2D(components[0]*cos(toRadians(components[1])),
                components[0]*sin(toRadians(components[1])));
    }

    public double abs() {
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
