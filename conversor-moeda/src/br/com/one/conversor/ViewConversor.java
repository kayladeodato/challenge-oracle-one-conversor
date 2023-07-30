package br.com.one.conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DropMode;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.Locale;

public class ViewConversor {

	JFrame frame;
	private JTextField txtValorConverter;
	Double valorTotal;
	private JTextField txtValorTemperatura;
	Double temperatura;

	
	public ViewConversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 717, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Conversor = new JLabel("Conversor");
		Conversor.setForeground(new Color(123, 104, 238));
		Conversor.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		Conversor.setBounds(289, 11, 129, 41);
		frame.getContentPane().add(Conversor);
		
		JLabel lblNewLabel = new JLabel("Moeda");
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(92, 50, 161, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor a Converter: ");
		lblValor.setBounds(33, 97, 114, 14);
		frame.getContentPane().add(lblValor);
		
		JLabel lblDe = new JLabel("De");
		lblDe.setBounds(33, 148, 85, 14);
		frame.getContentPane().add(lblDe);
		
		JLabel lblPara = new JLabel("Para");
		lblPara.setBounds(33, 177, 46, 14);
		frame.getContentPane().add(lblPara);
		
		JList list = new JList();
		list.setBounds(92, 111, 1, 1);
		frame.getContentPane().add(list);
		
		txtValorConverter = new JTextField();
		txtValorConverter.setBounds(157, 94, 75, 20);
		frame.getContentPane().add(txtValorConverter);
		txtValorConverter.setColumns(10);
		
		JComboBox txtDeMoeda = new JComboBox();
		txtDeMoeda.setModel(new DefaultComboBoxModel(new String[] {"Real", "D\u00F3lar", "Euro", "Libras Esterlinas", "Peso Argentino", "Peso Chileno"}));
		txtDeMoeda.setBounds(76, 144, 129, 22);
		frame.getContentPane().add(txtDeMoeda);
		
		JComboBox txtParaMoeda = new JComboBox();
		txtParaMoeda.setModel(new DefaultComboBoxModel(new String[] {"Real", "D\u00F3lar", "Euro", "Libras Esterlinas", "Peso Argentino", "Peso Chileno"}));
		txtParaMoeda.setBounds(75, 173, 130, 22);
		frame.getContentPane().add(txtParaMoeda);
		
		JButton btnConverterMoeda = new JButton("Converter");
		btnConverterMoeda.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConverterMoeda.setForeground(new Color(255, 105, 180));
		btnConverterMoeda.setBackground(new Color(230, 230, 250));
		btnConverterMoeda.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ConversorMoeda conversorMoeda = new ConversorMoeda();

				String valorFormatado = txtValorConverter.getText().replace(',','.');

				Double valorTotal = Double.parseDouble(valorFormatado);
				String moedaOrigem = txtDeMoeda.getSelectedItem().toString();
				String moedaDestino = txtParaMoeda.getSelectedItem().toString();
				
				try {
					JOptionPane.showMessageDialog(null, "O valor convertido de " + moedaOrigem +
							" para " + moedaDestino + " é: "+ conversorMoeda.converterMoedas(valorTotal, moedaOrigem, moedaDestino));
				}
				catch(Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Dados inválidos para conversão.");
				}
				
				
				
			}
		});
		btnConverterMoeda.setBounds(76, 227, 117, 23);
		frame.getContentPane().add(btnConverterMoeda);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setForeground(new Color(148, 0, 211));
		lblTemperatura.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblTemperatura.setBounds(490, 50, 161, 36);
		frame.getContentPane().add(lblTemperatura);
		
		JLabel lblTemperaturaAConverter = new JLabel("Temperatura a Converter: ");
		lblTemperaturaAConverter.setBounds(345, 94, 150, 14);
		frame.getContentPane().add(lblTemperaturaAConverter);
		
		txtValorTemperatura = new JTextField();
		txtValorTemperatura.setColumns(10);
		txtValorTemperatura.setBounds(505, 91, 75, 20);
		frame.getContentPane().add(txtValorTemperatura);
		
		JLabel lblDeTemperatura = new JLabel("De");
		lblDeTemperatura.setBounds(408, 144, 85, 14);
		frame.getContentPane().add(lblDeTemperatura);
		
		JComboBox txtDeTemperatura = new JComboBox();
		txtDeTemperatura.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin"}));
		txtDeTemperatura.setBounds(451, 140, 129, 22);
		frame.getContentPane().add(txtDeTemperatura);
		
		JLabel lblParaTemperatura = new JLabel("Para");
		lblParaTemperatura.setBounds(408, 177, 46, 14);
		frame.getContentPane().add(lblParaTemperatura);
		
		JComboBox txtParaTemperatura = new JComboBox();
		txtParaTemperatura.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin"}));
		txtParaTemperatura.setBounds(450, 173, 130, 22);
		frame.getContentPane().add(txtParaTemperatura);
		
		JButton btnConverterTemperatura = new JButton("Converter");
		btnConverterTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ConversorTemperatura conversorTemperatura = new ConversorTemperatura();

				String temperaturaFormatada = txtValorConverter.getText().replace(',','.');

				Double temperatura = Double.parseDouble(temperaturaFormatada);
				String temperaturaOrigem = txtDeTemperatura.getSelectedItem().toString();
				String temperaturaDestino = txtParaTemperatura.getSelectedItem().toString();
				
				try {
					JOptionPane.showMessageDialog(null, "O valor convertido de " + temperaturaOrigem +
							" para " + temperaturaDestino + " é: "+ conversorTemperatura.converterTemperatura
							(temperatura, temperaturaOrigem, temperaturaDestino));
				}
				catch(Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Dados inválidos para conversão.");
				}
				
			}
		});
		btnConverterTemperatura.setForeground(new Color(255, 105, 180));
		btnConverterTemperatura.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConverterTemperatura.setBackground(new Color(230, 230, 250));
		btnConverterTemperatura.setBounds(463, 228, 117, 23);
		frame.getContentPane().add(btnConverterTemperatura);
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
