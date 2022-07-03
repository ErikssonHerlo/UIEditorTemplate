/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.helloworld;

import com.mycompany.helloworld.GUI.IDE;
import com.mycompany.helloworld.GUI.MainView;
import com.mycompany.helloworld.GUI.MainViewV2;

/**
 *
 * @author erikssonherlo
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
          MainViewV2 editor = new MainViewV2();
            editor.setLocationRelativeTo(null);
            editor.setVisible(true);
    }
}
