public class RegistroTemperatura {
    private String dni;
    private double temperatura;

    public RegistroTemperatura(String dni, double temperatura) {
        this.dni = dni;
        this.temperatura = temperatura;
    }

    public String getDni() {
        return dni;
    }

    public double getTemperatura() {
        return temperatura;
    }
}
