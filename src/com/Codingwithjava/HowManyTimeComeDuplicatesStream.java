package com.Codingwithjava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HowManyTimeComeDuplicatesStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,5,3,5,5,1,7,8,7,7};
		List<Integer> no = Arrays.stream(ar).boxed().toList();
		Map<Integer, Long> duplicates = no.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().filter(item->item.getValue()>1)
        .collect(Collectors.toMap(e -> e.getKey(), e-> e.getValue()));
        System.out.println(duplicates);
}
}