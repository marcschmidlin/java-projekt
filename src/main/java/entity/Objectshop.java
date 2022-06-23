package entity;

/*
Autor Marc Schmidlin und Flavio Schaffer
Gibt werte von den Objekten zurück
 */

public class Objectshop extends Object {
    private String objectaddress;

    public  double getPrice() {
        return price;
    }
    public  void setPrice(double price) {
        this.price = price;
    }

    public  int getPriority() {
        return priority;
    }
    public  void setPriority(int priority) {
        this.priority = priority;
    }

    public String getObjectdescription() {
        return objectdescription;
    }
    public  void setObjectdescription(String objectdescription) {
        this.objectdescription = objectdescription;
    }

    public String getObjectname() {
        return objectname;
    }
    public  void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    public String getObjectaddress() {
        return objectaddress;
    }
    public void setObjectaddress(String objectaddress) {
        this.objectaddress = objectaddress;
    }
}
