package pooAereo;

public class helicopterosCivil {
	
	
	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    // se quito la carga y los pasajeros

    private int nTripulantes;
    private int nPasajeros;
    private int alturaMax; //en helicoptero es altura en avioneta velocidad
    private int pesoMotores;
    //se agrega color
    private String color;
 
    private int precioNNP;
    private boolean decoracion, estabilizador, helices;

    //metodo constructor ()
    
    public helicopterosCivil() {
           
            modelo= "eCivil";
            nLicencia = "HC2022"; 
            nMotores = 2;
            pesoNeto= 3000;
            nTripulantes= 2;
            nPasajeros= 4;
            alturaMax= 300;
           
    }      
    public String getModelo() {
   	 return "\ntodos los modelos de Helicoptero Civil son: "+ modelo;
    }
    
    public String getPaisElab() {
      	 return "\nsu Helicoptero fue elaborado en: "+ paisElab;
       }
    public String getnLicencia() {
   	 return "el numero de licencia para Helicopteros civiles es: "+ nLicencia;
    }
    
    public String getnMotores() {
   	 return "el helicoptero tiene: " + nMotores +" motores";
    }
    
    public String getpesoMotores() {
    	pesoMotores= nMotores*1000;
      	 return "todos los motores pesan en total:" + pesoMotores +"kg";
       }
    
    public String getPesoNeto() {
    	peso= pesoMotores+peso;
   	 return "el peso neto del helicoptero es: "+ pesoNeto+ "kg";
    }
    
    public String getPeso() {
    	peso= pesoMotores+pesoNeto;
   	 return "el peso del helicoptero es: "+ peso+ "kg";
    }
    
    public String getnTripulantes() {
      	 return "el helicoptero permite: "+ nTripulantes + " tripulantes";
       }
    
    public String getnPasajeros() {
      	 return "el helicoptero permite: "+ nPasajeros + " tripulantes";
       }
    
    public String getAlturaMax() {
   	 return "la altura maxima del helicoptero es: "+ alturaMax + " pies";
    }
    
    public String getPrecioNNP() {
   	 precioNNP=((nTripulantes+nPasajeros)*25)+(peso*15); // el precio se mide por el numero de slots de carga, numero de pasajeros y peso en kilogramo 
   	 return " el helicoptero tiene un precio total de:"+precioNNP +"$";
    }

    public String getDecoracion() {
      	 return "\ntiene decoracion: "+ decoracion;
       }

    public String getEstabilizador() {
      	 return "\ntiene estabilizador: "+ estabilizador;
       }
    

    public String getHelices() {
      	 return "\ntiene doble helice: "+ helices;
       }
    

    public String getColor() {
      	 return "\neligio el color: "+ color;
       }
    
    // info general
    public String getInfo() {
    	return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPeso()+"\n"+getnTripulantes()+"\n"+getnPasajeros()+"\n"+getAlturaMax()+"\n"+getPrecioNNP()+"\n"+getDecoracion()+"\n"+getEstabilizador()+"\n"+getHelices()+"\n"+getColor();
    }
    
    //setters
    
    public void setModelo(String modelo)
    {
            this.modelo = modelo;
    }
    
    public void setPaisElab(String paisElab)
    {
            this.paisElab = paisElab;
    }
    
    public void setnLicencia(String nLicencia)
    {
            this.nLicencia = nLicencia;
    }

    public void setnMotores(int nMotores)
    {
            this.nMotores = nMotores;
    }
    
    public void setpesoMotores(int pesoMotores)
    {
            this.pesoMotores = pesoMotores;
    }
    
    public void setPeso(int peso)
    {
            this.peso = peso;
    }
    
    public void setPesoNeto(int pesoNeto)
    {
            this.pesoNeto = pesoNeto;
    }
    
    public void setnTripulantes(int nTripulantes)
    {
            this.nTripulantes = nTripulantes;
    }
            
	 public void setnPasajeros(int nPasajeros)
 	{
 	        this.nPasajeros = nPasajeros;         
    }
    public void setAlturaMax (int alturaMax)
    {
            this.alturaMax = alturaMax;
    }
    
    public void setPrecioNNP(int precioNNP)
    {
            this.precioNNP = precioNNP;
    }
    
    public void setColor(String color)
    {
            this.color = color;
    }

//setter decoracion
    
    public void setDecoracion(String decoracion)
    {
   	 if (decoracion.equalsIgnoreCase ("si")) {
   		 this.decoracion= true;
   		 System.out.println("si tiene patrocinador");
   	 }
   	 else {
   		 this.decoracion= false;
   		 System.out.println("no tiene patrocinador");
   	 }
  }
     
   //setter estabilizador
     
     public void setEstabilizador(String estabilizador)
     {
    	 if (estabilizador.equalsIgnoreCase ("si")) {
    		 this.estabilizador= true;
    		 System.out.println("si tiene estabilizador");
    	 }
    	 else {
    		 this.estabilizador= false;
    		 System.out.println("no tiene estabilizador");
    	 }
     }
     
  //setter helices
     
     public void setHelices(String helices)
     {
    	 if (helices.equalsIgnoreCase ("si")) {
    		 this.helices= true;
    		 System.out.println("si tiene doble helices");
    	 }
    	 else {
    		 this.helices= false;
    		 System.out.println("no tiene doble helices");
    	 }
     }

}
