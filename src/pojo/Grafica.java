package pojo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
*
* @author ISC-Luis
*/
public class Grafica {

    public ArrayList<JTextField> getGrafica() {
    
        
       
        if(!(this.equipos.size()%2==0)){
            
            Equipo equipoFantasma =new Equipo();
            equipoFantasma.setNombre("fantasma");
            this.equipos.add(equipoFantasma);
        }
            
        for (int i = 0; i < this.equipos.size(); i++) {
            
            
            encuentros.add(new JTextField( "jornada " + (i+1)));
            this.mostrar(this.equipos); 
            this.combinar(this.equipos);
        }  
        return encuentros;
    }
    
    private ArrayList<JTextField> encuentros= new ArrayList<>();
    private List<Equipo> equipos;
    

    public Grafica(List<Equipo> equipos) {
        
        this.equipos = equipos;
     
    }

    public void combinar(List<Equipo> equipos){            
        Equipo buffer=equipos.get(equipos.size()-1);
  
        for (int i = equipos.size()-1; i > 1; i--) {
            equipos.set(i, equipos.get(i-1));;
        }
        equipos.set(1, buffer);  
    }

    public void mostrar(List<Equipo> equipos){
        for (int i = 0, j=equipos.size()-1; i<j; i++, j--) {
        	if(equipos.get(j).getNombre().equals("fantasma") ) {
                    
                    this.encuentros.add(new JTextField(equipos.get(i).getNombre() + " descansa"));
        		System.out.println(equipos.get(i).getNombre() + " descansa");
        	}else if(equipos.get(i).getNombre().equals("fantasma")){
                    this.encuentros.add(new JTextField(equipos.get(j).getNombre() + " descansa"));
                System.out.println(equipos.get(j).getNombre() + " descansa");
                }else{
                    this.encuentros.add(new JTextField(equipos.get(i).getNombre()+" vs "+ equipos.get(j).getNombre()));
                    System.out.println(equipos.get(i).getNombre()+" vs "+ equipos.get(j).getNombre());
        	}
        }
        System.out.println("*************************************");
    }
}