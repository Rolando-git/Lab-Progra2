package lab3p2_rolandoordoñez;
public class Financiero extends Personas
{
    private String nombre3;
    private String apellido3;
    private String nacionalidad3;
    private int salario3;
    private int clientes;
    private int productos;

    public Financiero() 
    {
        super();
    }
public Financiero (String nombre3, String apellido3, String nacionalidad3, int salario3, int clientes, int productos)
{
    this.nombre3 = nombre3;
        this.apellido3 = apellido3;
        this.nacionalidad3 = nacionalidad3;
        this.salario3 = salario3;
        this.clientes = clientes;
        this.productos = productos;
}
    public Financiero(String nombre3, String apellido3, String nacionalidad3, int salario3, int clientes, int productos, int id, String nombre, String apellido, String rango) {
        super(id, nombre, apellido, rango);
        this.nombre3 = nombre3;
        this.apellido3 = apellido3;
        this.nacionalidad3 = nacionalidad3;
        this.salario3 = salario3;
        this.clientes = clientes;
        this.productos = productos;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getApellido3() {
        return apellido3;
    }

    public void setApellido3(String apellido3) {
        this.apellido3 = apellido3;
    }

    public String getNacionalidad3() {
        return nacionalidad3;
    }

    public void setNacionalidad3(String nacionalidad3) {
        this.nacionalidad3 = nacionalidad3;
    }

    public int getSalario3() {
        return salario3;
    }

    public void setSalario3(int salario3) {
        this.salario3 = salario3;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Financiero{" + "nombre3=" + nombre3 + ", apellido3=" + apellido3 + ", nacionalidad3=" + nacionalidad3 + ", salario3=" + salario3 + ", clientes=" + clientes + ", productos=" + productos + '}';
    }
    
}
