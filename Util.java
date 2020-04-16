----------------------------------
package com.amena.util;

import javax.swing.JOptionPane;

public class Util{
    public static float promedio(){
        int i = 0;
        float promedioNotas, suma = 0;
        boolean continuar = true;
        while(continuar){
            float nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una nota, -1 para finalizar"));
            if (nota != -1){
                suma = suma + nota;
                i = i + 1;
            }
            else continuar = false;        
        }
        promedio = suma / i;
        return promedio;
    }

}