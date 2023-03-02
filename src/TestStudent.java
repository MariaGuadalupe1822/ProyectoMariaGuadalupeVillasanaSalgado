public class TestStudent {
    public static void main(String[] args) {

        System.out.println( "Probando clase Student");

        //el objeto es mariaGuadalupe

        Student mariaGuadalupe =new Student( ); //los metodos que me permiten indicar como voy a construir metodos se llama constructor
        // en este caso constructo vacio, porque no tiene parametros


        System.out.println("mariaGuadalupe = " + mariaGuadalupe.toString()); //Imprimió lo mismo



        mariaGuadalupe.setName("Maria Guadalupe"); //darle un nombre
        System.out.println("El nombre del alumno es = " + mariaGuadalupe.getName()); //asignar un nombre


        mariaGuadalupe.setLastname("Villasana");
        System.out.println("El apellido del alumno es = " + mariaGuadalupe.getLastname());

        mariaGuadalupe.setControlNumber(22670010);
        System.out.println("El número de control del alumno es " + mariaGuadalupe.getControlNumber());


        mariaGuadalupe.setAverage(10.0);
        System.out.println("El promedio es  = " + mariaGuadalupe.getAverage());


        mariaGuadalupe.setSemester(2);
        System.out.println("El semestre es  = " + mariaGuadalupe.getSemester());

        mariaGuadalupe.setCareer("Informatica");
        System.out.println("La carrera es " + mariaGuadalupe.getCareer());


      // cuando se crea una clase se crea un constructor



    }

}
