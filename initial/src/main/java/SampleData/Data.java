package SampleData;

import Model.Messages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

    public static List<Messages> getData(){
        List<Messages> list = new ArrayList<>();
        list.add(new Messages(1,new Date(), "this is a test message", "https://www.google.com","lol,lol"));
        list.add(new Messages(1,new Date(), "this is a sample message", "https://www.twitter.com","twitter twitter"));
        return list;

    }



}
