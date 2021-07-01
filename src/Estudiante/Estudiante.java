package Estudiante;

public class Estudiante implements serialize {
        private String PrimerNombre;
        private String SegundoNombre;
        private String PrimerApellido;
        private String SegundoApellido;
        private EmailInstitucional email;

    public Estudiante(String PrimerNombre, String SegundoNombre, String SegundoApellido, EmailInstitucional email) {
        this.PrimerNombre=PrimerNombre;
        this.SegundoNombre=SegundoNombre;
        this.PrimerApellido=PrimerApellido;
        this.SegundoApellido=SegundoApellido;
        this.email=new EmailInstitucional(generateEmail(email));


    }
    private String generateEmail(EmailInstitucional email){
        return email.generateEmail();


            public String getPrimerNombre() {
            return PrimerNombre;
        }

        public void setPrimerNombre(String primerNombre) {
            PrimerNombre = primerNombre;
        }

        public String getSegundoNombre() {
            return SegundoNombre;
        }

        public void setSegundoNombre(String segundoNombre) {
            SegundoNombre = segundoNombre;
        }

        public String getPrimerApellido() {
            return PrimerApellido;
        }

        public void setPrimerApellido(String primerApellido) {
            PrimerApellido = primerApellido;
        }

        public String getSegundoApellido() {
            return SegundoApellido;
        }

        public void setSegundoApellido(String segundoApellido) {
            SegundoApellido = segundoApellido;
        }


    }


