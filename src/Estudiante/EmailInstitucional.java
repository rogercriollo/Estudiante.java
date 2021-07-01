package Estudiante;

public class EmailInstitucional implements Serializable {


        public static final   String DoOMINIO = "utpl.edu.ec";
        private String email;
        private boolean isPublic ;
        private int CapacidadMax;

        public EmailInstitucional(String email){

            this.email= email;
        }

        public String getEmail() {

            return email.concat("@").concat(DoOMINIO);
        }


    }



