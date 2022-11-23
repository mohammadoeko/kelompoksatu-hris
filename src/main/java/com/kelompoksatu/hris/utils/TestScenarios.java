package com.kelompoksatu.hris.utils;

import java.awt.geom.Point2D;

public enum TestScenarios {
    T1("TCC.USERMANAGEMENT.001 Tekan button User Management"),
    T2("TCC.USERMANAGEMENT.002 Tekan button User"),
    T3("TCC.USERMANAGEMENT.003 Tidak ada data dan klik search"),
    T4("TCC.USERMANAGEMENT.004 Search Data Terdaftar"),
    T5("TCC.USERMANAGEMENT.006 Menampilkan form add"),
    T6("TCC.USERMANAGEMENT.007 menyimpan tanpa data agent"),
    T7("TCC.USERMANAGEMENT.008 Mengisi data tanpa memilih privileges dikolom"),
    T8("TCC.USERMANAGEMENT.009 Mengisi data memilih privileges agent dikolom"),
    T9("TCC.USERMANAGEMENT.010 Mengisi data memilih privileges admin dikolom"),
    T10("TCC.USERMANAGEMENT.011 Mengisi data tanpa memilih Supervisor dikolom"),
    T11("TCC.USERMANAGEMENT.012 Mengisi data memilih Supervisor dikolom"),
    T12("TCC.USERMANAGEMENT.013 Mengisi full name dengan angka"),
    T13("TCC.USERMANAGEMENT.014 Menekan button Reset Password"),
    T14("TCC.USERMANAGEMENT.015 Memilih data yang akan direset");

    private String testName;

    TestScenarios(String value) {

        testName = value;
    }

    public String getTestName() {

        return testName;
    }

}

