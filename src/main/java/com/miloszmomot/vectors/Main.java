package com.miloszmomot.vectors;

import static java.lang.Math.toDegrees;

public class Main {
    public static void main(String[] args) {
        Vector2D vectorXY = new Vector2D(6.10, 0.0);
        //Adaptacja wspolrzednych biegunowych
        Vector2D vectorRFi = new Vector2D(10, 130);
        Vector2DPolarCoordsAdapter vectorRFiAdapted = new Vector2DPolarCoordsAdapter(vectorRFi);

        //Vector3D stworzony uzywajac dekoratora
        Vector3D vector3D = new Vector3D(new Vector2D(4.5, 0), 6.0);
        //Adaptacja wspolrzednych sferycznych
        Vector3D vectorRTetaFi = new Vector3D(new Vector2D(11, 15), 60);
        Vector3DSphericalCoordsAdapter vectorRTetaFiAdapted = new Vector3DSphericalCoordsAdapter(vectorRTetaFi);

        System.out.println("Długosc wektora: " + vectorXY.abs());
        System.out.println("R i Fi przed adaptacją: " + vectorRFi.getComponents()[0] + " " +
                vectorRFi.getComponents()[1]);
        System.out.println("R i Fi po adaptacji:    " + vectorRFiAdapted.getAngles()[0] + " " +
                toDegrees(vectorRFiAdapted.getAngles()[1]));
        System.out.println("x, y po adaptacji:    " + vectorRFiAdapted.getComponents()[0] + " " +
                vectorRFiAdapted.getComponents()[1]);
        System.out.println("Wynik mnozenia skalarnego: " + vectorXY.cdot(vectorRFiAdapted));

        System.out.println("\n\nDługosc wektora: " + vector3D.abs());
        System.out.println("R, Teta, Fi przed adaptacją: " + vectorRTetaFi.getComponents()[0] + " " +
                vectorRTetaFi.getComponents()[1] + " " + vectorRTetaFi.getComponents()[2]);
        System.out.println("R, Teta, Fi po adaptacji:    " + vectorRTetaFiAdapted.getAngles()[0] + " " +
                vectorRTetaFiAdapted.getAngles()[1] + " " + vectorRTetaFiAdapted.getAngles()[2]);
        System.out.println("x, y, z po adaptacji:    " + vectorRTetaFiAdapted.getComponents()[0] + " " +
                vectorRTetaFiAdapted.getComponents()[1] + " " + vectorRTetaFiAdapted.getComponents()[2]);
        System.out.println("Wynik mnozenia skalarnego: " + vector3D.cdot(vectorRTetaFiAdapted));

        Vector3D wynikMnozeniaWektorowego = vector3D.ccross(vectorRTetaFiAdapted);

        System.out.println("\n\nDługosc wektora bedacego wynikiem mnozenia wektorowego: "
                + wynikMnozeniaWektorowego.abs());
        System.out.println("Wspolrzedne wektora powstalego po mnozeniu: " +
                wynikMnozeniaWektorowego.getComponents()[0] + " " +
                wynikMnozeniaWektorowego.getComponents()[1] + " " +
                wynikMnozeniaWektorowego.getComponents()[2]);

    }
}
