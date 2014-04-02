package fossilized;

public class Locale {

    //public
    // constructor
    public Locale(int id) {
        this.id = id;
    }

    //getters and setters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String value) {
        this.name = value;
    }

    public String getDesc() {
        return this.desc;
    }
    public void setDesc(String value) {
        this.desc = value;
    }

    public boolean getHasVisited() {
        return hasVisited;
    }
    public void setHasVisited(boolean hasVisited) {
        this.hasVisited = hasVisited;
    }
    
    public Items getItem() {
        return item;
    }
    public void setItem(Items item) {
        this.item = item;
    }

    //method toString
    @Override
    public String toString() {
        return "[Locale object: id=" + this.id + " name="+ this.name + " desc=" + this.desc + "item=" + this.item + "]";
    }

    //private
    private int     id;
    private String  name;
    private String  desc;
    private Items   item;
    private boolean hasVisited = false;
    private int north; //as in, the location to the north
    private int south;
    private int east;
    private int west;
}