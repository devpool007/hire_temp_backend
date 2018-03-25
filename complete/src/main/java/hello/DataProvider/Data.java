package hello.DataProvider;


import Model.Company;
import Model.Messages;
import Model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {


    List<Student> students = getStudents();

    public static List<Messages> getData(){
        List<Messages> list = new ArrayList<>();
        list.add(new Messages(1,new Date(), "this is a test message", "https://www.google.com","lol,lol"));
        list.add(new Messages(1,new Date(), "this is a sample message", "https://www.twitter.com","twitter twitter"));
        return list;
    }


    public static List<Student> getStudents(){
        List<Student> sample = new ArrayList<>();
        sample.add(new Student("ra1411003010688","rohan","893914242","rohan@sample.com","baaap","male","indian","dharti maa","chennai","tamil nadu","india","603203","www.google.com",new Date()));
        sample.add(new Student("ra1411003010999","sachin","w5w5ww","lol@sample.com","asnfafn","chakka","australia","uganda","chennai","tamil nadu","india","603203","www.fb.com",new Date()));
        return sample;
    }

    public static Student getStudentByReg(String reg){
        List<Student> sample = getStudents();
        for(Student d: sample){
            if(d.reg_no.equals(reg)){
                return d;
            }
        }
        return null;
    }

    public static List<Company> getCompanies(){
        List<Company> comp = new ArrayList<>();
        comp.add(new Company("Apple","1","iPhone","https://image.freepik.com/free-icon/apple-logo_318-40184.jpg"));
        comp.add(new Company("google","2","Pixel XL","https://cdn.vox-cdn.com/thumbor/Pkmq1nm3skO0-j693JTMd7RL0Zk=/0x0:2012x1341/1200x800/filters:focal(0x0:2012x1341)/cdn.vox-cdn.com/uploads/chorus_image/image/47070706/google2.0.0.jpg"));
        return comp;
    }





}
