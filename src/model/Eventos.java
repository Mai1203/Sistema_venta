/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author maico
 */
public class Eventos {

    public void textKeyPress(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) KeyEvent.VK_BACK_SPACE && (car != (char) KeyEvent.VK_SPACE))) {
            evt.consume();
        }
    }

    public void numberKeyPress(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    public void numberDecimalKeyPress(KeyEvent evt, JTextField textFlied) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && textFlied.getText().contains(".") && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    public void txtCelularKeyTyped(KeyEvent evt, JTextField textField) {
        if (textField.getText().length() >= 10) {
            evt.consume();
        }
    }
}
