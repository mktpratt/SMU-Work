/**
 * A small class to represent a person -- just a name
 */

public class Person
{
    private String name;

    // How to build a default person
    public Person()
    {
        this("No name yet");
    }

    // How to build a person with a name
    public Person(String initialName)
    {
        name = initialName;
    }

    // How to change the person's name
    public void setName(String newName)
    {
        name = newName;
    }

    // How to get the person's name
    public String getName()
    {
        return name;
    }

    // How to write the person to System.out
    public void writeOutput()
    {
        System.out.println("Name: " + name);
    }

    // How to check if two people have the same name
    public boolean hasSameName(Person otherPerson)
    {
        return name.equalsIgnoreCase(otherPerson.name);
    }

    // How to convert a person to a String
    public String toString()
    {
        return name;
    }

    // How to check if two people are equal
    public boolean equals(Person other)
    {
        return hasSameName(other);
    }
}

