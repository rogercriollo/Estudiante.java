package Estudiante;

public class FormaB implements EmailInstitucional{
    public String generate(Estudiante estudiante){
        return (estudiante.getPrimerNombre()+estudiante.getPrimerApellido()+estudiante.getSegundoApellido());
    }
}
