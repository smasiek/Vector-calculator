package com.miloszmomot.vectors;

public interface IVector {
    double abs();
    double[] getComponents();
    double[] getAngles();
    double cdot(IVector vector);
}
