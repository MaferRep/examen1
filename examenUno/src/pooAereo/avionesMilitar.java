package pooAereo;

public class avionesMilitar {

	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    private int nCarga;
    private int nPasajeros;
    private int nTripulantes;
    private int velocidadMax;
    private int pesoMotores;
 
    private int precioNNP;
    private boolean filtroUV, camuflaje, blindado;
    

    //metodo constructor ()
    
    public avionesMilitar() {
           
            modelo= "AM"; //todos los aviones Militares son del modelo AM
            nLicencia = "AM2020"; 
            nMotores = 6;
            pesoNeto= 5000;
            nCarga  = 250;
            nPasajeros= 10; 
            nTripulantes= 4;
            velocidadMax= 5000;
           
    }      
    public String getModelo() {
   	 return "\ntodos los modelos de avion militar son: "+ modelo;
    }
    
    public String getPaisElab() {
      	 return "su avion fue elaborado en: "+ paisElab;
       }
    public String getnLicencia() {
   	 return "el numero de licencia para aviones militares es: "+ nLicencia;
    }
    
    public String getnMotores() {
   	 return "el avion tiene: " + nMotores +" motores";
    }
    
    public String getBlindado() {
      	 return "el avion tiene blindado: " + blindado;
       }
    
    public String getpesoMotores() {
    	pesoMotores= nMotores*1000;
      	 return "todos los motores pesan en total:" + pesoMotores +"kg";
       }
    
    public String getPesoNeto() {
    	peso= pesoMotores+peso;
   	 return "el peso neto del aviones es: "+ pesoNeto+ "kg";
    }
    
    public String getPeso() {
    	peso= pesoMotores+pesoNeto;
   	 return "el peso del aviones es: "+ peso+ "kg";
    }
    public String getnCarga() {
   	 return "el avion tiene: "+ nCarga +" slots de carga";
    }
    
    public String getnPasajeros() {
   	 return "el avion tiene: "+ nPasajeros + " slots pasajeros";
    }
    
    public String getnTripulantes() {
      	 return "el avion permite: "+ nTripulantes + " tripulantes";
       }
    
    public String getVelocidadMax() {
   	 return "la velocidad maxima del avion es: "+ velocidadMax + " km/s";
    }
    
    public String getPrecioNNP() {
   	 precioNNP=(nCarga*5)+((nPasajeros+nTripulantes)*25)+(peso*15); // el precio se mide por el numero de slots de carga, numero de pasajeros y peso en kilogramo 
   	 return " el avion tiene un precio total de:"+precioNNP +"$";
    }

     public String getfiltroUV() {
       	 return " el avion tiene filtro UV:"+ filtroUV;
    }
    
     public String getCamuflaje() {
       	 return " el avion tiene camuflaje:"+ camuflaje;
    }
    // info general
    public String getInfo() {
        return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPesoNeto()+"\n"+getPeso() +"\n"+getnCarga() +"\n"+getnPasajeros()+"\n"+getnTripulantes()+"\n"+getVelocidadMax()+"\n"+getPrecioNNP()+"\n"+getfiltroUV()+"\n"+getCamuflaje()+"\n"+getBlindado();
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
    
    public void setnCarga(int nCarga)
    {
            this.nCarga = nCarga;
    }
    
    public void setnPasajeros(int nPasajeros)
    {
            this.nPasajeros = nPasajeros;
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

//setter Filtro UV
    
    public void configFUV(String filtroUV)
    {
   	 if (filtroUV.equalsIgnoreCase ("si")) {
   		 this.filtroUV= true;
   		 System.out.println("si tiene filtro UV");
   	 }
   	 else {
   		 this.filtroUV= false;
   		 System.out.println("no tiene filtro UV");
   	 }
  }
    
   //setter camuflaje 
     
     public void setCamuflaje(String camuflaje)
     {
    	 if (camuflaje.equalsIgnoreCase ("si")) {
    		 this.camuflaje= true;
    		 System.out.println("si tiene filtro UV");
    	 }
    	 else {
    		 this.camuflaje= false;
    		 System.out.println("no tiene filtro UV");
    	 }
   	 
    }
     
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
