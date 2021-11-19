package ExercicioCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioEstoque {
	
		public static void main(String[] args) {
			String nome = null;
			String lote = null;
			int quantidade = 0;
			
	Scanner scan = new Scanner(System.in);
			
			ArrayList<Produto>  = new ArrayList();
			
			int quantProduto = scan.nextInt();
			scan.nextLine();
			
			for(int i = 0; i < quantProduto; i++) {
				System.out.println("Digite o nome do produto: ");
				nome = scan.next();
				scan.nextLine();
				System.out.println("Digite o lote do produto:");
				lote = scan.next();
				scan.nextLine();
				System.out.println("Digite a quantidade do produto:");
				quantidade = scan.nextInt();
				
				produto.add(new Produto(nome, lote, quantidade));
			}
			
			for(Produto al : produto) {
			System.out.println(al);
			}
			
			System.out.println();
			
			produto.remove(0);
			
			System.out.println("Atualizando...");
			System.out.println();
			
			produto.add(new Produto("Xcaixa", "585", 3));
			
			for(Produto al : produto) {
				System.out.println(al);
			}
			
			scan.close();
		}
	}

}
