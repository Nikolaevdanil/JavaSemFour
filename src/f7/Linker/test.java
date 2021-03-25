package f7.Linker;

public class test {
    public static void main(String[] args) {
        Team team=new Team();

        Developer one=new BahaDeveloper();
        Developer two=new DanilDeveloper();

        team.addDeveloper(one);
        team.addDeveloper(two);

        team.createProject();
    }
}
