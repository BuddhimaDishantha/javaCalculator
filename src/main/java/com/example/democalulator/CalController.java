package com.example.democalulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class CalController {
    public TextField txtDisplay;
    int decimalClick=0;
    String general;
    Double firstDouble;
    public void btnGenaralOnAction(ActionEvent event){
            general=((Button)event.getSource()).getText();
           switch (general){
               case "AC":
                   txtDisplay.clear();
                   decimalClick=0;
                   break;
               case "+/-":
                   double plusMinus=Double.parseDouble(txtDisplay.getText());
                   plusMinus=plusMinus*(-1);
                   txtDisplay.setText(String.valueOf(plusMinus));
                   break;
               case "+":
               case "-":
               case"×":
               case"÷":
               case"%":
                   String text=txtDisplay.getText();
                   firstDouble=Double.parseDouble(text);
                   txtDisplay.clear();
                   decimalClick=0;
                   break;
               default:
           }
    }

    public void btnDigitOnAction(ActionEvent event){
            String digit=((Button)event.getSource()).getText();
            String oldtext=txtDisplay.getText();
            String newtext=oldtext+digit;
            txtDisplay.setText(newtext);
    }
    public void btnDecimalOnAction(ActionEvent event){
        if(decimalClick==0){
            String decimal=((Button)event.getSource()).getText();
            String oldtext=txtDisplay.getText();
            String newtext=oldtext+decimal;
            txtDisplay.setText(newtext);
            decimalClick=1;
        }
    }
    public void btnresultOnAction(ActionEvent event){
            double secondDouble=0;
            double result = 0;
            String secondtext=txtDisplay.getText();
            secondDouble=Double.parseDouble(secondtext);

        switch(general){
            case"+":
                result=firstDouble+secondDouble;
            break;
            case"-":
                result= firstDouble-secondDouble;
                break;
            case"×":
                result=firstDouble*secondDouble;
                break;
            case"÷":
                result=firstDouble/secondDouble;
            break;
            }
            String format=String.format("%.1f",result);
            txtDisplay.setText(format);
    }
}
