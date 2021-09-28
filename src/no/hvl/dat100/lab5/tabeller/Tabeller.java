package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	
	
	// a)
	public static void skrivUt(int[] tabell) {

	int skrivUtTabell[]= tabell;
		
		for (int i = 0; i<tabell.length; i++)
			System.out.println(skrivUtTabell[i]);
			
	}

	// b)
	public static String tilStreng(int[] tabell) {

		int stringTabell[]= tabell;
		String tabellString = "[";
		
		if(tabell.length>1) {
			for(int i = 0; i<stringTabell.length; i++) {
				if (i< stringTabell.length-1)
					tabellString += stringTabell[i] + ",";
				else
					tabellString += stringTabell[i];
			}
		}
		else if(tabell.length == 1)
			tabellString += stringTabell[0];
		
			tabellString += "]";
		
		return tabellString;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i<tabell.length; i++) {
			sum += tabell[i];	
		}
			return sum;
	}
	
	public static int summerWhile (int[] tabell) {
		int sum = 0;
		int i = 0;
		while (i<tabell.length) {
			sum += tabell[i];
			i++;
		}
			return sum;
		}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		while (!funnet && i<tabell.length) {
			
			if (tall == tabell[i])
			funnet = true;
			
			else
				i++;
		}
		return funnet;
	}
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int posisjonTall = -1;
		
		boolean funnet = false;
		int i = 0;
		
		while (!funnet && i<tabell.length) {
			
			if (tall == tabell[i]) {
			funnet = true;
			posisjonTall = i;
			}
			else
				i++;
		}
		return posisjonTall;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int revTabell [] = new int [tabell.length];
		int j= 0;
		
		for (int i = tabell.length-1; i>=0; i--) {
			revTabell[j] = tabell[i];
			j++;
		
		}
		
		return revTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sotert = true;
		int i = 1;
		
		while(i<tabell.length && sotert) {
			System.out.println(tabell[i-1]);
			if (tabell[i-1] <= tabell[i]) 
			i++;
			
			else 
				sotert = false;
			
			
		}
		return sotert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

int nyTabell [] = new int[tabell1.length+tabell2.length];
		
		for (int i = 0; i<tabell1.length; i++) 
			nyTabell[i] = tabell1[i];
	
		for (int j = 0; j<tabell2.length; j++) 
			nyTabell[tabell1.length+j] = tabell2[j];
		
		return nyTabell;
	}
}
