package com.kelompoksatu.hris.utils;

public enum TestScenarios {

    // UPLOAD DATA
    T1("TCC.Tele.006 Upload data kosong"),
    T2("TCC.Tele.007 Simpan data kosong"),
    T3("TCC.Tele.008 Upload data file txt"),
    T4("TCC.Tele.009 Simpan data file txt"),

    //DISTRIBUTE DATA
    T5("TCC.Tele.011 Unchecklist status dan buket data"),
    T6("TCC.Tele.012 Unchecklist status"),
    T7("TCC.Tele.013 Unchecklist buket data"),
    T8("TCC.Tele.014 Kosongkan distribusi dan jumlah agent"),
    T9("TCC.Tele.015 Kosongkan distribusi"),
    T10("TCC.Tele.016 Kosongkan jumlah agent"),

    //EDIT DATA
    T11("TCC.Tele.011 Tidak Masuk halaman edit data"),
    T12("TCC.Tele.012.EditData Tidak menginputkan data dan klik search"),
    T13("TCC.Tele.013.EditData Search input sempurna"),
    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

