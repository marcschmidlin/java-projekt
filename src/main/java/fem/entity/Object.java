package fem.entity;

public abstract class Object {
    protected String objectname, objectdescription;
    protected int priority;
    protected double price;

    public abstract double getPrice();
    public abstract void setPrice(double price) ;

    public abstract int getPriority();
    public abstract void setPriority(int priority);

    public abstract String getObjectdescription();
    public abstract void setObjectdescription(String objectdescription);

    public abstract String getObjectname();
    public abstract void setObjectname(String objectname);


}
