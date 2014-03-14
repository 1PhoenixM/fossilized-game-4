package fossilized;

public class Caves extends Locale {


   //constructor
   public Caves(int id) {
      super(id);
   }

   //getters and setters
   public void setFossil(String value) {
      this.fossil = value;
   }
   public String getFossil() {
      return this.fossil;
   }
   
   public void setSeenFossil(boolean value) {
      this.seenFossil = value;
   }
   public boolean getSeenFossil() {
      return this.seenFossil;
   }
   

   //method toString
   @Override
   public String toString() {
      return "Fossils found!" + super.toString() + " Fossil=" + this.fossil + " SeenFossil=" + this.seenFossil;
   }


  //private
   private String fossil;
   private boolean seenFossil = false;
}