package com.vivek.client;

import com.vivek.FileReadWrite.ReadFileWrite;
import com.vivek.bst.BST;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST<String> bst = new BST<>();
		ReadFileWrite readFile = new ReadFileWrite(bst);
		readFile.writer("MyFile");
		readFile.reader("MyFile");
		bst.inorderTraversal();
	}

}
