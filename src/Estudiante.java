public class Estudiante {
    public class Estudiante {
        private String primernombre;
        private String SegundoNombre;
        private String PrimerApellido;
        private String SegundoApellido;
        private EmailInstitucional email;
        public Estudiante( String PrimerNombre,String SegundoNombre, String SegundoApellido,EmailInstitucional email)
            this.primernombre= PrimerNombre;


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
