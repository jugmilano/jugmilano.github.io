Sicuramente vi sarà capitato di dover creare delle '''form in Java Swing''' e pensare quindi al duro lavoro, più che altro di pazienza, che vi attendeva.
Le Swing sono eccezionali, permettono di creare GUI molto dinamiche e belle graficamente.
Il problema deve essere risolto: '''Unire semplicità di utilizzo delle Swing senza ricorrere ad un plugin grafico aggiuntivo per tool tipo Eclipse per creare GUI'''
Ho pensato,quindi, di creare una classe generica che quando viene istanziata permette la creazione di form dinamiche.
Iniziamo dunque:
Creiamo il nostro file java "'''Generic.java'''" che permetterà di creare la form dinamica.
Supponiamo di voler creare una form per l'autenticazione per un'applicazione.
Ecco il codice:

public class Generic extends JPanel{

	/*
	 * Etichette per la GUI
	 */
	protected final static String names[]= {"Username", "Password" };
	/*
	 * Componenti GUI
	 */
	protected JLabel labels[];
	public JTextField fields[];
	protected JButton button1;
	protected JPanel panelCenter, panelSouth;
	
	
	/*
	 * Numero dei campi di testo della GUI
	 */
	public int size;
	
	/*
	 * Costanti che rappresentano i campi di testo della GUI
	 */
	public static final int GENERIC1 = 0, GENERIC2 = 1;						
	/*
	 * Imposta la GUI.
	 * La dimensione dell'argomento del costruttore 
	 */
	public Generic(int size){
		this.size = size;
		labels = new JLabel[size];
		fields = new JTextField[size];
		
		/*
		 * Crea etichette
		 */
		for(int count = 0; count < labels.length; count++){
			labels[count] = new JLabel(names[count]);
		}
		
		/*
		 * Crea campi di testo
		 */
		for(int count = 0; count < fields.length; count++){
			fields[count] = new JTextField();
		}
		
		/*
		 * Crea il pannello CENTRALE 
		 */
		panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(size,2));  // altezza x larghezza
		
		/*
		 * Attacca etichette e campi di testo a panelCenter
		 */
		for(int count=0; count < size; count++){
			panelCenter.add(labels[count]);
			panelCenter.add(fields[count]);
		}
		
		/*
		 * Crea pulsante generico senza etichette e gestori di eventi
		 */
		button1 = new JButton();
		
		
		/*
		 * Crea il pannello SUD per disporre i pulsanti e li attacca
		 */
		panelSouth = new JPanel();
		panelSouth.add(button1);
		
		/*
		 * Imposta il layout del contenitore e attacca i pannelli
		 */
		setLayout(new BorderLayout());
		
		add(panelCenter, BorderLayout.CENTER);
		add(panelSouth, BorderLayout.SOUTH);
		
		validate();
	}

	public JButton getButton1() {
		return button1;
	}
}

Ora che abbiamo la nostra classe generica possiamo creare un'altra classe che permetterà la creazione della form specifica.
Ecco il codice del file "'''LoginInterface.java'''":


public class LoginInterface extends JFrame{

	private Generic user;
	private JButton loginButton;
	/*
	 * Imposta la GUI
	 */
	public LoginInterface()
	{
		super("Login Form");
		
		/*
		 * Aggiungo l'Interfaccia generica e la centro allo schermo 
		 * creando l'oggetto user e impostando i campi nella form a 2
		 */
		user = new Generic(2);
		getContentPane().add(user, BorderLayout.CENTER);
		
		/*
		 * Configuro il pulsante doTask1
		 */
		loginButton = user.getButton1();
		loginButton.setText("Login");
		loginButton.setToolTipText("Avvia il login");
		
		
		/* 
		 * Chiamata ad ActionListener 
		 */
		loginButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event)
				{
					String username = "";
					String password = "";
					
					username = user.fields[0].getText();
					password = user.fields[1].getText();
					/*
					 * Creo un oggetto di tipo Accesso che mi permette
					 * di effettuare la connessione all'applicazione
					 * Il codice del file Accesso(non postato) prende in input "username e password" ed effettua una query sul db
					 */
					Accesso accesso = new Accesso();
					accesso.autentica(username, password);
				}
			}
		); //Fine chiamata ad ActionListener per il primo bottone 
		
	
		/*
		 * Registra ascoltatore per chiusura finestra
		 */
		addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent event)
					{
						System.exit(1);
					}
				}
		); // Fine chiamata a WindowListener
		
		/*
		 * Regolazioni Contenitore
		 */
		setSize(240, 160); //Larghezza x Altezza
		setVisible(true);
		setResizable(false);
		setLocation(500, 300); //Centro il contenitore allo schermo
	}
	
	public static void main(String[] args){
		new LoginInterface();
	}
}
'''
Giovanni d'Elia'''
