/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baker.brie;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class BakerBrie {

    /**
     * @param args the command line arguments
     */
    static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] results=new int[10];
        for(int i=0;i<10;i++){
            results[i]= doDataSet();
        }
        for (int i=0;i<10;i++){
            System.out.println(results[i]);
        }
        
    }

    private static int doDataSet() {
        int franchise=sc.nextInt();
        int days=sc.nextInt();
        
        int[] soldInADay = new int[days];
        int[] soldFranchise = new int[franchise];
        for(int i=0;i<days;i++) soldInADay[i]=0;
        for(int i=0;i<franchise;i++) soldFranchise[i]=0;
        for (int i=0;i<days;i++){
            for (int j=0;j<franchise;j++){
                int sold=sc.nextInt();
                soldInADay[i]+=sold;
                soldFranchise[j]+=sold;
            }
        }
        
        int dozens=0;
        for (int i=0;i<days;i++){
            if (soldInADay[i]%13==0){
                int n;
                n=soldInADay[i]/13;
                dozens+=n;
            }
        }
        for (int i=0;i<franchise;i++){
            if (soldFranchise[i]%13==0){                
                int n;
                n=soldFranchise[i]/13;
                dozens+=n;
            }
        }
        return dozens;
    }     
}
