import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MULTITAREFAS extends JFrame{

	private JPanel pnl1, pnl2, pnl3, pnl4, pnl5, pnl6, pnl7, pnl8, pnl9;
	private JTextField valores1_1, valores2_1, valores3_1, valores4_1, valores5_1, valores6_1, valores7_1, valores8_1, valores8_3;
	private JTextField valores1_2, valores2_2, valores3_2, valores4_2, valores5_2, valores6_2, valores7_2, valores8_2;
	private JTextField resultados1, resultados2, resultados3, resultados4, resultados5, resultados6, resultados7, resultados8, resultados9;
	private JLabel texto1_1, texto1_2 , texto1_3, texto2_1, texto2_2 , texto2_3, texto3_1, texto3_2, texto3_3, texto4_1, texto4_2,
	texto4_3, texto5_1, texto5_2, texto5_3, texto6_1, texto6_2, texto6_3, texto7_1, texto7_2, texto7_3, texto8_1, texto8_2, texto8_3,
	texto8_4, texto8_5, texto9_1, texto9_2, texto9_3, texto9_4, texto9_5;
	private JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9;
	private JCheckBox maiusculas, minusculas, numeros, simbolos;
	private JSpinner valores9;
	
	
	private MULTITAREFAS() {	
		setSize(1075, 588);
		setLayout(null);
		criadorElementos();
		setVisible(true);
	}

	
	private void criadorElementos() {
		
		//PAINEL 1
		
		
		
		//tamanho do painel
		pnl1 = new JPanel();
		pnl1.setLayout(null);
		pnl1.setBounds(5,5,350,180);
		pnl1.setBorder(BorderFactory.createTitledBorder("Aplicar desconto % num valor"));
		
		getContentPane().add(pnl1);
		
		//linha 1
		texto1_1 = new JLabel("Valor inicial R$:");
		texto1_1.setBounds(10 , 30 , 100 , 25);
		pnl1.add(texto1_1);
		valores1_1 = new JTextField();
		valores1_1.setBounds(120 , 30 , 100 , 25);
		pnl1.add(valores1_1);
		
		//linha2
		texto1_2 = new JLabel("% desconto");
		texto1_2.setBounds(10 , 60 , 100 , 25);
		pnl1.add(texto1_2);
		valores1_2 = new JTextField();
		valores1_2.setBounds(120 , 60 , 100 , 25);
		pnl1.add(valores1_2);
		
		//botao
		botao1 = new JButton("Calcular");
		botao1.setBounds(10, 90, 100, 25);
		pnl1.add(botao1);
		
		//observador para acionar a função através do botão
		botao1.addActionListener(new ActionListener() {			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
            	
				double result = funcoes.tela1(valores1_1.getText(), valores1_2.getText());
            	resultados1.setText(Double.toString(result));	
			}	
		});
		//observador para acionar a função através do enter no 2o campo
		valores1_2.addKeyListener(new KeyListener() {
	           @Override
	           public void keyTyped(KeyEvent e) {}

	           @Override
	           public void keyPressed(KeyEvent e) {}

	           @Override
	           public void keyReleased(KeyEvent e) {
	        	    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                	
	        	    	double result1 = funcoes.tela1(valores1_1.getText(), valores1_2.getText());
	        	    	resultados1.setText(Double.toString(result1));	
	        	    }
	           }
	    });
	
		//linha 4
		texto1_3 = new JLabel("Resultado");
		texto1_3.setBounds(10 , 120 , 100 , 25);
		pnl1.add(texto1_3);	
		resultados1 = new JTextField();
		resultados1.setBounds(120 , 120 , 100 , 25);
		pnl1.add(resultados1);
		resultados1.setEditable(false);

		
		
		//PAINEL 2
	
		
		
		//tamanho do painel
		pnl2 = new JPanel();
		pnl2.setLayout(null);
		pnl2.setBounds(355,5,350,180);
		pnl2.setBorder(BorderFactory.createTitledBorder("Incrementar % a um valor"));
		getContentPane().add(pnl2);

		//linha1
		texto2_1 = new JLabel("Valor inicial R$:");
		texto2_1.setBounds(10 , 30 , 100 , 25);
		pnl2.add(texto2_1);
		valores2_1 = new JTextField();
		valores2_1.setBounds(120 , 30 , 100 , 25);
		pnl2.add(valores2_1);
		
		//linha2
		texto2_2 = new JLabel("% acréscimo");
		texto2_2.setBounds(10 , 60 , 100 , 25);
		pnl2.add(texto2_2);
		valores2_2 = new JTextField();
		valores2_2.setBounds(120 , 60 , 100 , 25);
		pnl2.add(valores2_2);

		//botao
		botao2 = new JButton("Calcular");
		botao2.setBounds(10, 90, 100, 25);
		pnl2.add(botao2);

		//observador para acionar a função através do botão
		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
            	double result2 = funcoes.tela2(valores2_1.getText(), valores2_2.getText());
            	resultados2.setText(Double.toString(result2));				
			}
		});
		
		//observador para acionar a função através do enter no segundo campo
		valores2_2.addKeyListener(new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {}

		@Override
		public void keyPressed(KeyEvent e) {}

		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				
            	double result2 = funcoes.tela2(valores2_1.getText(), valores2_2.getText());
               	resultados2.setText(Double.toString(result2));
				}
			}
		});
			
		//linha 4
		texto2_3 = new JLabel("Resultado");
		texto2_3.setBounds(10 , 120 , 100 , 25);
		pnl2.add(texto2_3);	
		resultados2 = new JTextField();
		resultados2.setBounds(120 , 120 , 100 , 25);
		pnl2.add(resultados2);
		resultados2.setEditable(false);
		
		
		
		//PAINEL 3
		
		
		
		//tamanho do painel
		pnl3 = new JPanel();
		pnl3.setLayout(null);
		pnl3.setBounds(705,5,350,180);
		pnl3.setBorder(BorderFactory.createTitledBorder("Amostragem - X% representa de Y"));
		getContentPane().add(pnl3);

		//linha1
		texto3_1 = new JLabel("Total");
		texto3_1.setBounds(10 , 30 , 100 , 25);
		pnl3.add(texto3_1);
		valores3_1 = new JTextField();
		valores3_1.setBounds(120 , 30 , 100 , 25);
		pnl3.add(valores3_1);

		//linha2
		texto3_2 = new JLabel("Porcetagem");
		texto3_2.setBounds(10 , 60 , 100 , 25);
		pnl3.add(texto3_2);
		valores3_2 = new JTextField();
		valores3_2.setBounds(120 , 60 , 100 , 25);
		pnl3.add(valores3_2);

		//botao
		botao3 = new JButton("Calcular");
		botao3.setBounds(10, 90, 100, 25);
		pnl3.add(botao3);

		//observador ação no click
		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
            	double result3 = funcoes.tela3(valores3_1.getText(), valores3_2.getText());
            	resultados3.setText(Double.toString(result3));					
			}
		});
		
		//observador ação no enter
		valores3_2.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
	            	double result3 = funcoes.tela3(valores3_1.getText(), valores3_2.getText());
	            	resultados3.setText(Double.toString(result3));	
				}
			}	
		});

		//linha4
		texto3_3 = new JLabel("Corresponde a");
		texto3_3.setBounds(10 , 120 , 100 , 25);
		pnl3.add(texto3_3);	
		resultados3 = new JTextField();
		resultados3.setBounds(120 , 120 , 100 , 25);
		pnl3.add(resultados3);
		resultados3.setEditable(false);

		
		
		
		//PAINEL 4
		
		
		
		
		
		//tamanho do painel
		pnl4 = new JPanel();
		pnl4.setLayout(null);
		pnl4.setBounds(5,185,350,180);
		pnl4.setBorder(BorderFactory.createTitledBorder("Amostragem 2- Quanto X representa de Y"));
		getContentPane().add(pnl4);
		
		//linha1
		texto4_1 = new JLabel("Parte (x)");
		texto4_1.setBounds(10 , 30 , 100 , 25);
		pnl4.add(texto4_1);
		valores4_1 = new JTextField();
		valores4_1.setBounds(120 , 30 , 100 , 25);
		pnl4.add(valores4_1);
		
		//linha2
		texto4_2 = new JLabel("Total (y)");
		texto4_2.setBounds(10 , 60 , 100 , 25);
		pnl4.add(texto4_2);
		valores4_2 = new JTextField();
		valores4_2.setBounds(120 , 60 , 100 , 25);
		pnl4.add(valores4_2);
		
		//botao
		botao4 = new JButton("Calcular");
		botao4.setBounds(10, 90, 100, 25);
		pnl4.add(botao4);

		//observador função no botao
		botao4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
            	double result4 = funcoes.tela4(valores4_1.getText(), valores4_2.getText());
            	resultados4.setText((Double.toString(result4))+"%");					
			}
		});
		
		//observador função no enter
		valores4_2.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
	            	double result4 = funcoes.tela4(valores4_1.getText(), valores4_2.getText());
	            	resultados4.setText((Double.toString(result4))+"%");	
				}
			}
		});

		//linha4
		texto4_3 = new JLabel("Corresponde a %");
		texto4_3.setBounds(10 , 120 , 100 , 25);
		pnl4.add(texto4_3);	
		resultados4 = new JTextField();
		resultados4.setBounds(120 , 120 , 100 , 25);
		pnl4.add(resultados4);
		resultados4.setEditable(false);
		
		
		
		//PAINEL 5
		
		
		
		
		//tamanho do painel
		pnl5 = new JPanel();
		pnl5.setLayout(null);
		pnl5.setBounds(355,185,350,180);
		pnl5.setBorder(BorderFactory.createTitledBorder("Valor era A e paguei B,qual foi o desconto %?"));
		getContentPane().add(pnl5);

		//linha1
		texto5_1 = new JLabel("Valor original");
		texto5_1.setBounds(10 , 30 , 100 , 25);
		pnl5.add(texto5_1);
		valores5_1 = new JTextField();
		valores5_1.setBounds(120 , 30 , 100 , 25);
		pnl5.add(valores5_1);

		//linha2
		texto5_2 = new JLabel("Valor c/desconto");
		texto5_2.setBounds(10 , 60 , 100 , 25);
		pnl5.add(texto5_2);
		valores5_2 = new JTextField();
		valores5_2.setBounds(120 , 60 , 100 , 25);
		pnl5.add(valores5_2);

		//botao
		botao5 = new JButton("Calcular");
		botao5.setBounds(10, 90, 100, 25);
		pnl5.add(botao5);

		//observador função no botao
		botao5.addActionListener(new ActionListener() {			//botao executando a função

			@Override
			public void actionPerformed(ActionEvent e) {
				
            	double result5 = funcoes.tela5(valores5_1.getText(), valores5_2.getText());
            	resultados5.setText((Double.toString(result5))+"%");				
			}
		});

		//observador função no enter
		valores5_2.addKeyListener(new KeyListener() {				//se apertar enter estando no campo 2 ele executa e da o resultado
			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
	            	double result5 = funcoes.tela5(valores5_1.getText(), valores5_2.getText());
	            	resultados5.setText((Double.toString(result5))+"%");	
				}
			}
		});

		//linha4
		texto5_3 = new JLabel("% de Desconto"); 
		texto5_3.setBounds(10 , 120 , 100 , 25);
		pnl5.add(texto5_3);	
		resultados5 = new JTextField();
		resultados5.setBounds(120 , 120 , 100 , 25);
		pnl5.add(resultados5);
		resultados5.setEditable(false);
		
		
		
		
		//PAINEL6	
		
		
		
		
		
		//tamanho do painel
		pnl6 = new JPanel();
		pnl6.setLayout(null);
		pnl6.setBounds(705,185,350,180);
		pnl6.setBorder(BorderFactory.createTitledBorder("Variação Delta (%) - diferença % entre valores"));
		getContentPane().add(pnl6);

		//linha1
		texto6_1 = new JLabel("Valor inicial");
		texto6_1.setBounds(10 , 30 , 100 , 25);
		pnl6.add(texto6_1);
		valores6_1 = new JTextField();
		valores6_1.setBounds(120 , 30 , 100 , 25);
		pnl6.add(valores6_1);

		//linha2
		texto6_2 = new JLabel("Valor final");
		texto6_2.setBounds(10 , 60 , 100 , 25);
		pnl6.add(texto6_2);
		valores6_2 = new JTextField();
		valores6_2.setBounds(120 , 60 , 100 , 25);
		pnl6.add(valores6_2);

		//bota
		botao6 = new JButton("Calcular");
		botao6.setBounds(10, 90, 100, 25);
		pnl6.add(botao6);

		//observador função botão
		botao6.addActionListener(new ActionListener() {			//botao executando a função

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double result6 = funcoes.tela6(valores6_1.getText(), valores6_2.getText());
            	resultados6.setText((Double.toString(result6))+"%");					
			}
		});

		//observador função enter
		valores6_2.addKeyListener(new KeyListener() {				//se apertar enter estando no campo 2 ele executa e da o resultado
			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					double result6 = funcoes.tela6(valores6_1.getText(), valores6_2.getText());
	            	resultados6.setText((Double.toString(result6))+"%");	
				}
			}
		});

		//linha4
		texto6_3 = new JLabel("Diferença %"); 
		texto6_3.setBounds(10 , 120 , 100 , 25);
		pnl6.add(texto6_3);	
		resultados6 = new JTextField();
		resultados6.setBounds(120 , 120 , 100 , 25);
		pnl6.add(resultados6);
		resultados6.setEditable(false);
		
		
		
		
		//PAINEL7
		
		
		
		
		//tamanho do painel
		pnl7 = new JPanel();
		pnl7.setLayout(null);
		pnl7.setBounds(5,365,350,180);
		pnl7.setBorder(BorderFactory.createTitledBorder("Qual era o valor original?"));
		getContentPane().add(pnl7);
		
		//linha1
		texto7_1 = new JLabel("Valor final R$:");
		texto7_1.setBounds(10 , 30 , 100 , 25);
		pnl7.add(texto7_1);
		valores7_1 = new JTextField();
		valores7_1.setBounds(120 , 30 , 100 , 25);
		pnl7.add(valores7_1);

		//linha2
		texto7_2 = new JLabel("% desconto");
		texto7_2.setBounds(10 , 60 , 100 , 25);
		pnl7.add(texto7_2);
		valores7_2 = new JTextField();
		valores7_2.setBounds(120 , 60 , 100 , 25);
		pnl7.add(valores7_2);

		//botao
		botao7 = new JButton("Calcular");
		botao7.setBounds(10, 90, 100, 25);
		pnl7.add(botao7);

		//observador ação botao
		botao7.addActionListener(new ActionListener() {			//botao executando a função

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double result7 = funcoes.tela7(valores7_1.getText(), valores7_2.getText());
            	resultados7.setText(Double.toString(result7));					
			}
		});

		//observador ação enter
		valores7_2.addKeyListener(new KeyListener() {				//se apertar enter estando no campo 2 ele executa e da o resultado
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					double result7 = funcoes.tela7(valores7_1.getText(), valores7_2.getText());
	            	resultados7.setText(Double.toString(result7));
				}
			}
		});

		//linha4
		texto7_3 = new JLabel("Valor original"); 
		texto7_3.setBounds(10 , 120 , 100 , 25);
		pnl7.add(texto7_3);	
		resultados7 = new JTextField();
		resultados7.setBounds(120 , 120 , 100 , 25);
		pnl7.add(resultados7);
		resultados7.setEditable(false);
		
		
		
		
		
		//PAINEL8
		
		
		
		
		
		//tamanho do painel
		pnl8= new JPanel();
		pnl8.setLayout(null);
		pnl8.setBounds(355,365,350,180);
		pnl8.setBorder(BorderFactory.createTitledBorder("Regra de três"));
		getContentPane().add(pnl8);
		
		//linha1
		texto8_1 = new JLabel("a:");
		texto8_1.setBounds(20 , 30 , 100 , 25);
		pnl8.add(texto8_1);
		
		valores8_1 = new JTextField();
		valores8_1.setBounds(40 , 30 , 100 , 25);
		pnl8.add(valores8_1);
		
		texto8_2 = new JLabel("=");
		texto8_2.setBounds(160 , 30 , 100 , 25);
		pnl8.add(texto8_2);
		
		texto8_2 = new JLabel("r1:");
		texto8_2.setBounds(180, 30 , 100 , 25);
		pnl8.add(texto8_2);
		
		valores8_2 = new JTextField();
		valores8_2.setBounds(205 , 30 , 100 , 25);
		pnl8.add(valores8_2);
		
		//linha2
		texto8_3 = new JLabel("b:");
		texto8_3.setBounds(20 , 60 , 100 , 25);
		pnl8.add(texto8_3);
		
		valores8_3 = new JTextField();
		valores8_3.setBounds(40 , 60 , 100 , 25);
		pnl8.add(valores8_3);
		
		texto8_4 = new JLabel("=");
		texto8_4.setBounds(160 , 60 , 100 , 25);
		pnl8.add(texto8_4);
		
		texto8_5 = new JLabel("r2:");
		texto8_5.setBounds(180, 60 , 100 , 25);
		pnl8.add(texto8_5);
		
		resultados8 = new JTextField();
		resultados8.setBounds(205 , 60 , 100 , 25);
		pnl8.add(resultados8);
		resultados8.setEditable(false);
		
		
		//botao
		//botao
				botao8 = new JButton("Calcular");
				botao8.setBounds(122, 90, 100, 25);
				pnl8.add(botao8);

				//observador ação botao
				botao8.addActionListener(new ActionListener() {			//botao executando a função

					@Override
					public void actionPerformed(ActionEvent e) {
						
						double result8 = funcoes.tela8(valores8_1.getText(), valores8_2.getText(), valores8_3.getText());
		            	resultados8.setText(Double.toString(result8));		
					}
				});

				//observador ação enter
				valores8_3.addKeyListener(new KeyListener() {				//se apertar enter estando no campo 2 ele executa e da o resultado
					@Override
					public void keyTyped(KeyEvent e) {}
					
					@Override
					public void keyPressed(KeyEvent e) {}
					
					@Override
					public void keyReleased(KeyEvent e) {
						if (e.getKeyCode() == KeyEvent.VK_ENTER) {
							
							double result8 = funcoes.tela8(valores8_1.getText(), valores8_2.getText(), valores8_3.getText());
			            	resultados8.setText(Double.toString(result8));	
						}
					}
				});
				
				
				
				
				
				
				
		//PAINEL 9
				
			
		pnl9 = new JPanel();
		pnl9.setLayout(null);
		pnl9.setBounds(705,365,350,180);
		pnl9.setBorder(BorderFactory.createTitledBorder("Gerador de Senha"));
		getContentPane().add(pnl9);
		
		maiusculas = new JCheckBox();
		minusculas = new JCheckBox();
		numeros = new JCheckBox();
		simbolos = new JCheckBox();
		
		
		//linha 1
		
			//checkbox
			maiusculas.setBounds(30 , 30 , 20 , 20);
			pnl9.add(maiusculas);
			//texto
			texto9_1 = new JLabel("Maiúsculas");
			texto9_1.setBounds(55 , 28 , 100 , 25);
			pnl9.add(texto9_1);
			
			//checkbox
			minusculas.setBounds(150 , 30 , 20 , 20);
			pnl9.add(minusculas);	
			//texto
			texto9_2 = new JLabel("Minúsculas");
			texto9_2.setBounds(175 , 28 , 100 , 25);
			pnl9.add(texto9_2);
		
			
		//linha2
			
			//checkbox
			numeros.setBounds(30 , 55 , 20 , 20);
			pnl9.add(numeros);
			//texto
			texto9_3 = new JLabel("Números");
			texto9_3.setBounds(55 , 53 , 100 , 25);
			pnl9.add(texto9_3);
			
			//checkbox
			simbolos.setBounds(150 , 55 , 20 , 20);
			pnl9.add(simbolos);	
			//texto
			texto9_4 = new JLabel("Símbolos");
			texto9_4.setBounds(175 , 53 , 100 , 25);
			pnl9.add(texto9_4);
	
		
		//linha3
			
			//texto
			texto9_4 = new JLabel("Tamanho:");
			texto9_4.setBounds(35 , 90 , 100 , 25);
			pnl9.add(texto9_4);
			//spinbox de quantidade
			valores9 = new JSpinner();
			valores9.setBounds(95 , 90 , 35 , 25);
			pnl9.add(valores9);
			
			//botao
			botao9 = new JButton("Gerar");
			botao9.setBounds(150, 90, 100, 25);
			pnl9.add(botao9);
			
			//observador para acionar a função através do botão
			botao9.addActionListener(new ActionListener() {			
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int valorSpinner = (int) valores9.getValue();
					Boolean selecionado1 = maiusculas.isSelected();
					Boolean selecionado2 = minusculas.isSelected();
					Boolean selecionado3 = numeros.isSelected();
					Boolean selecionado4 = simbolos.isSelected();
					resultados9.setText(funcoes.tela9(selecionado1 , selecionado2 , selecionado3 , selecionado4, valorSpinner));
				}	
			});
			//observador para acionar a função através do enter na quantidade
			valores9.addKeyListener(new KeyListener() {
		           @Override
		           public void keyTyped(KeyEvent e) {}

		           @Override
		           public void keyPressed(KeyEvent e) {}

		           @Override
		           public void keyReleased(KeyEvent e) {
		        	    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		        	    	
							int valorSpinner = (int) valores9.getValue();
							Boolean selecionado1 = maiusculas.isSelected();
							Boolean selecionado2 = minusculas.isSelected();
							Boolean selecionado3 = numeros.isSelected();
							Boolean selecionado4 = simbolos.isSelected();
							resultados9.setText(funcoes.tela9(selecionado1 , selecionado2 , selecionado3 , selecionado4, valorSpinner));
		        	    }
		           }
		    });
			
			
			//texto result
			texto9_5 = new JLabel("Senha:");
			texto9_5.setBounds(35 , 130 , 100 , 25);
			pnl9.add(texto9_5);
			//resultado
			resultados9 = new JTextField();
			resultados9.setBounds(80 , 130 , 170 , 25);
			pnl9.add(resultados9);
			resultados9.setEditable(false);
	}	

	
	
	public static void main(String[] args) {
		
		new MULTITAREFAS();

	}
}