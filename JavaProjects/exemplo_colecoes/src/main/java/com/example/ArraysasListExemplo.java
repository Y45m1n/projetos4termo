package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysasListExemplo {
    private String[] nomes = {"Maria","João","Pedro"};
    private List<String> nomesList;
    
    public ArraysasListExemplo(){
        nomesList = new ArrayList<>(Arrays.asList(nomes));
    }

    //add no array
    public void addArray(String nome){
        try{
            nomes[3] = nome;
        } catch (Exception e) {
          System.err.print(e);
        }
    }
}
