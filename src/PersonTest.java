public class PersonTest {
    public static void main(String[]args){
        Person p1 = new Person();
        p1.setName("Selim");
        p1.setAge(16);
        System.out.println("Name: " + p1.getName()) ;
        System.out.println("Age: " + p1.getAge()) ;
        System.out.println( "ID: " + p1.getId()) ;
    }
}
