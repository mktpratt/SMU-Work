public class Person
{
    // ********** instance variables ********** //
    private String name;

    // ********** constructors ********** //
    public Person() {
        this("No name yet");
    }

    public Person(String initialName) {
        name = initialName;
    }

    // ********** instance methods ********** //
    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(Person other) {
        if (other == null) return false;
        return name.equalsIgnoreCase(other.name);
    }

    public String toString() {
        return "Person: " + name;
    }
}

