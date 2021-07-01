public class EmailInstitucional {
        public static final   String DOMINIO = "utpl.edu.ec";
        private String email;
        private boolean isPublic ;
        private int CapacidadMax;

    public EmailInstitucional(String email){
        this.email= email;
    }

    public String getEmail() {
        return email.concat("@").concat(DOMINIO);
    }



}
