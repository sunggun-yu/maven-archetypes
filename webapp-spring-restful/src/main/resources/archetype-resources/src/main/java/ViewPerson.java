package ${package};

/**
 * @author $Author$
 * @version $Rev$
 */
public class ViewPerson {
    private String name;
    private int age;

    public ViewPerson(String name) {
        this.name = name;
    }
    
    public ViewPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}