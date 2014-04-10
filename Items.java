package fossilized;

public class Items {

    //public
    //constructor
    public Items() {
    }

    //getters and setters


    public String getItemName() {
        return this.itemName;
    }
    public void setItemName(String value) {
        this.itemName = value;
    }

    public String getDesc() {
        return this.desc;
    }
    public void setDesc(String value) {
        this.desc = value;
    }

      public boolean getObtained() {
        return this.obtained;
    }
    public void setObtained(boolean value) {
        this.obtained = value;
    }
     public double getCost() {
        return this.cost;
    }
    public void setCost(double value) {
        this.cost = value;
    }
    
    public Items getNext() {
        return next;
    }
    public void setNext(Items next) {
        this.next = next;
    }


    //method toString
    public String toString() {
        return "[Item object: id=" + this.id + " name="+ this.itemName + " desc=" + this.desc + " obtained=" + this.obtained + " cost=" + this.cost + "]";
    }


   //private
    private int     id;
    private String  itemName;
    private String  desc;
    private boolean obtained = false;
    private double cost;
    private Items next = null;
}
