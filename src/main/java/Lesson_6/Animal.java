package src.main.java.Lesson_6;

public class Animal {
    protected String name;
    public Animal (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice(){
        System.out.println("Животное что-то говорит");
    }
}
