package f8.Iterator;

public class test {
    public static void main(String[] args) {
        String[] skills={"Danil","Baha"};

        JavaDeveloper javaDeveloper=new JavaDeveloper("Theyden",skills);
        Iterator iterator=javaDeveloper.getIterator();
        System.out.println("Developer: "+ javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
