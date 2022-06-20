package entity;

public class objectonline extends object {
    private String objectlink;

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

    public String getObjectlink() {
        return objectlink;
    }
    public void setObjectlink(String objectlink) {
        this.objectlink = objectlink;
    }
}
