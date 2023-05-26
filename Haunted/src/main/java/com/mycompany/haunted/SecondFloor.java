//********************************************************************************
// NAME:JANEEL ABRAHAMS
//PANTHERID:  [6242670]
// CLASS: COP 2210 – [FALL 2020]
// ASSIGNMENT #3 
// DATE: [11/4/2020]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.

package com.mycompany.haunted;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author neely
 */
public class SecondFloor {

public static void SecondRooms(){
int choice =Integer.parseInt(JOptionPane.showInputDialog(null,"Here is the list of rooms to explore on the second floor\n"
+ "\t1-Master Bedroom\n"
+ "\t2-Master Bathroom\n"
+ "\t3-Bedroom 1\n"
+ "\t4-Bedroom 2\n"
+ "\t5-Bathroom\n"
+ "If you would like to tour a certain room on this floor you need to select the respective number."));

switch(choice){
    case 1 -> MasterBed();
    case 2 -> MasterBathRoom();
    case 3 -> BedRoom1();
    case 4 -> BedRoom2();
    case 5 -> SecondBath();
   
        
    default -> {
        ImageIcon bye= new ImageIcon("bye.jpg");
        JOptionPane.showMessageDialog(null,"Invalid Input","Goodbye",JOptionPane.INFORMATION_MESSAGE,bye);
        
        ImageIcon byeE= new ImageIcon("goinguo.jpg");
        JOptionPane.showMessageDialog(null,"You got haunted by ghosts and killed while trying to go upstairs becareful next time.\n X marks the spot","WRONG INPUT",JOptionPane.INFORMATION_MESSAGE,byeE);
        
        }
  
        
}// end of switch 
}

public static void MasterBed(){
   // If the user chooses to go into the living room
//If the user chooses to open the cabinet a ghost will escape and scare the user to death 	END GAME
String filepath= "BGM1.wav";
Sounds BGM_MAS= new Sounds();
BGM_MAS.playMusic(filepath);

JOptionPane.showMessageDialog(null,"There are two items to be explored in the Master Bedroom. A lamp and a jewlery box would you like to explore the item?");
int jewel=JOptionPane.showConfirmDialog(null,"Would you like to explore the jewlery box?");

if(jewel==JOptionPane.YES_OPTION){ 
    ImageIcon curse= new ImageIcon("hope.jpg");
       JOptionPane.showMessageDialog(null,"Congratulations you found the the hope diamond it is the heart of the house’s curse\n your life force will now start to slowly be drained until you die or escape the house." ,"HOPE DIAMOND",JOptionPane.INFORMATION_MESSAGE,curse);        
   
}

    else if(jewel==JOptionPane.NO_OPTION){
ImageIcon magic= new ImageIcon("genie.jpg");
       JOptionPane.showMessageDialog(null,"You chose to rub the genie's lamp.\n The genie will grant you three wishes as outlined below\n"
               + "Choose wisely as you might die before your wishes are made reality\n"
               + "\t\t\t GENIE'S WISH BOARD\n"
               + "WISHES\t\tCOST\n"
               + "1.How to win the game\t\t soul \n"
               + "2.How to escape the house\t\t 20 lifeforce points\n"
               + "3 How to free the genie\t\t 80 life force points\n"
               + "When you have decided on your wish select okay and enter the number that corresponds with your desire." ,"GENIE'S LAMP",JOptionPane.INFORMATION_MESSAGE,magic);    
       System.out.println("Current life force amount");
       int wish=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your wish number here"));
      
       switch(wish){
           
           case 1 -> Genie();
       
          
        
           case 2 -> {
               ImageIcon death= new ImageIcon("dead.gif");
               JOptionPane.showMessageDialog(null,"You must shatter the diamond into a million pieces to break the curse and ecape.");
               JOptionPane.showMessageDialog(null,"The genie lied to you or probably you just didn't reach a million piece ...the world may never know.","GAME OVER",JOptionPane.INFORMATION_MESSAGE,death);
               ImageIcon masterbeddead= new ImageIcon("MASTERBED.jpg");
               JOptionPane.showMessageDialog(null,"Aww poor thing you died....\n\t~X marks the spot.","FINAL SPOT",JOptionPane.INFORMATION_MESSAGE,masterbeddead);
        
        }
           case 3 -> {
               JOptionPane.showMessageDialog(null,"Give me the hope diamond and wish me free. Wishing me free will cost you 10 additional life force point\n,but if I'm free I will free us both from this cursed mansion.");
               int accept=JOptionPane.showConfirmDialog(null,"Do you accept?");
            if (accept==JOptionPane.YES_OPTION) {
                ImageIcon winner= new ImageIcon("win.jpg");
                JOptionPane.showMessageDialog(null,"You have escaped the haunted house with the genie","CONGRATS!",JOptionPane.INFORMATION_MESSAGE,winner);
            }
        }
       }
       
    } 
        Rooms();// un explored MINUS Master bedroom 
}



public static void MasterBathRoom(){
  String filepath= "BGM1.wav";
Sounds BGM= new Sounds();
BGM.playMusic(filepath);

JOptionPane.showMessageDialog(null,"There is only nothing too out of the ordinary just the shower and the medicine cabinate");
 int explorebath=JOptionPane.showConfirmDialog(null,"Would you like to explore the items?");

if(explorebath==JOptionPane.YES_OPTION){ 
 
    String bathchoice=JOptionPane.showInputDialog(null,"Which item would you like to explore?- \nEnter shower to explor the showe or MC to xplore the medicine cabinet");
   String filepathgeneric= "showersong.wav";
Sounds BGMlady= new Sounds();
BGMlady.playMusic(filepathgeneric);
    if(bathchoice.equalsIgnoreCase("shower")){
        
               JOptionPane.showMessageDialog(null,"Suddenly hear singing in the shower, but no one is there.\n select okay to move on");        
    }
               else if (bathchoice.equalsIgnoreCase("shower")){
                   String filepathshower= "showersong.wav";
                    Sounds BGMshower= new Sounds();
                    BGMshower.playMusic(filepathshower);
                       
} else if (bathchoice.equalsIgnoreCase("MC")){
  ImageIcon death= new ImageIcon("dead.gif");
       JOptionPane.showMessageDialog(null,"Cabinet if filled with toxic gasses that kills whoever inhales ir.","GAME OVER",JOptionPane.INFORMATION_MESSAGE,death);     
}
}
   Rooms2(); 
}
       
