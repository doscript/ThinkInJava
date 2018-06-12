package com.xiaolvkeji.test.standardout;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteConsoleOutputToFile {
	public static void main(String[] args) throws FileNotFoundException {
		writeConsoleOutputToFile();
	}

	private static void writeConsoleOutputToFile() throws FileNotFoundException {
		System.out.println("1. String written to console");
		System.out.println("2. Another String written to console");
		PrintStream printStream = new PrintStream("ConsoleOutputFile.txt");
		System.setOut(printStream);
		System.out.println("3. Console output written to file");
		System.out.print("4. Another console output written to file");
		System.out.printf("5. Write yet another string to file");
		// Redirect to console output
		PrintStream consoleStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
		System.setOut(consoleStream);
		System.out.println("6. Reset to write on console output");
		System.out.println("7. Demonstration of console output");
	}
}
