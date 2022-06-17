/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parroquia.Servicio;

import Parroquia.Modelo.Parroquia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dario_t.
 */
public class ParroquiaServicio implements IParroquiaServicio{
    
    private static List<Parroquia> ParroquiaList = new ArrayList<>();

    @Override
    public Parroquia crear(Parroquia parroquia) {
        this.ParroquiaList.add(parroquia);
        return parroquia;
    }

    @Override
    public List<Parroquia> listar() {
        return this.ParroquiaList;
    }
    
    
    
}
