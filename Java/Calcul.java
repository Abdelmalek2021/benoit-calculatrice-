package calculatrice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calcul extends JFrame {

	private String operateur = ""; // string qui va contenir l'op�rateur sur lequel on appuie
	private double resultat = 0;
	private boolean notFirstOperation = false;

	// D�claration de la calculatrice
	public Calcul() {

		// Cr�ation de la fen�tre
		super("Ma Calculatrice");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);

		// D�claration des boutons
//		for(int i = 1 ; i < 16 ; i++) {
//			JButton bouton[i] = new JButton("\"" + i + "\"");
//		}
		JButton bouton1 = new JButton("1");
		JButton bouton2 = new JButton("2");
		JButton bouton3 = new JButton("3");
		JButton bouton4 = new JButton("4");
		JButton bouton5 = new JButton("5");
		JButton bouton6 = new JButton("6");
		JButton bouton7 = new JButton("7");
		JButton bouton8 = new JButton("8");
		JButton bouton9 = new JButton("9");
		JButton bouton10 = new JButton(".");
		JButton bouton11 = new JButton("+");
		JButton bouton12 = new JButton("-");
		JButton bouton13 = new JButton("*");
		JButton bouton14 = new JButton("/");
		JButton bouton15 = new JButton("=");
		JButton bouton16 = new JButton("C");

		// Ajout des Actions sur les boutons
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('1');
				afficherTableau();
			}
		});
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('2');
				afficherTableau();
			}
		});
		bouton1.setSize(100, 100);
		bouton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('3');
				afficherTableau();
			}
		});
		bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('4');
				afficherTableau();
			}
		});
		bouton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('5');
				afficherTableau();
			}
		});
		bouton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('6');
				afficherTableau();
			}
		});
		bouton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('7');
				afficherTableau();
			}
		});
		bouton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('8');
				afficherTableau();
			}
		});
		bouton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('9');
				afficherTableau();
			}
		});
		bouton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('.');
			}
		});
		bouton11.addActionListener(new PlusListener());
		bouton12.addActionListener(new MinusListener());
		bouton13.addActionListener(new MultiListener());
		bouton14.addActionListener(new DivListener());
		bouton15.addActionListener(new EqualListener());
		bouton16.addActionListener(new CleanListener());

		// Ajout des boutons sur la fen�tre
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		
//		for(int i = 1 ; i < 16 ; i++) {
//			contentPane.add(bouton+i);
//		}
		
		contentPane.add(bouton1);
		contentPane.add(bouton2);
		contentPane.add(bouton3);
		contentPane.add(bouton4);
		contentPane.add(bouton5);
		contentPane.add(bouton6);
		contentPane.add(bouton7);
		contentPane.add(bouton8);
		contentPane.add(bouton9);
		contentPane.add(bouton10);
		contentPane.add(bouton11);
		contentPane.add(bouton12);
		contentPane.add(bouton13);
		contentPane.add(bouton14);
		contentPane.add(bouton15);
		contentPane.add(bouton16);
	}

	private void calcul() {
		if (operateur.equals("+")) {
			resultat += Double.parseDouble(tab);// Double.parseDouble(String) permet de transformer une cha�ne de caract�re en double
		}
		if (operateur.equals("-")) {
			resultat -= Double.parseDouble(tab);
		}
		if (operateur.equals("*")) {
			resultat *= Double.parseDouble(tab);
		}
		if (operateur.equals("/")) { // N�cessaire de faire un test si division par 0 pour renvoyer une erreur
			// Mettre � jour l'�cran avec r�sultat de l'op�ration transform� au pr�alable en
			// String
		}
	}

	class PlusListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// n�cessaire de tester si premi�re op�ration pour enregistrer la premi�re
			// valeur dans resultat
			if (notFirstOperation) {
				// mettre code pour afficher le r�sultat de la derni�re op�ration effectu�e
				calcul(); // appel de la m�thode calcul
				System.out.println(resultat);
				tab="";
			} else {
				resultat = Double.parseDouble(tab);
				notFirstOperation = true;
				tab="";
			}
			operateur = "+"; // on met + dans op�rateur pour pouvoir le comparer dans la m�thode calcul

		}
	}

	class MinusListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (notFirstOperation) {
				// mettre code pour afficher le r�sultat de la derni�re op�ration effectu�e
				calcul(); // appel de la m�thode calcul
				System.out.println(resultat);
				tab="";
			} else {
				resultat = Double.parseDouble(tab);
				notFirstOperation = true;
				tab="";
			}
			operateur = "-"; // on met + dans op�rateur pour pouvoir le comparer dans la m�thode calcul
		}
	}

	class MultiListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (notFirstOperation) {
				// mettre code pour afficher le r�sultat de la derni�re op�ration effectu�e
				calcul(); // appel de la m�thode calcul
				System.out.println(resultat);
				tab="";
			} else {
				resultat = Double.parseDouble(tab);
				notFirstOperation = true;
				tab="";
			}
			operateur = "*"; // on met + dans op�rateur pour pouvoir le comparer dans la m�thode calcul
		}
	}

	class DivListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (notFirstOperation) {
				// mettre code pour afficher le r�sultat de la derni�re op�ration effectu�e
				calcul(); // appel de la m�thode calcul
				System.out.println(resultat);
				tab="";
			} else {
				resultat = Double.parseDouble(tab);
				notFirstOperation = true;
				tab="";
			}
			operateur = "/"; // on met + dans op�rateur pour pouvoir le comparer dans la m�thode calcul
		}
	}

	class CleanListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// mettre code pour afficher 0 � l'�cran
			notFirstOperation = false; // remise � false car la prochaine op�ration en sera une nouvelle

		}
	}

	class EqualListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			calcul();
			// mettre code pour afficher le r�sultat de la derni�re op�ration effectu�e
			notFirstOperation = false; // remise � false car la prochaine op�ration en sera une nouvelle
			System.out.println(resultat);
			tab = "";
		}
	}

	/*
	 * Bool�en qui indique si on est en train d'entrer le premier ou le deuxieme
	 * nombre du calcul false -> saisie du premier nombre true -> saisie du deuxieme
	 * nombre
	 */
	static boolean nb = false;

	/*
	 * Bool�en qui indique si une virgule a d�j� �t� saisie dans le nombre false ->
	 * aucune virgule n'a �t� saisie true -> une virgule a d�j� �t� saisie
	 */
	static boolean virgule = false;

	// Chaine de caract�re qui stocke temporairement le nombre saisi
	static String tab = "";

	// Les nombres du calcul
	static double nombre1;
	static double nombre2;

	// Ajoute le chiffre qui vient d'�tre saisi � la fin de la chaine de caract�re
	public static void ajouter(char a) {
		tab += a;
	}

	// Convertit la chaine de carat�re en double et l'affiche
	public static void afficherTableau() {
		System.out.println("Valeur = " + Double.parseDouble(tab));
	}

	// R�initialise les valeurs des nombres � 0 et les booleens � false
	public static void reset() {
		nb = false;
		virgule = false;
		tab = "";
		nombre1 = 0;
		nombre2 = 0;
	}

	public static void main(String[] args) {

		// Cr�ation de la calculatrice
		Calcul calculatrice = new Calcul();
		calculatrice.setVisible(true);

	}
}
