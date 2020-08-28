	package Electricity;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class UserProject extends JFrame implements ActionListener{
	    UserProject(String s1){
	        super("Electricity Billing System");
	        
	        
	        setSize(1300,850);
	        setLocation(400,50);
	      
	        
	        
	        /* Adding background image */
	        ImageIcon ic =  new ImageIcon("Icons/elecwall.jpg");
	        Image i3 = ic.getImage().getScaledInstance(1300,850,Image.SCALE_DEFAULT);
	        ImageIcon icc3 = new ImageIcon(i3);
	        JLabel l1 = new JLabel(icc3);
	        add(l1);
	        
	       
	        l1.setLayout(null);
	        JLabel jl1 = new JLabel("WELCOME");
	        jl1.setFont(new Font("Serif", Font.PLAIN, 150));
	        jl1.setForeground(Color.WHITE);
	        jl1.setBounds(300,100,800,200);
	        
	        
	     
	        JLabel jl2 = new JLabel(s1.toUpperCase());
	        jl2.setFont(new Font("Serif", Font.PLAIN, 100));
	        jl2.setForeground(Color.WHITE);
	        jl2.setBounds(500,280,800,200);
	       
	        l1.add(jl1);
	        l1.add(jl2);
	        
	        
	        
	       
	        /* First Column */
	        JMenuBar mb  = new JMenuBar();
	        
	        JMenu Home = new JMenu("Home");
	        Home.setForeground(Color.RED);
	        Home.setFont(new Font("Serif", Font.PLAIN, 20));
	        
	        
	        
	        
	        JMenu master = new JMenu("Master");
	        JMenuItem m1 = new JMenuItem("New Connection");
	       
	        master.setForeground(Color.BLUE);
	        master.setFont(new Font("Serif", Font.PLAIN, 20));
	        
	        
	        /* ---- Customer Details ---- */
	        m1.setFont(new Font("monospaced",Font.PLAIN,12));
	        
	        
	      
	        m1.addActionListener(this);
	      
	        
	        // --------------------------------------------------------------------------------------------
	        JMenu pass = new JMenu("ChangePassword");
	        JMenuItem pass1 = new JMenuItem("Change Password");
	        pass.setForeground(Color.BLUE);
	        pass.setFont(new Font("Serif", Font.PLAIN, 20));
	        
	        pass1.addActionListener(this);
	        
	        
	        /* Second Column */
	        JMenu user = new JMenu("Bill");
	        JMenuItem u1 = new JMenuItem("Pay Bill");
	       
	       
	        user.setForeground(Color.BLUE);
	        user.setFont(new Font("Serif", Font.PLAIN, 20));
	        
	        /* ---- Pay Bill ---- */
	        u1.setFont(new Font("monospaced",Font.PLAIN,15));
	   	        
	        /* ---- Last Bill ----*/
	       
	 
	        
	        u1.addActionListener(this);
	 
	       
	        
	        // --------------------------------------------------------------------------------------------- 
	        
	        /* Third Column*/
	        JMenu report = new JMenu("Report");
	        JMenuItem r1 = new JMenuItem("Generate Bill");
	        report.setForeground(Color.BLUE);
	        report.setFont(new Font("Serif", Font.PLAIN, 20));
	        
	        /* ---- Report ---- */
	        r1.setFont(new Font("monospaced",Font.PLAIN,15));
	     
	        
	        r1.addActionListener(this);
	        
	        // -----------------------------------------------------------------------------------------------
	        
	        
	        JMenu Contact = new JMenu("Contact Us");
	        JMenuItem Query = new JMenuItem("Query");
	        Contact.setForeground(Color.BLUE);
	        Contact.setFont(new Font("Serif", Font.PLAIN, 20));
	        Query.setFont(new Font("monospaced",Font.PLAIN,15));
	        Query.addActionListener(this);
	        
	        
	        
	        /* Fourth Column*/
	        JMenu utility = new JMenu("Utility");
	        JMenuItem ut1 = new JMenuItem("Notepad");
	        JMenuItem ut2 = new JMenuItem("Calculator");
	        JMenuItem ut3 = new JMenuItem("Web Browser");
	        utility.setForeground(Color.BLUE);
	        utility.setFont(new Font("Serif", Font.PLAIN, 20));
	        
	        /* ---- Calender ---- */
	        ut1.setFont(new Font("monospaced",Font.PLAIN,15));
	      
	        
	        /* ---- Calculator ---- */
	        ut2.setFont(new Font("monospaced",Font.PLAIN,15));
	       
	        /* ---- Web Browser ---- */
	        ut3.setFont(new Font("monospaced",Font.PLAIN,15));
	    
	        
	        
	        ut1.addActionListener(this);
	        ut2.addActionListener(this);
	        ut3.addActionListener(this);
	        
	        // ---------------------------------------------------------------------------------------
	        
	        /*Fifth Column */
	        JMenu exit = new JMenu("Exit");
	        JMenuItem ex = new JMenuItem("Exit");
	        exit.setForeground(Color.BLUE);
	        exit.setFont(new Font("Serif", Font.PLAIN, 20));
	        
	        /* ---- Exit ---- */
	        ex.setFont(new Font("Serif",Font.PLAIN,15));
	    
	        
	        ex.addActionListener(this);
	        
	        
	        // ---------------------------------------------------------------------------------------------
	               
	        
	        master.add(m1);
	       
	        
	        pass.add(pass1);
	        
	        user.add(u1);
	      

	        
	        report.add(r1);
	        
	        Contact.add(Query);
	       
	        utility.add(ut1);
	        utility.add(ut2);
	        utility.add(ut3);
	        
	        exit.add(ex);
	        
	        mb.add(Home);
	        mb.add(master);
	        mb.add(pass);
	        mb.add(user);
	        mb.add(report);
	        mb.add(Contact);
	        mb.add(utility);
	        mb.add(exit);
	        
	        setJMenuBar(mb);    
	        //mb.setPreferredSize(new Dimension(100,50));
	        setFont(new Font("Senserif",Font.BOLD,16));
	        setLayout(new FlowLayout());
	        setVisible(false);
	    }
	    
	    public void actionPerformed(ActionEvent ae){
	        String msg = ae.getActionCommand();
	        if(msg.equals("Change Password")){
	            new ChangePassword().setVisible(true);
	            
	        }else if(msg.equals("New Connection")){
	            new new_customer().setVisible(true);
	            
	        }else if(msg.equals("Query")){
	            new calculate_bill().setVisible(true);
	            
	        }else if(msg.equals("Calculate Bill")){
	            new calculate_bill().setVisible(true);
	            
	        }else if(msg.equals("Notepad")){
	            try{
	                Runtime.getRuntime().exec("notepad.exe");
	            }catch(Exception e){ }
	        }else if(msg.equals("Calculator")){
	            try{
	                Runtime.getRuntime().exec("calc.exe");
	            }catch(Exception e){ }
	        }else if(msg.equals("Web Browser")){
	            try{
	                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	            }catch(Exception e){ }
	        }else if(msg.equals("Exit")){
	            System.exit(0);
	        }else if(msg.equals("Generate Bill")){
	            new generate_bill().setVisible(true);
	            
	        }
	        
	        
	    }
	 
	    
	    
	    public static void main(String[] args){
	    	UserLogin u = new UserLogin();
	    	String s1 = u.tf1.getText();
	    	
	        new UserProject(s1).setVisible(true);
	    }
	    
	}


