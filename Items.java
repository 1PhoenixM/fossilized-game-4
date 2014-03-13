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


    //method toString
    public String toString() {
        return "[Item object: id=" + this.id + " name="+ this.itemName + " desc=" + this.desc + " obtained=" + this.obtained + "]";
    }


   //private
    private int     id;
    private String  itemName;
    private String  desc;
    private boolean obtained = false;
    
}
