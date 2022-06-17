/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Parroquia.Servicio;

import Parroquia.Modelo.Parroquia;
import java.util.List;

/**
 *
 * @author dario_t.
 */
public interface IParroquiaServicio {
    
    public Parroquia crear(Parroquia parroquia);
    public List<Parroquia>listar();
      
}
