package com.Codingwithjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenArrayWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {5,10,12,30,13,18,15,35,38,41};
		
		//Change Array to Collection
		List<Integer> l1=Arrays.stream(ar).boxed().collect(Collectors.toList());
		System.out.println(l1);
		
		// filter() and collect() method
		List<Integer> evenNo=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNo);
        
        // map() method
        List<Integer> graceAdd=l1.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(graceAdd);
        
        
        
        // count() method
        long noOfFailedStudents=l1.stream().filter(m->m<25).count();
        System.out.println(noOfFailedStudents);
        
        // sorted() method
       List<Integer> sortedArray = l1.stream().sorted().collect(Collectors.toList());
       System.out.println(sortedArray);
	}

}
