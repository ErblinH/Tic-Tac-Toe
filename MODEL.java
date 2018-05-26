
import javax.swing.JOptionPane;

/**
 * Klasa model permban metodat per pjesen logjike te lojes ku perfshihen
 * ekzistenca e rreshtave dhe kolonave, per me ba nje levizje, caktimin se kush
 * fitoi
 * 
 * @author Erblin.Halabaku
 *
 */
public class MODEL {
	public static final int O = 1;
	public static final int X = 2;
	public static int nr_fitoreve_O = 0;
	public static int nr_fitoreve_X = 0;
	public static int[][] tabela;
	public static int rendi = 1;

	/**
	 * Konstruktori formon nje varg dy dimensionale me rreshtat dhe kolonat e
	 * caktuara
	 */
	public MODEL() {

		tabela = new int[3][3];

	}

	/**
	 * ekzistonrr kontrollon nese rreshti i dhene ekziston
	 * 
	 * @param rresht
	 *            merr si argument numrin e rreshtave te shtypur
	 * @return true nese ekzsiton dhe false nese eshte e pamundur levizja
	 */
	public boolean ekzistonrr(int rresht) {
		boolean rezultati = false;

		if (rresht >= 4 || rresht <= 0) {
			JOptionPane.showMessageDialog(null, "Shkruaje nje numer mbrenda kufijeve te caktuar!");
		} else {
			rezultati = true;
		}

		return rezultati;
	}

	/**
	 * kzistonrr kontrollon nese kolona e dhene ekziston
	 * 
	 * @param kolone
	 *            merr si argument numrin e kolones te shtypur
	 * @return true nese ekzsiton dhe false nese eshte e pamundur levizja
	 */
	public boolean ekzistonk(int kolone) {
		boolean rezultati = false;

		if (kolone >= 4 || kolone <= 0) {
			JOptionPane.showMessageDialog(null, "Shkruaje nje numer mbrenda kufijeve te caktuar!");
		} else {
			rezultati = true;
		}

		return rezultati;
	}

	/**
	 * levizja ben te mundur qe te kryhet nje levizje respektivisht te mbushet nje
	 * vend ne matrice
	 * 
	 * @param rresht
	 *            merr si argument numrin e rreshtiti te shtypur
	 * @param kolone
	 *            merr si argument numrin e kolones te shtypur
	 */
	public void levizja(int rresht, int kolone) {
		if (tabela[rresht - 1][kolone - 1] != 0) {
			JOptionPane.showMessageDialog(null, "Kjo levizje eshte bere nje here!");
			rendi--;
		} else {
			if (rendi % 2 == 1) {
				tabela[rresht - 1][kolone - 1] = O;
			} else {
				tabela[rresht - 1][kolone - 1] = X;
			}
		}

	}

	/**
	 * rendor kontrollon nese loja ka perfundu duke mos fitu asnjera pale
	 * 
	 * @return true nese nuk ka firu asnjeri
	 */
	
	public boolean fitore() {
		boolean rez = true;

		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i][0] == tabela[i][1] && tabela[i][1] == tabela[i][2] && tabela[i][0] != 0) {
				rez = false;

				if (tabela[i][0] == 1) {

					JOptionPane.showMessageDialog(null, "Lojtari O fitoi");
					nr_fitoreve_O++;

				} else {
					JOptionPane.showMessageDialog(null, "Lojtari X fitoi");
					nr_fitoreve_X++;
				}
			}
		}

		for (int j = 0; j < tabela.length; j++) {
			if (tabela[0][j] == tabela[1][j] && tabela[1][j] == tabela[2][j] && tabela[0][j] != 0) {
				rez = false;
				if (tabela[0][j] == 1) {

					JOptionPane.showMessageDialog(null, "Lojtari O fitoi");
					nr_fitoreve_O++;

				} else {
					JOptionPane.showMessageDialog(null, "Lojtari X fitoi");
					nr_fitoreve_X++;
				}
			}

		}

		if (tabela[0][0] == tabela[2][2] && tabela[2][2] == tabela[1][1] && tabela[0][0] != 0) {
			rez = false;

			if (tabela[1][1] == 1) {

				JOptionPane.showMessageDialog(null, "Lojtari O fitoi");
				nr_fitoreve_O++;

			} else {
				JOptionPane.showMessageDialog(null, "Lojtari X fitoi");
				nr_fitoreve_X++;
			}
		}

		if (tabela[0][2] == tabela[1][1] && tabela[2][0] == tabela[1][1] && tabela[0][2] != 0) {
			rez = false;

			if (tabela[0][2] == 1) {

				JOptionPane.showMessageDialog(null, "Lojtari O fitoi");
				nr_fitoreve_O++;

			} else {
				JOptionPane.showMessageDialog(null, "Lojtari X fitoi");
				nr_fitoreve_X++;
			}
		
		}
		if(rez&&rendi==10) {JOptionPane.showMessageDialog(null, "Kjo loje perfundoi pa fitues");}
		
		return rez;
	}

	/**
	 * reset e ristarton lojen respektivisht matricen e zbraze dhe e ben rendin 0
	 */
	public void reset() {

		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela.length; j++) {
				tabela[i][j] = 0;
				rendi = 1;
			}
		}
	}

	/**
	 * report tregon se sa fitore dhe humbje kane secili lojtar
	 */
	public void report() {
		int a = JOptionPane.showConfirmDialog(null, "Deshiron me shiku raportin", "Loja", JOptionPane.YES_NO_OPTION);

		if (a == 0) {

			JOptionPane.showMessageDialog(null, "Lojtari O ka: " + nr_fitoreve_O + " fitore dhe " + nr_fitoreve_X
					+ " humbje" + "\nLojtari X ka: " + nr_fitoreve_X + " fitore dhe " + nr_fitoreve_O + " humbje");
			System.exit(0);
		} else {
			System.exit(0);
		}
	}
}
