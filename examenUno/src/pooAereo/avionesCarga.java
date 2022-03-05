package pooAereo;

public class avionesCarga {
	
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
    private boolean filtroUV;
    

    //metodo constructor ()
    
    public avionesCarga() {
           
            modelo= "AC"; //todos los aviones de carga son del modelo AC
            nLicencia = "AC2020"; //editar esto y modificar el año de la licencia
            nMotores = 6;
            pesoNeto= 7000;
            nCarga  = 500;
            nPasajeros= 1; 
            nTripulantes= 1;
            velocidadMax= 700; 
           
    }      
    public String getModelo() {
   	 return "\ntodos los modelos de avion de carga son: "+ modelo;
    }
    
    public String getPaisElab() {
      	 return "su avion fue elaborado en: "+ paisElab;
       }
    public String getnLicencia() {
   	 return "el numero de licencia para aviones de carga es: "+ nLicencia;
    }
    
    public String getnMotores() {
   	 return "el avion tiene: " + nMotores +" motores";
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
   	 return " el tiene un precio total de:"+precioNNP +"$";
    }

     public String getfiltroUV() {
       	 return " el avion tiene filtro uv:"+ filtroUV;
    }
    
    // info general
    public String getInfo() {
        return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPesoNeto()+"\n"+getPeso() +"\n"+getnCarga() +"\n"+getnPasajeros()+"\n"+getnTripulantes()+"\n"+getVelocidadMax()+"\n"+getPrecioNNP()+"\n"+getfiltroUV();
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
   	 
    }

