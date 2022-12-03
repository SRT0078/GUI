/**
 * This Transport_GUI class where has some methods used to create a GUI of vehicle, autoRickshaw and electricScooter. 
 * The vehicle class has five attributes: int vehicleID, String vehicleName, vehicleWeight, vehicleColor and vehicleSpeed 
   which is refereces to store by Vehicle types of array list.
 * The constructor accepts four parameters. The values of those parameters are assign the corresponding parameter values.
 * Each attribute has a corresponding accessor method and create a GUI and assign the value or do something like add, booked
   auotRickshaw then add, purchase or sell electricScooter.
 * Then finally display the all attributes values in GUI with also display the some message dialog as will.
 * @author (NP01MA4S220003, SITA RAM THING, MAD) 
 * @version (1.66, 2022-07-09)
 */

/* there is the import of all the methods in javax.swing package and java.awt package like JFrame, JLabel,
   JPanel, JButton, Font, Color etc... */
   
import javax.swing.*;
/*
 * import javax.swing.JFrame;
 * import javax.swing.JMenuBar;
 * import javax.swing.JMenu;
 * import javax.swing.JMenuItem;
 * import javax.swing.JPanel;
 * import javax.swing.JLabel;
 * import javax.swing.JTextArea;
 * import javax.swing.JTextField;
 * import javax.swing.JButton;
 * import javax.swing.JComboBox;
 * import javax.swing.JMenuItem;
 * import javax.swing.JOptionPane;
*/
import java.awt.*;
/*
 * import java.awt.Font;
 * import java.awt.Color;
*/
import java.awt.event.*;
/*
 * import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener;
*/
import java.util.ArrayList;

//there is create a Transport_GUI class where declared by various methods...
public class Transport_GUI implements ActionListener
{
    /* Declared the instance variable of the JFrame, JPanel, JLabel, JButton or JComboBox etc.
     * the ..._JF is a denoted by JFrame
     * the JL_... are the denoted by JLabel
     * the textField_... is a denoted by JTextField
     * the ..._button is denoted by JButton
     * the ..._JCB is denoted by JComboBox
     */
    private JFrame vehicle_JF, Rickshaw_JF, Scooter_JF;//this is the JFrame in Transport_GUI, AutoRickshaw and ElectricScooter class's GUI
    private JMenuBar JmenuBar_V, JmenuBar_A,JmenuBar_S;//this is the JMenuBar which is add the JFrame 
    private JMenu menuFile, menuOptions, menuClear, menuGoBack, menuDisplay;//this is the JMenu which is add the JMenuBar
    private JMenuItem jmenuItem_Rickshaw, jmenuItem_Scooter, jmenuItemB_Rickshaw, jmenuItem_opt, menuItem_optAdd, menuItem_optBook, menuItem_clear, menuItem_goVehiclass,
                      menuItem_goScooter, menuItem_display, menuItem_VID, menuItem_Vname, menuItem_Vweight, menuItem_Vcolor, menuItem_Vspeed, menuItem_EngineDis, 
                      menuItem_torque, menuItem_fuleTank, menuItem_groundCler, menuItem_date, menuItem_ChargeAmt, menuItem_numOfseats, jmenuItemSell_Scooter, 
                      menuItem_optP_S, menuItem_battryCap, menuItem_brand, menuItem_price,menuItem_chargeTime, menuItem_mileage, menuItem_range;//this is the JMenu JMenuItem and sub JMenuItem which is add each other       
    private JPanel vehicle_Jpanel, Rickshaw_Jpanel, subJpanel_Yellow, Scooter_Jpanel, subJpanel_Green;//this is the JPanel of Transport_GUI, AutoRickshaw and ElectricScooter's GUI
    private JLabel Jlabel_transport, Jlabel_addRickshaw, JlabelAR_addVID, JlabelAR_addVname, JlabelAR_addVweight, JlabelAR_addVcolor, JlabelAR_addVspeed,    
                   JlabelAR_addEngineDis, JlabelAR_addTorque, JlabelAR_addFuleTank, JlabelAR_addGroundClar, JlabelAR_nepal, footer_demo, Jlabel_bookedRickshaw, Jlabel_bookedVID, Jlabel_bookedDate, Jlabel_bookedAmount, Jlabel_bookedSeats, Jlabel_bookedJoinDate, 
                   Jlabel_addScooter, JlabelES_addVID, JlabelES_addVname, JlabelES_addVweight, JlabelES_addVcolor, JlabelES_addVspeed, JlabelES_addBattery, 
                   Jlabel_purchaseScooter, Jlabel_purchaseVID, Jlabel_purchaseBrand, Jlabel_purchasePrice, Jlabel_purchaseTime, menu_gui, Jlabel_purchaseMileage, Jlabel_purchaseRange, footer_jLabel;//this is the all of JLabel in Vehicle, AutoRickshaw and ElectricScooter class's GUI
    private JTextField textFieldAR_VID, textFieldAR_Vname, textFieldAR_Vweight, textFieldAR_Vcolor, textFieldAR_Vspeed, textFieldAR_EnginDis, textFieldAR_Torque, textFieldAR_fuleTank, textFieldAR_GroundClar, textField_bookedVID, textField_bookedAmount, textField_bookedSeats,
                       textFieldES_addVID, textFieldES_addVname, textFieldES_addVweight, textFieldES_addVcolor, textFieldES_addVspeed, textFieldES_addBattery,
                       textField_purchaseVID, textField_purchaseBrand, textField_purchasePrice, textField_purchaseTime, textField_purchaseMileage, textField_purchaseRange; //this is the all of JTextField in AutoRickshaw and ElectricScooter class's GUI
    private JButton autoRickshaw_JB, electricScooter_JB, goToScooter_button, addRickshaw_button, rickshawClear_button, BookRickshaw_button, rickshawDisplay_button, rickshawGoBack_button, 
                    purchaseScooter_button, sellScooter_button, addScooter_button, ScooterClear_button, ScooterGoBack_button, ScooterDisplay_button, goToRickshaw_button;//this is the all of JTextField in Vehicle, AutoRickshaw and ElectricScooter's GUI   
    private JComboBox booked_Date_JCB, booked_Months_JCB, booked_Days_JCB, joining_date_JCB,joining_months_JCB, joining_days_JCB;// this ia the all of JComboBox
    
    //create an ArraryList in vehicle types of array when store the array list of vehicle class 
    ArrayList<Vehicle> V_array = new  ArrayList<Vehicle>();
    
