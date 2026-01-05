package Ticket_Application;

public class PremiumTicket extends Ticket{
    private double extracharge;

    public PremiumTicket(int id, double extracharge) {
        super(id);
        this.extracharge =extracharge;
    }

    

}
