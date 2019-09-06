/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_pba;
import java.util.*;
/**
 *
 * @author PC MASTER
 */
public class SeleccionArgentina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jugadores j1=new Jugadores("Nicolás Otamendi","D",14,53,1.8);
        Jugadores j2=new Jugadores("Gabriel Mercado","D",3,19,1.9);
        Jugadores j3=new Jugadores("Federico Fazio","D",1,8,0.7);
        Jugadores j4=new Jugadores("Marcos Acuña","D",0,19,1.2);
        Jugadores j5=new Jugadores("Nicolás Tagliafico","D",0,3,1.6);
        Jugadores j6=new Jugadores("Marcos Rojo","D",2,53,1.9);
        Jugadores j7=new Jugadores("Cristian Ansaldi","D",1,5,0.5);
        Jugadores j8=new Jugadores("Javier Mascherano","V",3,145,1.6);
        Jugadores j9=new Jugadores("Ángel Di María","V",19,93,2.1);
        Jugadores j10=new Jugadores("Éver Bangega","V",6,61,1.7);
        Jugadores j11=new Jugadores("Lucas Biglia","V",1,57,0.4);
        Jugadores j12=new Jugadores("Eduardo Salvio","V",0,8,0.8);
        Jugadores j13=new Jugadores("Giovani Lo Celso","V",0,4,0.9);
        Jugadores j14=new Jugadores("Maximiliano Meza","V",0,1,1.2);
        Jugadores j15=new Jugadores("Enzo Pérez","V",0,4,1.9);
    
        Jugadores j21=new Jugadores("Wilfredo Caballero","A",5,2,2.0);
        Jugadores j22=new Jugadores("Franco Armani","A",0,0,2.4);
        Jugadores j23=new Jugadores("Sergio Romero","A",67,94,2.6);
        
        List<Jugadores> arq=new ArrayList<Jugadores>();
        arq.add(j21);
        arq.add(j22);
        arq.add(j23);        
        
        List<Jugadores> jugadoresArg=new ArrayList<Jugadores>();
        jugadoresArg.add(j1);
        jugadoresArg.add(j2);
        jugadoresArg.add(j3);
        jugadoresArg.add(j4);
        jugadoresArg.add(j5);
        jugadoresArg.add(j6);
        jugadoresArg.add(j7);
        jugadoresArg.add(j8);
        jugadoresArg.add(j9);
        jugadoresArg.add(j10);
        jugadoresArg.add(j11);
        jugadoresArg.add(j12);
        jugadoresArg.add(j13);
        jugadoresArg.add(j14);
        jugadoresArg.add(j15);
        
        //for(Jugadores jugadores: jugadoresArg){
          //  System.out.println();
        //}
        Jugadores j16=new Jugadores("Lionel Messi","DL",61,126,2.5);
        Jugadores j17=new Jugadores("Sergio Aguero","DL",36,84,1.4);
        Jugadores j18=new Jugadores("Gonzalo Higuaín","DL",32,71,2.1);
        Jugadores j19=new Jugadores("Paulo Dybala","DL",0,10,0.7);
        Jugadores j20=new Jugadores("Cristian Pavón","DL",0,4,0.3);
        
        jugadoresArg.add(j16);
        jugadoresArg.add(j17);
        jugadoresArg.add(j18);
        jugadoresArg.add(j19);
        jugadoresArg.add(j20);
        
       // for(Jugadores jugadores: jugadoresArg){
         //   System.out.println(jugadores.getNombre());
        //} 
        
        Set<Jugadores> titulares=new HashSet<Jugadores>();
        Set<Jugadores> suplentes=new HashSet<Jugadores>();
        for(Jugadores tit: jugadoresArg){
        if(tit.getPromedio()>1.5){
            titulares.addAll(jugadoresArg);
            System.out.println(tit.getNombre());
        }
        else {
            suplentes.addAll(arq);
            
        }
        }
        for (Jugadores arque: arq){
            if(arque.getPromedio()>2.5){
                titulares.addAll(arq);
                System.out.println(arque.getNombre());
            }
            else{
                suplentes.addAll(arq);
            }
        }
        boolean element = titulares.contains(j18);
        System.out.println("Esta Gonzalo Higuaín en la lista de titulares? "+element);
        
        titulares.remove(j23);
        System.out.println("El número de jugadores tras eliminar a Romero es "+titulares.size());   
        
    }
    
}
