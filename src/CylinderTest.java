public class CylinderTest {
    public static void main(String[] args) {
        System.out.println("Number of cylinders: " + Cylinder.getNoOfCylinder());
        System.out.println();
        Cylinder c1 = new Cylinder();
        System.out.println("* c1 properties:");
        System.out.println("Hight: " + c1.h + "\nRadius: " + c1.r);
        System.out.println("Number of cylinders: " + Cylinder.getNoOfCylinder());
        System.out.println();

        Cylinder c2 = new Cylinder(10,20);
        System.out.println("* c2 properties:");
        System.out.println("Hight: " + c2.h + "\nRadius: " + c2.r);
        System.out.println("Base Area: " + c2.calculateBaseArea());
        System.out.println("Surface Area: " + c2.calculateSurfaceArea());
        System.out.println("Volume: " + c2.calculateVolume());
        System.out.println("Mass: " + c2.calculateMass(5.12));
        System.out.println("Number of cylinders: " + Cylinder.getNoOfCylinder());
    }
}