    //create an another instance methods Vehicle where access modifire is public and return type is void
    public void vehicle()
    {
        //create an JFrame in java which is import the javax.swing package
        vehicle_JF = new JFrame();//call the constructor 
        vehicle_JF.setLayout(null);//the layout is set in JFrame
        vehicle_JF.setVisible(true); //the JFrame are visible in java
        vehicle_JF.setTitle("Vehicle GUI"); //set the title of GUI
        vehicle_JF.getContentPane().setBackground(new Color(0,255,255));//set the background color in JFrame
        vehicle_JF.setBounds(250, 150, 760, 410); //the JFrame are set the bounds at X-axis, Y-axis, weight, height etc.
        
        //this is the menu bar and set the vechile class's GUI
        JmenuBar_V = new JMenuBar();
        JmenuBar_V.setVisible(true);
        JmenuBar_V.setBounds(0, 0, 750, 30);
        JmenuBar_V.setBackground(new Color(0xC9FFE5));
        vehicle_JF.add(JmenuBar_V);
        
        //this is the menu which is set the JMenuBar
        menuFile = new JMenu("File");
        JmenuBar_V.add(menuFile);
        menuOptions = new JMenu("Options");
        JmenuBar_V.add(menuOptions);
        
        //Create a JMenuItem and add in JMenu
        jmenuItem_Rickshaw = new JMenuItem("Auto Rickshaw");
        menuFile.add(jmenuItem_Rickshaw);
        jmenuItem_Scooter = new JMenuItem("Electeic Scooter");
        menuFile.add(jmenuItem_Scooter);
        jmenuItem_opt = new JMenuItem("Click the any one options button.");
        menuOptions.add(jmenuItem_opt);
        
        //create an JPanel in java which is import in javax.swing package
        vehicle_Jpanel = new JPanel();
        vehicle_Jpanel.setLayout(null);
        vehicle_Jpanel.setBounds(25, 50, 700, 300);
        vehicle_Jpanel.setBackground(new Color(124,185,232));//this is set the RGB color's value in JPanel 
        vehicle_JF.add(vehicle_Jpanel); //the JPanel is add in JFrame
        
        //this is the JLabel which is used by footer sectoin
        footer_demo = new JLabel("GUI Software Demo - 2022 by @Mr. Sitaram Thing - MAD"); 
        footer_demo.setFont(new Font("Arial", Font.PLAIN, 15));
        vehicle_JF.add(footer_demo);
        
        //crate in JLabel in java it is also import javax.swing package
        Jlabel_transport = new JLabel("Transport GUI");
        Jlabel_transport.setBounds(210, 30, 310, 50);
        Jlabel_transport.setFont(new Font("Arial",Font.BOLD,40));
        vehicle_Jpanel.add(Jlabel_transport); //the JLabel is add in JPanel
        
        //this is the JLabel which is used by footer sectoin
        footer_demo = new JLabel("GUI Software Demo - 2022 by @Mr. Sitaram Thing - MAD"); 
        footer_demo.setBounds(230, 350, 400, 20);
        footer_demo.setFont(new Font("Arial", Font.PLAIN, 13));
        vehicle_JF.add(footer_demo);

        //ctrate an JButton where as connected by AutoRickshaw class and defined all the methods 
        autoRickshaw_JB = new JButton("AutoRickshaw");
        autoRickshaw_JB.setBounds(60, 170, 250, 50);
        autoRickshaw_JB.setFont(new Font("Arial",Font.PLAIN,30));
        autoRickshaw_JB.setFocusable(false); //the JButton have focusable are set false
        autoRickshaw_JB.addActionListener(this);//create a action listener and add the AutoRickshaw button 
        vehicle_Jpanel.add(autoRickshaw_JB); //the JButton are add in JPanel
        
        //Jlabel of ElectricScooter
        electricScooter_JB = new JButton("ElectricScooter");
        electricScooter_JB.setBounds(390, 170, 250, 50);
        electricScooter_JB.setFont(new Font("Arial",Font.PLAIN,30));
        electricScooter_JB.setFocusable(false);
        electricScooter_JB.addActionListener(this);
        vehicle_Jpanel.add(electricScooter_JB);
        
        vehicle_Jpanel.setVisible(true);//this is the set of visible is JPanel
        vehicle_JF.setResizable(false); //the out as easily display in java
    }
   
    
    /** 
    Create an instance methods which is ElectricScooter or access modifire is public and return type is void 
    than that is access the instance variable
    */
    public void autoRickshaw()
    {
        // JFrame of autoRickshaw class
        Rickshaw_JF = new JFrame();
        Rickshaw_JF.setLayout(null);
        Rickshaw_JF.setTitle("Auto Rickshaw GUI");
        Rickshaw_JF.getContentPane().setBackground(new Color(25,255,255));//set the background color in JFrame
        Rickshaw_JF.setBounds(150, 0, 970, 710);
        
        //Create the JMenuBar and add the AuotRickshaw class's GUI
        JmenuBar_A = new JMenuBar();
        JmenuBar_A.setVisible(true);
        JmenuBar_A.setBounds(0, 0, 970, 30);
        JmenuBar_A.setBackground(new Color(230, 251,255));
        Rickshaw_JF.add(JmenuBar_A);//the JMenu is set in AuotRickshaw's JFrame
        
        //this is all of the JMenu which is set the JMenuBar
        menuFile = new JMenu("Files");//this JMenu which is Files
        JmenuBar_A.add(menuFile);//the JMenu is set in JMenuBar
        menuOptions = new JMenu("Options");//this JMenu which is Options
        JmenuBar_A.add(menuOptions);
        menuClear = new JMenu("Clear");//this JMenu which is Clear
        JmenuBar_A.add(menuClear);
        menuGoBack = new JMenu("Go Back");//this JMenu which is Go Back
        JmenuBar_A.add(menuGoBack);
        menuDisplay = new JMenu("Display");//this JMenu which is Display
        JmenuBar_A.add(menuDisplay);
        
        //Create the JMenuItems and which is add in JMenu
        jmenuItem_Rickshaw = new JMenu("Add an Auto Rickshaw");
        menuFile.add(jmenuItem_Rickshaw);//add in Files menu
        jmenuItemB_Rickshaw = new JMenu("Book an Auto Rickshaw");
        menuFile.add(jmenuItemB_Rickshaw);//add in Files menu
        menuItem_optAdd = new JMenuItem("Are you add the AutoRickshaw?");//this is the JMenuItem
        menuOptions.add(menuItem_optAdd);//add in Option menu
        menuItem_optBook = new JMenuItem("Are you book the AutoRickshaw?");//this is the JMenuItem
        menuOptions.add(menuItem_optBook);//add in Option menu
        menuItem_clear = new JMenuItem("Press the <Clear> button then all the values are clear.");//this is the JMenuItem
        menuClear.add(menuItem_clear);//add in Clear menu
        menuItem_goVehiclass = new JMenuItem("Click the <Go Back> button and come out the Veicle class");//this is the JMenuItem
        menuGoBack.add(menuItem_goVehiclass);//add in Clear menu
        menuItem_goScooter = new JMenuItem("Click the <ElectricScooter> button and go to ElecteriScooter class");//this is the JMenuItem
        menuGoBack.add(menuItem_goScooter);//add in Display menu
        menuItem_display = new JMenuItem("Press the <Display> button ! Out are EngineDis, Torque, FuleTank, GroundCle, Bookdate, ChargeAmo, No.seats.");//this is the JMenuItem
        menuDisplay.add(menuItem_display);
        
        //create a sub JMenuItems which is add in all the sub JMenuItems are Add AutoRickshaw JMenuItem
        menuItem_VID = new JMenuItem("Int Vehicle ID");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_VID);//add in JMenuItem
        menuItem_Vname = new JMenuItem("String Vehicle Name");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_Vname);//add in JMenuItem
        menuItem_Vweight = new JMenuItem("String Vehicle Weight");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_Vweight);//add in JMenuItem
        menuItem_Vcolor = new JMenuItem("String Vehicle Color");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_Vcolor);//add in JMenuItem
        menuItem_Vspeed = new JMenuItem("String Vehicle Speed");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_Vspeed);//add in JMenuItem
        menuItem_EngineDis = new JMenuItem("Int Engine Displacement");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_EngineDis);//add in JMenuItem
        menuItem_torque = new JMenuItem("String Torque");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_torque);//add in JMenuItem
        menuItem_fuleTank = new JMenuItem("Int Fule Tank Capacity");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_fuleTank);//add in JMenuItem
        menuItem_groundCler = new JMenuItem("String Ground Clearance");//this is the sub JMenuItem
        jmenuItem_Rickshaw.add(menuItem_groundCler);//add in JMenuItem
        
        //create a sub JMenuItems which is add in all the sub JMenuItems are Add AutoRickshaw JMenuItem
        menuItem_VID = new JMenuItem("Int Vehicle ID");//this is the sub JMenuItem
        jmenuItemB_Rickshaw.add(menuItem_VID);//add in JMenuItem
        menuItem_date = new JMenuItem("String Book Date");//this is the sub JMenuItem
        jmenuItemB_Rickshaw.add(menuItem_date);//add in JMenuItem
        menuItem_ChargeAmt = new JMenuItem("Int Charge Amount");//this is the sub JMenuItem
        jmenuItemB_Rickshaw.add(menuItem_ChargeAmt);//add in JMenuItem
        menuItem_numOfseats = new JMenuItem("Int Number of Seats");//this is the sub JMenuItem
        jmenuItemB_Rickshaw.add(menuItem_numOfseats);//add in JMenuItem
        menuItem_date = new JMenuItem("String Joining Date");//this is the sub JMenuItem
        jmenuItemB_Rickshaw.add(menuItem_date);//add in JMenuItem
        
        //Create an JPanel and set the all propatices
        Rickshaw_Jpanel = new JPanel();
        Rickshaw_Jpanel.setLayout(null);
        Rickshaw_Jpanel.setBounds(30, 20, 920, 600);
        Rickshaw_Jpanel.setBackground(new Color(124,185,232));
        Rickshaw_JF.add(Rickshaw_Jpanel);
        
        //this is a additional JPanel where as add variable of Booked an Auto Rickshaw
        subJpanel_Yellow = new JPanel();
        subJpanel_Yellow.setLayout(null);
        subJpanel_Yellow.setBounds(465, 20, 430, 450);
        subJpanel_Yellow.setBackground(new Color(255,255,0));
        Rickshaw_Jpanel.add(subJpanel_Yellow);
        
        //JLabel of Add an AutoRickshaw
        Jlabel_addRickshaw = new JLabel("Add an AutoRickshaw :"); 
        Jlabel_addRickshaw.setBounds(40, 30, 350, 40);
        Jlabel_addRickshaw.setFont(new Font("Arial", Font.BOLD, 30));
        Rickshaw_Jpanel.add(Jlabel_addRickshaw);
        
        //JLabel & JTextField of add Vehicle ID in auto rickshaw class
        JlabelAR_addVID = new JLabel("Vehicle ID :");  
        JlabelAR_addVID.setBounds(40, 100, 150, 30);
        JlabelAR_addVID.setFont(new Font("Arial", Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addVID);
        textFieldAR_VID = new JTextField(); 
        textFieldAR_VID.setBounds(180, 100, 230, 30);
        Rickshaw_Jpanel.add(textFieldAR_VID);
        
        //JLabel & JTextField of add Vehicle name in auto rickshaw class
        JlabelAR_addVname = new JLabel("Vechicle Name :"); 
        JlabelAR_addVname.setBounds(40, 150, 250, 30);
        JlabelAR_addVname.setFont(new Font("Arial", Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addVname);
        textFieldAR_Vname = new JTextField(); 
        textFieldAR_Vname.setBounds(180, 150, 230, 30);
        Rickshaw_Jpanel.add(textFieldAR_Vname);
        
        //JLabel & JTextField add of Vehicle weight in auto rickshaw class
        JlabelAR_addVweight = new JLabel("Vehicle Weight :"); 
        JlabelAR_addVweight.setBounds(40, 200, 200, 30);
        JlabelAR_addVweight.setFont(new Font("Arial", Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addVweight);
        textFieldAR_Vweight = new JTextField(); 
        textFieldAR_Vweight.setBounds(180, 200, 230, 30);
        Rickshaw_Jpanel.add(textFieldAR_Vweight);
        
        //JLabel & JTextField add of Vehicle color in auto rickshaw class
        JlabelAR_addVcolor = new JLabel("Vehicle Color :");         
        JlabelAR_addVcolor.setBounds(40, 250, 200, 30);
        JlabelAR_addVcolor.setFont(new Font("Arial", Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addVcolor);
        textFieldAR_Vcolor = new JTextField(); 
        textFieldAR_Vcolor.setBounds(180, 250, 230, 30);
        Rickshaw_Jpanel.add(textFieldAR_Vcolor);
        
        //JLabel & JTextField add of Vehicle speed in auto rickshaw class
        JlabelAR_addVspeed = new JLabel("Vehicle Speed :");  
        JlabelAR_addVspeed.setBounds(40, 300, 200, 30);
        JlabelAR_addVspeed.setFont(new Font("Arial",Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addVspeed);
        textFieldAR_Vspeed = new JTextField(); 
        textFieldAR_Vspeed.setBounds(180, 300, 230, 30);
        Rickshaw_Jpanel.add(textFieldAR_Vspeed);
        
        //JLabel & JTextField of add Vehicle Engine Displacement in auto rickshaw class
        JlabelAR_addEngineDis = new JLabel("Engine Displacement :");  
        JlabelAR_addEngineDis.setBounds(30, 350, 250, 30);
        JlabelAR_addEngineDis.setFont(new Font("Arial",Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addEngineDis);
        textFieldAR_EnginDis = new JTextField(); 
        textFieldAR_EnginDis.setBounds(184, 350, 228, 30);
        Rickshaw_Jpanel.add(textFieldAR_EnginDis);
        
        //JLabel & JTextField of add Vehicle Torque in auto rickshaw class
        JlabelAR_addTorque = new JLabel("Torque :");  
        JlabelAR_addTorque.setBounds(40, 400, 100, 30);
        JlabelAR_addTorque.setFont(new Font("Arial",Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addTorque);
        textFieldAR_Torque = new JTextField(); 
        textFieldAR_Torque.setBounds(180, 400, 230, 30);
        Rickshaw_Jpanel.add(textFieldAR_Torque);
        
        //JLabel & JTextField of add Vehicle Fule Tank Capacity in auto rickshaw class
        JlabelAR_addFuleTank = new JLabel("Fule Tank Capacity :");  
        JlabelAR_addFuleTank.setBounds(40, 450, 300, 30);
        JlabelAR_addFuleTank.setFont(new Font("Arial",Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addFuleTank);
        textFieldAR_fuleTank = new JTextField(); 
        textFieldAR_fuleTank.setBounds(182, 450, 230, 30);
        Rickshaw_Jpanel.add(textFieldAR_fuleTank);
        
        //JLabel & JTextField of add Vehicle Ground Clearance in auto rickshaw class
        JlabelAR_addGroundClar = new JLabel("Ground Clearance :");  
        JlabelAR_addGroundClar.setBounds(40, 500, 200, 30);
        JlabelAR_addGroundClar.setFont(new Font("Arial",Font.PLAIN, 15));
        Rickshaw_Jpanel.add(JlabelAR_addGroundClar);
        textFieldAR_GroundClar = new JTextField(); 
        textFieldAR_GroundClar.setBounds(181, 500, 230, 30);
        Rickshaw_Jpanel.add(textFieldAR_GroundClar);
        
        //JLabel of Vehicle Made in Nepal in auto rickshaw class
        JlabelAR_nepal = new JLabel("@ Made in Nepal"); 
        JlabelAR_nepal.setBounds(465, 500, 150, 20);
        JlabelAR_nepal.setFont(new Font("Arial", Font.PLAIN, 17));
        Rickshaw_Jpanel.add(JlabelAR_nepal);
        
        //this is the JLabel which is used by footer sectoin
        footer_demo = new JLabel("GUI Software Demo - 2022 by @Mr. Sitaram Thing - MAD"); 
        footer_demo.setBounds(330, 625, 400, 20);
        footer_demo.setFont(new Font("Arial", Font.PLAIN, 15));
        Rickshaw_JF.add(footer_demo);
        
        //create an JLabel in booked an Auto Rickshaw and add in JPanel
        Jlabel_bookedRickshaw = new JLabel("Booked an Auto Rickshaw :");
        Jlabel_bookedRickshaw.setBounds(15, 20, 400, 40);
        Jlabel_bookedRickshaw.setFont(new Font("Arial", Font.BOLD, 30));
        subJpanel_Yellow.add(Jlabel_bookedRickshaw);
        
        //JLabel & JTextField of Vehicle ID in Booked Vehicle ID
        Jlabel_bookedVID = new JLabel("Vechicle ID :");     
        Jlabel_bookedVID.setBounds(40, 100, 200, 30);
        Jlabel_bookedVID.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Yellow.add(Jlabel_bookedVID);
        textField_bookedVID = new JTextField();
        textField_bookedVID.setBounds(165, 100, 230, 30);
        subJpanel_Yellow.add(textField_bookedVID);
        
        //JLabel & JTextField of Booked in Booked Date 
        Jlabel_bookedDate = new JLabel("Booked Date :"); 
        Jlabel_bookedDate.setBounds(40, 170, 150, 30);
        Jlabel_bookedDate.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Yellow.add(Jlabel_bookedDate);
        
        //Create an ArrayList & JComboBox of Booked Years
        String[] Dates = {"1990", "1995", "2000", "2005", "2010", "1015", "2020", "2025", "2030"};
        booked_Date_JCB = new JComboBox(Dates); 
        booked_Date_JCB.setBounds(325, 170, 70, 30);
        subJpanel_Yellow.add(booked_Date_JCB);
                
        //Array of string values is on the JComboBox that is Months
        String[] Months = {"January", "February", "March","Aprinl","May","June",
                           "July","August","September","Octobor","November","December"};
        booked_Months_JCB = new JComboBox(Months); 
        booked_Months_JCB.setBounds(225, 170, 90, 30);
        subJpanel_Yellow.add(booked_Months_JCB);
        
        //Create an ArrayList & JComboBox of Booked Days when using by for loop
        booked_Days_JCB = new JComboBox(); 
        booked_Days_JCB.setBounds(165, 170, 50, 30);
        subJpanel_Yellow.add(booked_Days_JCB);
        for(int a=1; a<=32; a++) //there are used the for loop and declared by the newmerical values
        {
                booked_Days_JCB.addItem(a);
        }
        
        Jlabel_bookedAmount = new JLabel("Charge Amount :"); 
        Jlabel_bookedAmount.setBounds(40, 240, 150, 30);
        Jlabel_bookedAmount.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Yellow.add(Jlabel_bookedAmount);
        textField_bookedAmount = new JTextField(); 
        textField_bookedAmount.setBounds(165, 240, 230, 30);
        subJpanel_Yellow.add(textField_bookedAmount);
        
        Jlabel_bookedSeats = new JLabel("Number of Seats :"); 
        Jlabel_bookedSeats.setBounds(40, 310, 200, 20);
        Jlabel_bookedSeats.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Yellow.add(Jlabel_bookedSeats);
        textField_bookedSeats = new JTextField(); 
        textField_bookedSeats.setBounds(165, 310, 230, 30);
        subJpanel_Yellow.add(textField_bookedSeats);
        
        Jlabel_bookedJoinDate = new JLabel("Joining Date :"); 
        Jlabel_bookedJoinDate.setBounds(40, 380, 150, 30);
        Jlabel_bookedJoinDate.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Yellow.add(Jlabel_bookedJoinDate);
        
        //This is array and declared the JComboBox 
        String[] dates = {"1990", "1995", "2000", "2005", "2010", "1015", "2020", "2025", "2030"};
        joining_date_JCB = new JComboBox(dates);
        joining_date_JCB.setBounds(165, 380, 70, 30);
        subJpanel_Yellow.add(joining_date_JCB);
        
        //Array of string values is on the JComboBox
        String[] months = {"January", "February", "March","Aprinl","May","June",
                           "July","August","September","Octobor","November","December"};
        joining_months_JCB = new JComboBox(months);
        joining_months_JCB.setBounds(245, 380, 90, 30);
        subJpanel_Yellow.add(joining_months_JCB);
        
        joining_days_JCB = new JComboBox();
        joining_days_JCB.setBounds(345, 380, 50, 30);
        subJpanel_Yellow.add(joining_days_JCB);
        for(int a=1; a<=32; a++) //there are used the for loop and declared by the newmerical values
        {
                joining_days_JCB.addItem(a);
        }
        
        /**
         now the create an JButton in Auto_Rickshaw and fefined by Add Auto Rickshaw, Clear, Go Back, Display, Book etc in 
         javax.swing.JButton package
         */
        BookRickshaw_button = new JButton("Book the Auto Rickshaw");
        BookRickshaw_button.setBounds(615, 490, 280, 40);
        BookRickshaw_button.setFont(new Font("Arial", Font.PLAIN, 20));
        BookRickshaw_button.setFocusable(false);
        BookRickshaw_button.addActionListener(this);
        Rickshaw_Jpanel.add(BookRickshaw_button);
       
        addRickshaw_button = new JButton("Add AutoRickshaw");
        addRickshaw_button.setBounds(30, 550, 220, 40);
        addRickshaw_button.setFont(new Font("Arial", Font.PLAIN, 20));
        addRickshaw_button.setFocusable(false);
        addRickshaw_button.addActionListener(this);
        Rickshaw_Jpanel.add(addRickshaw_button);
        
        rickshawClear_button = new JButton("Clear");
        rickshawClear_button.setBounds(265, 550, 120, 40);
        rickshawClear_button.setFont(new Font("Arial", Font.PLAIN, 20));
        rickshawClear_button.setBackground(new Color(255,77,77));
        rickshawClear_button.setFocusable(false);
        rickshawClear_button.addActionListener(this);
        Rickshaw_Jpanel.add(rickshawClear_button);
                
        rickshawGoBack_button = new JButton("Go Back");
        rickshawGoBack_button.setBounds(405, 550, 125, 40);
        rickshawGoBack_button.setFont(new Font("Arial", Font.PLAIN, 20));
        rickshawGoBack_button.setFocusable(false);
        rickshawGoBack_button.addActionListener(this);
        Rickshaw_Jpanel.add(rickshawGoBack_button);
        
        rickshawDisplay_button = new JButton("Display");
        rickshawDisplay_button.setBounds(550, 550, 120, 40);
        rickshawDisplay_button.setFont(new Font("Arial", Font.PLAIN, 20));
        rickshawDisplay_button.setFocusable(false);
        rickshawDisplay_button.addActionListener(this);
        Rickshaw_Jpanel.add(rickshawDisplay_button);
      
        goToScooter_button = new JButton("Go ElectricScooter");
        goToScooter_button.setBounds(690, 550, 205, 40);
        goToScooter_button.setFont(new Font("Arial", Font.PLAIN, 20));
        goToScooter_button.setForeground(Color.blue);
        goToScooter_button.setFocusable(false);
        goToScooter_button.addActionListener(this);
        Rickshaw_Jpanel.add(goToScooter_button);
        
        subJpanel_Yellow.setVisible(true);
        Rickshaw_Jpanel.setVisible(true);
        Rickshaw_JF.setVisible(true);
        Rickshaw_JF.setResizable(false);
    } 
    
   
    //create an another instance methods ElectricScooter where access modifire is public and return type is void
    public void electricScooter()
    {
        //create an JFrame
        Scooter_JF = new JFrame();
        Scooter_JF.setLayout(null);
        Scooter_JF.setVisible(true);
        Scooter_JF.setTitle("Electric Scooter GUI");
        Scooter_JF.setBounds(150, 30, 960, 610);
        Scooter_JF.getContentPane().setBackground(new Color(25,255,255));//set the background color in JFrame
        
        //Create the JMenuBar and add the AuotRickshaw class's GUI
        JmenuBar_S = new JMenuBar();
        JmenuBar_S.setVisible(true);
        JmenuBar_S.setBounds(0, 0, 960, 30);
        JmenuBar_S.setBackground(new Color(230, 251,255));
        Scooter_JF.add(JmenuBar_S);//the JMenu is set in AuotRickshaw's JFrame
        
        //this is all of the JMenu which is set the JMenuBar
        JMenu menuFile = new JMenu("Files");//this JMenu which is Files
        JmenuBar_S.add(menuFile);//the JMenu is set in JMenuBar
        JMenu menuOptions = new JMenu("Options");//this JMenu which is Options
        JmenuBar_S.add(menuOptions);
        JMenu menuClear = new JMenu("Clear");//this JMenu which is Clear
        JmenuBar_S.add(menuClear);
        JMenu menuGoBack = new JMenu("Go Back");//this JMenu which is Go Back
        JmenuBar_S.add(menuGoBack);
        JMenu menuDisplay = new JMenu("Display");//this JMenu which is Display
        JmenuBar_S.add(menuDisplay);
        
        //Create the JMenuItems and which is add in JMenu
        jmenuItem_Scooter = new JMenu("Add an ElectricScooter");
        menuFile.add(jmenuItem_Scooter);//add in Files menu
        jmenuItemSell_Scooter = new JMenu("Purchase & Sell an ElectricScooter");
        menuFile.add(jmenuItemSell_Scooter);//add in Files menu
        menuItem_optAdd = new JMenuItem("Are you add the ElectricScooter?");//this is the JMenuItem
        menuOptions.add(menuItem_optAdd);//add in Option menu
        menuItem_optP_S = new JMenuItem("Are you purchase & sell the ElectricScooter?");//this is the JMenuItem
        menuOptions.add(menuItem_optP_S);//add in Option menu
        menuItem_clear = new JMenuItem("Press the <Clear> button then all the values are clear.");//this is the JMenuItem
        menuClear.add(menuItem_clear);//add in Clear menu
        menuItem_goVehiclass = new JMenuItem("Click the <Go Back> button and come out the Veicle class");//this is the JMenuItem
        menuGoBack.add(menuItem_goVehiclass);//add in Clear menu
        menuItem_goScooter = new JMenuItem("Click the <AutoRickshaw> button and go to AutoRickshaw class");//this is the JMenuItem
        menuGoBack.add(menuItem_goScooter);//add in Display menu
        menuItem_display = new JMenuItem("Press the <Display> button ! Out are Brand, BatteryCapacity, Milleage, Range & ChargingTime");//this is the JMenuItem
        menuDisplay.add(menuItem_display);
        
        //create a sub JMenuItems which is add in all the sub JMenuItems are Add Electric Scooter JMenuItem
        menuItem_VID = new JMenuItem("Int Vehicle ID");//this is the sub JMenuItem
        jmenuItem_Scooter.add(menuItem_VID);//add in JMenuItem
        menuItem_Vname = new JMenuItem("String Vehicle Name");//this is the sub JMenuItem
        jmenuItem_Scooter.add(menuItem_Vname);//add in JMenuItem
        menuItem_Vweight = new JMenuItem("String Vehicle Weight");//this is the sub JMenuItem
        jmenuItem_Scooter.add(menuItem_Vweight);//add in JMenuItem
        menuItem_Vcolor = new JMenuItem("String Vehicle Color");//this is the sub JMenuItem
        jmenuItem_Scooter.add(menuItem_Vcolor);//add in JMenuItem
        menuItem_Vspeed = new JMenuItem("String Vehicle Speed");//this is the sub JMenuItem
        jmenuItem_Scooter.add(menuItem_Vspeed);//add in JMenuItem
        menuItem_battryCap = new JMenuItem("Int Battry Capacity");//this is the sub JMenuItem
        jmenuItem_Scooter.add(menuItem_battryCap);//add in JMenuItem
        
        //create a sub JMenuItems which is add in all the sub JMenuItems are Add Electric Scooter JMenuItem
        menuItem_VID = new JMenuItem("Int Vehicle ID");//this is the sub JMenuItem
        jmenuItemSell_Scooter.add(menuItem_VID);//add in JMenuItem
        menuItem_brand = new JMenuItem("String Brand");//this is the sub JMenuItem
        jmenuItemSell_Scooter.add(menuItem_brand);//add in JMenuItem
        menuItem_price = new JMenuItem("Int Price");//this is the sub JMenuItem
        jmenuItemSell_Scooter.add(menuItem_price);//add in JMenuItem
        menuItem_chargeTime = new JMenuItem("String Charging Time");//this is the sub JMenuItem
        jmenuItemSell_Scooter.add(menuItem_chargeTime);//add in JMenuItem
        menuItem_mileage = new JMenuItem("String Mileage");//this is the sub JMenuItem
        jmenuItemSell_Scooter.add(menuItem_mileage);//add in JMenuItem
        menuItem_range = new JMenuItem("Int Range");//this is the sub JMenuItem
        jmenuItemSell_Scooter.add(menuItem_range);//add in JMenuItem
        
        //create an JPanel in electricScooter
        Scooter_Jpanel = new JPanel();
        Scooter_Jpanel.setLayout(null);
        Scooter_Jpanel.setBounds(20, 20, 910, 520);
        Scooter_Jpanel.setBackground(new Color(124,185,232));
        Scooter_JF.add(Scooter_Jpanel);
        
        subJpanel_Green = new JPanel();
        subJpanel_Green.setLayout(null);
        subJpanel_Green.setBounds(20, 20, 420, 420);
        subJpanel_Green.setBackground(new Color(25,255,102));
        Scooter_Jpanel.add(subJpanel_Green);
        
        Jlabel_addScooter = new JLabel("Add an ElectricScooter :"); 
        Jlabel_addScooter.setBounds(40, 20, 350, 40);
        Jlabel_addScooter.setFont(new Font("Arial", Font.BOLD, 30));
        subJpanel_Green.add(Jlabel_addScooter);
        
        JlabelES_addVID = new JLabel("Vehicle ID :");  
        JlabelES_addVID.setBounds(40, 100, 150, 30);
        JlabelES_addVID.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Green.add(JlabelES_addVID);
        textFieldES_addVID = new JTextField(); 
        textFieldES_addVID.setBounds(160, 100, 220, 30);
        subJpanel_Green.add(textFieldES_addVID);
        
        JlabelES_addVname = new JLabel("Vechicle Neme :"); 
        JlabelES_addVname.setBounds(40, 150, 200, 30);
        JlabelES_addVname.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Green.add(JlabelES_addVname);
        textFieldES_addVname = new JTextField(); 
        textFieldES_addVname.setBounds(160, 150, 220, 30);
        subJpanel_Green.add(textFieldES_addVname);
        
        JlabelES_addVweight = new JLabel("Vehicle Weight :"); 
        JlabelES_addVweight.setBounds(40, 200, 200, 30);
        JlabelES_addVweight.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Green.add(JlabelES_addVweight);
        textFieldES_addVweight = new JTextField(); 
        textFieldES_addVweight.setBounds(160, 200, 220, 30);
        subJpanel_Green.add(textFieldES_addVweight);
        
        JlabelES_addVcolor = new JLabel("Vehicle Color :");         
        JlabelES_addVcolor.setBounds(40, 250, 200, 30);
        JlabelES_addVcolor.setFont(new Font("Arial", Font.PLAIN, 15));
        subJpanel_Green.add(JlabelES_addVcolor);
        textFieldES_addVcolor = new JTextField(); 
        textFieldES_addVcolor.setBounds(160, 250, 220, 30);
        subJpanel_Green.add(textFieldES_addVcolor);
        
        JlabelES_addVspeed = new JLabel("Vehicle Speed :");  
        JlabelES_addVspeed.setBounds(40, 300, 200, 30);
        JlabelES_addVspeed.setFont(new Font("Arial",Font.PLAIN, 15));
        subJpanel_Green.add(JlabelES_addVspeed);
        textFieldES_addVspeed = new JTextField(); 
        textFieldES_addVspeed.setBounds(160, 300, 220, 30);
        subJpanel_Green.add(textFieldES_addVspeed);
        
        JlabelES_addBattery = new JLabel("Battery Capacity :");  
        JlabelES_addBattery.setBounds(40, 350, 400, 30);
        JlabelES_addBattery.setFont(new Font("Arial",Font.PLAIN, 15));
        subJpanel_Green.add(JlabelES_addBattery);
        textFieldES_addBattery = new JTextField(); 
        textFieldES_addBattery.setBounds(160, 350, 220, 30);
        subJpanel_Green.add(textFieldES_addBattery);
        
        Jlabel_purchaseScooter = new JLabel("Purchase ElectricScooter :");
        Jlabel_purchaseScooter.setBounds(500, 30, 400, 40);
        Jlabel_purchaseScooter.setFont(new Font("Arial", Font.BOLD, 30));
        Scooter_Jpanel.add(Jlabel_purchaseScooter);
        
        Jlabel_purchaseVID = new JLabel("Vechicle ID :");     
        Jlabel_purchaseVID.setBounds(550, 100, 200, 30);
        Jlabel_purchaseVID.setFont(new Font("Arial", Font.PLAIN, 15));
        Scooter_Jpanel.add(Jlabel_purchaseVID);
        textField_purchaseVID = new JTextField();
        textField_purchaseVID.setBounds(660, 100, 225, 30);
        Scooter_Jpanel.add(textField_purchaseVID);
        
        Jlabel_purchaseBrand = new JLabel("Brand :"); 
        Jlabel_purchaseBrand.setBounds(550, 150, 150, 30);
        Jlabel_purchaseBrand.setFont(new Font("Arial", Font.PLAIN, 15));
        Scooter_Jpanel.add(Jlabel_purchaseBrand);
        textField_purchaseBrand = new JTextField(); 
        textField_purchaseBrand.setBounds(660, 150, 225, 30);
        Scooter_Jpanel.add(textField_purchaseBrand);
        
        Jlabel_purchasePrice = new JLabel("Price :"); 
        Jlabel_purchasePrice.setBounds(550, 200, 150, 30);
        Jlabel_purchasePrice.setFont(new Font("Arial", Font.PLAIN, 15));
        Scooter_Jpanel.add(Jlabel_purchasePrice);
        textField_purchasePrice = new JTextField(); 
        textField_purchasePrice.setBounds(660, 200, 225, 30);
        Scooter_Jpanel.add(textField_purchasePrice);
        
        Jlabel_purchaseTime = new JLabel("Charging Time :"); 
        Jlabel_purchaseTime.setBounds(550, 250, 200, 20);
        Jlabel_purchaseTime.setFont(new Font("Arial", Font.PLAIN, 15));
        Scooter_Jpanel.add(Jlabel_purchaseTime);
        textField_purchaseTime = new JTextField(); 
        textField_purchaseTime.setBounds(660, 250, 225, 30);
        Scooter_Jpanel.add(textField_purchaseTime);
        
        Jlabel_purchaseMileage = new JLabel("Mileage :"); 
        Jlabel_purchaseMileage.setBounds(550, 300, 150, 30);
        Jlabel_purchaseMileage.setFont(new Font("Arial", Font.PLAIN, 15));
        Scooter_Jpanel.add(Jlabel_purchaseMileage);
        textField_purchaseMileage = new JTextField();
        textField_purchaseMileage.setBounds(660, 300, 225, 30);
        Scooter_Jpanel.add(textField_purchaseMileage);
        
        Jlabel_purchaseRange = new JLabel("Range :"); 
        Jlabel_purchaseRange.setBounds(550, 350, 100, 30);
        Jlabel_purchaseRange.setFont(new Font("Arial", Font.PLAIN, 15));
        Scooter_Jpanel.add(Jlabel_purchaseRange);
        textField_purchaseRange = new JTextField();
        textField_purchaseRange.setBounds(660, 350, 225, 30);
        Scooter_Jpanel.add(textField_purchaseRange);
        
        //this is the JLabel which is used by footer sectoin
        JLabel footer_jLabel = new JLabel("GUI Software Demo - 2022 by @Mr. Sitaram Thing - MAD"); 
        footer_jLabel.setBounds(310, 545, 400, 20);
        footer_jLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        Scooter_JF.add(footer_jLabel);
        
        purchaseScooter_button = new JButton("Purchase Scooter");  
        purchaseScooter_button.setBounds(520, 400, 200, 40);
        purchaseScooter_button.setFont(new Font("Arial",Font.PLAIN, 20));
        purchaseScooter_button.setFocusable(false);
        purchaseScooter_button.addActionListener(this);
        Scooter_Jpanel.add(purchaseScooter_button);
         
        sellScooter_button = new JButton("Sell Scooter");  
        sellScooter_button.setBounds(735, 400, 150, 40);
        sellScooter_button.setFont(new Font("Arial",Font.PLAIN, 20));
        sellScooter_button.setFocusable(false);
        sellScooter_button.addActionListener(this);
        Scooter_Jpanel.add(sellScooter_button);
        
        //Create an JButton in Auto_Rickshaw and fefined by Add Auto Rickshaw, Clear, Go Back, Display, Book etc in javax.swing.JButton package
        addScooter_button = new JButton("Add ElectricScooter");
        addScooter_button.setBounds(20, 460, 220, 40);
        addScooter_button.setFont(new Font("Arial", Font.PLAIN, 20));
        addScooter_button.setFocusable(false);
        addScooter_button.addActionListener(this);
        Scooter_Jpanel.add(addScooter_button);
        
        ScooterClear_button = new JButton("Clear");
        ScooterClear_button.setBounds(260, 460, 120, 40);
        ScooterClear_button.setFont(new Font("Arial", Font.PLAIN, 20));
        ScooterClear_button.setBackground(new Color(255,77,77));
        ScooterClear_button.setFocusable(false);
        ScooterClear_button.addActionListener(this);
        Scooter_Jpanel.add(ScooterClear_button);
       
        ScooterGoBack_button = new JButton("Go Back");
        ScooterGoBack_button.setBounds(400, 460, 125, 40);
        ScooterGoBack_button.setFont(new Font("Arial", Font.PLAIN, 20));
        ScooterGoBack_button.setFocusable(false);
        ScooterGoBack_button.addActionListener(this);
        Scooter_Jpanel.add(ScooterGoBack_button);
        
        ScooterDisplay_button = new JButton("Display");
        ScooterDisplay_button.setBounds(545, 460, 120, 40);
        ScooterDisplay_button.setFont(new Font("Arial", Font.PLAIN, 20));
        ScooterDisplay_button.setFocusable(false);
        ScooterDisplay_button.addActionListener(this);
        Scooter_Jpanel.add(ScooterDisplay_button);
       
        goToRickshaw_button = new JButton("Go AutoRickshaw");
        goToRickshaw_button.setBounds(680, 460, 205, 40);
        goToRickshaw_button.setFont(new Font("Arial", Font.PLAIN, 20));
        goToRickshaw_button.setForeground(Color.blue);
        goToRickshaw_button.setFocusable(false);
        goToRickshaw_button.addActionListener(this);
        Scooter_Jpanel.add(goToRickshaw_button);
        
        subJpanel_Green.setVisible(true);
        Scooter_Jpanel.setVisible(true);
        Scooter_JF.setResizable(false);
    }
    
    // this is the actionPerformed methods which is intialized the all JButton to action in the fields
    public void actionPerformed(ActionEvent AE)
    {
        //link button to JFrame, Rickshaw_JF, Scooter_JF where one class to another class and call the methods or using by dispose methods
        if(AE.getSource() == autoRickshaw_JB)
        {
            vehicle_JF.dispose();//this is the using by dispose methods when the one GUI open then another is auto dispose
            this.autoRickshaw();//call the autorickshaw methods.
        }
        else if(AE.getSource() == electricScooter_JB)
        {
            vehicle_JF.dispose();
            this.electricScooter();//call the ElectricScooter class
        }
        //direct go back auto rickshaw class to vehicle
        else if(AE.getSource() == rickshawGoBack_button)
        {
            Rickshaw_JF.dispose();//this is the using by dispose methods when the one GUI open then another is auto dispose
            this.vehicle();//call the Vehicle class
        }  
        //direct go back electric scooter class to vehicle
        else if(AE.getSource() == ScooterGoBack_button)
        {
            Scooter_JF.dispose();
            this.vehicle();//call the Vehicle class
        }
        //go to auto rickshaw class to electric scooter class
        else if(AE.getSource() == goToScooter_button)
        {
            Rickshaw_JF.dispose();
            this.electricScooter();//call the ElectricScooter class
        }
        //go to electeri scooter class to auto rickshaw class
        else if(AE.getSource() == goToRickshaw_button)
        {
            Scooter_JF.dispose();
            this.autoRickshaw();//call the auto rickshaw class
        }
    
        //add the values of all the AutoRickshaw class and ElectricScooter class 
        if(AE.getSource() == addRickshaw_button)
        {
            // the user was not put the input and direct add the value then given the empty message
            if(textFieldAR_VID.getText().isEmpty() || textFieldAR_Vname.getText().isEmpty() || textFieldAR_Vweight.getText().isEmpty() || textFieldAR_Vcolor.getText().isEmpty() ||  textFieldAR_Vspeed.getText().isEmpty() ||  textFieldAR_EnginDis.getText().isEmpty() ||  
            textFieldAR_Torque.getText().isEmpty() ||  textFieldAR_fuleTank.getText().isEmpty() || textFieldAR_GroundClar.getText().isEmpty())
            {
                //message dailog box whne the any values or message provide the user
                JOptionPane.showMessageDialog(Rickshaw_Jpanel, "The fields is Empty !!");
            }
            else
            {
                //this is the try which is check the value are correct or not
                try
                {
                    //this is the data conversion in String to integer use in Wrapper class with getText() methods
                    int Vid = Integer.parseInt(textFieldAR_VID.getText());
                    String name = textFieldAR_Vname.getText();//get vehicle name
                    String weight = textFieldAR_Vweight.getText();//get vehicle weight
                    String color = textFieldAR_Vcolor.getText();//get vehicle color
                    String speed = textFieldAR_Vspeed.getText();//get vehicle speed
                    int engine = Integer.parseInt(textFieldAR_EnginDis.getText());//get vehicle engineDisplacement
                    String torque = textFieldAR_Torque.getText();//get vehicle torque
                    int fuel = Integer.parseInt(textFieldAR_fuleTank.getText());//get vehicle fule tank capacity
                    String ground = textFieldAR_GroundClar.getText();//get vehicle ground clareance
                    
                    
                    //this is the data type convert integer values to String 
                    String ID= String.valueOf(Vid);
                    String Engine = String.valueOf(engine);
                    String Fuel = String.valueOf(fuel);
        
                    //sum of all String values
                    String sumValues ="Vehicle ID : "+ID+" \nVehicle Name : "+name+" \nVehicle weight : "+weight+" \nVehicle Color : "+color+" \nVehicle Speed : "+
                    speed+" \nEngine Displacement : "+Engine+" \nTorque : "+torque+" \nFuleTank Capacity : "+Fuel+" \nGroungnClearance : "+ground;
                        
                    boolean Reused = true;//initialize the boolean veriable Reused is true
                    for(Vehicle V_obj : V_array)
                    {
                        if(V_obj instanceof AutoRickshaw)
                        {
                            AutoRickshaw auto_obj = (AutoRickshaw) V_obj;
                            if(auto_obj.getVehicleID() == Vid)
                            {
                                Reused = false;
                            }
                        }
                    }
                    if(Reused == true)
                    {
                        //create a object of AutoRickshaw class and given paramiter valuesD
                        AutoRickshaw AR = new AutoRickshaw(Vid, name, weight, color, speed, engine, torque, fuel, ground);
                        V_array.add(AR);//add the value of ar to V_array list
                        
                        //given output in add successfully
                        JOptionPane.showMessageDialog(Rickshaw_Jpanel, "Auto Rickshaw add successfully. \n"+sumValues);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(Rickshaw_Jpanel, "The Auto Rickshaw is already added");
                    }
                }
                catch(NumberFormatException nfe)//this is the NumberFormatException which is catch the given the message when user wrong input
                {
                    JOptionPane.showMessageDialog(Rickshaw_Jpanel, "Invalid !! Please input the currect values.");
                }    
            }
        }
    
        //book the Auto Rickshaw
        else if(AE.getSource() == BookRickshaw_button)
        {
            // the user was not put the input and direct add the value then given the empty message
            if(textField_bookedVID.getText().isEmpty() || booked_Date_JCB.getSelectedItem() == null || booked_Months_JCB.getSelectedItem()== null 
               || booked_Days_JCB.getSelectedItem()== null || textField_bookedAmount.getText().isEmpty() || textField_bookedSeats.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(Rickshaw_Jpanel, "The fields is Empty !!");
            }
            else  
            {
                //this is the try which is check the value are correct or not
                try
                {
                    //this is the data conversion in String to integer with useing by Wrapper class with getText() methods
                    int vehicleID = Integer.parseInt(textField_bookedVID.getText());//vehicle ID
                    String date = booked_Days_JCB.getSelectedItem()+" "+booked_Months_JCB.getSelectedItem()+" "+booked_Date_JCB.getSelectedItem();
                    int amount = Integer.parseInt(textField_bookedAmount.getText());//charge amount 
                    int seats = Integer.valueOf(textField_bookedSeats.getText());//number of seats
                    String joinDate = joining_date_JCB.getSelectedItem()+" "+joining_months_JCB.getSelectedItem()+" "+joining_days_JCB.getSelectedItem();
            
                    //data type conversion in integer to String
                    String ID = String.valueOf(vehicleID);
                    String Amount = String.valueOf(amount);
                    String Seats = String.valueOf(seats);
                    //all the Sreing valuer are combine to store in f variable
                    String values = "Booked Date : "+date+" \nCharge Amount : "+Amount+" \nNunber of Seats : "+Seats; 
                    //using by for loop where create an boject in Vehicle class then store the Array list
                    for(Vehicle V_obj : V_array)
                    {
                        //using the if condation and check the Vehicle class's value are ElectricScooter values or and not
                        if(V_obj instanceof AutoRickshaw)
                        {
                            //using the if condation and check the Vehicle class's value are AutoRickshaw values or and not
                            AutoRickshaw auto_obj = (AutoRickshaw) V_obj;
                            if(auto_obj.getVehicleID() == vehicleID)
                            {
                                //using by if or else if condition when if condition is true the some vlaue print and not true the go to else if condition executive
                                if(auto_obj.getIsBooked() == false)
                                {
                                    //call the Book method and given the parameter
                                    auto_obj.Book(date, amount, seats);
                                    JOptionPane.showMessageDialog(Rickshaw_Jpanel, "The Auto Rickshaw is booked. \n"+values);
                                }
                                else if(auto_obj.getIsBooked() == true)
                                {
                                    JOptionPane.showMessageDialog(Rickshaw_Jpanel, "The Auto Rickshaw is already booked. \n Vehicle ID : "+ID);
                                }
                            }
                            else
                            {
                                //when the if condition is false the else condition are executive and display message dailog box
                                JOptionPane.showMessageDialog(Rickshaw_Jpanel, "Doesn't match Vehicle ID !!");
                            }
                        }
                    }
                }
                catch(NumberFormatException NFE)//this is the NumberFormatException which is catch the given the message when user wrong input
                {
                    JOptionPane.showMessageDialog(Rickshaw_Jpanel, "Invalid !! Please input the currect values");
                }
            }
        }
        else if(AE.getSource() == rickshawDisplay_button)
        {
            // the user was not put the input and direct add the value then given the empty message
            if(textFieldAR_EnginDis.getText().isEmpty() || textFieldAR_Torque.getText().isEmpty() || textFieldAR_fuleTank.getText().isEmpty() || textFieldAR_GroundClar.getText().isEmpty() || 
            booked_Days_JCB.getSelectedItem() == null || booked_Months_JCB.getSelectedItem() == null || booked_Date_JCB.getSelectedItem() == null)
            {
                JOptionPane.showMessageDialog(Scooter_Jpanel, "The fields is Empty !!");
            }
            else
            {
                //this is the try which is check the value are correct or not
                try    
                {
                    //this is the data conversion in String to integer with useing by Wrapper class with getText() methods
                    int engine = Integer.parseInt(textFieldAR_EnginDis.getText());//get vehicle engineDisplacement
                    String torque = textFieldAR_Torque.getText();//get vehicle torque
                    int fuleTank = Integer.parseInt(textFieldAR_fuleTank.getText());//get vehicle fule tank capacity
                    String ground = textFieldAR_GroundClar.getText();//get vehicle ground clareance
                    String date = booked_Days_JCB.getSelectedItem()+" "+booked_Months_JCB.getSelectedItem()+" "+booked_Date_JCB.getSelectedItem();
                    
                    //data convert in integer to String 
                    String Engine = String.valueOf(engine);
                    String FuleTank = String.valueOf(fuleTank);
                    
                    String allvalues = "Engine Displacement : "+Engine+" \nTorque : "+torque+" \nFuleTank Capacity : "+FuleTank+" \nGround Clearance : "+ground+" \nBooked Date : "+date;
                    //using by for loop where create an boject in Vehicle class then store the Array list
                    for(Vehicle V_obj : V_array)
                    {
                        //using the if condation and check the Vehicle class's value are AutoRickshaw values or and not
                        if(V_obj instanceof AutoRickshaw)
                        {
                            //create an object of ElectricScooter class then Down object casting which Vehicle to AutoRickshaw class and if condation check the values are equal or not
                            AutoRickshaw auto_obj = (AutoRickshaw) V_obj;
                            auto_obj.Display();
                            JOptionPane.showMessageDialog(Rickshaw_Jpanel, "    <Auto Rickshaw>  \n"+allvalues);
                        }
                    }
                }
                catch(NumberFormatException NFE)//this is the NumberFormatException which is catch the given the message when user wrong input
                {
                    JOptionPane.showMessageDialog(Rickshaw_Jpanel, "Invalid !! Please input the currect values.");
                }
            }
        }
        
        //add the ElectricScooter class
        if(AE.getSource() == addScooter_button)
        {
            if(textFieldES_addVID.getText().isEmpty() || textFieldES_addVname.getText().isEmpty() || textFieldES_addVweight.getText().isEmpty() || textFieldES_addVcolor.getText().isEmpty() || 
               textFieldES_addVspeed.getText().isEmpty() || textFieldES_addBattery.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(subJpanel_Green, "The fields is Empty !!");
            }
            else
            {
                //this is the try which is check the value are correct or not
                try
                {
                    //this is the data conversion in String to integer with useing by Wrapper class with getText() methods
                    int Vid = Integer.parseInt(textFieldES_addVID.getText());//get vehicle ID
                    String name = textFieldES_addVname.getText();
                    String weigth = textFieldES_addVweight.getText();
                    String color = textFieldES_addVcolor.getText();
                    String speed = textFieldES_addVspeed.getText();
                    int battery = Integer.parseInt(textFieldES_addBattery.getText());
                    
                    //data convert in integer to String
                    String ID = String.valueOf(Vid);
                    String Battery = String.valueOf(battery);
                    
                    //sum of all String values
                    String sumOfvalues ="Vehicle ID : "+ID+" \nVehicle Nmae : "+name+" \nVehicle Weight : "+weigth+" \nVehicle Color : "+color+" \nVehicle Speed : "+speed+" \nBAttery Capacity : "+Battery; 
                    
                    boolean reused = true;//initialize the boolean veriable reused is true
                    for(Vehicle V_obj : V_array)
                    {
                        if(V_obj instanceof ElectricScooter)
                        {
                            ElectricScooter Scooter_obj = (ElectricScooter) V_obj;
                            if(Scooter_obj.getVehicleID() == Vid)
                            {
                               reused = false;
                            }
                        }
                    }
                    if(reused == true)
                    {
                        //create a object of ElectricScooter class and given paramiter values
                        ElectricScooter ES = new ElectricScooter(Vid, name, weigth, color, speed, battery);
                        V_array.add(ES);//add in arraylist which is Vehicle types
                    
                        //given output in add successfully
                        JOptionPane.showMessageDialog(subJpanel_Green, "Electric Scooter is added successfully. \n"+sumOfvalues);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(subJpanel_Green, "The Electric Scooter is already added.");
                    }
                }
                catch(NumberFormatException nef)//this is the NumberFormatException which is catch the given the message when user wrong input
                {
                    JOptionPane.showMessageDialog(subJpanel_Green, "Invalid !! Please input the currect values.");
                }
            }
        }
        //purchase Electric Scooter wher the Vehicle Id is reference by V_array list instanceof ElectricScooter
        else if(AE.getSource() == purchaseScooter_button)
        {
            // the user was not put the input and direct add the value then given the empty message
            if(textField_purchaseVID.getText().isEmpty() || textField_purchaseBrand.getText().isEmpty() || textField_purchasePrice.getText().isEmpty() || 
            Jlabel_purchaseTime.getText().isEmpty() || textField_purchaseMileage.getText().isEmpty() || textField_purchaseRange.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(Scooter_Jpanel, "The fields is Empty !!");
            }
            else
            {
                //this is the try which is check the value are correct or not
                try
                {
                    //this is the data conversion in String to integer with useing by Wrapper class with getText() methods
                    int vehicleID = Integer.parseInt(textField_purchaseVID.getText());//get vehicle ID
                    String brand = textField_purchaseBrand.getText();
                    int price = Integer.parseInt(textField_purchasePrice.getText());
                    String time = textField_purchaseTime.getText();
                    String mileage = textField_purchaseMileage.getText();
                    int range = Integer.parseInt(textField_purchaseRange.getText());
            
                    //data convert in integer to String
                    String ID = String.valueOf(vehicleID);
                    String Price = String.valueOf(price);
                    String Range = String.valueOf(range);
                    //sum of all String values are set in one vareable which is Allvalues
                    String Allvalues = "Brand : "+brand+" \nPrice : "+price+" \nCharging Time : "+time+" \nMileage : "+mileage+" \nRange : "+Range;
                    //using by for loop where create an boject in Vehicle class then store the Array list
                    for(Vehicle V_obj : V_array)
                    {
                        //using the if condation and check the Vehicle class's value are ElectricScooter values or and not
                        if(V_obj instanceof ElectricScooter)
                        {
                            //create an object of ElectricScooter class then Down object casting which Vehicle to ElectricScooter class and if condation check the values are equal or not
                            ElectricScooter Scooter_obj = (ElectricScooter) V_obj;
                            if(Scooter_obj.getVehicleID() == vehicleID)
                            {
                                //using by if or else if condition when if condition is true the some vlaue print message in message dailog and not true the go to else if condition executive
                                if(Scooter_obj.getHasPurchased() == false)
                                {
                                    //call the Purchase methods and given paramiter
                                   Scooter_obj.Purchase(brand, price, time, mileage, range);
                                   JOptionPane.showMessageDialog(Scooter_Jpanel, "The Electric Scooter is purchase. \n"+Allvalues);
                                }
                                else if(Scooter_obj.getHasPurchased() == true)
                                {
                                   //message dialogbox
                                   JOptionPane.showMessageDialog(Scooter_Jpanel, "It has been already purchased. \n ID: "+ID);
                                }       
                            }
                            else
                            {
                                //when the if condition is false the else condition are executive and display message dailog box
                                JOptionPane.showMessageDialog(Scooter_Jpanel, "Doesn't match Vehicle ID !!");
                            }
                        }
                    }
                }
                catch(NumberFormatException NFE)//this is the NumberFormatException which is catch the given the message when user wrong input
                {
                    JOptionPane.showMessageDialog(Scooter_Jpanel, "Invalid !! Please input the currect values.");
                }
            }
        }
        //Call the Sell methods and the some values are display in message dailog box
        else if(AE.getSource() == sellScooter_button)
        {
            // the user was not put the input and direct add the value then given the empty message
            if(textField_purchaseVID.getText().isEmpty() || textField_purchasePrice.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(Scooter_Jpanel, "The fields is Empty !!");
            }
            else
            {
                //this is the try which is check the value are correct or not
                try
                { 
                    //this is the data conversion in String to integer with useing by Wrapper class with getText() methods
                    int vehicleID = Integer.parseInt(textField_purchaseVID.getText());
                    int price = Integer.parseInt(textField_purchasePrice.getText());
                    
                    //the integer vaues are convert in String values
                    String ID = String.valueOf(vehicleID);
                    String Price = String.valueOf(price);
                    //using by for loop where create an boject in Vehicle class then store the Array list
                    for(Vehicle V_obj : V_array)
                    {
                        //using the if condation and check the Vehicle class's value are ElectricScooter values or and not
                        if(V_obj instanceof ElectricScooter)
                        {
                            //create an object of ElectricScooter class then Down object casting which Vehicle to ElectricScooter class and if condation check the values are equal or not
                            ElectricScooter Scooter_obj = (ElectricScooter) V_obj;
                            if(Scooter_obj.getVehicleID() == vehicleID)
                            {
                                //using by if or else if condition when if condition is true the some vlaue print and not true the go to else if condition executive
                                if(Scooter_obj.getHasSold() == false)
                                {
                                   //call the Sell methods
                                   Scooter_obj.Sell(price);
                                   JOptionPane.showMessageDialog(Scooter_Jpanel, "The Electric Scooter is sell. \n Price: "+Price);
                                }
                                else if(Scooter_obj.getHasSold() == true)
                                {
                                   //message dialogbox it has been already sold.
                                   JOptionPane.showMessageDialog(Scooter_Jpanel, "It has been already sold. \n Vehicle ID: "+ID);
                                }       
                            }
                            else
                            {
                               //when the if condition is false the else condition are executive and display message dailog box
                               JOptionPane.showMessageDialog(Scooter_Jpanel, "Doesn't not match Vehicle ID !!");
                            }
                        }
                    }
                }
                catch(NumberFormatException NFE)//this is the NumberFormatException which is catch the given the message when user wrong input
                {
                    JOptionPane.showMessageDialog(Scooter_Jpanel, "Invalid !! Please input the currect values.");
                }
            }
        }
        //Call the Display methods and Display the some values are message dailog box
        else if(AE.getSource() == ScooterDisplay_button)
        {
            // the user was not put the input and direct add the value then given the empty message
            if(textFieldES_addBattery.getText().isEmpty() || textField_purchaseBrand.getText().isEmpty() || Jlabel_purchaseTime.getText().isEmpty() || 
            textField_purchaseMileage.getText().isEmpty() || textField_purchaseRange.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(Scooter_Jpanel, "The fields is Empty !!");
            }
            else
            {
                //this is the try which is check the value are correct or not
                try    
                {
                    //this is the data conversion in String to integer with useing by Wrapper class with getText() methods
                    int battery = Integer.parseInt(textFieldES_addBattery.getText());
                    String brand = textField_purchaseBrand.getText();
                    String time = textField_purchaseTime.getText();
                    String mileage = textField_purchaseMileage.getText();
                    int range = Integer.parseInt(textField_purchaseRange.getText());
                    
                    //data convert in integer to String
                    String Battery = String.valueOf(battery);
                    String Range = String.valueOf(range);
                    //all the values are set in String types of variable
                    String allvalues ="Battery Capacity : "+Battery+" \nBrand : "+brand+" \nChargeing Time : "+time+" \nMileage : "+mileage+" \nRange : "+Range;
                    //using by for loop where create an boject in Vehicle class then store the Array list
                    for(Vehicle V_obj : V_array)
                    {
                        //this is the check of assign value are array list same or not
                        if(V_obj instanceof ElectricScooter)
                        {
                            //create a Electric Scooter class's object and Object casting which is Down casting like parent class Vehicle to convert chile class ElectricScooter
                            ElectricScooter Scooter_obj = (ElectricScooter) V_obj;
                            Scooter_obj.Display();
                            JOptionPane.showMessageDialog(Scooter_Jpanel, "     <Electric Scooter>  \n"+allvalues);
                        }
                    }
                }
                catch(NumberFormatException NFE)//this is the NumberFormatException which is catch the given the message when user wrong input
                {
                    JOptionPane.showMessageDialog(Scooter_Jpanel, "Invalid !! Please input the currect values.");
                }
            }
        }
        
        //set the empty values and all the values are clare in Auto Rickshaw and Electric Scooter class
        if(AE.getSource() == rickshawClear_button)//clear electric scooter class values
        {
            //clear the add Aout Rickshaw values
            textFieldAR_VID.setText("");
            textFieldAR_Vname.setText("");
            textFieldAR_Vweight.setText("");
            textFieldAR_Vcolor.setText("");
            textFieldAR_Vspeed.setText("");
            textFieldAR_EnginDis.setText("");
            textFieldAR_Torque.setText("");
            textFieldAR_fuleTank.setText("");
            textFieldAR_GroundClar.setText("");
            //clear the booked Auto Ricksahaw values
            textField_bookedVID.setText("");
            textField_bookedAmount.setText("");
            textField_bookedSeats.setText("");
            //clear the JComboBox book values 
            booked_Days_JCB.setSelectedIndex(0);
            booked_Months_JCB.setSelectedIndex(0);
            booked_Date_JCB.setSelectedIndex(0);
            //Joining Date is clare
            joining_date_JCB.setSelectedIndex(0); 
            joining_months_JCB.setSelectedIndex(0); 
            joining_days_JCB.setSelectedIndex(0);
        }
        //clear electric scooter class values when click the ScooterClear_button Button
        else if(AE.getSource() == ScooterClear_button)
        {
            //clear the add scooter values
            textFieldES_addVID.setText("");
            textFieldES_addVname.setText("");
            textFieldES_addVweight.setText("");
            textFieldES_addVcolor.setText("");
            textFieldES_addVspeed.setText("");
            textFieldES_addBattery.setText("");
            //clear the purchare scooter values
            textField_purchaseVID.setText("");
            textField_purchaseBrand.setText("");
            textField_purchasePrice.setText("");
            textField_purchaseTime.setText("");
            textField_purchaseMileage.setText("");
            textField_purchaseRange.setText("");
        }
    }
    //create a main methods
    public static void main(String[] args)
    {
       Transport_GUI transport = new Transport_GUI();
       transport.vehicle();
    }
}