       public static void BedRoom1(){
 String filepathdine= "BGM1.wav";
Sounds BGM= new Sounds();
BGM.playMusic(filepathdine);
ImageIcon room1= new ImageIcon("room1.jpg");
JOptionPane.showMessageDialog(null,"There are two items in the this room to 'explore' - a rocking chir and a window","DISPLAYING ITEMS",JOptionPane.INFORMATION_MESSAGE,room1);
int room=JOptionPane.showConfirmDialog(null,"Would you like to explore the items?");
if(room==JOptionPane.YES_OPTION){
    int roomChoice=Integer.parseInt(JOptionPane.showInputDialog(null,"Select the item you woould like to explore\n1-Rocking chair\n2-Window"));
    if(roomChoice==1){
   
       ImageIcon death= new ImageIcon("dead.gif");
       JOptionPane.showMessageDialog(null,"You're trapped on the rocking chair now until your life force is completely drained","GAME OVER",JOptionPane.INFORMATION_MESSAGE,death);        
       
    }else if (roomChoice==2){
      
       JOptionPane.showMessageDialog(null,"they will see a child outside on the swings then the child suddenly disappears");        
         
    }
    } 
        Rooms3();
    }          
   public static void BedRoom2(){
   String filepath= "BGM1.wav";
Sounds BGMfood= new Sounds();
BGMfood.playMusic(filepath);
JOptionPane.showMessageDialog(null,"There are two item to be explore in the doll house and the dresser");
int room2=JOptionPane.showConfirmDialog(null,"Would you like to explore the items?");
if(room2==JOptionPane.YES_OPTION){ 
    int room2choice=JOptionPane.showConfirmDialog(null,"Would you like to look in the doll house?)");
    
if(room2choice==JOptionPane.YES_OPTION){
    ImageIcon doll= new ImageIcon("doll.jpg");
    JOptionPane.showMessageDialog(null,"Dolls start moving on their own","DOLL HOUSE",JOptionPane.INFORMATION_MESSAGE,doll);
}
else if (room2choice==JOptionPane.NO_OPTION){
    ImageIcon ghost= new ImageIcon("ghost.jpg");
       JOptionPane.showMessageDialog(null,"A ghost flies out of the dresser as soon as you open it and goes right though your body","BOO!",JOptionPane.INFORMATION_MESSAGE,ghost);       
           
    }
   
        SecondBath();//MINUS explored rooms
}
        }
       
    
  

public static void SecondBath(){
String filepath= "DoorSlam.wav";
Sounds BGM= new Sounds();
BGM.playMusic(filepath);
JOptionPane.showMessageDialog(null,"There are two items in the Bathroom. They are a mirror and the shower");
 int explore=JOptionPane.showConfirmDialog(null,"Would you like to explore the items?");

if(explore==JOptionPane.YES_OPTION){ 
 String filepathgeneric= "BGM1.wav";
Sounds BGMgeneric= new Sounds();
BGMgeneric.playMusic(filepathgeneric);
    String bathchoice=JOptionPane.showInputDialog(null,"Which item would you like to explore?");
   
    if(bathchoice.equalsIgnoreCase("mirror")){
        ImageIcon mirror= new ImageIcon("bloodyface.jpg");
               JOptionPane.showMessageDialog(null,"Ghost escapes and scares you to death","GAME OVER",JOptionPane.INFORMATION_MESSAGE,mirror);        
    }
               else if (bathchoice.equalsIgnoreCase("shower")){
                   String filepathshower= "shower.wav";
                    Sounds BGMshower= new Sounds();
                    BGMshower.playMusic(filepathshower);
                       }
}
    ImageIcon terror= new ImageIcon("terror.jpg");
       JOptionPane.showMessageDialog(null,", you are trapped!\n You have entered a terror's domain to survive you must answer to terror's riddle correctly otherwise its GAME OVER!"
               + "\t\tRIDDLE:\nIt cannot be seen, cannot be felt,\n" +
"Cannot be heard, cannot be smelt.\n" +
"It lies behind stars and under hills,\n" +
"And empty holes it fills.\n" +
"It comes out first and follows after,\n" +
"Ends life, kills laughter.\n"
    +"When you think you know the answer select okay to enter yor answer.\n YOU ONLY GET ONE CHANCE","TERROR QUEST",JOptionPane.INFORMATION_MESSAGE,terror);  
       
       String terrorAns= JOptionPane.showInputDialog(null,"Enter you response to the terror's riddle here");
       if(terrorAns.equalsIgnoreCase("darkness") || terrorAns.equalsIgnoreCase("dark")){
           SecondRooms(); // backing only allowed with terror quests
         }
       else if (!(terrorAns.equalsIgnoreCase("darkness")||terrorAns.equalsIgnoreCase("dark"))){
           ImageIcon death= new ImageIcon("dead.gif");
       JOptionPane.showMessageDialog(null,"Ghost escapes and scares you to death","GAME OVER",JOptionPane.INFORMATION_MESSAGE,death);        
    
       
       }
}
public static void Rooms(){ // Rooom minus Master Bedroom
int choice =Integer.parseInt(JOptionPane.showInputDialog(null,"Here is the list of unexplored rooms on the first floor\n"
+ "\t1-Master Bathroom\n"
+ "\t2-Bedroom 1\n"
+ "\t3-Bedroom 2\n"
+ "\t4-Bathroom\n"
+ "If you would like to tour a certain room on this floor you need to select the respective number."));

switch(choice){
    case 1 -> MasterBathRoom();
    case 2 -> BedRoom1();
    case 3 -> BedRoom2();
        
    default -> {
        ImageIcon bye= new ImageIcon("bye.jpg");
        JOptionPane.showMessageDialog(null,"Invalid Input","Goodbye",JOptionPane.INFORMATION_MESSAGE,bye);
            }
  
        
}
}
        
public static void Rooms2(){ // Minus Master bed and bath
int choice =Integer.parseInt(JOptionPane.showInputDialog(null,"Here is the list of unexplored rooms on the second floor\n"
+"\t1-Bedroom 1\n"
+ "\t2-Bedroom 2\n"
+ "\t3-Bathroom\n"
+ "If you would like to tour a certain room on this floor you need to select the respective number."));

switch(choice){
    case 1 -> BedRoom1();
    case 2 -> BedRoom2();
    case 3 -> SecondBath();
    
        
    default -> {
        ImageIcon bye= new ImageIcon("bye.jpg");
        JOptionPane.showMessageDialog(null,"Invalid Input","Goodbye",JOptionPane.INFORMATION_MESSAGE,bye);
            }
  
        
}// end of switch 
}


public static void Rooms3(){ //Minus first three options
int choice =Integer.parseInt(JOptionPane.showInputDialog(null,"Here is the list of unexplored rooms on the first floor\n"

+ "\t1-Bedroom 2\n"
+ "\t2-Bathroom\n"
+ "If you would like to tour a certain room on this floor you need to select the respective number."));

switch(choice){
    case 1 -> BedRoom2();
    case 2 -> SecondBath();
           default -> {
        ImageIcon bye= new ImageIcon("bye.jpg");
        JOptionPane.showMessageDialog(null,"Invalid Input","Goodbye",JOptionPane.INFORMATION_MESSAGE,bye);
            }
}
}

public static void Rules(){
    JOptionPane.showMessageDialog(null,"\t\t WARNING!!! \n"
            + "-Unlike the first floor there will be some items that you will need to keep on your person...REMEMBER!\n"
            + "-Be careful when exploring because you never know what could kill you\n"
            + "-Backtracking only allowed after surviving an encounter with terrors\n"
            + "-There are some trap ooms that once you enter you automatically die so...be careful.");
}


public static void Genie (){
    JOptionPane.showMessageDialog(null,"You must give the Hope diamond to the singing woman\n ");
    int choice =Integer.parseInt(JOptionPane.showInputDialog(null,"select a room and go.\n"
+ "\t1-Master Bedroom\n"
+ "\t2-Master Bathroom\n"
+ "\t3-Bedroom 1\n"
+ "\t4-Bedroom 2\n"
+ "\t5-Bathroom (Second floor)\n"
+ "\t6-Living Room\n"
+ "\t7-Dinning Room\n"
+ "\t8-Kitchen\n"
+ "\t9-Pantry\n"
+ "\t10-Bathroom (first floor)\n"
+ "If you would like to tour a certain room on this floor you need to select the respective number.\n"
            + "For those who have yet to encouter either the hidden lady or the Hop diamond "
            + "Hint 1: The hidden lady is always in our midst, though she likes it a bit steamy she's always squaky..."
            + "Hint 2: The Hope diamond is a jewel seek for it where precious things are kept."));

switch(choice){
    case 1 -> MasterBed();
    case 2 -> Singing();             
    case 3 -> BedRoom1();
    case 4 -> BedRoom2();
    case 5 -> SecondBath();
    case 6 -> Firstfloor.LivingRoom();
    case 7 -> Firstfloor.DinningRoom();
    case 8 -> Firstfloor.Kitchen();
    case 9 -> Firstfloor.Pantry();
    case 10 ->Firstfloor.BathRoom();
    
    default->{
        ImageIcon bye= new ImageIcon("bye.jpg");
        JOptionPane.showMessageDialog(null,"Invalid Input","Goodbye",JOptionPane.INFORMATION_MESSAGE,bye);
    
        
}
}
}

public static void Singing(){
  String filepath= "showersong.wav";
Sounds BGM= new Sounds();
BGM.playMusic(filepath);

JOptionPane.showMessageDialog(null,"You have entered the room with the singing lady now give her the Hope diamond");
 String bagpack="Hope Diamond";
 String check="Hope Diamond";
 boolean retval=bagpack.contains(check);
  if(retval==true){
      ImageIcon winner= new ImageIcon("win.jpg");
                JOptionPane.showMessageDialog(null,"You have escaped the haunted house.","CONGRATS!",JOptionPane.INFORMATION_MESSAGE,winner);
               ImageIcon bath= new ImageIcon("masterbath.jpg");
                JOptionPane.showMessageDialog(null,"X marks your final location in the house.","FINAL SPOT",JOptionPane.INFORMATION_MESSAGE,bath);
            }
  else if (retval==false){
    ImageIcon death= new ImageIcon("dead.gif");
       JOptionPane.showMessageDialog(null,"You were killed by the singing lady for disturbing her.","GAME OVER",JOptionPane.INFORMATION_MESSAGE,death);        
       
       ImageIcon bath= new ImageIcon("masterbath.jpg");
                JOptionPane.showMessageDialog(null,"X marks your final location in the house.","FINAL SPOT",JOptionPane.INFORMATION_MESSAGE,bath);
            }
}
  
            }
   
                   

   
        



    
     
   
    

        




