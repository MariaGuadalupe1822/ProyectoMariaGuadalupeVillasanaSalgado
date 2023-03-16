public class Patient {

    private String name;
    private int age;
    private char sex;
    private double weight;
    private double height;
    private String competition;

    public Patient() {
    }//metodo, constructor vacio

    public Patient(String name, int age, double weight, double height, char sex) { //constructor,constror parametrizado
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    //siguen los constructores vacios y paramaetrizados
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public double imc(double weight, double heigth) {

        return weight / (heigth * heigth);
    }

    public String Compotition(double imc) {

        if (imc < 18.5) {
            return "under weight";
        } else if (imc >= 18.5 && imc < 25) {
            return "normal";
        } else if (imc >= 25 && imc < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }



}

  //  public String compotition(double imc) {
    //    }


