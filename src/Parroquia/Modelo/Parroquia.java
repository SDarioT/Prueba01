/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parroquia.Modelo;

/**
 *
 * @author dario_t.
 */
public class Parroquia {
    private int codigo;
    private String nombre;
    private String canton;
    private int year;

    public Parroquia(int codigo, String nombre, String canton, int year) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.canton = canton;
        this.year = year;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Parroquia{" + "codigo=" + codigo + ", nombre=" + nombre + ", canton=" + canton + ", year=" + year + '}';
    }
    
}
