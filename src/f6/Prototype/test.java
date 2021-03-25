package f6.Prototype;

public class test {
    public static void main(String[] args) {
        Project project=new Project(5,"Данил");
        System.out.println(project);
        ProjectFactory projectFactory=new ProjectFactory(project);
        Project project11=projectFactory.copyProject();
        System.out.println(project11);
    }
}
