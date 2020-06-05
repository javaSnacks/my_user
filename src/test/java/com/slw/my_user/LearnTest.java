package com.slw.my_user;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnTest {

    @Test
    public void test(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("two")){
                iterator.remove();
            }
        }
        System.out.println(list);
//        for (String s :
//                list) {
//            if ("two".equals(s)){
//                list.remove(s);
//            }
//        }
//        System.out.println(list);
    }
}
