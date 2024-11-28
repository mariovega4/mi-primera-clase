public class TiendaDeRopa{

    // instance variables - replace the example below with your own
    private String nombre;
    private int numeroEmpleados;
    private boolean vendeCamisetas;

    public TiendaDeRopa(String nombreTienda,int numeroDeEmpleados){
        nombre = nombreTienda;
        numeroEmpleados = numeroDeEmpleados;
        vendeCamisetas = true;
    }

    public String getNombre(String nombreTienda){
        return nombreTienda;    //Devuelve el nombre de la tienda
    }

    public int getNumeroEmpleados(){
        return numeroEmpleados;     //Devuelve el numero de empleados
    }

    public boolean vendeCamisetas(){
        return vendeCamisetas;      //Devuelve si la tienda vende camisetas o no 
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;       //Cambia el nombre de la tienda
    }

    public void modificarNumeroEmpleados(int cambio){
        numeroEmpleados += cambio;      //Cambia el numero de empleados de la tienda
    }

    public void alternarVendeCamisetas(){
        vendeCamisetas =!vendeCamisetas;        //Cambia si vende camisetas o no
    }

    public void imprimirEstado(){
        System.out.println("El nombre de la tienda es:"+ nombre);
        System.out.println("En la tienda trabajan:"+ numeroEmpleados);
        System.out.println("¿La tienda vende camisetas?"+(vendeCamisetas ? "Sí":"No"));
    }

    public String getEstado(){
        return "Nombre de la tienda"+ nombre + ","+
                "En la tienda trabajan"+ numeroEmpleados + ","+
                "¿La tienda vende camisetas?"+ (vendeCamisetas? "Sí":"No");        
    }
}
