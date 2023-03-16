public class PatientTest {

        public static void main(String[] args){
            double imc=0;
            Patient patient=new Patient("Maria",18, 50.0, 1.50,'F');
            imc = patient.imc(patient.getWeight(),patient.getHeight());


            System.out.println("Hola "+patient.getName()+", tu IMC es: "+imc);
            String compotition=patient.Compotition(imc);
            System.out.println("Tu composicion corporal es: "+compotition);
        }
    }

