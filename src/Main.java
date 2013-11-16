import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;


public class Main extends JFrame {
	
	private JTable table;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelCatalogo = new JPanel();
		tabbedPane.addTab("Catalogo", null, panelCatalogo, null);
		
		JMenuBar menuBar = new JMenuBar();
		panelCatalogo.add(menuBar);
		
		JMenuItem mntmHubs = new JMenuItem("Hubs");
		mntmHubs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				System.out.println("HUB");
				
			}
		});
		menuBar.add(mntmHubs);
		
		JMenuItem mntmImpressoras = new JMenuItem("Impressoras");
		mntmImpressoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				System.out.println("IMPRESSORAS");
			}
		});
		menuBar.add(mntmImpressoras);
		
		JMenuItem mntmMonitor = new JMenuItem("Monitores");
		mntmMonitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("MONITORES");
			}
		});
		menuBar.add(mntmMonitor);
		
		JMenuItem mntmNotebooks = new JMenuItem("Notebooks");
		mntmNotebooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("NOTEBOOKS");
			}
		});
		menuBar.add(mntmNotebooks);

		
		table = new JTable();
		panelCatalogo.add(table);
		
		JPanel panelCarrinho = new JPanel();
		tabbedPane.addTab("Carrinho", null, panelCarrinho, null);
		
	}
}
