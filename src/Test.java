import java.util.*;
import java.util.zip.Adler32;



public class Test {
    public static void main(String[] args) {
        List<Student> list=new ArrayList();
        list.add(new Student(25,"1"));
        list.add(new Student(20,"2"));
        list.add(new Student(19,"3"));
        list.add(new Student(18,"3"));
        list.add(new Student(18,"6"));
        Map<String,List<Student>> map=new HashMap<>();
        Function<List<Student>, Map<String,List<Student>>> func =s-> {
            sort(s,map);
            return map;
        };
        System.out.println(func.apply(list));
    }
    public static void sort(List<Student>list,Map<String,List<Student>> map){
        List<Student>list1=new ArrayList<>();
        List<Student>list2=new ArrayList<>();
        List<Student>list3=new ArrayList<>();
        List<Student>listf=new ArrayList<>();
        for(Student x:list) {
            if(x.getTown()=="1"){
               list1.add(x);
            }
            else  if(x.getTown()=="2"){
                list2.add(x);
            }
            else  if(x.getTown()=="3"){
                list3.add(x);
            }
            else {
               listf.add(x);
            }
        }
        map.put("1",list1);
        map.put("2",list2);
        map.put("3",list3);
        map.put("Все",listf);

    }




}
