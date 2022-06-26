package fem.entity;

public class Objectonline extends Object {
    private String objectlink;

    public Objectonline(String objectname, String objectdescripion, String objectlink, double price, int priority) {
       this.objectname = objectname;
       this.objectdescription = objectdescripion;
       this.objectlink = objectlink;
       this.price = price;
       this.priority = priority;
    }

    //getter setter Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //getter setter Priority
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    //getter setter Description
    public String getObjectdescription() {
        return objectdescription;
    }

    public void setObjectdescription(String objectdescription) {
        this.objectdescription = objectdescription;
    }

    //getter setter Objectname
    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    //getter setter Objectlink
    public String getObjectlink() {
        return objectlink;
    }

    public void setObjectlink(String objectlink) {
        this.objectlink = objectlink;
    }

}
