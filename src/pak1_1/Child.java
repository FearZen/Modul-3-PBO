/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pak1_1;

import pak_1.Parents;


/**
 *
 * @author Fernanda Wawang Azraqi
 */
public class Child extends Parents{
    public Child(String Mahasiswa){
        super(Mahasiswa);
    }
    public Child(String Mahasiswa, int semester){
        super(Mahasiswa);
        this.semester=semester;
    }
    public void show(){
        System.out.println("Nama Mahasiswa "+super.Mahasiswa);
        System.out.println("Semester : "+super.semester);
    }
}
