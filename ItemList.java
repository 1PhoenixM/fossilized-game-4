public class ItemList {
    
    public ItemList() {
    }
    
    public int getLength() {
        return this.length;
    }

    public Items getHead() {
        return head;
    }
    public void setHead(Items head) {
        this.head = head;
    }

    public Items getLast() {
        return last;
    }
    public void setLast(Items last) {
        this.last = last;
    }
    
    public void add(Items item) {
        // System.out.println("adding " + item.toString());
        if (this.head == null) {
            // The list is empty.
            this.head = item;
            this.last = item;
        } else {
            // The list is NOT empty.
            this.last.setNext(item);
            this.last = item;
        }
        this.length = this.length + 1;
    }
     private int length = 0;
     private Items head;
     private Items last = null;
    }
   
