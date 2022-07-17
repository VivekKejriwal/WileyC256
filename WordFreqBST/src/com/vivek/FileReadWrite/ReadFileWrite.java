package com.vivek.FileReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.vivek.bst.BST;

public class ReadFileWrite {
	BST<String> bst = new BST<>();

	public ReadFileWrite(BST<String> bst) {
		super();
		this.bst = bst;
	}

	public void reader(String fileName) {
		try (FileInputStream fileInputStream = new FileInputStream(fileName);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

			while (true)
				bst.insert((String) objectInputStream.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void writer(String fileName) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject("Hi");
			objectOutputStream.writeObject("My");
			objectOutputStream.writeObject("Name");
			objectOutputStream.writeObject("Is");
			objectOutputStream.writeObject("Anthony");
			objectOutputStream.writeObject("Gonsalves");
			objectOutputStream.writeObject("Hi&");
			objectOutputStream.writeObject("My");
			objectOutputStream.writeObject("Name");
			objectOutputStream.writeObject("Is");
			objectOutputStream.writeObject("Anthony");
			objectOutputStream.writeObject("Gonsalves");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
