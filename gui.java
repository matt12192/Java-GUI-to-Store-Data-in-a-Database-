
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JButton;


//class GUI extends the Database class by creating a Graphical User Interface 

	
	public class gui extends db {
		
	   	//Declaring variables
		
			    
		static String Postcode;
		static String AllocatedZone;
		
	
	//creating the frame that will hold labels, textboxes and buttons for the GUI   
    
	JFrame jframe_window;
 
	//defined  java labels (jl) - title, Customer Number, Customer Name, Customer Address, Customer Postcode, Customer Age, and Customer Zone   
    
    JLabel jl_Title;
	
    JLabel jl_Customer_Number;
    JLabel jl_Customer_Name;
    JLabel jl_Customer_Address;
    JLabel jl_Customer_Postcode;
    JLabel jl_Customer_Age;  
    JLabel jl_Customer_Zone;

    //defined java text fields (Textboxes - jtf) -  Customer Number, Customer Name, Customer Address, Customer Postcode, Customer Age, and Customer Zone     
    
    JTextField jtf_Customer_Number;
    JTextField jtf_Customer_Name;
    JTextField jtf_Customer_Address;
    JTextField jtf_Customer_Postcode;
    JTextField jtf_Customer_Age;
    JTextField jtf_Customer_Zone;
    
    

    //defines User Control Buttons 
    
    //Buttons to navigate to different records
    
    JButton jb_Next = new JButton("Next");
    JButton jb_Prev = new JButton("Previous");
    JButton jb_Last = new JButton("Last");
    JButton jb_First = new JButton("First");
    
    //Buttons to manage records
    
    JButton jb_update = new JButton("Update");
    JButton jb_delete = new JButton("Delete");
    JButton jb_new = new JButton("New");
    JButton jb_save = new JButton ("Save");
 
    //Method to calls frame - creating and displaying frame and listening for User input using the tbtnAction method   
    
    public gui() {
    
   //call to create and and display frame.
    frame();
    
    
    //call to listen to any User actions
    listenForUserAction();

}
  //frame method holds and creates the properties of a frame, labels, textboxes, buttons and panel  
   
    public void frame(){
 
    	//frame properties are set        
     
    	jframe_window = new JFrame();
    	
    	jframe_window.setTitle("Java Assignment 2 - Created By Matthew Boden");
    	jframe_window.setSize(700, 400);
    	jframe_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
        //font selection  - font type, font style and point size       
        
    	Font font0 = new Font("Arial", Font.BOLD ,12);
    	    	
        Font font1 = new Font ("Arial", Font.BOLD , 18);
                
        
        //Create JLabels that will show field names
        //location, size and font are set
        
        jl_Title = new JLabel("Customer Zone Allocation");
        jl_Title.setLocation(100,10);
        jl_Title.setSize (400,20);
        jl_Title.setFont(font1);
        jl_Title.setForeground(Color.black);
                
        jl_Customer_Number = new JLabel("Customer ID");
        jl_Customer_Number.setLocation(10, 40);
        jl_Customer_Number.setSize(200, 20);
        jl_Customer_Number.setFont(font0);
             
        jl_Customer_Name = new JLabel("Customer Name");
        jl_Customer_Name.setLocation(10, 80);
        jl_Customer_Name.setSize(200, 20);
        jl_Customer_Name.setFont(font0);
                
        jl_Customer_Address = new JLabel("Customer Address");
        jl_Customer_Address.setLocation(10, 120);
        jl_Customer_Address.setSize(200, 20);
        jl_Customer_Address.setFont(font0);
                
        jl_Customer_Postcode = new JLabel("Customer Postcode");
        jl_Customer_Postcode.setLocation(10, 160);
        jl_Customer_Postcode.setSize(200, 20);
        jl_Customer_Postcode.setFont(font0);
                
        jl_Customer_Age = new JLabel("Customer Age");    
        jl_Customer_Age.setLocation(10, 200);
        jl_Customer_Age.setSize(200, 20);
        jl_Customer_Age.setFont(font0);
        
        jl_Customer_Zone = new JLabel("Customer Zone");    
        jl_Customer_Zone.setLocation(10, 240);
        jl_Customer_Zone.setSize(200, 20);
        jl_Customer_Zone.setFont(font0);
        
               
                
               
        //JTextField containers are created to hold Field values
        //location, size, font and tooltip text for textboxes is set
        
        jtf_Customer_Number = new JTextField(10);
        jtf_Customer_Number.setLocation(200, 40);
        jtf_Customer_Number.setSize(200, 20);
        jtf_Customer_Number.setFont(font0);
        jtf_Customer_Number.setToolTipText("READ ONLY FIELD - Displays Customer Number");
        jtf_Customer_Number.setEditable(false);
                        
        jtf_Customer_Name = new JTextField(10);
        jtf_Customer_Name.setLocation(200, 80);
        jtf_Customer_Name.setSize(200, 20);
        jtf_Customer_Name.setFont(font0);
        jtf_Customer_Name.setToolTipText("Use field to Enter or Edit Customer Name");
                        
        jtf_Customer_Address = new JTextField(10);
        jtf_Customer_Address.setLocation(200, 120);
        jtf_Customer_Address.setSize(200, 20);
        jtf_Customer_Address.setFont(font0);
        jtf_Customer_Address.setToolTipText("Use field to Enter or Edit Customer Address");
          
        jtf_Customer_Postcode = new JTextField(10);
        jtf_Customer_Postcode.setLocation(200, 160);
        jtf_Customer_Postcode.setSize(200, 20);
        jtf_Customer_Postcode.setFont(font0);
        jtf_Customer_Postcode.setToolTipText("Use field to Enter or Edit Customers Postcode");
                
        jtf_Customer_Age = new JTextField(10);
        jtf_Customer_Age.setLocation(200, 200);
        jtf_Customer_Age.setSize(200, 20);
        jtf_Customer_Age.setFont(font0);
        jtf_Customer_Age.setToolTipText("Use field to enter customers age");
        
        jtf_Customer_Zone = new JTextField(10);
        jtf_Customer_Zone.setLocation(200, 240);
        jtf_Customer_Zone.setSize(200, 20);
        jtf_Customer_Zone.setFont(font0);
        jtf_Customer_Zone.setToolTipText("READ ONLY FIELD - Displays customers allocated zone");
        jtf_Customer_Zone.setEditable(false);
                   
        //JPanel is created to hold JFrame container with Screen Controls
        //layout and location of panel is set
        
        JPanel jpanel = new JPanel(new BorderLayout());
        jpanel.setLayout(null);
        jpanel.setBackground(Color.green);
               
        //Field TextBoxes and Labels are added to JPanel
       
        jpanel.add(jl_Title);
        
        jpanel.add(jl_Customer_Number);
        jpanel.add(jtf_Customer_Number);
                
        jpanel.add(jl_Customer_Name);
        jpanel.add(jtf_Customer_Name);
        
        jpanel.add(jl_Customer_Address);
        jpanel.add(jtf_Customer_Address);
        
        jpanel.add(jl_Customer_Postcode);
        jpanel.add(jtf_Customer_Postcode);
        
        jpanel.add(jl_Customer_Age);
        jpanel.add(jtf_Customer_Age);
        
        jpanel.add(jl_Customer_Zone);
        jpanel.add(jtf_Customer_Zone);
             
        //set tooltip background and text colour 
        
        try
        
        {
        
        	UIManager.put("Tooltip.background", Color.WHITE);
           	UIManager.put("ToolTip.foreground", Color.RED);
        
        }
        
        catch(Throwable th)
        
        {
        
        	th.printStackTrace();
        
        }
        
        //Navigation Buttons are added to JPanel and their position, size and tooltip are set
        
        jb_Next.setBounds(420, 40, 130, 30);
        jb_Next.setToolTipText("Click this button to view Next Customer Record");
                                   
        jb_Prev.setBounds(420, 80, 130, 30);
        jb_Prev.setToolTipText("Click this button to view Previous Customer Record");
        
        jb_Last.setBounds(420, 120, 130, 30);
        jb_Last.setToolTipText("Click this button to view Last Customer Record");
        
        jb_First.setBounds(420, 160, 130, 30);
        jb_First.setToolTipText("Click this button to view First Customer Record");
        
        jb_update.setBounds(10, 270, 130, 30); 
        jb_update.setToolTipText("Click this button to Save Updated Customer Information");
        
        jb_delete.setBounds(150, 270, 130, 30); 
        jb_delete.setBackground(Color.RED);
        jb_delete.setToolTipText("Click this button to Delete Customer Record");
        
             
        jb_new.setBounds(290, 270, 130, 30);
        jb_new.setToolTipText("Click this button to clear fields to add New Customer Information");
        
        jb_save.setBounds(430, 270, 130, 30);
        jb_save.setBackground(Color.gray);
        jb_save.setToolTipText("Click this button to Save New Customer Information");
        
        //Buttons are added to JPanel
        
        jpanel.add(jb_Next);
        jpanel.add(jb_Prev);
        jpanel.add(jb_Last);
        jpanel.add(jb_First);
        jpanel.add(jb_update);
        jpanel.add(jb_delete);
        jpanel.add(jb_new);
        jpanel.add(jb_save);
        
        
        //JPanel is added to JFrame
       
        jframe_window.add(jpanel);
        
        //Once jpanel has properties set and added to Jframe_window the frame is made visible
             
        jframe_window.setVisible(true);
                     
        //Connect to the MS Access DB, populate the ResultSet with all data, 
        //navigate to first record, populate screen controls
        
        try{
            
            resultset.next();
            
            jtf_Customer_Number.setText(resultset.getString("Customer_Number"));
            jtf_Customer_Name.setText(resultset.getString("Customer_name"));
            jtf_Customer_Address.setText(resultset.getString("Customer_Address"));
            jtf_Customer_Postcode.setText(resultset.getString("Customer_Postcode"));
            jtf_Customer_Age.setText(resultset.getString("Customer_Age"));
            jtf_Customer_Zone.setText(resultset.getString("Allocated_Zone"));
                       
        }
        
        catch(Exception ex)
        
        {
            
            JOptionPane.showMessageDialog(null, ex); 
            
        }    
                    
         
    }
    
      	   	
    	
    	    	    	
    	public static void AllocateZone(String Postcode){
        	
    		switch(Postcode.substring(0, 4)) 
        	{
            
        	//Belfast
        	
        	case "BT1 ": case "BT2 ": case "BT3 ": case "BT4 ": case "BT5 ": case "BT6 ": case "BT7 ": case "BT8 ":
            case "BT9 ": case "BT10": case "BT11": case "BT12": case "BT13": case "BT14": case "BT15":
            AllocatedZone = "Belfast"; 
            break;
            
            //North
            
            case "BT39": case "BT40": case "BT41": case "BT42": case "BT43": case "BT44": case "BT45": case "BT46": 
            case "BT51": case "BT52": case "BT53": case "BT54": case "BT55": case "BT56": case "BT57":
            AllocatedZone = "North";
            break;
            
            //South
            
            case "BT25": case "BT26": case "BT32": case "BT35": case "BT60": case "BT61": case "BT62": case "BT63": 
            case "BT64": case "BT65": case "BT66": case "BT67": case "BT68": case "BT69": case "BT70": case "BT71": 
            case "BT80":
            AllocatedZone = "South";
            break;
            
            //East  
            
            case "BT16": case "BT17": case "BT18": case "BT19": case "BT20": case "BT21": case "BT22": case "BT23": 
            case "BT24": case "BT27": case "BT28": case "BT29": case "BT30": case "BT31": case "BT33": case "BT34": 
            case "BT36": case "BT37": case "BT38":
            AllocatedZone = "East";
            break;
            
            //West       
            
            case "BT47": case "BT48": case "BT49": case "BT74": case "BT75": case "BT76": case "BT77": case "BT78": 
            case "BT79": case "BT81": case "BT82": case "BT92": case "BT93": case "BT94":
            AllocatedZone = "West";
            break;
             
            default: AllocatedZone = "No Zone";
            break;
            //UNALLOCATED

            
          
        }
        	
    		
             		
        	
        	   	
            	
        }
    	   
    
    
public static int ConvertStringToInt(String aString){
        
        int aInt = Integer.parseInt(aString);

        return aInt;
                        
}
 
 
 public static double ConvertStringToDouble(String aString){
     
     double aDouble = Double.parseDouble(aString);

     return aDouble;
                     
}
 
 public static String ConvertIntToString(int aInt){
     
     String aString = Integer.toString(aInt);
     
     return aString;
     
}
 
 public static String ConvertDoubleToString(Double aDouble){
     
     String aString = Double.toString(aDouble);
     
     return aString;
     
}

//Button Method is created to 'listen' to Users Clicking each button and responds accordingly 

    public void listenForUserAction(){
    
    	jb_Next.addActionListener(new ActionListener(){
    
    		public void actionPerformed(ActionEvent e)
        
    		{
    		
    			//Connect with database and search for next record     

    			try{
    
    				if(resultset.next())
    
    				{
    
    					jtf_Customer_Number.setText(resultset.getString("Customer_Number"));
    					jtf_Customer_Name.setText(resultset.getString("Customer_Name"));
    					jtf_Customer_Address.setText(resultset.getString("Customer_Address"));
    					jtf_Customer_Postcode.setText(resultset.getString("Customer_Postcode"));
    					jtf_Customer_Age.setText(resultset.getString("Customer_Age"));
    					jtf_Customer_Zone.setText(resultset.getString("Allocated_Zone"));

    				}


    				else
    

    				{
    
    					resultset.previous();

    					//if no next record display messagebox

    					JOptionPane.showMessageDialog(null,"No More Customer Information!");

    				}

    				//if error catch and display in messagebox

    			}
    			
    			catch(Exception ex)
    
    			{
    
    				JOptionPane.showMessageDialog(null, ex); 

    			}

    		}

    	});
    	
    	

    	jb_Prev.addActionListener(new ActionListener(){
    
    		public void actionPerformed(ActionEvent e)
        
    		{

    			//Connect to database and search for previous record    

    			try{
    

    				if(resultset.previous())
    

    				{
    
    					jtf_Customer_Number.setText(resultset.getString("Customer_Number"));
    		            		jtf_Customer_Name.setText(resultset.getString("Customer_Name"));
    		            		jtf_Customer_Address.setText(resultset.getString("Customer_Address"));
    		            		jtf_Customer_Postcode.setText(resultset.getString("Customer_Postcode"));
    		            		jtf_Customer_Age.setText(resultset.getString("Customer_Age"));
    		            		jtf_Customer_Zone.setText(resultset.getString("Allocated_Zone"));
   		            
    				}

    				else
    
    				{
 
    					//if no previous records display messagebox   

    					resultset.next();

    					JOptionPane.showMessageDialog(null,"No More Customer Information!");

    				}

    				//if error occurs catch and display in messagebox

    			}
    			
    			catch(Exception ex)

    			{

    			}

    		}

    	});


    	jb_Last.addActionListener(new ActionListener(){

    		public void actionPerformed(ActionEvent e)

    		{

    			//Connect to database and search for last record    

    			try{

    				resultset.last();

    				jtf_Customer_Number.setText(resultset.getString("Customer_Number"));
            		jtf_Customer_Name.setText(resultset.getString("Customer_Name"));
            		jtf_Customer_Address.setText(resultset.getString("Customer_Address"));
            		jtf_Customer_Postcode.setText(resultset.getString("Customer_Postcode"));
            		jtf_Customer_Age.setText(resultset.getString("Customer_Age"));
            		jtf_Customer_Zone.setText(resultset.getString("Allocated_Zone"));
    				

    	            //if error occurs catch and display in messagebox

    			}
    			
    			catch(Exception ex)

    			{

    			}

    		}

    	});


    	jb_First.addActionListener(new ActionListener(){

	
    		public void actionPerformed(ActionEvent e)

    		{

		//Connect to database and search for first record

		try{

			resultset.first();

			jtf_Customer_Number.setText(resultset.getString("Customer_Number"));
    		jtf_Customer_Name.setText(resultset.getString("Customer_Name"));
    		jtf_Customer_Address.setText(resultset.getString("Customer_Address"));
    		jtf_Customer_Postcode.setText(resultset.getString("Customer_Postcode"));
    		jtf_Customer_Age.setText(resultset.getString("Customer_Age"));
    		jtf_Customer_Zone.setText(resultset.getString("Allocated_Zone"));

            //If error occurs catch and display in messagebox

		}
		
		catch(Exception ex)

		{

	
			JOptionPane.showMessageDialog(null, ex);
		
		}


    		}


    	});


    	jb_update.addActionListener(new ActionListener(){

    		public void actionPerformed(ActionEvent e)

    		{

    			
    			
    			//String Customer_Number = t1.getText(); - The Primary Key value is never modified by a User

    			String Customer_Name = jtf_Customer_Name.getText();
    			
    			String Customer_Address = jtf_Customer_Address.getText();
    			String Customer_Postcode = jtf_Customer_Postcode.getText();
    			String Customer_Age = jtf_Customer_Age.getText();
    			
    			
    			AllocateZone(Customer_Postcode); 
    			
    			jtf_Customer_Zone.setText(AllocatedZone);
    			
    			
    			
    			String Allocated_Zone = AllocatedZone;
    			//Connect to database and enter data from textboxes  
    			
    			
    			
    			
    			//String Allocated_zone = jtf_Customer_Zone.getText();


    			//Connect to database and insert information from textboxes

    			try{

    				//resultset.updateString("Customer_Number", Customer_Number); - The Primary Key value is never modified by a User 

    				resultset.updateString("Customer_Name", Customer_Name);
    				resultset.updateString("Customer_Address", Customer_Address);
    				resultset.updateString("Customer_Postcode", Customer_Postcode);
    				resultset.updateString("Customer_Age", Customer_Age);
    				resultset.updateString("Allocated_Zone", Allocated_Zone);
    				resultset.updateRow();

    				JOptionPane.showMessageDialog(null, "Record Updated!");

    				//If error occurs catch and display messagebox

    			}
    			
    			catch(Exception ex)

    			{

    				JOptionPane.showMessageDialog(null, ex);

    			}

    		}

    	}); 
    	
     	
    	
    	jb_delete.addActionListener(new ActionListener(){

    		public void actionPerformed(ActionEvent e)

    		{

    			//Connect to database delete record    

    			try{

    				resultset.deleteRow();

    				resultset.beforeFirst();

    				resultset.next();

    				jtf_Customer_Number.setText(resultset.getString("Customer_Number"));
				jtf_Customer_Name.setText(resultset.getString("Customer_Name"));
				jtf_Customer_Address.setText(resultset.getString("Customer_Address"));
				jtf_Customer_Postcode.setText(resultset.getString("Customer_Postcode"));
				jtf_Customer_Age.setText(resultset.getString("Customer_Age"));
				jtf_Customer_Zone.setText(resultset.getString("Allocated_Zone"));

    				//If error occurs catch and display messagebox

    			}
    			
    			catch(Exception ex)

    			{

    				JOptionPane.showMessageDialog(null, "Delete Error: " + ex);

    			}

    		}

    	});

    	jb_new.addActionListener(new ActionListener(){

    		public void actionPerformed(ActionEvent e)


    		{
    			
    			//Clear text field text

    			jtf_Customer_Number.setText(" ");
    			jtf_Customer_Name.setText(" ");
    			jtf_Customer_Address.setText(" ");
    			jtf_Customer_Postcode.setText(" ");
    			jtf_Customer_Age.setText(" ");
    			jtf_Customer_Zone.setText(" ");
    			    			
    		}

    	});

    	jb_save.addActionListener(new ActionListener(){

    		public void actionPerformed(ActionEvent e)

    		{

    			    			
    			//String Customer_Number = t1.getText(); - The Primary Key value is never created by a User 

    			String Customer_Name = jtf_Customer_Name.getText();
    			String Customer_Address = jtf_Customer_Address.getText();
    			String Customer_Postcode = jtf_Customer_Postcode.getText();
    			String Customer_Age = jtf_Customer_Age.getText();
    			    
    			
    			
    			
    			AllocateZone(Customer_Postcode); 
    			
    			jtf_Customer_Zone.setText(AllocatedZone);
    			
    			
    			
    			String Allocated_Zone = AllocatedZone;
    			//Connect to database and enter data from textboxes

    			try{

    				resultset.moveToInsertRow();

    				resultset.updateString("Customer_Name", Customer_Name);
    				resultset.updateString("Customer_Address", Customer_Address);
    				resultset.updateString("Customer_Postcode", Customer_Postcode);
    				resultset.updateString("Customer_Age", Customer_Age);
    				resultset.updateString("Allocated_Zone", Allocated_Zone);

    				resultset.insertRow();

    				//Navigate to before first record

    				resultset.beforeFirst();

    				//Navigate to first record and populate screen controls 

    				resultset.next();

    				jtf_Customer_Number.setText(resultset.getString("Customer_Number"));
				jtf_Customer_Name.setText(resultset.getString("Customer_Name"));
				jtf_Customer_Address.setText(resultset.getString("Customer_Address"));
				jtf_Customer_Postcode.setText(resultset.getString("Customer_Postcode"));
				jtf_Customer_Age.setText(resultset.getString("Customer_Age"));
				jtf_Customer_Zone.setText(resultset.getString("Allocated_Zone"));

    				JOptionPane.showMessageDialog(null, "Record Saved");

    				//If error occurs catch and display messagebox

    			}
    			
    			catch(Exception ex)

    			{

    				//JOptionPane.showMessageDialog(null, ex);

    			} 

    		}

    	});

    }
}





