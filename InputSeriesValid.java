/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input.series.valid;

import java.util.Scanner;

/**
 *
 * @author Drak Kinght
 */
public class InputSeriesValid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your 1st input:");
        int a = sc.nextInt();
        System.out.print("enter your 2nd input:");
        int b = sc.nextInt();
        System.out.print("enter your 3rd input:");
        int c = sc.nextInt();
        if(a==1){
            if(b==11){
                if(c==4){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==5){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==6){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else{
                    System.out.println("your input is invalid:"+a+','+b+','+c);
                    }
            }else if(b==22){
                if(c==4){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==5){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==6){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else{
                    System.out.println("your input is invalid:"+a+','+b+','+c);
                    }
            }else{
                System.out.println("your input is invalid:"+a+','+b+','+c);
                }
        }else if(a==2){
            if(b==11){
                if(c==4){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==5){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==6){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else{
                    System.out.println("your input is invalid:"+a+','+b+','+c);
                    }
            }else if(b==22){
                if(c==4){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==5){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==6){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else{
                    System.out.println("your input is invalid:"+a+','+b+','+c);
                    }
            }else{
                System.out.println("your input is invalid:"+a+','+b+','+c);
                }
        }else if(a==3){
            if(b==11){
                if(c==4){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==5){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==6){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else{
                    System.out.println("your input is invalid:"+a+','+b+','+c);
                    }
            }else if(b==22){
                if(c==4){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==5){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else if(c==6){
                    System.out.println("your input is valid:"+a+','+b+','+c);
                }else{
                    System.out.println("your input is invalid:"+a+','+b+','+c);
                }
            }else{
                System.out.println("your input is invalid:"+a+','+b+','+c);
                }
        }else{
            System.out.println("your input is invalid:"+a+','+b+','+c);
        }
    }
    
}
