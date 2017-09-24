package BeginnersBook;

public class Enum {
   public enum Directions{
		  EAST, 
		  WEST, 
		  NORTH, 
		  SOUTH
   }     
   Directions dir;
   public Enum(Directions dir) {
      this.dir = dir;
   }
   public void getMyDirection() {
     switch (dir) {
       case EAST:  System.out.println("In East Direction");   break;
       case WEST:  System.out.println("In West Direction");   break;
       case NORTH: System.out.println("In North Direction");  break;
       default:    System.out.println("In South Direction");  break;
     }
   }

	
	public static void main(String[] args) {
		Enum obj1 = new Enum(Directions.EAST);
        obj1.getMyDirection();
        Enum obj2 = new Enum(Directions.SOUTH);
        obj2.getMyDirection();

	}

}
