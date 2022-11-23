package com.kelompoksatu.hris.utils;

public enum TestScenarios {

    // UPLOAD DATA

   // T1("TCC.Tele.006 Upload data kosong"),
    //T2("TCC.Tele.007 Simpan data kosong"),
   // T3("TCC.Tele.008 Upload data file txt"),
   // T4("TCC.Tele.009 Simpan data file txt"),

    T1("TCC.Tele.Login.001 User invalid login") ,
    T2("TCC.Tele.Login.004 User invalid login username kosong"),
    T3("TCC.Tele.Login.005 User invalid login password kosong"),
    T4("TCC.Tele.Login.006 User invalid login username invalid"),
    T5("TCC.Tele.Login.007 User invalid login password invalid"),
    T6("TCC.Tele.Login.003 User invalid login username password kosong"),
    T7("TCC.Tele.Login.007 User valid login"),

    T8("TCC.Tele.001 Upload data isi"),
    //DISTRIBUTE DATA
   T9("TCC.Tele.Distribusi.001 Add Distribusi Data"),
   T10("TCC.Tele.Distribusi.002 view distribusi data"),
   T11("TCC.Tele.Distribusi.003 page 2"),
   T12("TCC.Tele.Distribusi.004 last page"),
   T13("TCC.Tele.Distribusi.005 first page"),
   T14("TCC.Tele.Distribusi.006 page 25"),
   T15 ("TCC.Tele.Distribusi.007 page 50"),
   T16("TCC.Tele.Distribusi.008 page 100"),
   T17("TCC.Tele.Distribusi.009 page 500"),
   T18("TCC.Tele.Distribusi.010 page 10"),
   T19("TCC.EDIT DATA SEARCH.004 input telero"),
   T20("TCC.EDIT DATA SEARCH.005 page 2"),
   T21("TCC.EDIT DATA SEARCH.006 last page"),
   T22("TCC.EDIT DATA SEARCH.007 first page"),
   T23("TCC.EDIT DATA SEARCH.008 page 25"),
   T24("TCC.EDIT DATA SEARCH.009 page 50"),
   T25("TCC.EDIT DATA SEARCH.010 page 100"),
   T26("TCC.EDIT DATA SEARCH.010 page 500"),
   T27("TCC.EDIT DATA SEARCH.010 page 10"),
   T28("TCC.EDIT DATA SEARCH.013 edit data"),
   T29("TCC.Tele.Login.008 User logout"), ;
    //T6("TCC.Tele.012 Unchecklist status"),
   // T7("TCC.Tele.013 Unchecklist buket data"),
   // T8("TCC.Tele.014 Kosongkan distribusi dan jumlah agent"),
   // T9("TCC.Tele.015 Kosongkan distribusi"),
   // T10("TCC.Tele.016 Kosongkan jumlah agent"),

    //EDIT DATA
   // T11("TCC.Tele.011 Tidak Masuk halaman edit data"),
   // T12("TCC.Tele.012.EditData Tidak menginputkan data dan klik search"),
   // T13("TCC.Tele.013.EditData Search input sempurna"),
    //; */

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

