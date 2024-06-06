package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListProgram {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ace", "act", "Add", "Test", "123");
		
		List<String> filteredList = filterList(list);
		System.out.println(filteredList);
	}

	private static List<String> filterList(List<String> listToFilter) {
		return listToFilter.stream().filter(stringInList -> stringInList.startsWith("a") && stringInList.length() == 3)
				.collect(Collectors.toList());
	}
}
