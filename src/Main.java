public class Main {
    public static void main(String[] args)  {

        Ssm ssm = new Ssm();
        try {
        ssm.registrarPersona("Emanuel", "Peral", 31, "La Perla", "36382541", "Empleado");
        ssm.registrarPersona("Mariano", "Medina", 31, "barrio1", "36358965", "Empleado");
        ssm.registrarPersona("Sebastian", "Cabral", 31, "barrio2", "25368451", "Empleado");
        ssm.registrarPersona("Andrea", "Cabral", 31, "La Perla", "3215468", "Empleado");
        ssm.registrarPersona("Juan", "Cabral", 31, "centro", "6541236", "Empleado");
        ssm.registrarPersona("Cistina", "Cabral", 31, "Nueva pompeya", "1265489", "Empleado");
        ssm.registrarPersona("Sol", "Cabral", 31, "barrio4", "45987156", "Empleado");
        ssm.registrarPersona("Daiana", "Cabral", 31, "bario5", "36548741", "Empleado");
        ssm.registrarPersona("Esteban", "Cabral", 31, "barrio6", "31985474", "Empleado");
        }catch (SinReactivosException e){
            System.out.println("No hay reactivos");
        }
    }
}