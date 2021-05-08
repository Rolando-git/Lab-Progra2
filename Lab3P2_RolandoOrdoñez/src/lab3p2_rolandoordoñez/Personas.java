package lab3p2_rolandoordoñez;
public class Personas 
{
    private int id;
    private String nombre;
    private String apellido;
    private String rango;

    public Personas() 
    {
        
    }

    public Personas(int id, String nombre, String apellido, String rango) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rango = rango;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", rango=" + rango + '}';
    }
    
}
