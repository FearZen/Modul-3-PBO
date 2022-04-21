/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul_3;

/**
 *
 * @author Fernanda Wawang Azraqi
 */
public class Modul3main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aves unggas=new Aves();
        Ayam goreng=new Ayam();
        Elang rebus=new Elang();
        Bebek bakar=new Bebek();
        System.out.println("Ayam Pemakan "+goreng.makan1);
        unggas.kembang1();
        System.out.println("Elang Pemakan "+rebus.makan);
        unggas.kembang();
        System.out.println("Bebek Pemakan "+bakar.makan1);
        unggas.kembang1();
        goreng.skill();
        rebus.skill();
        bakar.skill();
                
    }
    
}
