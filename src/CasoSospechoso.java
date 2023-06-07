public class CasoSospechoso {
    private int numeroKit;
    private double temperatura;
    private String barrio;

    public CasoSospechoso(int numeroKit, double temperatura, String barrio) {
        this.numeroKit = numeroKit;
        this.temperatura = temperatura;
        this.barrio = barrio;
    }

    public int getNumeroKit() {
        return numeroKit;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getBarrio() {
        return barrio;
    }

    @Override
    public String toString() {
        return "CasoSospechoso{" +
                "numeroKit=" + numeroKit +
                ", temperatura=" + temperatura +
                ", barrio='" + barrio + '\'' +
                '}';
    }
}