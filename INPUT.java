

import javax.swing.JOptionPane;

/**
 *INPUT merret vetem me hyrjen e te dhenva dhe kontrollon nese jane valide
 * 
 * @author Erblin.Halabaku
 *
 */
public class INPUT { 
	public int rresht;
	public int kolone;
	public char loj;

	MODEL model = new MODEL();

	/**
	 * rreshti pranon numrin e rreshtit ne te cilen deshiron me u ba levizja
	 */
	public void rreshti() {
		try {
			if (model.rendi % 2 == 1) {
				loj = 'O';
			} else {
				loj = 'X';
			}
			String rreshti = JOptionPane
					.showInputDialog("Lojtari " + loj + "\nNga [1-3] shkruani numrin e rreshtit ku deshironi te luani");
			if (rreshti == null) {
				System.exit(0);
			}

			rresht = new Integer(rreshti).intValue();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Gabim: Shkruaj numrin e kerkuar!");
			rreshti();
		}
		if (!model.ekzistonrr(rresht)) {
			rreshti();
		}

	}

	/**
	 * kolone pranon numrin e kolones ne te cilen deshiron me u ba levizja
	 */
	public void kolone() {
		try {

			if (model.rendi % 2 == 1) {
				loj = 'O';
			} else {
				loj = 'X';
			}
			String kolona = JOptionPane
					.showInputDialog("Lojtari " + loj + "\nNga [1-3] shkruani numrin e kolones ku deshironi te luani");

			if (kolona == null) {
				System.exit(0);
			}

			kolone = new Integer(kolona).intValue();
		} catch (Exception e) {

			kolone();
		}
		if (!model.ekzistonrr(kolone)) {
			JOptionPane.showMessageDialog(null, "Gabim: Shkruaj numrin e kerkuar!");
			kolone();
		}

	}

	/**
	 * getRresht merr numrin e rreshtit te deshiruar
	 * 
	 * @return numrin ne te cilen behet levizja
	 */
	public int getRresht() {
		return rresht;
	}

	/**
	 * getKolone merr numrin e kolones te deshiruar
	 * 
	 * @return numrin ne te cilen behet levizja
	 */
	public int getKolone() {
		return kolone;
	}
}

