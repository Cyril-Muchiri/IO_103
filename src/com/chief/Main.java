package com.chief;

import java.io.*;

public class Main {

    public static void main(String[] args) {

                try {
                    BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial2-copy1.txt"));
                    BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial2.txt"));
                    String s;
                    while ((s=reader.readLine()) !=null ) writer.write(s+"\n");
                    writer.close();
                    reader.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


