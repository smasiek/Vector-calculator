package com.miloszmomot.vectors;

import static java.lang.Math.*;

public class Vector3DSphericalCoordsAdapter implements IVector {

    private Vector3D vector3D;

    public Vector3DSphericalCoordsAdapter(Vector3D vector3D){
        //Zakladajac, że konstruktor vectora3D przyjmie argumenty: new Vector3D(new Vector(double r, double teta),double fi)
        double[] components=vector3D.getComponents();
        this.vector3D=new Vector3D(new Vector2D(components[0]*sin(toRadians(components[1]))*cos(toRadians(components[2])),
                components[0]*sin(toRadians(components[1]))*sin(toRadians(components[2]))),
                components[0]*cos(toRadians(components[1])));
    }
    public double abs() {
        return vector3D.abs();
    }

    public double[] getComponents() {
        return vector3D.getComponents();
    }

    public double[] getAngles() {
        return vector3D.getAngles();
    }

    public double cdot(IVector vector) {
        return vector3D.cdot(vector);
    }

    public Vector3D ccross(IVector vector){
        return vector3D.ccross(vector);
    }

}
