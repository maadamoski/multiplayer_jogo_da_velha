package views;

import java.awt.Color;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	Integer player;
	int matrix[][] = new int[3][3];
	int p1;
	int p2;

	
	private String username;
	private InetAddress endMulticast;
	private int port;
	private MulticastSocket socket;
		
	private javax.swing.JButton btn1;
	private javax.swing.JButton btn2;
	private javax.swing.JButton btn3;
	private javax.swing.JButton btn4;
	private javax.swing.JButton btn5;
	private javax.swing.JButton btn6;
	private javax.swing.JButton btn7;
	private javax.swing.JButton btn8;
	private javax.swing.JButton btn9;
	private javax.swing.JButton btnConnect;
	private javax.swing.JButton btnDisconnect;
	private javax.swing.JButton btnNewGame;
	private javax.swing.JButton btnSendMsg;
	
	private javax.swing.JComboBox<Object> jCB;
	
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	
	private javax.swing.JMenuBar jMBar1;
	
	private javax.swing.JMenuItem jMIQuit;
	private javax.swing.JMenuItem jMIAbout;
	
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
		
	private javax.swing.JScrollPane jSPanel;
	
	private javax.swing.JToolBar jTBar;
		
	private javax.swing.JTextField jTFMsg;
	private javax.swing.JTextField jTFMulticast;
	private javax.swing.JTextField jTFPort;
	private javax.swing.JTextField jTFUser;
	
	private javax.swing.JTextArea jTxtArea;
	

	public Game() {
		this.getContentPane().setBackground(Color.DARK_GRAY);
		initComponents();
		setLocation(310, 50);
	}

	public void StartGame() {
		
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				matrix[i][j] = 0;

		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");

		// iniciando os players
		if (String.valueOf(jCB.getSelectedItem()).equals("Player O"))
			player = 1;
		if (String.valueOf(jCB.getSelectedItem()).equals("Player X"))
			player = 2;

		JOptionPane.showMessageDialog(null, "Game Started! ");
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jPanel6 = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
				
		btn1 = new javax.swing.JButton();
		btn4 = new javax.swing.JButton();
		btn7 = new javax.swing.JButton();
		btn2 = new javax.swing.JButton();
		btn5 = new javax.swing.JButton();
		btn8 = new javax.swing.JButton();
		btn3 = new javax.swing.JButton();
		btn6 = new javax.swing.JButton();
		btn9 = new javax.swing.JButton();
		btnSendMsg = new javax.swing.JButton();
		btnConnect = new javax.swing.JButton();
		btnDisconnect = new javax.swing.JButton();
		btnNewGame = new javax.swing.JButton();
		
		jSPanel = new javax.swing.JScrollPane();
		
		jTxtArea = new javax.swing.JTextArea();
		
		jTBar = new javax.swing.JToolBar();
		
		jCB = new javax.swing.JComboBox<>();
		
		jTFUser = new javax.swing.JTextField();
		jTFMsg = new javax.swing.JTextField();
		jTFMulticast = new javax.swing.JTextField();
		jTFPort = new javax.swing.JTextField();
		
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		
		jMBar1 = new javax.swing.JMenuBar();
		
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		
		jMIQuit = new javax.swing.JMenuItem();
		jMIAbout = new javax.swing.JMenuItem();
		
		

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Jogo da Velha Multiplayer"));

		jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		btn1.setEnabled(false);
		btn1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn1MouseClicked(evt);
			}
		});

		btn4.setEnabled(false);
		btn4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn4MouseClicked(evt);
			}
		});

		btn7.setEnabled(false);
		btn7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn7MouseClicked(evt);
			}
		});

		btn2.setEnabled(false);
		btn2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn2MouseClicked(evt);
			}
		});

		btn5.setEnabled(false);
		btn5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn5MouseClicked(evt);
			}
		});

		btn8.setEnabled(false);
		btn8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn8MouseClicked(evt);
			}
		});

		btn3.setEnabled(false);
		btn3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn3MouseClicked(evt);
			}
		});

		btn6.setEnabled(false);
		btn6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn6MouseClicked(evt);
			}
		});

		btn9.setEnabled(false);
		btn9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn9MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
					.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup()
										.addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE,
												92, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel6Layout.createSequentialGroup()
										.addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE,
												92, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel6Layout.createSequentialGroup()
										.addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE,
												92, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(
						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Posts",
				javax.swing.border.TitledBorder.RIGHT,  javax.swing.border.TitledBorder.DEFAULT_POSITION));

		jTxtArea.setColumns(20);
		jTxtArea.setEditable(false);
		jTxtArea.setRows(5);
		jSPanel.setViewportView(jTxtArea);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jSPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addContainerGap()
								.addComponent(jSPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
								.addContainerGap()));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Connect or Disconnect"));

		jTBar.setRollover(true);

		jCB.setModel(new javax.swing.DefaultComboBoxModel<Object>(new String[] { "Player O", "Player X" }));
		jCB.setEnabled(false);
		jTBar.add(jCB);

		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));

		jTFUser.setFont(new java.awt.Font("Arial", 2, 11));
		jTFUser.setText("Enter your name");
		jTFUser.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTFUserMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTFUser, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Message"));

		jTFMsg.setFont(new java.awt.Font("Arial", 2, 11));
		jTFMsg.setText("Enter your Message");
		jTFMsg.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTFMsgMouseClicked(evt);
			}
		});

		btnSendMsg.setText("Send");
		btnSendMsg.setEnabled(false);
		btnSendMsg.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSendMsgActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel5Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(btnSendMsg, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
										.addComponent(jTFMsg, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
								.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jTFMsg, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnSendMsg)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		btnConnect.setText("CONNECT");
		btnConnect.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btConnectActionPerformed(evt);
			}
		});

		jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Connection"));

		jLabel1.setText("Multicast");

		jTFMulticast.setText("237.32.65.3");

		jLabel2.setText("Port:");

		jTFPort.setText("9999");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(
										jTFMulticast, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
						.addGroup(jPanel7Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jLabel2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jTFPort, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jTFMulticast, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTFPort, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		btnDisconnect.setText("DISCONNECT");
		btnDisconnect.setEnabled(false);
		btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDisconnectActionPerformed(evt);
			}
		});

		btnNewGame.setText("NEW GAME");
		btnNewGame.setEnabled(false);
		btnNewGame.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNewGameActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnConnect, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
								.addComponent(btnDisconnect, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
								.addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jTBar, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
								.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(
										btnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
								.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jPanel5,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup().addContainerGap()
								.addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnDisconnect, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addGap(18, 18, 18)
								.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTBar, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

		jMenu1.setText("File");

		jMIQuit.setText("Quit");
		jMIQuit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMIQuitActionPerformed(evt);
			}
		});
		jMenu1.add(jMIQuit);

		jMBar1.add(jMenu1);

		jMenu2.setText("About ");

		jMIAbout.setText("About... ");
		jMIAbout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMIAboutActionPerformed(evt);
			}
		});
		jMenu2.add(jMIAbout);

		jMBar1.add(jMenu2);

		setJMenuBar(jMBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(21, Short.MAX_VALUE)));

		pack();
	}

	

	public void BlockButton(int block) {

		if (block == 1) {
			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
			btn4.setEnabled(true);
			btn5.setEnabled(true);
			btn6.setEnabled(true);
			btn7.setEnabled(true);
			btn8.setEnabled(true);
			btn9.setEnabled(true);
		}

		if (block == 2) {
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);
		}
	}

	
	
	public void Win() {

		p1 = 0;// player '0'
		p2 = 0;// player 'X'

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (matrix[i][j] == 1) {

					// linha
					if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O"))
						p1++;
					if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O"))
						p1++;
					if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O"))
						p1++;

					// coluna
					if (btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O"))
						p1++;
					if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O"))
						p1++;
					if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O"))
						p1++;

					// diagonal \
					if (btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O"))
						p1++;

					// diagonal /
					if (btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O"))
						p1++;
				} else if (matrix[i][j] == 2) {

					// linha
					if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X"))
						p2++;
					if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X"))
						p2++;
					if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X"))
						p2++;

					// coluna
					if (btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X"))
						p2++;
					if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X"))
						p2++;
					if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X"))
						p2++;

					// diagonal \
					if (btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X"))
						p2++;

					// diagonal/
					if (btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X"))
						p2++;
				}
			}
		}

		if (p1 == 3) {
			JOptionPane.showMessageDialog(null, "Player 'O' Win!");
			p1 = 0;
			p2 = 0;

			BlockButton(2);
			sendMsg("Player 'O' Win!\n");
			sendMsg("block2");
		}

		if (p2 == 3) {
			JOptionPane.showMessageDialog(null, "Player 'X' Win!");
			p2 = 0;
			p1 = 0;

			BlockButton(2);
			sendMsg("Player 'X' Win!\n");
			sendMsg("block2");
		}
	}

	public void Connect() {

		username = jTFUser.getText();
		jTFUser.setEnabled(false);

		try {
			port = Integer.parseInt(jTFPort.getText());
			endMulticast = InetAddress.getByName(jTFMulticast.getText());
			socket = new MulticastSocket(port);
			socket.joinGroup(endMulticast);
			ListenerThread();
			JOptionPane.showMessageDialog(null, "Connect!");
			btnConnect.setEnabled(false);
			btnDisconnect.setEnabled(true);
			btnNewGame.setEnabled(true);
			jCB.setEnabled(true);
			btnSendMsg.setEnabled(true);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Try Again! " + ex.toString() + "\n");
		}
	}

	public void Disconnect() {
		try {
			sendMsg(username + " Disconnected!");
			socket.close();
			JOptionPane.showMessageDialog(null, username + " Disconnected!");
		} catch (Exception ex) {
			System.err.println(ex.toString());
		}
	}

	public class Listener implements Runnable {

		public void run() {

			try {
				while (true) {
					byte dates[] = new byte[240];
					DatagramPacket datagram = new DatagramPacket(dates, dates.length);
					socket.receive(datagram);
					String text = new String(datagram.getData());
					UpdateBtn(text.trim());
					jTxtArea.append("\n" + text.trim());
				}
			} catch (Exception ex) {
				System.err.println(ex.toString());
			}
		}
	}

	public void ListenerThread() {
		Thread Listener = new Thread(new Listener());
		Listener.start();
	}

	public void sendMsg(String msg) {

		try {
			byte dates[] = new String(msg).getBytes();
			DatagramPacket datagram = new DatagramPacket(dates, dates.length, endMulticast, port);
			socket.send(datagram);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

	
	private void btn1MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[0][0] == 0) {
			if (player == 1) {
				matrix[0][0] = 1;
				btn1.setText("O");
				sendMsg("B1,P1");
			} else if (player == 2) {
				matrix[0][0] = 2;
				btn1.setText("X");
				sendMsg("B1,P2");
			}
			Win();
		}
	}

	private void btn2MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[0][1] == 0) {
			if (player == 1) {
				matrix[0][1] = 1;
				btn2.setText("O");
				sendMsg("B2,P1");
			} else if (player == 2) {
				matrix[0][1] = 2;
				btn2.setText("X");
				sendMsg("B2,P2");
			}
			Win();
		}
	}

	private void btn3MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[0][2] == 0) {
			if (player == 1) {
				matrix[0][2] = 1;
				btn3.setText("O");
				sendMsg("B3,P1");
			} else if (player == 2) {
				matrix[0][2] = 2;
				btn3.setText("X");
				sendMsg("B3,P2");
			}
			Win();
		}
	}

	private void btn4MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[1][0] == 0) {
			if (player == 1) {
				matrix[1][0] = 1;
				btn4.setText("O");
				sendMsg("B4,P1");
			} else if (player == 2) {
				matrix[1][0] = 2;
				btn4.setText("X");
				sendMsg("B4,P2");
			}
			Win();
		}
	}

	private void btn5MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[1][1] == 0) {
			if (player == 1) {
				matrix[1][1] = 1;
				btn5.setText("O");
				sendMsg("B5,P1");
			} else if (player == 2) {
				matrix[1][1] = 2;
				btn5.setText("X");
				sendMsg("B5,P2");
			}
			Win();
		}
	}

	private void btn6MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[1][2] == 0) {
			if (player == 1) {
				matrix[1][2] = 1;
				btn6.setText("O");
				sendMsg("B6,P1");
			} else if (player == 2) {
				matrix[1][2] = 2;
				btn6.setText("X");
				sendMsg("B6,P2");
			}
			Win();
		}
	}

	private void btn7MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[2][0] == 0) {
			if (player == 1) {
				matrix[2][0] = 1;
				btn7.setText("O");
				sendMsg("B7,P1");
			} else if (player == 2) {
				matrix[2][0] = 2;
				btn7.setText("X");
				sendMsg("B7,P2");
			}
			Win();
		}
	}

	private void btn8MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[2][1] == 0) {
			if (player == 1) {
				matrix[2][1] = 1;
				btn8.setText("O");
				sendMsg("B8,P1");
			} else if (player == 2) {
				matrix[2][1] = 2;
				btn8.setText("X");
				sendMsg("B8,P2");
			}
			Win();
		}
	}
	
	private void btn9MouseClicked(java.awt.event.MouseEvent evt) {

		if (matrix[2][2] == 0) {
			if (player == 1) {
				matrix[2][2] = 1;
				btn9.setText("O");
				sendMsg("B9,P1");
			} else if (player == 2) {
				matrix[2][2] = 2;
				btn9.setText("X");
				sendMsg("B9,P2");
			}
			Win();
		}
	}

	private void btConnectActionPerformed(java.awt.event.ActionEvent evt) {
		
		if (jTFUser.getText().equals("") || jTFUser.getText().equals("Enter your name")
				|| jTFMulticast.getText().equals("") || jTFPort.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Check the fields (User, Multicast, Port)");
		} else {
			Connect();
			sendMsg(username + " Connected!");
			jTFMulticast.setEnabled(false);
			jTFPort.setEnabled(false);
			jTFUser.setEditable(false);
		}
	}

	private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {
		
		Disconnect();
		btnDisconnect.setEnabled(false);
		btnNewGame.setEnabled(false);
		btnSendMsg.setEnabled(false);
		jCB.setEnabled(false);
		btnConnect.setEnabled(true);
		jTFMulticast.setEnabled(true);
		jTFPort.setEnabled(true);
		jTFUser.setEditable(true);

	}

	private void btnSendMsgActionPerformed(java.awt.event.ActionEvent evt) {
	
		sendMsg(jTFMsg.getText());
	}

	private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {
		StartGame();
		sendMsg(username + " Started a Multiplayer Game! - " + jCB.getSelectedItem().toString());
		BlockButton(1);
	}

	private void jTFUserMouseClicked(java.awt.event.MouseEvent evt) {
		jTFUser.setText("");
	}

	private void jTFMsgMouseClicked(java.awt.event.MouseEvent evt) {
		jTFMsg.setText("");
	}

	private void jMIQuitActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jMIAboutActionPerformed(java.awt.event.ActionEvent evt) {

		About about = new About();
		about.setVisible(true);
	}

	/*public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Game().setVisible(true);
			}
		});
	}*/

	public void UpdateBtn(String text) {

		
		if (text.equals("block2"))
			BlockButton(2);
		if (text.equals("B1,P1")) {
			btn1.setText("O");
			matrix[0][0] = 1;
		}
		if (text.equals("B1,P2")) {
			btn1.setText("X");
			matrix[0][0] = 2;
		}

		if (text.equals("B2,P1")) {
			btn2.setText("O");
			matrix[0][1] = 1;
		}
		if (text.equals("B2,P2")) {
			btn2.setText("X");
			matrix[0][1] = 2;
		}

		if (text.equals("B3,P1")) {
			btn3.setText("O");
			matrix[0][2] = 1;
		}
		if (text.equals("B3,P2")) {
			btn3.setText("X");
			matrix[0][2] = 2;
		}

		if (text.equals("B4,P1")) {
			btn4.setText("O");
			matrix[1][0] = 1;
		}
		if (text.equals("B4,P2")) {
			btn4.setText("X");
			matrix[1][0] = 2;
		}

		if (text.equals("B5,P1")) {
			btn5.setText("O");
			matrix[1][1] = 1;
		}
		if (text.equals("B5,P2")) {
			btn5.setText("X");
			matrix[1][1] = 2;
		}

		if (text.equals("B6,P1")) {
			btn6.setText("O");
			matrix[1][2] = 1;
		}
		if (text.equals("B6,P2")) {
			btn6.setText("X");
			matrix[1][2] = 2;
		}

		if (text.equals("B7,P1")) {
			btn7.setText("O");
			matrix[2][0] = 1;
		}
		if (text.equals("B7,P2")) {
			btn7.setText("X");
			matrix[2][0] = 2;
		}

		if (text.equals("B8,P1")) {
			btn8.setText("O");
			matrix[2][1] = 1;
		}
		if (text.equals("B8,P2")) {
			btn8.setText("X");
			matrix[2][1] = 2;
		}

		if (text.equals("B9,P1")) {
			btn9.setText("O");
			matrix[2][2] = 1;
		}
		if (text.equals("B9,P2")) {
			btn9.setText("X");
			matrix[2][2] = 2;
		}
	}

	
}
