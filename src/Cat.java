public class Cat {
    int x;
    double direction;
    String name;

    public Cat(){
        this(0,180,"Sofya");
    }
    public Cat(int x, double direction, String name){
        this.x = x;
        this.direction = direction;
        this.name = name;
    }

    public void move(){
        x += 20;
    }

    public void move2(int a){
        x += a;
    }

    public void turn(double angle){
        direction += angle;
    }

    public void status(){
        System.out.println("Name: " + name + "\nx: " + x + "\nDirection: " + direction);
        System.out.println("******************************");
    }

}
