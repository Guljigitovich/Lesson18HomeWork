public class Main {
    public static void main(String[] args) {
        Person person = new Person("Asan",5);
        Person person1 = new Person("Aktan",3);
        Person person2= new Person("Atai",4);




        Flat housing = new Flat("Flat","Toktogul #45",5);
        Hotel housing1= new Hotel("Hotel","Jibek jolu",3);
        Hostel housing2 = new Hostel("Hostel","Ryskulova",4);

        System.out.println(person.toString()+housing.toString());
        System.out.println(person1.toString()+housing1.toString());
        System.out.println(person2.toString()+housing2.toString());





    }
}