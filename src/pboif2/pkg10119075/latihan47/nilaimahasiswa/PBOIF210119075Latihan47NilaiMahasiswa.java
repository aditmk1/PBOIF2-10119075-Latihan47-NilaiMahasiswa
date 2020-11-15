/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan47.nilaimahasiswa;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan Nilai
 */
 
public class PBOIF210119075Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilai = new Nilai(75.0, 45.0, 34.0);
        
        nilai.tampilNilai(nilai.getQuiz(), 
                     nilai.getUts(), 
                     nilai.getUas(), 
                     nilai.getNilaiAkhir(nilai.getQuiz(), nilai.getUts(),nilai.getUas()), nilai.getIndex(nilai.getNilaiAkhir(nilai.getQuiz(), nilai.getUts(),nilai.getUas())));
    }
    
}
