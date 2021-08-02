package com.keyword;

import java.util.EnumMap;
import java.util.Iterator;

enum JavaMap{HASHMAP,LINKED_HASHMAP,TREEMAP,HASHTABLE}
public class EnumMapKeySet
{
    public static void main(String[] args)
    {
        EnumMap<JavaMap,String> map = new EnumMap<JavaMap, String>(JavaMap.class);
        map.put(JavaMap.HASHMAP,"HM");
        map.put(JavaMap.LINKED_HASHMAP,"LHM");
        map.put(JavaMap.TREEMAP,"TM");
        map.put(JavaMap.HASHTABLE,"HT");
        System.out.println("The Map is "+map);
        System.out.println("The Keys in Map are: ");
        Iterator<JavaMap> iterate = map.keySet().iterator();
        while (iterate.hasNext())
        {
            System.out.println(iterate.next());
        }
    }
}
