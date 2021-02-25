public class Student  {
    private int age;
    private String  town;


    public Student(int age, String town) {
        this.age = age;
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String customShow(Function<Student,String >function){
        return function.apply(this);
    }
}
