Feature: Edit Data
  Scenario: TCC.Tele.001.EditData Tidak Masuk halaman edit data
    When TCC.Tele.001.EditData klik data
    And TCC.Tele.001.EditData klik distribute data
    Then TCC.Tele.001.EditData Menampilkan halaman distribusi

  Scenario: TCC.Tele.002.EditData Tidak menginputkan data dan klik search
    When TCC.Tele.002.EditData klik data
    And TCC.Tele.002.EditData klik edit data
    And TCC.Tele.002.EditData input search data kosong
    And TCC.Tele.002.EditData klik search
    Then TCC.Tele.002.EditData Menampilkan semua data

  Scenario: TCC.Tele.003.EditData Search input sempurna
    When TCC.Tele.003.EditData klik data
    And TCC.Tele.003.EditData klik edit data
    And TCC.Tele.003.EditData input search sempurna
    And TCC.Tele.003.EditData klik search
    Then TCC.Tele.003.EditData Menampilkan data kosong

  Scenario:TCC.EDIT DATA SEARCH.004 input telero
    When TCC.EDIT DATA SEARCH.004 klik data
    And TCC.EDIT DATA SEARCH.004 klik edit data
    And TCC.EDIT DATA SEARCH.004 input search telero
    And TCC.EDIT DATA SEARCH.004 klik search
    Then TCC.EDIT DATA SEARCH.004 Menampilkan data telero

  Scenario:TCC.EDIT DATA SEARCH.005 page 2
    When TCC.EDIT DATA SEARCH.005 klik data
    And TCC.EDIT DATA SEARCH.005 klik edit data
    And TCC.EDIT DATA SEARCH.005 input search telero
    And TCC.EDIT DATA SEARCH.005 klik search
    And TCC.EDIT DATA SEARCH.005 Menampilkan data telero
    And TCC.EDIT DATA SEARCH.005 klik page 2
    Then TCC.EDIT DATA SEARCH.005 menampilkan halaman ke 2


  Scenario:TCC.EDIT DATA SEARCH.006 last page
    When TCC.EDIT DATA SEARCH.006 klik data
    And TCC.EDIT DATA SEARCH.006 klik edit data
    And TCC.EDIT DATA SEARCH.006 input search telero
    And TCC.EDIT DATA SEARCH.006 klik search
    Then TCC.EDIT DATA SEARCH.006 Menampilkan data telero
    And TCC.EDIT DATA SEARCH.006 klik last page
    Then TCC.EDIT DATA SEARCH.006 menampilkan halaman last page

  Scenario:TCC.EDIT DATA SEARCH.007 first page
    When TCC.EDIT DATA SEARCH.007 klik data
    And TCC.EDIT DATA SEARCH.007 klik edit data
    And TCC.EDIT DATA SEARCH.007 input search telero
    And TCC.EDIT DATA SEARCH.007 klik search
    Then TCC.EDIT DATA SEARCH.007 Menampilkan data telero
    And TCC.EDIT DATA SEARCH.007 klik last page
    And TCC.EDIT DATA SEARCH.007 klik first page
    Then TCC.EDIT DATA SEARCH.007 menampilkan halaman first page

  Scenario:TCC.EDIT DATA SEARCH.008 page 25
    When TCC.EDIT DATA SEARCH.008 klik data
    And TCC.EDIT DATA SEARCH.008 klik edit data
    And TCC.EDIT DATA SEARCH.008 input search telero
    And TCC.EDIT DATA SEARCH.008 klik search
    Then TCC.EDIT DATA SEARCH.008 Menampilkan data telero
    And TCC.EDIT DATA SEARCH.008 klik page 25
    Then TCC.EDIT DATA SEARCH.008 menampilkan data entries 25

  Scenario:TCC.EDIT DATA SEARCH.009 page 50
    When TCC.EDIT DATA SEARCH.009 klik data
    And TCC.EDIT DATA SEARCH.009 klik edit data
    And TCC.EDIT DATA SEARCH.009 input search telero
    And TCC.EDIT DATA SEARCH.009 klik search
    Then TCC.EDIT DATA SEARCH.009 Menampilkan data telero
    And TCC.EDIT DATA SEARCH.009 klik page 50
    Then TCC.EDIT DATA SEARCH.009 menampilkan data entries 50


  Scenario:TCC.EDIT DATA SEARCH.010 page 100
    When TCC.EDIT DATA SEARCH.010 klik data
    And TCC.EDIT DATA SEARCH.010 klik edit data
    And TCC.EDIT DATA SEARCH.010 input search telero
    And TCC.EDIT DATA SEARCH.010 klik search
    Then TCC.EDIT DATA SEARCH.010 Menampilkan data telero
    And TCC.EDIT DATA SEARCH.010 klik page 100
    Then TCC.EDIT DATA SEARCH.010 menampilkan data entries 100


  Scenario:TCC.EDIT DATA SEARCH.011 page 500
    When TCC.EDIT DATA SEARCH.011 klik data
    And TCC.EDIT DATA SEARCH.011 klik edit data
    And TCC.EDIT DATA SEARCH.011 input search telero
    And TCC.EDIT DATA SEARCH.011 klik search
    Then TCC.EDIT DATA SEARCH.011 Menampilkan data telero
    And TCC.EDIT DATA SEARCH.011 klik page 500
    Then TCC.EDIT DATA SEARCH.011 menampilkan data entries 500

  Scenario:TCC.EDIT DATA SEARCH.012 page 10
    When TCC.EDIT DATA SEARCH.012 klik data
    And TCC.EDIT DATA SEARCH.012 klik edit data
    And TCC.EDIT DATA SEARCH.012 input search telero
    And TCC.EDIT DATA SEARCH.012 klik search
    Then TCC.EDIT DATA SEARCH.012 Menampilkan data telero
    And TCC.EDIT DATA SEARCH.012 klik page 10
    Then TCC.EDIT DATA SEARCH.012 Showpage menampilkan data sampai 10

  Scenario:TCC.EDIT DATA SEARCH.013 edit data
    When TCC.EDIT DATA SEARCH.012 klik data
    And TCC.EDIT DATA SEARCH.012 klik edit data
    And TCC.EDIT DATA SEARCH.013 Klik nama perusahaan yang ingin di ubah
    And TCC.EDIT DATA SEARCH.013 pilih agent yang ingin di ubah
    And TCC.EDIT DATA SEARCH.013 klik update edit data
    And TCC.EDIT DATA SEARCH.013 muncul dialog informasi berhasil update data
    And TCC.EDIT DATA SEARCH.013 klik OK update data
    Then And TCC.EDIT DATA SEARCH.013 data agent berubah
