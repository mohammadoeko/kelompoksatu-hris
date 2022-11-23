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
    T23("TCC.Tele.003.Agree.Showpage show entries 50"),
    T24("TCC.Tele.004.Agree.Showpage show entries 100"),
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

    //TASK FOLLOW UP
    T37("TCC.Tele.001.Task.FollowUp Masuk halaman task follow up"),
    T38("TCC.Tele.001.Task.FollowUp.Search Input data klik search"),
    T39("TCC.Tele.002.Task.FollowUp.Search input data berupa angka klik search"),
    T40("TCC.Tele.003.Task.FollowUp.Search input data berupa simbol klik search"),
    T41("TCC.Tele.004.Task.FollowUp.Search tidak input data klik search"),
    T42("TCC.Tele.001.Task.FollowUp.Showpage show enties 10"),
    T43("TCC.Tele.001.Task.FollowUp.Nextpage show page 2"),
    T44("TCC.Tele.002.Task.FollowUp.Nextpage show lastpage"),
    T45("TCC.Tele.003.Task.FollowUp.Nextpage show first page"),
    T46("TCC.Tele.001.Task.FollowUp.Edit input nomor telepon"),
    T47("TCC.Tele.002.Task.FollowUp.Edit input nomor telepon lebih dari 15 karakter"),
    T48("TCC.Tele.003.Task.FollowUp.Edit input nomor telepon dengan huruf"),
    T49("TCC.Tele.004.Task.FollowUp.Edit tidak input nomor telepon"),
    T50("TCC.Tele.005.Task.FollowUp.Edit tidak input data klik submit"),
    T51("TCC.Tele.006.Task.FollowUp.Edit memilih channel"),
    T52("TCC.Tele.007.Task.FollowUp.Edit memilih channel dan status"),
    T53("TCC.Tele.008.Task.FollowUp.Edit memilih channel, status dan status call"),
    T54("TCC.Tele.009.Task.FollowUp.Edit memilih channel, status, status call dan status result"),
    T55("TCC.Tele.010.Task.FollowUp.Edit memilih channel, status, status call, status result dan reason"),
    T56("TCC.Tele.011.Task.FollowUp.Edit pilih phone, edit status activity, klik submit"),

    //TASK DATA ALL
    T57("TCC.Tele.001.Task.All masuk halaman task data all"),
    T58("TCC.Tele.001.Task.All.Search search hanya memilih customer"),
    T59("TCC.Tele.002.Task.All.Search search hanya memilih agent"),
    T60("TCC.Tele.003.Task.All.Search search hanya memilih status"),
    T61("TCC.Tele.004.Task.All.Search search hanya memilih customer dan agent"),
    T62("TCC.Tele.005.Task.All.Search search hanya memilih status dan agent"),
    T63("TCC.Tele.006.Task.All.Search search hanya memilih customer dan status"),
    T64("TCC.Tele.007.Task.All.Search search hanya memilih customer, agent dan status"),
    T65("TCC.Tele.008.Task.All.Search Search dikosongkan"),
    T66("TCC.Tele.001.Task.All.Showpage show entries 10"),
    T67("TCC.Tele.001.Task.All.Showpage show entries 25"),
    T68("TCC.Tele.001.Task.All.Showpage show entries 50"),
    T69("TCC.Tele.001.Task.All.Showpage show entries 100"),
    T70("TCC.Tele.001.Task.All.NextPage show page 2"),
    T71("TCC.Tele.002.Task.All.NextPage show lastpage"),
    T72("TCC.Tele.003.Task.All.NextPage show first page"),
    T73("TCC.Tele.001.Task.All.Edit input nomor telepon"),
    T74("TCC.Tele.002.Task.All.Edit input nomor telepon lebih dari 15 karakter"),
    T75("TCC.Tele.003.Task.All.Edit input nomor telepon dengan huruf"),
    T76("TCC.Tele.004.Task.All.Edit tidak input nomor telepon"),
    T77("TCC.Tele.005.Task.All.Edit tidak input data klik submit"),
    T78("TCC.Tele.006.Task.All.Edit memilih channel"),
    T79("TCC.Tele.007.Task.All.Edit memilih channel dan status"),
    T80("TCC.Tele.008.Task.All.Edit memilih channel, status dan status call"),
    T81("TCC.Tele.009.Task.All.Edit memilih channel, status, status call dan status result"),
    T82("TCC.Tele.010.Task.All.Edit memilih channel, status, status call, status result dan reason"),
    T83("TCC.Tele.011.Task.All.Edit pilih phone, edit status activity, klik submit"),

    //TASK  FINAL
    T84("TCC.Tele.001.Task.Final masuk halaman task final"),
    T85("TCC.Tele.001.Task.Final.Search Input data klik search"),
    T86("TCC.Tele.002.Task.Final.Search input data berupa angka klik search"),
    T87("TCC.Tele.003.Task.Final.Search input data berupa simbol klik search"),
    T88("TCC.Tele.004.Task.Final.Search tidak input data klik search"),
    T89("TCC.Tele.001.Task.Final.Showpage show entries 10"),
    T90("TCC.Tele.002.Task.Final.Showpage show entries 25"),
    T91("TCC.Tele.001.Task.Final.Nextpage show page 2"),
    T92("TCC.Tele.002.Task.Final.Nextpage show lastpage"),
    T93("TCC.Tele.003.Task.Final.Nextpage show first page"),

    //PHONE APPROVE
    T94("TCC.Tele.001.PhoneApprove mengakses user management"),
    T95("TCC.Tele.002.PhoneApprove menuju halaman phone approve"),
    T96("TCC.Tele.003.PhoneApprove tidak menginputkan search agent"),
    T97("TCC.Tele.004.PhoneApprove mencari data user yang terdaftar"),
    T98("TCC.Tele.005.PhoneApprove mencari data user yang belum terdaftar"),
    T99("TCC.Tele.006.PhoneApprove klik approve nomor"),
    T100("TCC.Tele.007.PhoneApprove klik approve nomor yes"),
    T101("TCC.Tele.008.PhoneApprove klik approve nomor no"),
    T102("TCC.Tele.009.PhoneApprove klik reject nomor"),
    T103("TCC.Tele.010.PhoneApprove mereject user yang ditentukan"),
    T104("TCC.Tele.011.PhoneApprove batal reject user yang ditentukan"),
    T105("TCC.Tele.012.PhoneApprove show entries 10"),
    T106("TCC.Tele.013.PhoneApprove show entries 25"),
    T07("TCC.Tele.014.PhoneApprove show entries 50"),
    T108("TCC.Tele.015.PhoneApprove menampilkan grid agent"),
    T109("TCC.Tele.016.PhoneApprove menampilkan grid number phone"),
    T110("TCC.Tele.017.PhoneApprove menampilkan grid tanggal request"),
    T111("TCC.Tele.018.PhoneApprove menampilkan grid nama"),
    T112("TCC.Tele.019.PhoneApprove menampilkan grid status"),
    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

