package Ej1;

public class Main {
    public static void main(String[] args) {


        //p.addExpediente(new Diagnostico(new Expediente(),p));
        //System.out.println("Paciente " + p.toString() + " creado con expediente + " + p.getExpediente().toString());

        Expediente e1 = new Expediente();
        Paciente p1 = e1.getDiagnostico().getPaciente();
        System.out.println("Paciente " + p1.toString() + " creado con expediente + " + p1.getExpediente().toString());

    }
}
