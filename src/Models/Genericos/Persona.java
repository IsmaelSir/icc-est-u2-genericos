package Models.Genericos;

public class Persona {

    private int edad;
    private String nombre;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(){
        
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "[nombre= "+nombre+", edad= "+edad+"]";
    }
}
