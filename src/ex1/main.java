package ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws IOException {
        List colectie=new ArrayList();

        String nume_fis= "/src/ex1/electronice.txt";
        BufferedReader citire_fisier;
        citire_fisier=new BufferedReader(new FileReader(nume_fis));
        echipamente echipament=new echipamente("HP Deskjet 1000",1234,170,"A",Stare.ACHIZITIONAT);
        while (citire_fisier.readLine()!=null){
            echipament.getNume();
            echipament.getNr_inv();
            echipament.getPret();
            echipament.getZona_mag();
            echipament.getStiuatie();

        }


    }
}
