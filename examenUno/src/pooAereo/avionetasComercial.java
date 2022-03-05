package pooAereo;

public class avionetasComercial {
//avioneta de publicidad
	
	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    // se quito la carga
    private int nTripulantes;
    private int nPasajeros;
    private int velocidadMax;
    private int pesoMotores;
    //se agrego color
    private String color;
 
    private int precioNNP;
    private boolean decoracion, pancarta, helices;
    

    //metodo constructor ()
    
    public avionetasComercial() {
           
            modelo= "aComerce"; //todos los aviones de carga son del modelo AC
            nLicencia = "COM2021"; //editar esto y modificar el año de la licencia
            nMotores = 2;
            pesoNeto= 2000;
            nTripulantes= 2;
            nPasajeros= 1;
            velocidadMax= 2000;
           
    }      
    public String getModelo() {
   	 return "\ntodos los modelos de avioneta comercial son: "+ modelo;
    }
    
    public String getPaisElab() {
      	 return "\nsu avioneta fue elaborada en: "+ paisElab;
       }
    public String getnLicencia() {
   	 return "el numero de licencia para avionetas comerciales es: "+ nLicencia;
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
    
    public String getnPasajeros() {
      	 return "la avioneta permite: "+ nPasajeros + " tripulantes";
       }
    
    public String getVelocidadMax() {
   	 return "la velocidad maxima de la avioneta es: "+ velocidadMax + " km/s";
    }
    
    public String getPrecioNNP() {
   	 precioNNP=((nTripulantes+nPasajeros)*25)+(peso*15); // el precio se mide por el numero de slots de carga, numero de pasajeros y peso en kilogramo 
   	 return " la avioneta tiene un precio total de:"+precioNNP +"$";
    }

    public String getDecoracion() {
      	 return "\ntiene decoracion: "+ decoracion;
       }

    public String getPancarta() {
      	 return "\ntiene pancarta: "+ pancarta;
       }
    

    public String getHelices() {
      	 return "\ntiene doble helice: "+ helices;
       }
    

    public String getColor() {
      	 return "\neligio el color: "+ color;
       }
    
    // info general
    public String getInfo() {
    	return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPeso()+"\n"+getnTripulantes()+"\n"+getnPasajeros()+"\n"+getVelocidadMax()+"\n"+getPrecioNNP()+"\n"+getDecoracion()+"\n"+getPancarta()+"\n"+getHelices()+"\n"+getColor();
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
     
  //setter pancarta
     
     public void setPancarta(String pancarta)
     {
    	 if (pancarta.equalsIgnoreCase ("si")) {
    		 this.pancarta= true;
    		 System.out.println("si tiene doble helices");
    	 }
    	 else {
    		 this.pancarta= false;
    		 System.out.println("no tiene doble helices");
    	 }
     }
}

