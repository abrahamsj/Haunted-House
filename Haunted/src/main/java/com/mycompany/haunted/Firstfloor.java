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

import static com.mycompany.haunted.Firstfloor.BathRoom;
import static com.mycompany.haunted.Firstfloor.DinningRoom;
import static com.mycompany.haunted.Firstfloor.Kitchen;
import static com.mycompany.haunted.Firstfloor.LivingRoom;
import static com.mycompany.haunted.Firstfloor.Pantry;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author neely
 */
//import javax.swing.JOPtionPane*;  
public class Firstfloor {
    
 public String bagpack;
   public String name; 
   
 //public  Firstfloor () {
      //String name = welcomeName();
    // String  bagpack= welcometool(); 
 //}
      

public static void FirstRooms(){
   
int choice =Integer.parseInt(JOptionPane.showInputDialog(null,"Here is the list of rooms to explore on the first floor\n"
+ "\t1-Living Room\n"
+ "\t2-Bathroom\n"
+ "\t3-Dinning Room\n"
+ "\t4-Kitchen\n"
+ "\t5-Pantry\n"
+ "\t6-Second Floor\n"
+ "If you would like to tour a certain room on the first floor you need to select the respective number."));

switch(choice){
    case 1 -> LivingRoom();
    case 2 -> BathRoom();
    case 3 -> DinningRoom();
    case 4 -> Kitchen();
    case 5 -> Pantry();
    case 6 -> {
        SecondFloor.SecondRooms(); // creating object to call for the rooms upstairs
            }
        
    default -> {
        ImageIcon bye= new ImageIcon("bye.jpg");
        JOptionPane.showMessageDialog(null,"Invalid Input","Goodbye ",JOptionPane.INFORMATION_MESSAGE,bye);
            }
  
        
}// end of switch 
}

public static void LivingRoom(){
   // If the user chooses to go into the living room
//If the user chooses to open the cabinet a ghost will escape and scare the user to death 	END GAME
String filepath= "Door.wav";
Sounds BGM= new Sounds();
BGM.playMusic(filepath);
ImageIcon chest= new ImageIcon("chest.jpg");
JOptionPane.showMessageDialog(null,"There is only one item in the Living room would you like to explore the item?","DISPLAY ITEM",JOptionPane.INFORMATION_MESSAGE,chest);
int Livingexpo=JOptionPane.showConfirmDialog(null,"Would you like to explore the item?");
if(Livingexpo==JOptionPane.YES_OPTION){ 
    ImageIcon death= new ImageIcon("dead.gif");
       JOptionPane.showMessageDialog(null,"Ghost escapes and scares you to death","GAME OVER",JOptionPane.INFORMATION_MESSAGE,death);      
       
       ImageIcon deathlive= new ImageIcon("livingroomdead.jpg");
       JOptionPane.showMessageDialog(null,"Ghost escaped and scared you to death.You died in the living you X maeks the spot","GAME OVER",JOptionPane.INFORMATION_MESSAGE,deathlive);        
    
    }
    else if(Livingexpo==JOptionPane.NO_OPTION){
} 
        Rooms();// MINUS Livingroom 
}



public static void BathRoom(){
  String filepath= "DoorSlam.wav";
Sounds BGM= new Sounds();
BGM.playMusic(filepath);
JOptionPane.showMessageDialog(null,"There are two items in the Bathroom. They are a mirror and the shower");
 int explore=JOptionPane.showConfirmDialog(null,"Would you like to explore the items?");

if(explore==JOptionPane.YES_OPTION){ 
 String filepathgeneric= "BGM1.wav";
Sounds BGMgeneric= new Sounds();
BGMgeneric.playMusic(filepathgeneric);
    String bathchoice=JOptionPane.showInputDialog(null,"Which item would you like to explore?\n Hint:Enter mirror or shower");
   
    if(bathchoice.equalsIgnoreCase("mirror")){
        ImageIcon mirror= new ImageIcon("bloodyface.jpg");
               JOptionPane.showMessageDialog(null,"See a bloody face looking back at you","DISPLY IMAGE",JOptionPane.INFORMATION_MESSAGE,mirror);        
    }
               else if (bathchoice.equalsIgnoreCase("shower")){
                   String filepathshower= "shower";
                    Sounds BGMshower= new Sounds();
                    BGMshower.playMusic(filepathshower);
                       }
}
    ImageIcon terror= new ImageIcon("terror.jpg");
       JOptionPane.showMessageDialog(null,"You are trapped!\n You have entered a terror's domain, to survive you must answer the terror's riddle correctly otherwise its GAME OVER!\n"
      + "\t\tRIDDLE:\n"
    + "This thing all things devours;\n" +
      "Birds, beasts, trees, flowers;\n" +
      "Gnaws iron, bites steel;\n" +
      "Grinds hard stones to meal;\n" +
       "Slays king, ruins town,\n" +
       "And beats mountain down.\nWhen you think you know the answer select okay to enter yor answer.\n YOU ONLY GET ONE CHANCE","TERROR QUEST",JOptionPane.INFORMATION_MESSAGE,terror);  
       String terrorAns= JOptionPane.showInputDialog(null,"Enter you response to the terror's riddle here");
       if(terrorAns.equalsIgnoreCase("time")){
           FirstRooms(); // backing only allowed with terror quests
         }
       else if (!(terrorAns.equalsIgnoreCase("time"))){
           ImageIcon death= new ImageIcon("dead");
       JOptionPane.showMessageDialog(null,"You failed to answer the terror's riddle correctly","GAME OVER",JOptionPane.INFORMATION_MESSAGE,death);        
    
    ImageIcon deathbath= new ImageIcon("bathdeath.jpg");
       JOptionPane.showMessageDialog(null,"You died here X marks the spot,the first floor bathroom.","GAME OVER",JOptionPane.INFORMATION_MESSAGE,deathbath);        
       
       // ADD THE USER NAME TO PERSONALIZE AND THE PENALTY FOR LIFE FORCE
       }
}
       
