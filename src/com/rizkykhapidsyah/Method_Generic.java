package com.rizkykhapidsyah;

/* Created by Rizky Khapidsyah */

public class Method_Generic {
    public static <E> void TampilkanData(E[] Daftar) {
        for (int i = 0; i < Daftar.length; i++) {
            System.out.println(Daftar[i]);
        }
    }
}
