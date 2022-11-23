package com.kelompoksatu.hris.utils;

public enum TestScenarios {

    //Login Agent
    T1 ("TCC.Tele.001 Input username dan password invalid"),
    T2 ("TCC.Tele.002 Input username valid dan password invalid"),
    T3 ("TCC.Tele.003 Input username invalid dan password valid"),
    T5 ("TCC.Tele.005 Input username dan password valid"),
    T6 ("TCC.Tele.006 Logout"),
    T7 ("TCC.Tele.007 Input username huruf kapital dan password valid"),

    //Agent New
    T8 ("Input username dan password valid"),
    T9 ("TCC.Tele.001 Masuk halaman task new"),
    T10 ("TCC.Tele.002 Mencari data huruf"),
    T11 ("TCC.Tele.003 Mencari data kosong"),
    T12 ("TCC.Tele.004 Mencari data angka"),
    T13 ("TCC.Tele.005 Mencari data simbol"),
    T14 ("Mencari data dan memunculkan data halaman berikutnya"),
    T15 ("TCC.Tele.007 Menampilkan 10 data per halaman"),
    T16 ("TCC.Tele.008 Menampilkan 50 data per halaman"),
    T17 ("TCC.Tele.009 Menampilkan 10 data per halaman"),
    T18 ("TCC.Tele.010 Menampilkan data urutan sesuai halaman"),
    T19 ("TCC.Tele.011 Menampilkan data halaman terakhir"),
    T20 ("TCC.Tele.012 Menampilkan data halaman pertama"),
    T21 ("TCC.Tele.013 Add nomor telepon"),
    T22 ("TCC.Tele.014 Add nomor telepon lebih dari lima belas karakter"),
    T23 ("TCC.Tele.015 Tidak input nomor telepon"),
    T24 ("TCC.Tele.016 Tidak input data edit activity"),
    T25 ("TCC.Tele.017 Hanya edit activity channel"),
    T26 ("TCC.Tele.018 Hanya edit activity channel dan status"),
    T27 ("TCC.Tele.019 Hanya edit activity channel dan status dan status call"),
    T28 ("TCC.Tele.020 Edit activity channel dan status dan status call dan status result"),
    T29 ("TCC.Tele.021 Edit activity channel dan status dan status call dan status result dan reason"),

    //Agent New
    T30 ("TCC.Tele.022 Masuk halaman task agree"),
    T31 ("TCC.Tele.023 Mencari data huruf"),
    T32 ("TCC.Tele.024 Mencari data kosong"),
    T33 ("TCC.Tele.025 Mencari data angka"),
    T34 ("TCC.Tele.026 Mencari data simbol"),
    T35 ("TCC.Tele.027 Mencari data dan memunculkan data halaman berikutnya"),
    T36 ("TCC.Tele.028 Menampilkan 25 data per halaman"),
    T37 ("TCC.Tele.029 Menampilkan 10 data per halaman"),
    T38 ("TCC.Tele.030 Menampilkan data urutan sesuai halaman"),
    T39 ("TCC.Tele.031 Menampilkan data halaman terakhir"),
    T40 ("TCC.Tele.032 Menampilkan data halaman pertama"),
    T41 ("TCC.Tele.033 Link berhasil terupdate"),
    T42 ("TCC.Tele.034 Update link kosong");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

