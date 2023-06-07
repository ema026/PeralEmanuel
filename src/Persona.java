import java.util.Random;

public class Persona {
    private static Integer contKit = 1;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String barrio;
    private String dni;
    private String ocupacion;

    private Integer numeroKit;
    private double temperatura;

    public Persona(String nombre, String apellido, Integer edad, String barrio, String dni, String ocupacion) {
    Random random = new Random();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.barrio = barrio;
        this.dni = dni;
        this.ocupacion = ocupacion;
        this.numeroKit = contKit++;
        this.temperatura = 36 + random.nextDouble() * (39 - 36); // Genera temperatura aleatoria entre 36 y 39

    }


    public Persona() {
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getNumeroKit() {
        return numeroKit;
    }

    public void setNumeroKit(Integer numeroKit) {
        this.numeroKit = numeroKit;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
