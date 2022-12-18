public class App {
    public static void main(String[] args)  {
       Persona persona = new Persona();
       persona.setEdad(20);
       System.out.println(persona.getEdad());

       persona.setNombre("Juan");
       System.out.println(persona.getNombre());

       persona.setTelefono(58505020);
       System.out.println(persona.getTelefono());

      
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;
    //Edad-------------------------
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    //Nombre-----------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    //Telefono--------------------
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
