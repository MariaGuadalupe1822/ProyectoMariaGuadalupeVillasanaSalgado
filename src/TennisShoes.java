public class TennisShoes {


    private String name;

    private int amount;
    private char sex;
    private String mark;
    private byte size;
    private String color;
    private int age;

    public String getMark() {
        return mark;
    }

    public TennisShoes(String name, int amount, char sex, String mark, byte size, String color, int age) {
        this.name = name;
        this.amount = amount;
        this.sex = sex;
        this.mark = mark;
        this.size = size;
        this.color = color;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


    public void setMark(String mark) {
        this.mark = mark;
    }

    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        System.out.println("Nombre " + getName());
        System.out.println("Cantidad " + getAmount());
        System.out.println("Sexo " + getSex());
        System.out.println("Marca " + getMark());
        System.out.println("Talla " + getSize());
        System.out.println("Color " + getColor());
        System.out.println("Edad " + getAge());

        return "";
    }
}