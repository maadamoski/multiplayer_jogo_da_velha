package views;

import java.awt.Color;

import views.About;

public class About extends javax.swing.JFrame {

	
	private static final long serialVersionUID = 1L;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;

	private javax.swing.JPanel jPanel1;

	public About() {
		this.getContentPane().setBackground(Color.BLACK);
		initComponents();
		setLocation(350, 250);
	}

	private void initComponents() {
		
		jPanel1 = new javax.swing.JPanel();

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("About...");
		setResizable(false);
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("About..."));

		jLabel1.setFont(new java.awt.Font("Arial", 1, 16));
		jLabel1.setText("Jogo da Velha Multiplayer");
		

		jLabel2.setFont(new java.awt.Font("Arial", 1, 14));
		jLabel2.setText("Desenvolvido por:");

		jLabel3.setText("Tiago Manika Adamoski");

		jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11));
		jLabel4.setText("maadamoski@gmail.com");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								jPanel1Layout.createSequentialGroup().addGap(71, 71, 71).addComponent(jLabel1))

						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel2))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(95, 95, 95)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel3).addComponent(jLabel4)))

		)

						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addGap(26, 26, 26)

						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

						.addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

						).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		
		
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1,
						javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)

		)
				

		);
		

		pack();
	}
	

	/*public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new About().setVisible(true);
			}
		});
	}*/
}
