
/**
 * Write a description of class Padron2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Padron2
{
    private ArrayList<Padron1> habitantesPadron = new
    ArrayList<>();
    public void annadir(Padron1 habitante)
    {habitantesPadron.add(habitante);
    }
    public ArrayList getHabitantesPadron(){
        return habitantesPadron;
    }
   
    public int calcularNumeroHabitantes(){
        int suma = 0;
        for(Padron1 habitante : habitantesPadron){
            suma++;
        }
        return suma;
    }
}
