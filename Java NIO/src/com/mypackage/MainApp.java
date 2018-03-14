package com.mypackage;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.util.Date;

public class MainApp {
	public static void main(String[] args) throws IOException {
		System.out.println("Creating file and directories using Path, Paths and Files.");
		Path directory1= Paths.get("subDirectory", "files");
		Path file1= Paths.get("subDirectory", "files", "file1.txt");
		
		System.out.println("Using methods of Path class.");
		System.out.println(file1.getNameCount());
		System.out.println(file1.getFileName());
		System.out.println(file1.getName(0));
		System.out.println(Files.exists(file1));
		
		System.out.println("Creating actual file and directory with Files class.");
		Files.createDirectories(directory1);
		//Files.createFile(file1);
		
		Path file2= Paths.get("file2.txt");
		//Files.createFile(file2);
		Path file3= Paths.get("subDirectory", "files", "file3.txt");
		//Files.createFile(file3);
		
		Path file4= Paths.get("subDirectory", "files", "file4.txt");
		System.out.println("Copying, Moving and Deleting files using Files class within same directory.");
		
		//Files.copy(file3, file4);
		//Files.delete(file4);
		//Files.move(file3, file4);
		Path directory5= Paths.get("childDirectory", "files");
		//Files.createDirectories(directory5);
		Path file5= Paths.get("childDirectory", "files", "file1.txt");
		//Files.copy(file1, file5, StandardCopyOption.REPLACE_EXISTING);
		//Files.delete(file5);
		//Files.move(file4, file5);
		
		//Files.copy(directory1, directory5, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("Using resolve method.");
		Path absoulte1= Paths.get("/home/ramesh/java.txt");
		Path absolute2= Paths.get("/home/ramesh/ranjeet/java.txt");
		
		System.out.println(absoulte1.resolve(absolute2));
		System.out.println(absoulte1.relativize(absolute2));
		
		System.out.println("Setting last modified in a file.");
		Path fileModified= Paths.get("fileModified.txt");
		Files.createFile(fileModified);
		
		FileTime fileTime= FileTime.fromMillis(new Date().getTime());
		Files.setLastModifiedTime(fileModified, fileTime);
		System.out.println(Files.getLastModifiedTime(fileModified));
		Files.delete(fileModified);
		
		
		System.out.println("Using DirectoryStream.");
		Path readDirectory= Paths.get("subDirectory", "files");
		
		try(DirectoryStream<Path> stream= Files.newDirectoryStream(readDirectory)){
			for(Path path: stream){
				System.out.println(path.getFileName());
			}
		}
		
		System.out.println("Using DirectoryStream to read files starting with a particular letter.");
		
		try(DirectoryStream<Path> stream= Files.newDirectoryStream(readDirectory, "[f]*")){
			for(Path path: stream){
				System.out.println(path.getFileName());
			}
		}
		
		System.out.println("Deleting .class files using SimpleFileVisitor");
		RemoveFiles files= new RemoveFiles();
		Files.walkFileTree(Paths.get("subDirectory"), files);
		
	}

}
