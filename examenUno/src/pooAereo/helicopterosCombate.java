package pooAereo;

public class helicopterosCombate {
	
	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    // se quito la carga
    private int nTripulantes;
    private int nPasajeros;
    private int alturaMax; 
    private int pesoMotores;
    //agregar color
    private String color;
 
    private int precioNNP;
    private boolean camuflaje, estabilizador, blindado;
    
    //metodo constructor ()
    
    public helicopterosCombate() {
           
            modelo= "eCombat"; //
            nLicencia = "HCBO2020";
            nMotores = 4;
            pesoNeto= 7000;
            nTripulantes= 2;
            nPasajeros= 0;
            alturaMax= 800;
           
    }      
    public String getModelo() {
   	 return "\ntodos los helicopteros de Combate son: "+ modelo;
    }
    
    public String getPaisElab() {
      	 return "\nsu helicoptero fue elaborado en: "+ paisElab;
       }
    public String getnLicencia() {
   	 return "el numero de licencia para helicoptero de combate es: "+ nLicencia;
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
   	 return "el peso del helicopteroes es: "+ peso+ "kg";
    }
    
    public String getnTripulantes() {
      	 return "el helicoptero permite: "+ nTripulantes + " tripulantes";
       }
    
    public String getnPasajeros() {
      	 return "el helicoptero permite: "+ nPasajeros + " pasajeros";
       }
    
    public String getVelocidadMax() {
   	 return "la altura maxima del helicoptero es: "+ alturaMax + " pies";
    }
    
    public String getPrecioNNP() {
   	 precioNNP=((nTripulantes+nPasajeros)*25)+(peso*15); // el precio se mide por el numero de slots de carga, numero de pasajeros y peso en kilogramo 
   	 return " el helicoptero tiene un precio total de:"+precioNNP +"$";
    }

    public String getCamuflaje() {
      	 return "\ntiene camuflaje: "+ camuflaje;
       }

    public String getEstabilizador() {
      	 return "\ntiene estabilizador: "+ estabilizador;
       }
    

    public String getBlindado() {
      	 return "\ntiene doble blindado: "+ blindado;
       }
    

    public String getColor() {
      	 return "\neligio el color: "+ color;
       }
    
    // info general
    public String getInfo() {
    	return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPeso()+"\n"+getnTripulantes()+"\n"+getnPasajeros()+"\n"+getVelocidadMax()+"\n"+getPrecioNNP()+"\n"+getCamuflaje()+"\n"+getEstabilizador()+"\n"+getBlindado()+"\n"+getColor();
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
    public void setVelocidadMax (int alturaMax)
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

//setter patrocinio
    
    public void setCamuflaje(String camuflaje)
    {
   	 if (camuflaje.equalsIgnoreCase ("si")) {
   		 this.camuflaje= true;
   		 System.out.println("si tiene camuflaje");
   	 }
   	 else {
   		 this.camuflaje= false;
   		 System.out.println("no tiene camuflaje");
   	 }
  }
     
   //setter turbo
     
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
     
     public void setBlindado(String blindado)
     {
    	 if (blindado.equalsIgnoreCase ("si")) {
    		 this.blindado= true;
    		 System.out.println("si tiene blindado");
    	 }
    	 else {
    		 this.blindado= false;
    		 System.out.println("no tiene blindado");
    	 }
     }
}
