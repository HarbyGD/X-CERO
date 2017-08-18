package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;
    @FXML
    Button button7;
    @FXML
    Button button8;
    @FXML
    Button button9;
    @FXML
    TextField player1;
    @FXML
    TextField player2;
    @FXML
    MenuItem nuevo;
    @FXML
    MenuItem salir;


    public void button1(ActionEvent actionEvent) {
        button1.setText("X");

        if (button2.getText() != "O" && button3.getText() != "O" && button4.getText() != "O" &&
                button5.getText() != "O" && button6.getText() != "O" && button7.getText() != "O" &&
                button8.getText() != "O" && button9.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button2.setText("O");
                    break;
                case 2:
                    button3.setText("O");
                    break;
                case 3:
                    button4.setText("O");
                    break;
                case 4:
                    button5.setText("O");
                    break;
                case 5:
                    button6.setText("O");
                    break;
                case 6:
                    button7.setText("O");
                    break;
                case 7:
                    button8.setText("O");
                    break;
                case 8:
                    button9.setText("O");
                    break;
            }
        }

        if (button1.getText() == "X" && button2.getText() == "X" && button3.getText() != "0" && button3.getText() != "X"){
            button3.setText("O");
        }
        else if (button1.getText() == "X" && button3.getText() == "X" && button2.getText() != "0" && button2.getText() != "X"){
            button2.setText("O");
        }
        else if (button1.getText() == "X" && button4.getText() == "X" && button7.getText() != "0" && button7.getText() != "X"){
            button7.setText("O");
        }
        else if (button1.getText() == "X" && button7.getText() == "X" && button4.getText() != "0" && button4.getText() != "X"){
            button4.setText("O");
        }
        else if (button1.getText() == "X" && button5.getText() == "X" && button9.getText() != "0" && button9.getText() != "X"){
            button9.setText("O");
        }
        else if (button1.getText() == "X" && button9.getText() == "X" && button5.getText() != "0" && button5.getText() != "X"){
            button5.setText("O");
        }

    }

    public void button2(ActionEvent actionEvent) {
        button2.setText("X");

        if (button1.getText() != "O" && button3.getText() != "O" && button4.getText() != "O" &&
                button5.getText() != "O" && button6.getText() != "O" && button7.getText() != "O" &&
                button8.getText() != "O" && button9.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button1.setText("O");
                    break;
                case 2:
                    button3.setText("O");
                    break;
                case 3:
                    button4.setText("O");
                    break;
                case 4:
                    button5.setText("O");
                    break;
                case 5:
                    button6.setText("O");
                    break;
                case 6:
                    button7.setText("O");
                    break;
                case 7:
                    button8.setText("O");
                    break;
                case 8:
                    button9.setText("O");
                    break;
            }
        }

        if (button1.getText() == "X" && button2.getText() == "X" && button3.getText() != "0" && button3.getText() != "X"){
            button3.setText("O");
        }
        else if (button2.getText() == "X" && button3.getText() == "X" && button1.getText() != "0" && button1.getText() != "X"){
            button1.setText("O");
        }
        else if (button2.getText() == "X" && button5.getText() == "X" && button8.getText() != "0" && button8.getText() != "X"){
            button8.setText("O");
        }
        else if (button2.getText() == "X" && button8.getText() == "X" && button5.getText() != "0" && button5.getText() != "X"){
            button5.setText("O");
        }



    }

    public void button3(ActionEvent actionEvent) {
        button3.setText("X");

        if (button1.getText() != "O" && button2.getText() != "O" && button4.getText() != "O" &&
                button5.getText() != "O" && button6.getText() != "O" && button7.getText() != "O" &&
                button8.getText() != "O" && button9.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button1.setText("O");
                    break;
                case 2:
                    button2.setText("O");
                    break;
                case 3:
                    button4.setText("O");
                    break;
                case 4:
                    button5.setText("O");
                    break;
                case 5:
                    button6.setText("O");
                    break;
                case 6:
                    button7.setText("O");
                    break;
                case 7:
                    button8.setText("O");
                    break;
                case 8:
                    button9.setText("O");
                    break;
            }
        }

        if (button2.getText() == "X" && button3.getText() == "X" && button1.getText() != "0" && button1.getText() != "X"){
            button1.setText("O");
        }
        else if (button1.getText() == "X" && button3.getText() == "X" && button2.getText() != "0" && button2.getText() != "X"){
            button2.setText("O");
        }
        else if (button3.getText() == "X" && button9.getText() == "X" && button6.getText() != "0" && button6.getText() != "X"){
            button6.setText("O");
        }
        else if (button3.getText() == "X" && button6.getText() == "X" && button9.getText() != "0" && button9.getText() != "X"){
            button9.setText("O");
        }
        else if (button3.getText() == "X" && button5.getText() == "X" && button7.getText() != "0" && button7.getText() != "X"){
            button7.setText("O");
        }
        else if (button3.getText() == "X" && button7.getText() == "X" && button5.getText() != "0" && button5.getText() != "X"){
            button5.setText("O");
        }
    }

    public void button4(ActionEvent actionEvent) {
        button4.setText("X");

        if (button1.getText() != "O" && button2.getText() != "O" && button3.getText() != "O" &&
                button5.getText() != "O" && button6.getText() != "O" && button7.getText() != "O" &&
                button8.getText() != "O" && button9.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button1.setText("O");
                    break;
                case 2:
                    button2.setText("O");
                    break;
                case 3:
                    button3.setText("O");
                    break;
                case 4:
                    button5.setText("O");
                    break;
                case 5:
                    button6.setText("O");
                    break;
                case 6:
                    button7.setText("O");
                    break;
                case 7:
                    button8.setText("O");
                    break;
                case 8:
                    button9.setText("O");
                    break;
            }
        }

        if (button4.getText() == "X" && button1.getText() == "X" && button7.getText() != "0" && button7.getText() != "X"){
            button7.setText("O");
        }
        else if (button4.getText() == "X" && button7.getText() == "X" && button1.getText() != "0" && button1.getText() != "X"){
            button1.setText("O");
        }
        else if (button4.getText() == "X" && button5.getText() == "X" && button6.getText() != "0" && button6.getText() != "X"){
            button6.setText("O");
        }
        else if (button4.getText() == "X" && button6.getText() == "X" && button5.getText() != "0" && button5.getText() != "X"){
            button5.setText("O");
        }
    }

    public void button5(ActionEvent actionEvent) {
        button5.setText("X");

        if (button1.getText() != "O" && button2.getText() != "O" && button3.getText() != "O" &&
                button4.getText() != "O" && button6.getText() != "O" && button7.getText() != "O" &&
                button8.getText() != "O" && button9.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button1.setText("O");
                    break;
                case 2:
                    button2.setText("O");
                    break;
                case 3:
                    button3.setText("O");
                    break;
                case 4:
                    button4.setText("O");
                    break;
                case 5:
                    button6.setText("O");
                    break;
                case 6:
                    button7.setText("O");
                    break;
                case 7:
                    button8.setText("O");
                    break;
                case 8:
                    button9.setText("O");
                    break;
            }
        }

        if (button5.getText() == "X" && button1.getText() == "X" && button9.getText() != "0" && button9.getText() != "X"){
            button9.setText("O");
        }
        else if (button5.getText() == "X" && button9.getText() == "X" && button1.getText() != "0" && button1.getText() != "X"){
            button1.setText("O");
        }
        else if (button2.getText() == "X" && button5.getText() == "X" && button8.getText() != "0" && button8.getText() != "X"){
            button8.setText("O");
        }
        else if (button5.getText() == "X" && button8.getText() == "X" && button2.getText() != "0" && button2.getText() != "X"){
            button2.setText("O");
        }
        else if (button3.getText() == "X" && button5.getText() == "X" && button7.getText() != "0" && button7.getText() != "X"){
            button7.setText("O");
        }
        else if (button5.getText() == "X" && button7.getText() == "X" && button3.getText() != "0" && button3.getText() != "X"){
            button3.setText("O");
        }
        else if (button4.getText() == "X" && button5.getText() == "X" && button6.getText() != "0" && button6.getText() != "X"){
            button6.setText("O");
        }
        else if (button5.getText() == "X" && button6.getText() == "X" && button4.getText() != "0" && button4.getText() != "X"){
            button4.setText("O");
        }
    }

    public void button6(ActionEvent actionEvent) {
        button6.setText("X");

        if (button1.getText() != "O" && button2.getText() != "O" && button3.getText() != "O" &&
                button4.getText() != "O" && button5.getText() != "O" && button7.getText() != "O" &&
                button8.getText() != "O" && button9.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button1.setText("O");
                    break;
                case 2:
                    button2.setText("O");
                    break;
                case 3:
                    button3.setText("O");
                    break;
                case 4:
                    button4.setText("O");
                    break;
                case 5:
                    button5.setText("O");
                    break;
                case 6:
                    button7.setText("O");
                    break;
                case 7:
                    button8.setText("O");
                    break;
                case 8:
                    button9.setText("O");
                    break;
            }
        }

        if (button3.getText() == "X" && button6.getText() == "X" && button9.getText() != "0" && button9.getText() != "X"){
            button9.setText("O");
        }
        else if (button6.getText() == "X" && button9.getText() == "X" && button3.getText() != "0" && button3.getText() != "X"){
            button3.setText("O");
        }
        else if (button4.getText() == "X" && button6.getText() == "X" && button5.getText() != "0" && button5.getText() != "X"){
            button5.setText("O");
        }
        else if (button5.getText() == "X" && button6.getText() == "X" && button4.getText() != "0" && button4.getText() != "X"){
            button4.setText("O");
        }
    }

    public void button7(ActionEvent actionEvent) {
        button7.setText("X");

        if (button1.getText() != "O" && button2.getText() != "O" && button3.getText() != "O" &&
                button4.getText() != "O" && button5.getText() != "O" && button6.getText() != "O" &&
                button8.getText() != "O" && button9.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button1.setText("O");
                    break;
                case 2:
                    button2.setText("O");
                    break;
                case 3:
                    button3.setText("O");
                    break;
                case 4:
                    button4.setText("O");
                    break;
                case 5:
                    button5.setText("O");
                    break;
                case 6:
                    button6.setText("O");
                    break;
                case 7:
                    button8.setText("O");
                    break;
                case 8:
                    button9.setText("O");
                    break;
            }
        }

        if (button1.getText() == "X" && button7.getText() == "X" && button4.getText() != "0" && button4.getText() != "X"){
            button4.setText("O");
        }
        else if (button4.getText() == "X" && button7.getText() == "X" && button1.getText() != "0" && button1.getText() != "X"){
            button1.setText("O");
        }
        else if (button7.getText() == "X" && button5.getText() == "X" && button3.getText() != "0" && button3.getText() != "X"){
            button3.setText("O");
        }
        else if (button7.getText() == "X" && button3.getText() == "X" && button5.getText() != "0" && button5.getText() != "X") {
            button5.setText("O");
        }
        else if (button7.getText() == "X" && button8.getText() == "X" && button9.getText() != "0" && button9.getText() != "X"){
            button9.setText("O");
        }
        else if (button7.getText() == "X" && button9.getText() == "X" && button8.getText() != "0" && button8.getText() != "X") {
            button8.setText("O");
        }


    }

    public void button8(ActionEvent actionEvent) {
        button8.setText("X");

        if (button1.getText() != "O" && button2.getText() != "O" && button3.getText() != "O" &&
                button4.getText() != "O" && button5.getText() != "O" && button6.getText() != "O" &&
                button7.getText() != "O" && button9.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button1.setText("O");
                    break;
                case 2:
                    button2.setText("O");
                    break;
                case 3:
                    button3.setText("O");
                    break;
                case 4:
                    button4.setText("O");
                    break;
                case 5:
                    button5.setText("O");
                    break;
                case 6:
                    button6.setText("O");
                    break;
                case 7:
                    button7.setText("O");
                    break;
                case 8:
                    button9.setText("O");
                    break;
            }
        }

        if (button7.getText() == "X" && button8.getText() == "X" && button9.getText() != "0" && button9.getText() != "X"){
            button9.setText("O");
        }
        else if (button8.getText() == "X" && button9.getText() == "X" && button7.getText() != "0" && button7.getText() != "X"){
            button7.setText("O");
        }
        else if (button8.getText() == "X" && button5.getText() == "X" && button2.getText() != "0" && button2.getText() != "X"){
            button2.setText("O");
        }
        else if (button2.getText() == "X" && button8.getText() == "X" && button5.getText() != "0" && button5.getText() != "X") {
            button5.setText("O");
        }

    }

    public void button9(ActionEvent actionEvent) {
        button9.setText("X");

        if (button1.getText() != "O" && button2.getText() != "O" && button3.getText() != "O" &&
                button4.getText() != "O" && button5.getText() != "O" && button6.getText() != "O" &&
                button7.getText() != "O" && button8.getText() != "O") {
            int randumnum;
            randumnum = 1 + (int) (Math.random() * 8);
            switch(randumnum){
                case 1:
                    button1.setText("O");
                    break;
                case 2:
                    button2.setText("O");
                    break;
                case 3:
                    button3.setText("O");
                    break;
                case 4:
                    button4.setText("O");
                    break;
                case 5:
                    button5.setText("O");
                    break;
                case 6:
                    button6.setText("O");
                    break;
                case 7:
                    button7.setText("O");
                    break;
                case 8:
                    button8.setText("O");
                    break;
            }
        }

        if (button7.getText() == "X" && button9.getText() == "X" && button8.getText() != "0" && button8.getText() != "X"){
            button8.setText("O");
        }
        else if (button8.getText() == "X" && button9.getText() == "X" && button7.getText() != "0" && button7.getText() != "X"){
            button7.setText("O");
        }
        else if (button5.getText() == "X" && button9.getText() == "X" && button1.getText() != "0" && button1.getText() != "X"){
            button1.setText("O");
        }
        else if (button1.getText() == "X" && button9.getText() == "X" && button5.getText() != "0" && button5.getText() != "X") {
            button5.setText("O");
        }
        else if (button3.getText() == "X" && button9.getText() == "X" && button6.getText() != "0" && button6.getText() != "X"){
            button6.setText("O");
        }
        else if (button6.getText() == "X" && button9.getText() == "X" && button3.getText() != "0" && button3.getText() != "X") {
            button3.setText("O");
        }
    }



}
