package Estudiante;

public class FormaA implements EmailInstitucional{
    public String generate(Estudiante estudiante){
        return (estudiante.getPrimerApellido())+estudiante.getSegundoApellido()+estudiante.getPrimerNombre()+estudiante.setSegundoNombre();

    }

    }