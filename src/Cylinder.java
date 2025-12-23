public class Cylinder {
   public double r;
   public double h;
   public static int noOfCylinder = 0;

   public Cylinder(double r, double h){
       this.r = r;
       this.h = h;
       noOfCylinder++;
   }

   public Cylinder(){
       this(3,4) ;
   }

   public static int getNoOfCylinder(){
       return noOfCylinder;
   }

   public double calculateBaseArea(){
       return Math.PI * r *r ;
   }

   public double calculateSurfaceArea(){
       return 2 * Math.PI * r * (r + h );
   }

   public double calculateVolume(){
       return Math.PI * r * r * h ;
   }

   public double calculateMass(double density){
      return calculateVolume() * density;
   }
}
