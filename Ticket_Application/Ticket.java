package Ticket_Application;

public class Ticket {
    protected int id;
    protected String status;

    public Ticket(int id) {
        this.id = id;
        this.status = "AVAILABLE";
    }
    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }

    
}
