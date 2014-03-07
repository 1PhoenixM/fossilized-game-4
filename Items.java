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



    //method toString
    public String toString() {
        return "[Item object: id=" + this.id + " name="+ this.itemName + " desc=" + this.desc + "]";
    }


   //private
    private int     id;
    private String  itemName;
    private String  desc;

    
}
