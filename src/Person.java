public class Person {
    private String name;
    private int numberOfPerson;


    public Person(String name, int numberOfPerson) {
        this.name = name;
        this.numberOfPerson=numberOfPerson;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", numberOfPerson=" + numberOfPerson +
                '}';
    }
}
