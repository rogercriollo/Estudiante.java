package Estudiante;

public class Test {
    public static void main(String[] args) {
        EmailInstitucional est1 = new Estudiante("JUAN","carlos");
        serialize(est1);
    }

    private static void serialize (Estudiante estudiante){
        try {
            EmailInstitucional fileOut = new EmailInstitucional("est1.email");
            EmailInstitucional out = new Estudiante(fileOut);

            out.getEmail(estudiante);

            out.getEmail();
            fileOut.getEmail();
        }catch (serialize ioe){
            ioe.();
        }
    }

    private static EmailInstitucional deserialize(){
        try {
            EmailInstitucional fis = new EmailInstitucional("est1.email");
            Estudiante ois = new Estudiante(fis);

            return (deserialize(EmailInstitucional)) ois.();

        }catch (EmailInstitucional | ClassNotFoundException ioe){
            ioe.();;
        }
        return null;
    }
}
