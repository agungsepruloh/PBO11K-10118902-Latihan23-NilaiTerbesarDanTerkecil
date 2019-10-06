package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Name  : Agung Sepruloh
 * Class : IF-11K
 * NIM   : 10118902
 * Deskripsi program: program ini akan menampilkan nilai dari masing-masing siswa dan nilai terbesar serta nilai terkecil
 * dari keseluruhan mahasiswa
 *
 */

public class NilaiTerbesarTerkecil {

    public static void main(String[] args) {
        System.out.println("===== Program Nilai Terbesar dan Nilai Terkecil Mahasiswa =====");
        System.out.print("Masukkan Nama Petugas: ");
        Scanner scanner = new Scanner(System.in);
        String petugas = scanner.next();
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        Scanner scanner1 = new Scanner(System.in);
        int jumlahMahasiswa = scanner1.nextInt();
        int [] nilaiMahasiswa = new int[jumlahMahasiswa];
        int nilaiTerbesar = 0;
        int nilaiTerkecil = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-".concat(String.valueOf(i + 1)).concat(" = "));
            System.out.print(String.format("Masukkan Nilai Mahasiswa ke-%d = "));
            Scanner scanner2 = new Scanner(System.in);
            nilaiMahasiswa[i]  = scanner2.nextInt();
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
                if (i == 0) {
                    nilaiTerkecil = nilaiMahasiswa[i];
                }
            } else if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        System.out.println("\n===== Hasil Nilai Mahasiswa =====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println(String.format("Nilai Mahasiswa ke-%d = %d", i+1, nilaiMahasiswa[i]));
        }
        System.out.println(String.format("\nNilai terbesar adalah %d", nilaiTerbesar));
        System.out.println(String.format("Nilai terkecil adalah %d", nilaiTerkecil));
        System.out.println("\nPetugas: ".concat(petugas));
    }
}