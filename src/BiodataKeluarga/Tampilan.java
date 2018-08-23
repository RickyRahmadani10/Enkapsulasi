/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiodataKeluarga;

/**
 *
 * @author WINDOWS 10
 */
public class Tampilan {
    public static void main(String[] args){
        Ricky keluarga = new Ricky();
        keluarga.setNamaAyah("Sudarmaji");
        keluarga.setNamaIbu ("Sri Haryati");
        keluarga.setNamaSendiri ("Ricky");
        keluarga.setNamaSaudara ("-");
        keluarga.setAlamat ("Jl. Sembilang 7/10A");
        keluarga.setHobi ("Bermain Game");
        keluarga.setCitacita ("Programmer");
        keluarga.setUmur (16);
        
        System.out.println(" Nama Ayah    = " + keluarga.getNamaAyah());
        System.out.println(" Nama Ibu     = " + keluarga.getNamaIbu());
        System.out.println(" Nama Sendiri = " + keluarga.getNamaSendiri());
        System.out.println(" Nama Saudara = " + keluarga.getNamaSaudara());
        System.out.println(" Alamat       = " + keluarga.getAlamat());
        System.out.println(" Hobi         = " + keluarga.getHobi());
        System.out.println(" Cita-cita    = " + keluarga.getCitacita());
        System.out.println(" Umur         = " + keluarga.getUmur());
    }  
}
