
package org.learn.Question;

import java.util.Arrays;

public class Root2Leaf {
	private static int nPath ;
	public static void root2LeafPath(Node root, int[] path) {
		nPath = 0;
		processPath(root, path,0);
	}
	private static void processPath(Node root, int[] path,int index) {
		if(null == root) {
			return;
		}
		path[index++] = root.data;
		if(root.left == null && root.right == null) {
			print(path,index);
			return;
		}
		processPath(root.left,path,index);
		processPath(root.right,path,index);		
		return;
	}
	
	private static void print(int[] path,int index) {
		System.out.printf("Root to Leaf path %d : ",++nPath);
		System.out.println(Arrays.toString(Arrays.copyOf(path,index)));
		return;
	}
}
