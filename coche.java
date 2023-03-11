package com.example.coche;
public class coche {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.Addpuertas();
        miCoche.Addpuertas();
        miCoche.Addpuertas();
        System.out.println(miCoche.puertas);

        int resultado;
        resultado = suma(16, 6, 5);
        System.out.println(resultado);

    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
    static class Coche {
        public int puertas = 1;

        public void Addpuertas() {
            this.puertas++;
        }
    }
}

