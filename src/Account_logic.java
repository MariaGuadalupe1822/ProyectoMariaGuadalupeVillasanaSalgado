public class Account_logic {
    private String name;
    private long id;
    private double operationDate;
    private String reason;
    private String payment;
    private double balance;

    public Account_logic(String name, long id, double operationDate, String reason, String payment, double balance) {

        this.name = name;
        this.id = id;
        this.operationDate = operationDate;
        this.reason = reason;
        this.payment = payment;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(double operationDate) {
        this.operationDate = operationDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {

        System.out.println("Los datos el dueño son: ");
        System.out.println("Nombre: "+getName());
        System.out.println("El ID es: "+getId());
        System.out.println("Fecha de apertura: "+getOperationDate());
        System.out.println("Motivo de apertura: "+getReason());
        System.out.println("Su saldo es de: "+getBalance());

        return"";
    }

}
