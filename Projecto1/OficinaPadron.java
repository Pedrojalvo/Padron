import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

/**
 * Write a description of class OficinaPadron here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OficinaPadron
    
    { 
        private ArrayList<Padron1> habitantesPadron = new ArrayList<>();
        
        public void annadir(Padron1 habitante){
            habitantesPadron.add(habitante);
            volcarContactos();
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
            
                private void cargarHabitantes(){
                    try{
                        File fichero = new File("padron.csv");
                        
                        
                        fichero.createNewFile();
                        Scanner sc = new Scanner(fichero);
                        sc.useDelimiter(",|\n");
                        while(sc.hasNext()){
                            Padron1 habitante = new Padron1 (sc.next(),
                            sc.next(),
                            sc.next());
                            
                            habitantesPadron.add(habitante);
                        }
                        
                        sc.close();
                    }catch(IOException ex){
                        System.out.println("No hay habitantes inscritos");
                    }
                }
                public void volcarContactos(){
                    try{
                        FileWriter fw = new FileWriter("padron.csv");
                        for(Padron1 habitante : habitantesPadron){
                            fw.write(habitante.getNombre() + ","+
                            habitante.getApellido1() + "," +
                            habitante.getApellido2() + "n");
                        }
                        fw.close();
                    }catch(IOException ex){
                        System.err.println(ex);
                        
            
                    }
                        }
                        
                        public OficinaPadron(){
                            cargarHabitantes();
                        }
                    }
        
    