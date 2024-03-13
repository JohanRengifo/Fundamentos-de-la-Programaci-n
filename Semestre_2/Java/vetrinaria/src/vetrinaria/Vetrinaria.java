
package vetrinaria;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Vetrinaria {

    public static Scanner digite = new Scanner (System.in);
    public static void main(String[] args) {
        
        int menu = 0;
  
        String cita, especie, historia_vetrinaria, ultimo_control, vacuna;

        ArrayList <Animal> animales = new ArrayList();
        do{
            Animal animales1 = new Animal();
            
            cita= JOptionPane.showInputDialog("Digite la proxima cita: ");
            animales1.setCita(cita);
            
            especie = JOptionPane.showInputDialog("Digite la especie: ");
            animales1.setEspecie(especie);
            
            historia_vetrinaria= JOptionPane.showInputDialog("cual es la historia clinica del animal , antecedentes , sintomatologias si las tiene y recomendaciones: ");
            animales1.setHistoria_vetrinaria(historia_vetrinaria);
            
            ultimo_control = JOptionPane.showInputDialog("Digite el ultimo control: ");
            animales1.setUltimo_control(ultimo_control);
            
            animales1.setVacuna(true);
            
            animales.add(animales1);
            
            String opcion = JOptionPane.showInputDialog("Desea registrar otra mascota? (1=Si, 2=No) : ");
            menu = Integer.parseInt(opcion); 
       
        }while(menu==1);
          for(int i=0; i<animales.size(); i++){
            JOptionPane.showMessageDialog(null, animales.get(i).toString()); 
          }
          animales.toString();
          
    }
    
}
