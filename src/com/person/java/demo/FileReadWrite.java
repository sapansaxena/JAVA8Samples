package com.person.java.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReadWrite {
	public static void main(String args[]) throws IOException{

		List<String> words = Files.lines(Paths.get("files.txt"))

		.filter(s->s.length()==4)
		.map(String::toUpperCase)
		.distinct()
		.sorted()
		.collect(Collectors.toList());

		System.out.println(words);
	}
}
