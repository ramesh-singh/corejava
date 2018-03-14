package com.mypackage;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class RemoveFiles extends SimpleFileVisitor<Path>{
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException{
		System.out.println(file.getFileName());
		if(file.getFileName().toString().endsWith(".class")){
			System.out.println(file.getFileName());
			Files.delete(file);
		}
		return FileVisitResult.CONTINUE;
		
	}

}