       public static void DinningRoom(){
 String filepathdine= "BGM1.wav";
Sounds BGM= new Sounds();
BGM.playMusic(filepathdine);
ImageIcon lamp= new ImageIcon("lamp.jpg");
JOptionPane.showMessageDialog(null,"There is only one item in the Dinning room would you like to explore the item?","DISPLAY ITEM",JOptionPane.INFORMATION_MESSAGE,lamp);
int dineExpo=JOptionPane.showConfirmDialog(null,"Would you like to explore the item?");
if(dineExpo==JOptionPane.YES_OPTION){
    String color=JOptionPane.showInputDialog(null,"Select the color of the lamp you desire\n"
     + "\t-Black\n\t-White");
    if(color.equalsIgnoreCase("Black")){
    ImageIcon demon= new ImageIcon("demon.jpg");
       JOptionPane.showMessageDialog(null," You are souls see dark things you were taunted by the demon of trickster demon and saw desired a black lamp now its came GAME OVER","GAME OVER",JOptionPane.INFORMATION_MESSAGE,demon);  
       ImageIcon death= new ImageIcon("dead");
       JOptionPane.showMessageDialog(null,"BYE..","GAME OVER",JOptionPane.INFORMATION_MESSAGE,death); 
ImageIcon deatheat= new ImageIcon("eatdead.jpg");
       JOptionPane.showMessageDialog(null,"You died in the dinning room on the first fllor X marks the spot.","GAME OVER",JOptionPane.INFORMATION_MESSAGE,deatheat);        
           
       
    }else if (color.equalsIgnoreCase("white")){
        
            ImageIcon riddle=new ImageIcon("riddle.png");
            JOptionPane.showMessageDialog(null,"You were saved by the shadow of a mother who has lost her child and now you must answer her favorite riddle"
                    + "\t\tRIDDLE\n"
                    + "Tell me what it is, you have it, I have it  and almost everyone does\n it is often overused and at the same time not used quite enough now tell me child what do you think it is?\n"
                    + "\n When you are ready to answer the riddle select okay to enter your response.","MOTHER'S QUEST",JOptionPane.INFORMATION_MESSAGE,riddle);  
            
            String mother=JOptionPane.showInputDialog(null,"Enter your response to Mother Quest riddle here");
            if(mother.equalsIgnoreCase("sense")||mother.equalsIgnoreCase("common sense")||mother.equalsIgnoreCase("senses")){
              
                
            }       }
    }        
    }          
   public static void Kitchen(){
   String filepath= "BGM1.wav";
Sounds BGMfood= new Sounds();
BGMfood.playMusic(filepath);
JOptionPane.showMessageDialog(null,"There are two item to be explore in the Kitchen:refrigerator  the cabinet");
int KitchenExpo=JOptionPane.showConfirmDialog(null,"Would you like to explore the items?");
if(KitchenExpo==JOptionPane.YES_OPTION){ 
    int Rchoice=JOptionPane.showConfirmDialog(null,"Would you like to explore the refrigerator?)");
    
if(Rchoice==JOptionPane.YES_OPTION){
    
}
else if (Rchoice==JOptionPane.NO_OPTION){
    ImageIcon cabinet= new ImageIcon("cabinet.jpg");
       JOptionPane.showMessageDialog(null,"User gets knocked out by dishes and starts moving towards the light","GAME OVER Pending...",JOptionPane.INFORMATION_MESSAGE,cabinet);       
       //check if life force is greater than or equal to 65 tif it is user survives otherwise GAME OVER
       System.out.println("Get soul Food increase life force");
       
       //ImageIcon deathkitchen= new ImageIcon("kitchenn.jpg");
       //JOptionPane.showMessageDialog(null,"Ghost escapes and scares you to death","GAME OVER",JOptionPane.INFORMATION_MESSAGE,deathkitchen);        
}
    else if(KitchenExpo==JOptionPane.NO_OPTION){
} 
        Rooms2();//- explored rooms
}
        }
       
    
  

public static void Pantry (){
 String filepath= "Scream1.wav";
Sounds BGMpantry= new Sounds();
BGMpantry.playMusic(filepath);   
ImageIcon end= new ImageIcon("end.gif");
       JOptionPane.showMessageDialog(null,"The Pantry is a trapped room, once you enter you can't leave automatic death!","GAME OVER",JOptionPane.INFORMATION_MESSAGE,end);    
    
       ImageIcon stop= new ImageIcon("stop.jpg");
       JOptionPane.showMessageDialog(null,"Pantry was a trap run you'll always die here","FINAL SPOT",JOptionPane.INFORMATION_MESSAGE,stop);        
    
}

        


public static void Rooms(){ // Rooom minus Living Room
int choice =Integer.parseInt(JOptionPane.showInputDialog(null,"Here is the list of unexplored rooms on the first floor\n"
+ "\t1-Bathroom\n"
+ "\t2-Dinning Room\n"
+ "\t3-Kitchen\n"
+ "\t4-Pantry\n"
+ "\t5-Second Floor"
+ "If you would like to tour a certain room on the first floor you need to select the repective number."));

switch(choice){
    case 1 -> BathRoom();
    case 2 -> DinningRoom();
    case 3 -> Kitchen();
    case 4 -> Pantry();
    case 5 -> {
        SecondFloor.SecondRooms();
            }
        
    default -> {
        ImageIcon bye= new ImageIcon("bye.jpg");
        JOptionPane.showMessageDialog(null,"Invalid Input","Goodbye",JOptionPane.INFORMATION_MESSAGE,bye);
            }
  
        
}
}
        
public static void Rooms2(){ // Rooom minus Living Room
int choice =Integer.parseInt(JOptionPane.showInputDialog(null," Here is the list of unexplored rooms on the first floor\n"
+ "\t1-Kitchen\n"
+ "\t2-Pantry\n"
+ "\t3-Second Floor"
+ "If you would like to tour a certain room on the first floor you need to select the repective number."));

switch(choice){
  case 1 -> Kitchen();
    case 2 -> Pantry();
    case 3 -> {
       
        SecondFloor.SecondRooms();
            }
        
    default -> {
        ImageIcon bye= new ImageIcon("bye.jpg");
        JOptionPane.showMessageDialog(null,"Invalid Input","Goodbye",JOptionPane.INFORMATION_MESSAGE,bye);
            }
  
        
}// end of switch 
}//end of FirstFloor class

public static void Rules(){
    JOptionPane.showMessageDialog(null,"\t\t WARNING!!\n"
            + "-You only have one life so live well, YOLO\n"
            + "-Be careful when exploring because you never know what could kill you\n"
            + "-Backtracking only allowed after surviving an encounter with terrors\n"
            + "-There are some trap Rooms that once you enter you automatically die so...be careful.");
}


public static String welcomeName(){

 ImageIcon begin= new ImageIcon("front.jpg");
        JOptionPane.showMessageDialog(null,"Happy Halloween, Welcome to the Key House","WELCOME!",JOptionPane.INFORMATION_MESSAGE,begin);

String name= JOptionPane.showInputDialog(null,"Please enter your name:"); 
return name;
}
public static String welcometool(){
 String tool= JOptionPane.showInputDialog(null,"Enter an item that you thing you will need to survive in the house. ");
  
    
    JOptionPane.showMessageDialog(null,"Your item has been stored in you bagpack","Alert",JOptionPane.WARNING_MESSAGE);

return tool;

}



        }

        

