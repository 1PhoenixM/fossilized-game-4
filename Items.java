package fossilized;

public class Items {

    //public
    //constructor
    public Items(int id) {
        this.id = id;
    }

    //getters and setters
    public int getId() {
        return this.id;
    }

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
     public int getCost() {
        return this.cost;
    }
    public void setCost(int value) {
        this.cost = value;
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
    private int cost;
    
}
