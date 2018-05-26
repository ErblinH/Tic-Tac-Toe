
import javax.swing.*;
import java.awt.*;

/**
 * Klasa VIEW ben te mundur qe te vizatohet nje dritare ku behet loja
 * 
 * @author Erblin.Halabaku
 *
 */

public class VIEW extends JPanel {
	public int width;
	public int height;
	public static final int trashesia = 10;
	public static final int trashesia_katrorit = 100;



	MODEL model = new MODEL();

	/**
	 * Konstruktori VIEW i jep vlren gjatesine dhe lartesise e dritares
	 * 
	 * @param w
	 *            paraqet gjatesine e dritares
	 * @param h
	 *            paraqet lartesine e driaters
	 */
	public VIEW(int w, int h) {
		width = w;
		height = h;

		JFrame frame = new JFrame();
		frame.getContentPane().add(this);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setTitle("Tic Tac Toe");

	}

	public void paintComponent(Graphics e) {
		Graphics2D g2 = (Graphics2D) e;
		g2.setStroke(new BasicStroke(6));

		korniza(e);

		degezimi(e);

	}

	/**
	 * degezimi vizaton levizjet nese elementet e matrices jane te ndryshem nga 0
	 * 
	 * @param g
	 */
	private void degezimi(Graphics g) {

		if (model.tabela[0][0] != 0) {
			vizato1(g);
		}

		if (model.tabela[0][1] != 0) {
			vizato2(g);
		}
		if (model.tabela[0][2] != 0) {
			vizato3(g);
		}
		if (model.tabela[1][0] != 0) {
			vizato4(g);
		}
		if (model.tabela[1][1] != 0) {
			vizato5(g);
		}
		if (model.tabela[1][2] != 0) {
			vizato6(g);
		}
		if (model.tabela[2][0] != 0) {
			vizato7(g);
		}
		if (model.tabela[2][1] != 0) {
			vizato8(g);
		}
		if (model.tabela[2][2] != 0) {
			vizato9(g);
		}
	}

	/**
	 * korniza vizaton kornizen e driaters
	 * 
	 * @param pen
	 *            penda grafike me te cilen vizatohet
	 */
	private void korniza(Graphics pen) {
		pen.setColor(Color.WHITE);
		pen.fillRect(0, 0, width, height);
		pen.setColor(Color.BLACK);
		pen.fillRect(0, 0, width - 85, height - 85);
		pen.setColor(Color.WHITE);

		pen.fillRect(trashesia, trashesia, width*4/5 - 2 * trashesia, height*4/5 - 2 * trashesia);
		pen.setColor(Color.BLACK);
		pen.fillRect(trashesia + trashesia_katrorit, 0, trashesia, width*4/5);
		pen.fillRect(2 * trashesia + 2 * trashesia_katrorit, 0, trashesia, width*4/5);
		pen.fillRect(0, trashesia + trashesia_katrorit,width*4/5, trashesia);
		pen.fillRect(0, 2 * trashesia + 2 * trashesia_katrorit, width*4/5, trashesia);
	}

	/**
	 * vizato1 vizaton levizjen e bere ne poziten 1
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato1(Graphics pen) {
		if (model.tabela[0][0] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(20, 20, 100, 100);
			pen.drawLine(100, 20, 20, 100);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(20, 20, 80, 80);
		}
	}

	/**
	 * vizato2 vizaton levizjen e bere ne poziten 2
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato2(Graphics pen) {
		if (model.tabela[0][1] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(130, 20, 210, 100);// 2
			pen.drawLine(210, 20, 130, 100);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(130, 20, 80, 80);
		}
	}

	/**
	 * vizato3 vizaton levizjen e bere ne poziten 3
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato3(Graphics pen) {
		if (model.tabela[0][2] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(240, 20, 320, 100);// 3
			pen.drawLine(320, 20, 240, 100);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(240, 20, 80, 80);
		}
	}

	/**
	 * vizato4 vizaton levizjen e bere ne poziten 4
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato4(Graphics pen) {
		if (model.tabela[1][0] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(20, 130, 100, 210);// 4
			pen.drawLine(100, 130, 20, 210);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(20, 130, 80, 80);
		}
	}

	/**
	 * vizato5 vizaton levizjen e bere ne poziten 5
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato5(Graphics pen) {
		if (model.tabela[1][1] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(210, 210, 130, 130);// 5
			pen.drawLine(210, 130, 130, 210);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(130, 130, 80, 80);
		}
	}

	/**
	 * vizato6 vizaton levizjen e bere ne poziten 6
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato6(Graphics pen) {
		if (model.tabela[1][2] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(240, 130, 320, 210);// 6
			pen.drawLine(320, 130, 240, 210);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(240, 130, 80, 80);
		}
	}

	/**
	 * vizato7 vizaton levizjen e bere ne poziten 7
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato7(Graphics pen) {
		if (model.tabela[2][0] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(20, 240, 100, 320);// 7
			pen.drawLine(100, 240, 20, 320);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(20, 240, 80, 80);
		}
	}

	/**
	 * vizato8 vizaton levizjen e bere ne poziten 8
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato8(Graphics pen) {
		if (model.tabela[2][1] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(130, 240, 210, 320);// 8
			pen.drawLine(210, 240, 130, 320);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(130, 240, 80, 80);
		}
	}

	/**
	 * vizato9 vizaton levizjen e bere ne poziten 9
	 * 
	 * @param pen
	 *            penda me te cilen vizatohet
	 */
	private void vizato9(Graphics pen) {
		if (model.tabela[2][2] == model.X) {
			pen.setColor(Color.BLUE);
			pen.drawLine(240, 240, 320, 320);// 9
			pen.drawLine(320, 240, 240, 320);
		} else {
			pen.setColor(Color.GREEN);
			pen.drawOval(240, 240, 80, 80);
		}
	}

}
