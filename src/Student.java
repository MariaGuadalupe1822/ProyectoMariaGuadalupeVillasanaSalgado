public class Student {

    private long controlNumber;
    private String name;
    private String lastname;
    private String career;
    private int semester;
    private double average;

    //atributos




    //gets and sets son los metodos implicitos

    public int getSemester() {
        return this.semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }



    public double getGeneralAverage(long controlNumber) {
        return 0.0;
    }
    public double getSemesterAverage(long controlNumber, int semester) {return 0.0 ;}
    public double getSubjectGrade(long controlNumber, String Subject) {
        return 0.0;
    }

    //metodos explicitos




    public long getControlNumber() {
        return this.controlNumber;
    }
    public void setControlNumber(long controlNumber) {
        this.controlNumber = controlNumber;
    }



    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getLastname() {
        return this.lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getCareer() {
        return this.career;
    }
    public void setCareer(String career) { this.career=career; }





    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }




}

