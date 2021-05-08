package lab3p2_rolandoordoñez;
public class Supervisor extends Personas
{
    private String nombre2;
    private String apellido2;
    private int salario1;
    private String cajero;
    private int salarioP;
    private String metaP;

    public Supervisor() 
    {
        super();
    }
public Supervisor (String nombre2, String apellido2, int salario1, String cajero, int salarioP, String metaP)
{
    this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.salario1 = salario1;
        this.cajero = cajero;
        this.salarioP = salarioP;
        this.metaP = metaP;
}
    public Supervisor(String nombre2, String apellido2, int salario1, String cajero, int salarioP, String metaP, int id, String nombre, String apellido, String rango) {
        super(id, nombre, apellido, rango);
        this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.salario1 = salario1;
        this.cajero = cajero;
        this.salarioP = salarioP;
        this.metaP = metaP;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getSalario1() {
        return salario1;
    }

    public void setSalario1(int salario1) {
        this.salario1 = salario1;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public int getSalarioP() {
        return salarioP;
    }

    public void setSalarioP(int salarioP) {
        this.salarioP = salarioP;
    }

    public String getMetaP() {
        return metaP;
    }

    public void setMetaP(String metaP) {
        this.metaP = metaP;
    }

    @Override
    public String toString() {
        return "Supervisor{" + "nombre2=" + nombre2 + ", apellido2=" + apellido2 + ", salario1=" + salario1 + ", cajero=" + cajero + ", salarioP=" + salarioP + ", metaP=" + metaP + '}';
    }
    
}
