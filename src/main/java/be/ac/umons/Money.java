package be.ac.umons;

public class Money {

    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int amount() {

        return this.amount;
    }

    public String currency(){

        return this.currency;
    }


    /**
     *
     *
     * Question 2 : Création de la méthode add(Money m) qui retourne un objet Money
     *
     *
     */


    public Money add(Money m) throws Exception {


        if(this.currency().equals(m.currency())) {
            return new Money(this.amount()+m.amount(), this.currency());
        }
        throw new Exception("Not Same currency");

    }






    public Money add(int namount, String currency) throws Exception{

        return this.add(new Money(namount, currency));
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
