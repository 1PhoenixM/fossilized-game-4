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

   //method toString
   @Override
   public String toString() {
      return "Fossils found!" + super.toString() + " Fossil=" + this.fossil;
   }


  //private
   private String fossil;

}