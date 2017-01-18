package io.dktechin.jarvis.study;

import io.dktechin.jarvis.study.list.JarvisLinkedList;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Iterator;

public class LinkedListTest {


    @Test
    public void testLinkedList() {
        JarvisLinkedList<String> list = new JarvisLinkedList<String>();
        list.push("1st");
        list.push("2st");
        list.push("3st");

        assertEquals(3, list.size());
        assertEquals(list.get(0) , "1st");
        assertEquals(list.get(1) , "2st");

        list.push("new st", 1);
        assertEquals(4, list.size());
        assertEquals("new st", list.get(1));

        list.remove("2st");
        assertEquals(3, list.size());

        Iterator<String> iterator = list.iterator();
        while ( iterator.hasNext() ) {
            String value = iterator.next();
            assertNotEquals("2st", value);
        }

        System.out.println("test");
    }
}
