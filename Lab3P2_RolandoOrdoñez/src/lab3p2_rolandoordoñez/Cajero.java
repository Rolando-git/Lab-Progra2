package lab3p2_rolandoordoñez;
public class Cajero extends Personas
{
    private String nombre1;
    private String apellido1;
    private int salario;
    private String nacionalidad;
    private int trabajo;
    private int almuerzo;
    private String meta;
    private int atendidos;

    public Cajero() 
    {
        super();
    }
public Cajero (String nombre1, String apellido1, int salario, String nacionalidad, int trabajo, int almuerzo, String meta, int atendidos)
{
    this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.trabajo = trabajo;
        this.almuerzo = almuerzo;
        this.meta = meta;
        this.atendidos = atendidos;
}
    public Cajero(String nombre1, String apellido1, int salario, String nacionalidad, int trabajo, int almuerzo, String meta, int atendidos, int id, String nombre, String apellido, String rango) {
        super(id, nombre, apellido, rango);
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.trabajo = trabajo;
        this.almuerzo = almuerzo;
        this.meta = meta;
        this.atendidos = atendidos;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }

    public int getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(int almuerzo) {
        this.almuerzo = almuerzo;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = atendidos;
    }

    @Override
    public String toString() {
        return "Cajero{" + "nombre1=" + nombre1 + ", apellido1=" + apellido1 + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", trabajo=" + trabajo + ", almuerzo=" + almuerzo + ", meta=" + meta + ", atendidos=" + atendidos + '}';
    }
    
}
