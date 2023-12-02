/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_juan_lópez;

import java.util.ArrayList;


/**
 *
 * @author jjlm1
 */
public class Game {
    
     int[][] genactual=new int[10][10];
     int[][] gensig=new int[10][10];
     int [][] vacio=new int [10][10];
    String coordenadas;
     int rondas;
     ArrayList <String> lista=new ArrayList <>();

public  Game (){
}

public void setactual(int[][] genactual){
    this.genactual=genactual;
}
public int[][] getactual(){
    return genactual;
}
public void setsig(int[][] gensig){
    this.gensig=gensig;
}
public int[][] getsig(){
    return gensig;
}
public void setrondas(int rondas){
    this.rondas=rondas;
}
public int getrondas (){
    return rondas;
}
public ArrayList <String> getarray(){
    return lista;
}
public void setarray(ArrayList <String> lista){
    this.lista=lista;
}
public int[][] getvacio(){
    return vacio;
}
public void setvacio(int[][]vacio){
    this.vacio=vacio;
}


public void jugar (int rondas){
    for (int i=0;i<rondas;i++){
    nextgen();
    
        imprimir(lista);
        
        System.out.println("");
    }
}

public void nextgen(){
    for(int i=0;i<genactual.length;i++){
        for (int j=0;j<genactual[i].length;j++){
            int control=0;
            if(i==0||j==0||j==genactual.length-1||i==genactual.length-1){
                
            }else {
                if (genactual[i][j]==1){
                    
                if(genactual[i-1][j-1]==1){
                    control++;
                }
                if(genactual[i-1][j]==1){
                    control++;
                }if(genactual[i-1][j+1]==1){
                    control++;
                }if(genactual[i][j-1]==1){
                    control++;
                }if(genactual[i][j+1]==1){
                    control++;
                }if(genactual[i+1][j-1]==1){
                    control++;
                }if(genactual[i+1][j]==1){
                    control++;
                }if(genactual[i+1][j+1]==1){
                    control++;
                }
                    
                }
            
            if(genactual[i][j]==0&&control==3){
                    gensig[i][j]=1;
                } 
            if (genactual[i][j]==1&&control==2){
                    gensig[i][j]=1;
                }else{
            gensig[i][j]=0;
            }
                    
            }
        
        }
        
    }
    setactual(gensig);
    lista=coordenadas();
    setsig(vacio);
    
    
    
}

public void imprimir(ArrayList<String> lista){
    
    for (int i=0;i<lista.size();i++){
        String coord=lista.get(i);
        char x= coord.charAt(0);
        char y= coord.charAt(2);
        System.out.print("["+x+":"+y+"]");
        
    }
    impri();
    System.out.println("");
    
}
public  ArrayList coordenadas(){
    ArrayList <String> lista=new ArrayList <>();
    for (int i=0;i<genactual.length;i++){
        for (int j=0;j<genactual[i].length;j++){
            if (genactual[i][j]==1){
                String cad=String.valueOf(i);
                String cad1=String.valueOf(j);
                lista.add(cad+":"+cad1);
                
            }
        }
    }
    return lista;
}

public void impri (){
    System.out.println("");
    for (int i=0;i<genactual.length;i++){
        for (int j=0;j<genactual[i].length;j++){
            System.out.print("["+genactual[i][j]+"] ");
            
        }
        System.out.println("");
    }

}

}
