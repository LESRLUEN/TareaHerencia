/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaHerencia;

import ico.fes.persona.Alumno;

/**
 *
 * @author Viking
 */
public class TareaHerencia {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 = new Alumno();
        a1.setNombre("Ricardo Ramirez Garcia");
        a1.setEdad(18);
        //1 es Hombre, 2 es Mujer
        a1.setGenero(1);
        a1.setAltura(1.84f);
        
        a1.setNumeroCuenta("6677889900");
        a1.setCarrera("Computación");
        a1.setSemestre(2);
        
        Alumno a2 = new Alumno("556112305","Pedagogia",4,"Paulina Alejandra Montes Perez",22,5,1.76f);
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
    
    
}
