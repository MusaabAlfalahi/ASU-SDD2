package edu.asu.sdd.training;

/**
 * student information class
 * @author Musaab Al-Falahi
 * javadoc -d [path to javadoc destination directory] -sourcepath [path to package directory] [package name]
 *
 */
public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * method to set the name of the student
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method to say hello to the student name
     */
    public void sayHello(){
        System.out.println("Hello " + name);
    }
}
