package Ticket_Application;

public class Ticket {
    protected int id;
    protected String status;

    public Ticket(int id, String status) {
        this.id = id;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }

    
}
