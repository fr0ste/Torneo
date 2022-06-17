package pojo;
/**
*
* @author ISC-Luis
*/
public class Grafica {

    public static String getGrafica(int n) {
        Grafica rr = new Grafica(0);
        String buffer = null;
        for (int i = 0; i < 3; i++) {
            
            
            buffer += ("jornada " + (i+1));
            rr.mostrar(); 
            rr.combinar();
        }  
        return buffer;
    }

    private String[] equipos= new String[4];

    public Grafica(int n) {
        this.equipos[0]="A";
        this.equipos[1]="B";
        this.equipos[2]="C";
        /*this.equipos[3]="D";
        this.equipos[4]="E";
        this.equipos[5]="F";
        this.equipos[6]="G";
        this.equipos[7]="H";
        this.equipos[8]="I";
        */
       this.equipos[3]="fantasma";
    }

    public void combinar(){            
        String buffer=equipos[equipos.length-1];
  
        for (int i = equipos.length-1; i > 1; i--) {
            equipos[i]=equipos[i-1];
        }
        equipos[1]=buffer;  
    }

    public void mostrar(){
        for (int i = 0, j=equipos.length-1; i<j; i++, j--) {
        	if(equipos[j].equals("fantasma") ) {
        		System.out.println(equipos[i] + " descansa");
        	}else if(equipos[i].equals("fantasma")){
                System.out.println(equipos[i] + " descansa");
                }else{
            System.out.println(equipos[i]+" vs "+ equipos[j]);
        	}
        }
        System.out.println("*************************************");
    }
}