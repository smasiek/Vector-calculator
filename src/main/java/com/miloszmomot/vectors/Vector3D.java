package com.miloszmomot.vectors;

import static java.lang.Math.*;

public class Vector3D extends Vector3DDecorator{
    private Vector2D vector2D;
    private double z;

    public Vector3D(Vector2D vector2D,double z){
        super(vector2D);
        this.vector2D=vector2D;
        this.z=z;
    }

    public double abs(){
        double[] components=vector2D.getComponents();
        return sqrt(pow(components[0],2)+pow(components[1],2)+pow(z,2));
    }
    public double[] getComponents() {
        double[] tempComponents=vector2D.getComponents();
        double[] components= new double[]{tempComponents[0], tempComponents[1], z};
        return components;
    }

    public double[] getAngles() {
        double[] tempComponents=vector2D.getComponents();
        double r = abs();
        double teta=acos(z/r);
        double fi=atan(tempComponents[1]/tempComponents[0]);
        return new double[]{r,Math.round(toDegrees(teta) * 1e5) / 1e5,Math.round(toDegrees(fi) * 1e5) / 1e5};
    }

    public double cdot(IVector vector) {
        //Sprawdzenie czy vector posiada trzeci wymiar
        if (vector instanceof Vector3D || vector instanceof Vector3DSphericalCoordsAdapter){
            return vector2D.cdot(vector)+z*vector.getComponents()[2];
        } else{
            return vector2D.cdot(vector);
        }
    }

    public Vector3D ccross(IVector vector){
            double[] components1=getComponents();
            double[] components2=vector.getComponents();
            return new Vector3D(new Vector2D(components1[1]*components2[2]-components1[2]*components2[1],
                    components1[2]*components2[0]-components1[0]*components2[2]),
                    components1[0]*components2[1]-components1[1]*components2[0]);
    }

}
