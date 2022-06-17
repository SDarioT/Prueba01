/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parroquia.control;

import Parroquia.Modelo.Parroquia;
import Parroquia.Servicio.ParroquiaServicio;
import java.util.List;

/**
 *
 * @author dario_t.
 */
public class ParroquiaControl {
    
    private final ParroquiaServicio parroquiaServicio = new ParroquiaServicio();
    
    public Parroquia crear(String[] args) {
        Parroquia parroquia = new Parroquia(Integer.valueOf(args[0]),args[1],args[2],Integer.valueOf(args[3]));
        this.parroquiaServicio.crear(parroquia);
        return parroquia;
    }
    
    public List<Parroquia> listar(){
        return this.parroquiaServicio.listar();
    }
}
