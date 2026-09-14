/**
 * @author Claire Battelle
 */
public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    /**
     * Constructor for a person object
     * @param ID The id of the person
     * @param firstName The first name of the person
     * @param lastName The last name of the person
     * @param title The title of the person
     * @param YOB The year of birth of the person
     */
    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    /**
     * Returns the id
     * @return the id of the person
     */
    // Getters
    public String getID() { return ID; }

    /**
     * Returns the first name
     * @return the first name
     */
    public String getFirstName() { return firstName; }

    /**
     * returns the last name
     * @return the last name
     */
    public String getLastName() { return lastName; }

    /**
     * returns the title
     * @return the title
     */
    public String getTitle() { return title; }

    /**
     * returns the birth year
     * @return year of birth
     * */
    public int getYOB() { return YOB; }

    /**
     * sets the first name
     * @param firstName sets first name
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /**
     * sets the last name
     * @param lastName set last name
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * sets the title
     * @param title set title
     */
    public void setTitle(String title) { this.title = title; }

    /**
     * sets the year of birth
     * @param YOB set year of birth
     */
    public void setYOB(int YOB) { this.YOB = YOB; }

    /**
     * gets first and last name
     * @return get full name
     */
    public String fullName() {
        return firstName + " " + lastName;
    }

    /**
     * gets the formal name
     * @return get formal name
     */
    public String formalName() {
        return title + " " + fullName();
    }

    /**
     * Get a CSV representation of the object
     * @return comma separated list
     */
    public String toCSV() {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    /**
     * get a json representation of the object
     * @return JSON format string
     */
    public String toJSON() {
        return "{\"ID\":\"" + ID + "\",\"firstName\":\"" + firstName + "\",\"lastName\":\"" + lastName + "\",\"title\":\"" + title + "\",\"YOB\":" + YOB + "}";
    }

    /**
     * get an xml representation of the object
     * @return XML format string
     */
    public String toXML() {
        return "<Person><ID>" + ID + "</ID><firstName>" + firstName + "</firstName><lastName>" + lastName + "</lastName><title>" + title + "</title><YOB>" + YOB + "</YOB></Person>";
    }

    /**
     * gets a string
     * @return string representation of the person
     */
    @Override
    public String toString() {
        return "Person{ID='" + ID + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", title='" + title + '\'' + ", YOB=" + YOB + '}';
    }
}
