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

    //REPORT AGREE
    T14("TCC.Tele.001 Masuk halaman report agree"),
    T15("TCC.Tele.001.Agree.View Memasukkan start date dan end date"),
    T16("TCC.Tele.002.Agree.View Tidak memasukkan tanggal awal dan akhir"),
    T17("TCC.Tele.003.Agree.View Memasukkan start date"),
    T18("TCC.Tele.004.Agree.View Memasukkan end date"),
    T19("TCC.Tele.001.Agree.Export Memasukkan start date dan end date"),
    T20("TCC.Tele.002.Agree.Export Tidak memasukkan start date dan end date"),
    T21("TCC.Tele.001.Agree.Showpage show entries 10"),
    T22("TCC.Tele.002.Agree.Showpage show entries 25"),
    T23("TCC.Tele.002.Agree.Showpage show entries 50"),
    T24("TCC.Tele.002.Agree.Showpage show entries 25"),
    T25("TCC.Tele.001.Agree.Nextpage show page 2"),
    T26("TCC.Tele.002.Agree.Nextpage show last page"),
    T27("TCC.Tele.003.Agree.Nextpage show first page"),

    //REPORT ACTIVITY
    T28("TCC.Tele.001.Report.Activity Masuk halaman report activity"),
    T29("TCC.Tele.001.Activity.View Memilih agent dan tanggal"),
    T30("TCC.Tele.002.Activity.View Memilih tanggal dan tidak memilih agent"),
    T31("TCC.Tele.001.Activity.Export Export data setelah memilih agent dan memasukkan tanggal awal dan akhir"),
    T32("TCC.Tele.002.Activity.Export Export data tanpa memilih agent dan memasukkan tanggal awal dan akhir"),
    T33("TCC.Tele.001.Activity.Showpage Show entries 10"),
    T34("TCC.Tele.001.Activity.Nextpage Show page 2"),
    T35("TCC.Tele.002.Activity.Nextpage Show lastpage"),
    T36("TCC.Tele.003.Activity.Nextpage Show firstpage"),

    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

