package rekursion.ue.file;

import java.io.File;

public class RekursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("/Test");
		System.out.println(file.listFiles().length);
		
		System.out.println("Size: " + getSize(file));
		
		System.out.println("-------------------------");
		
		print(file,"");

	}
	
	public static void print(File f, String prefix) {
		File[] files = f.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()) {
				System.out.println(prefix + "+" + files[i].getName());
				print(files[i], prefix+" ");
			}
			else System.out.println(prefix + "-" + files[i].getName());
		}
	}
	
	public static long getSize(File f) {
		long size = f.length();
				if(!f.isDirectory())
					return size;
		
		for (File file : f.listFiles()) {
			size += getSize(file);
		}
		return size;
	}

}
