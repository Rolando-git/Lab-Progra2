package lab3p2_rolandoordoñez;
public class Cliente extends Personas
{
    private String nombre4;
    private String apellido4;
    private String nacionalidad4;
    private int salario4;
    private int credito;
    private int comprado;
    private String domicilio;

    public Cliente() 
    {
        super();
    }
public Cliente (String nombre4, String apellido4, String nacionalidad4, int salario4, int credito, int comprado, String domicilio)
{
    this.nombre4 = nombre4;
        this.apellido4 = apellido4;
        this.nacionalidad4 = nacionalidad4;
        this.salario4 = salario4;
        this.credito = credito;
        this.comprado = comprado;
        this.domicilio = domicilio;
}
    public Cliente(String nombre4, String apellido4, String nacionalidad4, int salario4, int credito, int comprado, String domicilio, int id, String nombre, String apellido, String rango) {
        super(id, nombre, apellido, rango);
        this.nombre4 = nombre4;
        this.apellido4 = apellido4;
        this.nacionalidad4 = nacionalidad4;
        this.salario4 = salario4;
        this.credito = credito;
        this.comprado = comprado;
        this.domicilio = domicilio;
    }

    public String getNombre4() {
        return nombre4;
    }

    public void setNombre4(String nombre4) {
        this.nombre4 = nombre4;
    }

    public String getApellido4() {
        return apellido4;
    }

    public void setApellido4(String apellido4) {
        this.apellido4 = apellido4;
    }

    public String getNacionalidad4() {
        return nacionalidad4;
    }

    public void setNacionalidad4(String nacionalidad4) {
        this.nacionalidad4 = nacionalidad4;
    }

    public int getSalario4() {
        return salario4;
    }

    public void setSalario4(int salario4) {
        this.salario4 = salario4;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getComprado() {
        return comprado;
    }

    public void setComprado(int comprado) {
        this.comprado = comprado;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre4=" + nombre4 + ", apellido4=" + apellido4 + ", nacionalidad4=" + nacionalidad4 + ", salario4=" + salario4 + ", credito=" + credito + ", comprado=" + comprado + ", domicilio=" + domicilio + '}';
    }
    
}
