package br.edu.iftm.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Interface {

	int numJogadas = 0;
	boolean Jogador1 = true;
	boolean Jogador2 = false;

	private JFrame frmJogoDaVelha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmJogoDaVelha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	public void Jogando() {
		if (Jogador1 == true) {
			Jogador1 = false;
			Jogador2 = true;
		} else {
			Jogador1 = true;
			Jogador2 = false;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogoDaVelha = new JFrame();
		frmJogoDaVelha.setTitle("Jogo da Velha");
		frmJogoDaVelha.setResizable(false);
		frmJogoDaVelha.setBounds(100, 100, 654, 373);
		frmJogoDaVelha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogoDaVelha.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 410, 334);
		frmJogoDaVelha.getContentPane().add(panel);
		panel.setLayout(null);

		JButton botao1 = new JButton("");
		botao1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao1.getText().equals("")) {
						botao1.setText("X");
						Jogando();
					}
				} else {
					if (botao1.getText().equals("")) {
						botao1.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao1.setBounds(10, 11, 114, 89);
		panel.add(botao1);

		JButton botao4 = new JButton("");
		botao4.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao4.getText().equals("")) {
						botao4.setText("X");
						Jogando();
					}
				} else {
					if (botao4.getText().equals("")) {
						botao4.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao4.setBounds(10, 121, 114, 89);
		panel.add(botao4);

		JButton botao7 = new JButton("");
		botao7.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao7.getText().equals("")) {
						botao7.setText("X");
						Jogando();
					}
				} else {
					if (botao7.getText().equals("")) {
						botao7.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao7.setBounds(10, 233, 114, 89);
		panel.add(botao7);

		JButton botao2 = new JButton("");
		botao2.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao2.getText().equals("")) {
						botao2.setText("X");
						Jogando();
					}
				} else {
					if (botao2.getText().equals("")) {
						botao2.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao2.setBounds(145, 11, 114, 89);
		panel.add(botao2);

		JButton botao5 = new JButton("");
		botao5.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao5.getText().equals("")) {
						botao5.setText("X");
						Jogando();
					}
				} else {
					if (botao5.getText().equals("")) {
						botao5.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao5.setBounds(145, 121, 114, 89);
		panel.add(botao5);

		JButton botao8 = new JButton("");
		botao8.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao8.getText().equals("")) {
						botao8.setText("X");
						Jogando();
					}
				} else {
					if (botao8.getText().equals("")) {
						botao8.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao8.setBounds(145, 233, 114, 89);
		panel.add(botao8);

		JButton botao3 = new JButton("");
		botao3.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao3.getText().equals("")) {
						botao3.setText("X");
						Jogando();
					}
				} else {
					if (botao3.getText().equals("")) {
						botao3.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao3.setBounds(283, 11, 114, 89);
		panel.add(botao3);

		JButton botao6 = new JButton("");
		botao6.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao6.getText().equals("")) {
						botao6.setText("X");
						Jogando();
					}
				} else {
					if (botao6.getText().equals("")) {
						botao6.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao6.setBounds(283, 121, 114, 89);
		panel.add(botao6);

		JButton botao9 = new JButton("");
		botao9.setFont(new Font("Tahoma", Font.PLAIN, 36));
		botao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Jogador1 == true) {
					if (botao9.getText().equals("")) {
						botao9.setText("X");
						Jogando();
					}
				} else {
					if (botao9.getText().equals("")) {
						botao9.setText("O");
						Jogando();
					}
				}
				numJogadas++;
			}
		});
		botao9.setBounds(283, 233, 114, 89);
		panel.add(botao9);

		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("Info");
		panel_1.setBounds(420, 11, 208, 153);
		frmJogoDaVelha.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel informacoes = new JLabel("Informa\u00E7\u00F5es");
		informacoes.setHorizontalAlignment(SwingConstants.CENTER);
		informacoes.setBounds(10, 9, 148, 14);
		panel_1.add(informacoes);

		JLabel Humano = new JLabel("Jogador Humano - S\u00EDmbolo X");
		Humano.setBounds(10, 34, 164, 14);
		panel_1.add(Humano);

		JLabel Computador = new JLabel("Jogador Computador - S\u00EDmbolo O");
		Computador.setBounds(10, 59, 188, 14);
		panel_1.add(Computador);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(420, 175, 208, 148);
		frmJogoDaVelha.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JButton vencedorDoJogo = new JButton("Vencedor do Jogo");
		vencedorDoJogo.setToolTipText("vencedorDoJogo");
		vencedorDoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numJogadas == 9) {
					System.out.println("Houve EMPATE");
					JOptionPane.showMessageDialog(null, "Houve EMPATE");
				} else {
					// Horizontal
					if (botao1.getText().equals("X") && botao2.getText().equals("X") && botao3.getText().equals("X")) {
						System.out.println("Humano ganhou");
						JOptionPane.showMessageDialog(null, "Humano ganhou");
					}
					if (botao1.getText().equals("O") && botao2.getText().equals("O") && botao3.getText().equals("O")) {
						System.out.println("Computador ganhou");
						JOptionPane.showMessageDialog(null, "Computador ganhou");
					}
					if (botao4.getText().equals("X") && botao5.getText().equals("X") && botao6.getText().equals("X")) {
						System.out.println("Humano ganhou");
						JOptionPane.showMessageDialog(null, "Humano ganhou");
					}
					if (botao4.getText().equals("O") && botao5.getText().equals("O") && botao6.getText().equals("O")) {
						System.out.println("Computador ganhou");
						JOptionPane.showMessageDialog(null, "Computador ganhou");
					}
					if (botao7.getText().equals("X") && botao8.getText().equals("X") && botao9.getText().equals("X")) {
						System.out.println("Humano ganhou");
						JOptionPane.showMessageDialog(null, "Humano ganhou");
					}
					if (botao7.getText().equals("O") && botao8.getText().equals("O") && botao9.getText().equals("O")) {
						System.out.println("Computador ganhou");
						JOptionPane.showMessageDialog(null, "Computador ganhou");
					}

					// Vertical
					if (botao1.getText().equals("X") && botao4.getText().equals("X") && botao7.getText().equals("X")) {
						System.out.println("Humano ganhou");
						JOptionPane.showMessageDialog(null, "Humano ganhou");
					}
					if (botao1.getText().equals("O") && botao4.getText().equals("O") && botao7.getText().equals("O")) {
						System.out.println("Computador ganhou");
						JOptionPane.showMessageDialog(null, "Computador ganhou");
					}
					if (botao2.getText().equals("X") && botao5.getText().equals("X") && botao8.getText().equals("X")) {
						System.out.println("Humano ganhou");
						JOptionPane.showMessageDialog(null, "Humano ganhou");
					}
					if (botao2.getText().equals("O") && botao5.getText().equals("O") && botao8.getText().equals("O")) {
						System.out.println("Computador ganhou");
						JOptionPane.showMessageDialog(null, "Computador ganhou");
					}
					if (botao3.getText().equals("X") && botao6.getText().equals("X") && botao9.getText().equals("X")) {
						System.out.println("Humano ganhou");
						JOptionPane.showMessageDialog(null, "Humano ganhou");
					}
					if (botao3.getText().equals("O") && botao6.getText().equals("O") && botao9.getText().equals("O")) {
						System.out.println("Computador ganhou");
						JOptionPane.showMessageDialog(null, "Computador ganhou");
					}

					// Diagonal
					if (botao1.getText().equals("X") && botao5.getText().equals("X") && botao9.getText().equals("X")) {
						System.out.println("Humano ganhou");
						JOptionPane.showMessageDialog(null, "Humano ganhou");
					}
					if (botao1.getText().equals("O") && botao5.getText().equals("O") && botao9.getText().equals("O")) {
						System.out.println("Computador ganhou");
						JOptionPane.showMessageDialog(null, "Computador ganhou");
					}
					if (botao3.getText().equals("X") && botao5.getText().equals("X") && botao7.getText().equals("X")) {
						System.out.println("Humano ganhou");
						JOptionPane.showMessageDialog(null, "Humano ganhou");
					}
					if (botao3.getText().equals("O") && botao5.getText().equals("O") && botao7.getText().equals("O")) {
						System.out.println("Computador ganhou");
						JOptionPane.showMessageDialog(null, "Computador ganhou");
					}
				}
			}
		});
		vencedorDoJogo.setBounds(10, 114, 167, 23);
		panel_2.add(vencedorDoJogo);

		JLabel lblNewLabel = new JLabel("Escolher primeiro jogador");
		lblNewLabel.setBounds(10, 11, 167, 14);
		panel_2.add(lblNewLabel);

		JRadioButton radioButtonHumano = new JRadioButton("Humano");
		radioButtonHumano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Humano inicia o jogo");
			}
		});
		radioButtonHumano.setBounds(10, 32, 109, 23);
		panel_2.add(radioButtonHumano);

		JRadioButton radioButtonComputador = new JRadioButton("Computador");
		radioButtonComputador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogando();
			}
		});
		radioButtonComputador.setBounds(10, 58, 109, 23);
		panel_2.add(radioButtonComputador);
	}
}
