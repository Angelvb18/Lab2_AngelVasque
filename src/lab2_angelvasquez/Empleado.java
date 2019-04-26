
package lab2_angelvasquez;

import java.util.ArrayList;


public class Empleado {
    private String nombre;
    private String apellido;
    private String Colorfav;
    private int edad;
    private char gen;
    private double alt;
    private double peso;
    private String tit;
    private String carg;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String Colorfav, int edad, char gen, double alt, double peso, String tit, String carg) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Colorfav = Colorfav;
        this.edad = edad;
        this.gen = gen;
        this.alt = alt;
        this.peso = peso;
        this.tit = tit;
        this.carg = carg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColorfav() {
        return Colorfav;
    }

    public void setColorfav(String Colorfav) {
        this.Colorfav = Colorfav;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getCarg() {
        return carg;
    }

    public void setCarg(String carg) {
        this.carg = carg;
    }
    public String toString(Empleado a)
    {
       String re="";
       re=a.getNombre()+" "+a.getApellido()+" "+a.getCarg()+" "+a.getTit()+" "+a.getEdad()+" "+a.getGen()+" "+" "+a.getPeso()+" "+a.getAlt();
       return re;
    }
}
