/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_juan_lópez;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author jjlm1
 */
public class Lab8P1_Juan_López {
   //FILA 3 PUESTO 8
    /**
     * @param args the command line arguments
     */
    static Scanner leer=new Scanner(System.in);
    static Random rand= new Random ();
    
    
    public static void main(String[] args) {
        Game game=new Game();
        System.out.println("********GAME OF LIFE********");
        System.out.println("");
        int[][] tablero =new int [10][10];
        System.out.println("Ingrese numero de rondas:");
        int rondas=leer.nextInt();
        tablero=llenar(tablero);
        ArrayList <String> lista=new ArrayList <>();
        lista=coordenadas(tablero);
        System.out.println(lista);
        impri(tablero);
        System.out.println("");
        game.setactual(tablero);
        game.jugar(rondas);
        
        
    }


public static int[][] llenar(int[][] tablero){
    for (int i=0;i<tablero.length;i++){
        for (int j=0;j<tablero[i].length;j++){
            if(i==0||j==0||j==tablero.length-1||i==tablero.length-1){
                tablero [i][j]=0;
            }else{
                tablero [i][j]=rand.nextInt(2);
            }
        }
    }
    return tablero;
}    

public static void impri (int [][]tablero){
    for (int i=0;i<tablero.length;i++){
        for (int j=0;j<tablero[i].length;j++){
            System.out.print("["+tablero[i][j]+"] ");
            
        }
        System.out.println("");
    }
}

public static ArrayList coordenadas(int[][] tablero){
    ArrayList <String> lista=new ArrayList <>();
    for (int i=0;i<tablero.length;i++){
        for (int j=0;j<tablero[i].length;j++){
            if (tablero[i][j]==1){
                String cad=String.valueOf(i);
                String cad1=String.valueOf(j);
                lista.add(cad+":"+cad1);
                
            }
        }
    }
    return lista;
}
}
//}
//else{
//                if(genactual[i][j]==1){
//                    int control=0;
//                    if (i>=1&&i<=genactual.length-1){
//                        for (int p=0;p<3;p++){
//                            for (int q=0;q<3;q++){
//                                if (p==1&&q==1){
//                                    
//                                }else{
//                                   if (genactual[i-p][j-q]==1){
//                                       control++;
//                                   }
//                                   }
//                            }
//                        }
//                                   if (control==2){
//                                    genactual[i][j]=1;
//                                }else{
//                                       genactual[i][j]=0;
//                                   }
//                                
//                        
//                    }
//                }else if (genactual[i][j]==0){
//                    int control=0;
//                    if (i>=2&&i<=genactual.length-2&&j>=2&&j<=genactual.length-2){
//                        for (int p=0;p<3;p++){
//                            for (int q=0;q<3;q++){
//                                if (p==1&&q==1){
//                                    
//                                }else{
//                                   if (genactual[i-p][j-q]==1){
//                                       control++;
//                                   }
//                                   }
//                        }
//                                   if (control==3){
//                                    genactual[i][j]=1;
//                                }
//                                }
//                            
//                    }else if(i==2&&i==genactual.length-1&&j==2&&j==genactual.length-1){
//                        for (int p=0;p<3;p++){
//                            for (int q=0;q<3;q++){
//                                if (p==1&&q==1){
//                                    
//                                }else{
//                                   if (genactual[i-p+1][j-q+1]==1){
//                                       control++;
//                                   }
//                                }
//                                }
//                    }
//                                
//                                   if (control==3){
//                                    genactual[i][j]=1;
//                                }
//                                }
//                            
//                        
//                }
//            }
