/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_200393445;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author krutarth Rathod
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Button 
            Button_A,
            Button_B,
            Button_C,
            Button_D,
            Button_E,
            Button_F,
            Button_G,
            Button_H,
            Button_I,
            Button_J,
            Button_K,
            Button_L,
            Button_M,
            Button_N,
            Button_O,
            Button_P,
            Button_Q,
            Button_R,
            Button_S,
            Button_T,
            Button_U,
            Button_V,
            Button_W,
            Button_X,
            Button_Y,
            Button_Z;

    @FXML
    private Button Submit_Button;

    @FXML
    private Button Restart_Button;

    @FXML
    private Label Bag_A,
            Bag_B,
            Bag_C,
            Bag_D,
            Bag_E,
            Bag_F,
            Bag_G,
            Bag_H,
            Bag_I,
            Bag_J,
            Bag_K,
            Bag_L,
            Bag_M,
            Bag_N,
            Bag_O,
            Bag_P,
            Bag_Q,
            Bag_R,
            Bag_S,
            Bag_T,
            Bag_U,
            Bag_V,
            Bag_W,
            Bag_X,
            Bag_Y,
            Bag_Z;
           
    public FXMLDocumentController() {}

    @FXML
    private Label Input_Box;
    
    @FXML
    private Label Error_Message;

    @FXML
    private Label Total_Points;

    @FXML
    private Label Last_Word;
        
    int[] Bag_Letters = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
    int[] Tmp_BagLetter = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
     
    String Entred_Word = "", disHis = "";
    int Word_High_Limit = 1, Ttl_Pnt =0;
    boolean Chk_Vowel = false, Chk_Blank = true, Chk_LessWord = true;
    
    ArrayList<String> Hist = new ArrayList<>();
    
    
    @FXML
    private void Button_Clicked(ActionEvent event){
        
        if(Word_High_Limit<=8){
            if(event.getSource() == Button_A){
                Word_High_Limit++;
                Entred_Word += "A";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_B){
                Word_High_Limit++;
                Entred_Word += "B";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_C){
                Word_High_Limit++;
                Entred_Word += "C";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_D){
                Word_High_Limit++;
                Entred_Word += "D";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_E){
                Word_High_Limit++;
                Entred_Word += "E";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_F){
                Word_High_Limit++;
                Entred_Word += "F";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_G){
                Word_High_Limit++;
                Entred_Word += "G";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_H){
                Word_High_Limit++;
                Entred_Word += "H";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_I){
                Word_High_Limit++;
                Entred_Word += "I";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_J){
                Word_High_Limit++;
                Entred_Word += "J";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_K){
                Word_High_Limit++;
                Entred_Word += "K";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_L){
                Word_High_Limit++;
                Entred_Word += "L";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_M){
                Word_High_Limit++;
                Entred_Word += "M";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_N){
                Word_High_Limit++;
                Entred_Word += "N";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_O){
                Word_High_Limit++;
                Entred_Word += "O";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_P){
                Word_High_Limit++;
                Entred_Word += "P";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_Q){
                Word_High_Limit++;
                Entred_Word += "Q";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_R){
                Word_High_Limit++;
                Entred_Word += "R";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_S){
                Word_High_Limit++;
                Entred_Word += "S";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_T){
                Word_High_Limit++;
                Entred_Word += "T";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_U){
                Word_High_Limit++;
                Entred_Word += "U";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_V){
                Word_High_Limit++;
                Entred_Word += "v";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_W){
                Word_High_Limit++;
                Entred_Word += "W";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_X){
                Word_High_Limit++;
                Entred_Word += "X";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_Y){
                Word_High_Limit++;
                Entred_Word += "Y";
                Input_Box.setText(Entred_Word);
            }
            else if(event.getSource() == Button_Z){
                Word_High_Limit++;
                Entred_Word += "Z";
                Input_Box.setText(Entred_Word);
            }
        }
        else{
            Error_Message.setText("Your written word is too long. ");
        }
    }
   
    @FXML
    private void Submit_Button_Clicked(ActionEvent event){
        Chk_Blank = true;
        Chk_Vowel = false;
        Chk_LessWord = true;
        
        for(int i = 0; i < Entred_Word.length(); i++){
            if(Entred_Word.charAt(i) == 'A' || 
               Entred_Word.charAt(i) == 'E' || 
               Entred_Word.charAt(i) == 'I' || 
               Entred_Word.charAt(i) == 'O' ||
               Entred_Word.charAt(i) == 'U' ||
               Entred_Word.charAt(i) == 'Y') {
                Chk_Vowel = true;
            }
        }
        if(!Chk_Vowel){
            Error_Message.setText("Your word does not include Vowel. Please include a vowel.");
        }
        if(Entred_Word.isEmpty()){
            Error_Message.setText("Please, Write any word!");
            Chk_Blank = false;
        }
        if(Entred_Word.length() == 1){
            Error_Message.setText("Your written word is too Short!!");
            Chk_LessWord = false;
        }
        
        if(Chk_Blank == true && Chk_Vowel == true && Chk_LessWord == true){
            Hist.add(Entred_Word);
            disHis += Entred_Word + ", ";
            Input_Box.setText("");
            
            for(int i=0; i < Entred_Word.length(); i++){
                if(Entred_Word.charAt(i) == 'A'){
                Bag_Letters[0]--;
                if(Bag_Letters[0]==0){
                Bag_A.setText(String.valueOf(Bag_Letters[0]));
                Button_A.setDisable(true);
                }
                Bag_A.setText(String.valueOf(Bag_Letters[0]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'B'){
                Bag_Letters[1]--;
                if(Bag_Letters[1]==0){
                Bag_B.setText(String.valueOf(Bag_Letters[1]));
                Button_B.setDisable(true);
                }
                Bag_B.setText(String.valueOf(Bag_Letters[1]));
                Ttl_Pnt += 3;
                }
                if(Entred_Word.charAt(i) == 'C'){
                Bag_Letters[2]--;
                if(Bag_Letters[2]==0){
                Bag_C.setText(String.valueOf(Bag_Letters[2]));
                Button_C.setDisable(true);
                }
                Bag_C.setText(String.valueOf(Bag_Letters[2]));
                Ttl_Pnt += 3;
                }
                if(Entred_Word.charAt(i) == 'D'){
                Bag_Letters[3]--;
                if(Bag_Letters[3]==0){
                Bag_D.setText(String.valueOf(Bag_Letters[3]));
                Button_D.setDisable(true);
                }
                Bag_D.setText(String.valueOf(Bag_Letters[3]));
                Ttl_Pnt += 2;
                }
                if(Entred_Word.charAt(i) == 'E'){
                Bag_Letters[4]--;
                if(Bag_Letters[4]==0){
                Bag_E.setText(String.valueOf(Bag_Letters[4]));
                Button_E.setDisable(true);
                }
                Bag_E.setText(String.valueOf(Bag_Letters[4]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'F'){
                Bag_Letters[5]--;
                if(Bag_Letters[5]==0){
                Bag_F.setText(String.valueOf(Bag_Letters[5]));
                Button_F.setDisable(true);
                }
                Bag_F.setText(String.valueOf(Bag_Letters[5]));
                Ttl_Pnt += 4;
                }
                if(Entred_Word.charAt(i) == 'G'){
                Bag_Letters[6]--;
                if(Bag_Letters[6]==0){
                Bag_G.setText(String.valueOf(Bag_Letters[6]));
                Button_G.setDisable(true);
                }
                Bag_G.setText(String.valueOf(Bag_Letters[6]));
                Ttl_Pnt += 2;
                }
                if(Entred_Word.charAt(i) == 'H'){
                Bag_Letters[7]--;
                if(Bag_Letters[7]==0){
                Bag_H.setText(String.valueOf(Bag_Letters[7]));
                Button_H.setDisable(true);
                }
                Bag_H.setText(String.valueOf(Bag_Letters[7]));
                Ttl_Pnt += 4;
                }
                if(Entred_Word.charAt(i) == 'I'){
                Bag_Letters[8]--;
                if(Bag_Letters[8]==0){
                Bag_I.setText(String.valueOf(Bag_Letters[8]));
                Button_I.setDisable(true);
                }
                Bag_I.setText(String.valueOf(Bag_Letters[8]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'J'){
                Bag_Letters[9]--;
                if(Bag_Letters[9]==0){
                Bag_J.setText(String.valueOf(Bag_Letters[9]));
                Button_J.setDisable(true);
                }
                Bag_J.setText(String.valueOf(Bag_Letters[9]));
                Ttl_Pnt += 8;
                }
                if(Entred_Word.charAt(i) == 'K'){
                Bag_Letters[10]--;
                if(Bag_Letters[10]==0){
                Bag_K.setText(String.valueOf(Bag_Letters[10]));
                Button_K.setDisable(true);
                }
                Bag_K.setText(String.valueOf(Bag_Letters[10]));
                Ttl_Pnt += 5;
                }
                if(Entred_Word.charAt(i) == 'L'){
                Bag_Letters[11]--;
                if(Bag_Letters[11]==0){
                Bag_L.setText(String.valueOf(Bag_Letters[11]));
                Button_L.setDisable(true);
                }
                Bag_L.setText(String.valueOf(Bag_Letters[11]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'M'){
                Bag_Letters[12]--;
                if(Bag_Letters[12]==0){
                Bag_M.setText(String.valueOf(Bag_Letters[12]));
                Button_M.setDisable(true);
                }
                Bag_M.setText(String.valueOf(Bag_Letters[12]));
                Ttl_Pnt += 3;
                }
                if(Entred_Word.charAt(i) == 'N'){
                Bag_Letters[13]--;
                if(Bag_Letters[13]==0){
                Bag_N.setText(String.valueOf(Bag_Letters[13]));
                Button_N.setDisable(true);
                }
                Bag_N.setText(String.valueOf(Bag_Letters[13]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'O'){
                Bag_Letters[14]--;
                if(Bag_Letters[14]==0){
                Bag_O.setText(String.valueOf(Bag_Letters[14]));
                Button_O.setDisable(true);
                }
                Bag_O.setText(String.valueOf(Bag_Letters[14]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'P'){
                Bag_Letters[15]--;
                if(Bag_Letters[15]==0){
                Bag_P.setText(String.valueOf(Bag_Letters[15]));
                Button_P.setDisable(true);
                }
                Bag_P.setText(String.valueOf(Bag_Letters[15]));
                Ttl_Pnt += 3;
                }
                if(Entred_Word.charAt(i) == 'Q'){
                Bag_Letters[16]--;
                if(Bag_Letters[16]==0){
                Bag_Q.setText(String.valueOf(Bag_Letters[16]));
                Button_Q.setDisable(true);
                }
                Bag_Q.setText(String.valueOf(Bag_Letters[16]));
                Ttl_Pnt += 10;
                }
                if(Entred_Word.charAt(i) == 'R'){
                Bag_Letters[17]--;
                if(Bag_Letters[17]==0){
                Bag_R.setText(String.valueOf(Bag_Letters[17]));
                Button_R.setDisable(true);
                }
                Bag_R.setText(String.valueOf(Bag_Letters[17]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'S'){
                Bag_Letters[18]--;
                if(Bag_Letters[18]==0){
                Bag_S.setText(String.valueOf(Bag_Letters[18]));
                Button_S.setDisable(true);
                }
                Bag_S.setText(String.valueOf(Bag_Letters[18]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'T'){
                Bag_Letters[19]--;
                if(Bag_Letters[19]==0){
                Bag_T.setText(String.valueOf(Bag_Letters[19]));
                Button_T.setDisable(true);
                }
                Bag_T.setText(String.valueOf(Bag_Letters[19]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'U'){
                Bag_Letters[20]--;
                if(Bag_Letters[20]==0){
                Bag_U.setText(String.valueOf(Bag_Letters[20]));
                Button_U.setDisable(true);
                }
                Bag_U.setText(String.valueOf(Bag_Letters[20]));
                Ttl_Pnt += 1;
                }
                if(Entred_Word.charAt(i) == 'V'){
                Bag_Letters[21]--;
                if(Bag_Letters[21]==0){
                Bag_V.setText(String.valueOf(Bag_Letters[21]));
                Button_V.setDisable(true);
                }
                Bag_V.setText(String.valueOf(Bag_Letters[21]));
                Ttl_Pnt += 4;
                }
                if(Entred_Word.charAt(i) == 'W'){
                Bag_Letters[22]--;
                if(Bag_Letters[22]==0){
                Bag_W.setText(String.valueOf(Bag_Letters[22]));
                Button_W.setDisable(true);
                }
                Bag_W.setText(String.valueOf(Bag_Letters[22]));
                Ttl_Pnt += 4;
                }
                if(Entred_Word.charAt(i) == 'X'){
                Bag_Letters[23]--;
                if(Bag_Letters[23]==0){
                Bag_X.setText(String.valueOf(Bag_Letters[23]));
                Button_X.setDisable(true);
                }
                Bag_X.setText(String.valueOf(Bag_Letters[23]));
                Ttl_Pnt += 8;
                }
                if(Entred_Word.charAt(i) == 'Y'){
                Bag_Letters[24]--;
                if(Bag_Letters[24]==0){
                Bag_Y.setText(String.valueOf(Bag_Letters[24]));
                Button_Y.setDisable(true);
                }
                Bag_Y.setText(String.valueOf(Bag_Letters[24]));
                Ttl_Pnt += 4;
                }
                if(Entred_Word.charAt(i) == 'Z'){
                Bag_Letters[25]--;
                if(Bag_Letters[25]==0){
                Bag_Z.setText(String.valueOf(Bag_Letters[25]));
                Button_Z.setDisable(true);
                }
                Bag_Z.setText(String.valueOf(Bag_Letters[25]));
                Ttl_Pnt += 10;
                }
            }
            Total_Points.setText(String.valueOf(Ttl_Pnt));
            Entred_Word = "";
            Word_High_Limit = 1;
            Last_Word.setText(disHis);
            Error_Message.setText("");
        }
    }
    
    @FXML
    private void Restart_Button_Clicked(ActionEvent event){
        for(int i=0; i<Bag_Letters.length; i++){
        Bag_Letters[i] = Tmp_BagLetter[i];
        }
        Entred_Word = "";
        disHis = "";
        Total_Points.setText("");
        Word_High_Limit = 1;
        Chk_Vowel = false;
        Chk_Blank = true;
        Chk_LessWord = true;
        Ttl_Pnt = 0;
    }
            
    @Override
    @SuppressWarnings("empty-statement")
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Bag_A.setText("9");
        Bag_B.setText("2");
        Bag_C.setText("2");
        Bag_D.setText("4");
        Bag_E.setText("12");
        Bag_F.setText("2");
        Bag_G.setText("3");
        Bag_H.setText("2");
        Bag_I.setText("8");
        Bag_J.setText("1");
        Bag_K.setText("1");
        Bag_L.setText("4");
        Bag_M.setText("2");
        Bag_N.setText("6");
        Bag_O.setText("8");
        Bag_P.setText("2");
        Bag_Q.setText("1");
        Bag_R.setText("6");
        Bag_S.setText("4");
        Bag_T.setText("6");
        Bag_U.setText("4");
        Bag_V.setText("2");
        Bag_W.setText("2");
        Bag_X.setText("1");
        Bag_Y.setText("2");
        Bag_Z.setText("1");
    } 
}
