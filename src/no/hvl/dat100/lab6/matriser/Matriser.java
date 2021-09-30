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

		int[][] speilTabell = new int[matrise.length][];
		for(int i = 0; i < matrise.length; i++) {
			speilTabell[i] = new int[matrise[i].length];
		}
			
			for( int j = 0; j<speilTabell.length; j++) {
				for (int k= 0; k<speilTabell[j].length; k++) {
					speilTabell[k][j] = matrise[j][k];
				}
			}
			
		return speilTabell;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] multiTabell = new int[a.length][];
		for(int i = 0; i < a.length; i++) {
			multiTabell[i] = new int[a[i].length];
			
		}
		
		for (int i= 0; i<multiTabell.length; i++) {
			for(int j = 0; j<multiTabell[i].length; j++) {
					multiTabell[i][j] = (a[i][0]*b[0][j])
										+(a[i][1]*b[1][j])+
										(a[i][2]*b[2][j]);
					System.out.println(multiTabell[i][j]);
			}
		}
					

			return multiTabell;
	}
}
