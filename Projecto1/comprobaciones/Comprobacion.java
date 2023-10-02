package comprobaciones;
import dominio.*;

/**
 * Write a description of class Comprobacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Comprobacion{
    public static void realizarComprobacion(){
        Padron1 habitante1 = new Padron1("Juan", "Torres"
        , "Sanz");
        Padron1 habitante2 = new Padron1("Marta","Caballero","Ramos");
        Padron2 padron = new Padron2();
        padron.annadir(habitante1);
        padron.annadir(habitante2);
        ArrayList<Padron1> habitantes = padron.
        getHabitantesPadron();
        for(Padron1 habitante : habitantes){
            System.out.println(habitante.getNombre() + " " +
            habitante.getApellido1() + " " +
            habitante.getApellido2());
        }
    System.out.println("El numero total de habitantes es " + padron.calcularNumeroHabitantes());
}
}

        
  
