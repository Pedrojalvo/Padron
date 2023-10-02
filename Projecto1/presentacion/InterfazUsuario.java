package presentacion;
import dominio.*;
import java.util.ArrayList;

/**
 * Write a description of class InterfazUsuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InterfazUsuario
{
    
    public static void ejecutar(String[] instruccion){
        OficinaPadron padron = new OficinaPadron();
        if (instruccion[0].equalsIgnoreCase("mostrar") &&
            instruccion.length == 1){
                mostrarOficinaPadron(padron);
            }else if (instruccion[0].equalsIgnoreCase("añadir")
            && instruccion.length == 4){
                padron.annadir(new Padron1(instruccion[1],
                instruccion[2], instruccion[3]));
                System.out.println("Habitante añadido correctamente");
            }else{
                System.out.println("Error en la instrucción");
                
            }
            }
            private static void mostrarOficinaPadron(OficinaPadron padron){
                ArrayList<Padron1> habitantes = padron.
    getHabitantesPadron();
    for(Padron1 habitante : habitantes){
        System.out.println(habitante.getNombre() + "" + 
        habitante.getApellido1()+ "" +
        habitante.getApellido2());
    }
    System.out.println("El numero total de habitantes es " + padron.calcularNumeroHabitantes());
    
    
    }
            }     
   

      

