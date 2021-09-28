package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] a) {
		
		for(int []rad: a) {
			for (int tall: rad) {
			System.out.print(tall);
			}
			System.out.println("");
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String tekst = "";
		for(int []rad:matrise) {
			for(int tall: rad) {
			tekst += tall + " ";
			}
			tekst += '\n';
			
		}
		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyTabell = new int[matrise.length][];
		for(int i = 0; i < matrise.length; i++) {
			nyTabell[i] = new int[matrise[i].length];
		
		}
		
		for(int i = 0; i < matrise.length; i++)
			for(int j= 0; j < matrise[i].length; j++) {
				nyTabell[i][j] = matrise[i][j]*tall;
				
				
			}
		return nyTabell;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean likAntallRad = false;
		boolean likTall = false;
		boolean erLik = false;
	for(int i= 0; i<a.length; i++) {
			if (a[i].length == b[i].length) 
				likAntallRad = true;
			else 
				likAntallRad = false;
			
			for(int j= 0; j < a[i].length; j++) {
				if (a[i][j] == b[i][j])
					likTall = true;
				else
					likTall = false;
			}	
		}
	
		if (likAntallRad && likTall) {
		erLik = true;
		}
		
		return erLik;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
