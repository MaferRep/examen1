package pooAereo;

public class avionetasCompetencia {
	
	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    // se quito la carga
    //no tiene pasajeros
    private int nTripulantes;
    private int velocidadMax;
    private int pesoMotores;

    private String color;
 
    private int precioNNP;
    private boolean decoracion, turbo, helices;
    
// modificar valores y revisar si no tiene avion por algun lado
    //metodo constructor ()
    
    public avionetasCompetencia() {
           
            modelo= "aCompent"; //todos los aviones de carga son del modelo AC
            nLicencia = "COMP2022"; //editar esto y modificar el año de la licencia
            nMotores = 4;
            pesoNeto= 2000;
            nTripulantes= 1;
            velocidadMax= 5000;
           
    }      
    public String getModelo() {
   	 return "\ntodos los modelos de avioneta de competencia son: "+ modelo;
    }
    
    public String getPaisElab() {
      	 return "\nsu avioneta fue elaborada en: "+ paisElab;
       }
    public String getnLicencia() {
   	 return "el numero de licencia para Avionetas de competencia es: "+ nLicencia;
    }
    
    public String getnMotores() {
   	 return "la avioneta tiene: " + nMotores +" motores";
    }
    
    public String getpesoMotores() {
    	pesoMotores= nMotores*1000;
      	 return "todos los motores pesan en total:" + pesoMotores +"kg";
       }
    
    public String getPesoNeto() {
    	peso= pesoMotores+peso;
   	 return "el peso neto de la avioneta es: "+ pesoNeto+ "kg";
    }
    
    public String getPeso() {
    	peso= pesoMotores+pesoNeto;
   	 return "el peso de la avioneta es: "+ peso+ "kg";
    }
    
    public String getnTripulantes() {
      	 return "la avioneta permite: "+ nTripulantes + " tripulantes";
       }
    
    public String getVelocidadMax() {
   	 return "la velocidad maxima de la avioneta es: "+ velocidadMax + " km/s";
    }
    
    public String getPrecioNNP() {
   	 precioNNP=((nTripulantes)*25)+(peso*15); // el precio se mide por el numero de slots de carga, numero de pasajeros y peso en kilogramo 
   	 return " la avioneta tiene un precio total de:"+precioNNP +"$";
    }

    public String getDecoracion() {
      	 return "\ntiene decoracion: "+ decoracion;
       }

    public String getTurbo() {
      	 return "\ntiene turbo: "+ turbo;
       }
    

    public String getHelices() {
      	 return "\ntiene doble helice: "+ helices;
       }
    

    public String getColor() {
      	 return "\neligio el color: "+ color;
       }
    
    // info general
    public String getInfo() {
    	return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPeso()+"\n"+getnTripulantes()+"\n"+getVelocidadMax()+"\n"+getPrecioNNP()+"\n"+getDecoracion()+"\n"+getTurbo()+"\n"+getHelices()+"\n"+getColor();
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
    public void setVelocidadMax (int velocidadMax)
    {
            this.velocidadMax = velocidadMax;
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
     
   //setter turbo
     
     public void setTurbo(String turbo)
     {
    	 if (turbo.equalsIgnoreCase ("si")) {
    		 this.turbo= true;
    		 System.out.println("si tiene turbo");
    	 }
    	 else {
    		 this.turbo= false;
    		 System.out.println("no tiene turbo");
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

