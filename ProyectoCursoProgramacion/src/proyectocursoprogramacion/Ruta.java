/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocursoprogramacion;

/**
 * @author INGRITH 
 * @author FELIPE
 * @author YENNY
 */
public class Ruta {

    String nombre;
    int[] ruta = {4, -1, 5, -4, 2, 6};
    String ruta_posicion="";
    public Ruta() {
        nombre = "Transporte publico Gotham";

    }

    public void Mayor_recompesa() {
        int valor = 0;
        for (int j = 0; j<6 ; j++) {
            for (int i = 0; i < ruta.length - j; i++) {
                if (i == i + j) {
                    valor= ruta[i];
                } else {
                    if (valor < sumarVector(i, (i + j), 0,"")) {
                        valor = sumarVector(i, (i + j), 0,"");
                    }
                }
            }
        }

        System.out.println("Premio Maximo: "+valor);
        System.out.println(ruta_posicion);
    }

    public int sumarVector(int i, int f, int valor,String ruta_x) {
      
        if (i <= f) {
            valor = valor + ruta[i];
            ruta_x+=""+(i+1)+"->";
            i++;
            return sumarVector(i, f, valor,ruta_x);
        } else {
            ruta_posicion=ruta_x;
            return valor;
        }
    }

}
