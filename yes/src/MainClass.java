import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import javax.swing.*;

import javafx.stage.Window;
public class MainClass extends MyFrame {
    public static void main(String[] args) {

        String s;
        System.out.println("enter the name of title ");
        Scanner scan= new Scanner(System.in);
        s=scan.nextLine();


        JLabel lable=new JLabel();
        lable.setText("The Yatharth's Store");
        lable.setVisible(true);
        lable.setVerticalAlignment(SwingConstants.TOP);
        lable.setHorizontalAlignment(SwingConstants.CENTER);
        lable.setLocation(360,360);
        lable.setFont(new Font("Monospace",Font.PLAIN,20));
        lable.setBounds(360,0,500,30);
        lable.setForeground(Color.gray);
        MyFrame obj= new MyFrame();

        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize(720,720);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(Color.cyan);
        frame.setTitle("yes");
        frame.setLayout(null);
        frame.add(lable);
        frame.add(obj.button);
        frame.add(obj.labled);
        frame.pack();

        int n;

        System.out.println("ENter the number of items");

        n=scan.nextInt();

        String S[] =new String[n];
        String temps=" ";
        int price[]=new int[n];
        int temp,sum=0;
        for(int i = 0; i< n; i++){
            System.out.println("Enter thr name and price of item "+(i+1));
            S[i]=scan.nextLine();
            price[i]=scan.nextInt();
            sum=sum+price[i];
        }
        System.out.println("YOUR BILL :");
        System.out.println("ITEM      PRICE");
        for(int i = 0; i< n; i++){
            System.out.println(S[i]+"     "+price[i]);
        }

    }
}
