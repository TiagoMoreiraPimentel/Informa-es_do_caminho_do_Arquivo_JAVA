package App;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// define o metodo scanner e pede para digitar um caminho da pasta
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		// armazena o caminho na variavel strPath
		File path = new File(strPath);
		
		// imprime o caminho completo do arquivo no diretorio informado
		System.out.println("getPath: " + path.getPath());
		
		// imprime o caminho do arquivo no diretorio informado ignorando o nome do arquivo
		System.out.println("getParent: " + path.getParent());
		
		// imprime o nome dos arquivos no diretorio informado ignorando o caminho
		System.out.println("getName: " + path.getName());
		
		sc.close();
		
	}

}
