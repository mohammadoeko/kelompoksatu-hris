Feature: Agent New

  Scenario: TCC.Tele.001 Masuk halaman task new
    When TCC.Tele.001 Klik Task
    And TCC.Tele.001 Klik New
    Then TCC.Tele.001 Menampilkan halaman Task bucket New

  Scenario: TCC.Tele.002 Mencari data huruf
    When TCC.Tele.002 Input data di kolom search
    And TCC.Tele.002 Klik search
    Then TCC.Tele.002 Menampilkan data sesuai keyword

  Scenario: TCC.Tele.003 Mencari data kosong
    When TCC.Tele.003 Klik New
    And TCC.Tele.003 Klik search
    Then TCC.Tele.003 Menampilkan data sesuai keyword

  Scenario: TCC.Tele.004 Mencari data angka
    When TCC.Tele.004 Klik New
    And TCC.Tele.004 Input data di kolom search
    And TCC.Tele.004 Klik search
    Then TCC.Tele.004 Menampilkan data sesuai keyword

  Scenario: TCC.Tele.005 Mencari data simbol
    When TCC.Tele.005 Klik New
    And TCC.Tele.005 Input data di kolom search
    And TCC.Tele.005 Klik search
    Then TCC.Tele.005 Menampilkan data sesuai keyword

  Scenario: TCC.Tele.006 Mencari data dan memunculkan data halaman berikutnya
    When TCC.Tele.006 Klik New
    And TCC.Tele.006 Input data di kolom search
    And TCC.Tele.006 Klik search
    And TCC.Tele.006 Klik page two
    Then TCC.Tele.006 Menampilkan data sesuai keyword page two

  Scenario: TCC.Tele.007 Menampilkan 25 data per halaman
    When TCC.Tele.007 Klik New
    And TCC.Tele.007 Klik Dropdown Show Page
    Then TCC.Tele.007 Menampilkan 25 data per halaman

  Scenario: TCC.Tele.008 Menampilkan 50 data per halaman
    When TCC.Tele.008 Klik New
    And TCC.Tele.008 Klik Dropdown Show Page
    Then TCC.Tele.008 Menampilkan 50 data per halaman

  Scenario: TCC.Tele.009 Menampilkan 10 data per halaman
    When TCC.Tele.009 Klik New
    And TCC.Tele.009 Klik Dropdown Show Page
    Then TCC.Tele.009 Menampilkan 10 data per halaman

  Scenario: TCC.Tele.010 Menampilkan data urutan sesuai halaman
    When TCC.Tele.010 Klik New
    And TCC.Tele.010 Klik page two
    And TCC.Tele.010 Klik page three
    And TCC.Tele.010 Klik page four
    And TCC.Tele.010 Klik page five
    Then TCC.Tele.010 Menampilkan data urutan sesuai halaman

  Scenario: TCC.Tele.011 Menampilkan data halaman terakhir
    When TCC.Tele.011 Klik New
    And TCC.Tele.011 Klik last page
    Then TCC.Tele.011 Menampilkan data halaman terakhir

  Scenario: TCC.Tele.012 Menampilkan data halaman pertama
    When TCC.Tele.012 Klik New
    And TCC.Tele.012 Klik last page
    And TCC.Tele.012 Klik first page
    Then TCC.Tele.012 Menampilkan data halaman pertama

  Scenario: TCC.Tele.013 Add nomor telepon
    When TCC.Tele.013 Klik salah satu data
    And TCC.Tele.013 Klik add phone
    And TCC.Tele.013 Input nomor telepon
    And TCC.Tele.013 Klik save
    And TCC.Tele.013 Klik Ok
    Then TCC.Tele.013 Nomor telepon berhasil tersimpan

  Scenario: TCC.Tele.014 Add nomor telepon lebih dari lima belas karakter
    When TCC.Tele.014 Klik add phone
    And TCC.Tele.014 Input nomor telepon lebih dari lima belas karakter
    And TCC.Tele.014 Klik save
    And TCC.Tele.014 Klik Ok
    Then TCC.Tele.014 Nomor telepon tersimpan

  Scenario: TCC.Tele.015 Tidak input nomor telepon
    When TCC.Tele.015 Klik add phone
    And TCC.Tele.015 Klik save
    And TCC.Tele.015 Klik Ok
    Then TCC.Tele.015 Data berhasil tersimpan

  Scenario: TCC.Tele.016 Tidak input data edit activity
    When TCC.Tele.016 Klik submit
    And TCC.Tele.016 Klik close edit
    Then TCC.Tele.016 Data tidak berhasil tersimpan

  Scenario: TCC.Tele.017 Hanya edit activity channel
    When TCC.Tele.017 Pilih channel
    And TCC.Tele.017 Klik submit
    And TCC.Tele.017 Klik close edit
    Then TCC.Tele.017 Data tidak berhasil tersimpan

  Scenario: TCC.Tele.018 Hanya edit activity channel dan status
    When TCC.Tele.018 Pilih channel
    And TCC.Tele.018 Pilih status
    And TCC.Tele.018 Klik submit
    And TCC.Tele.018 Klik close edit
    Then TCC.Tele.018 Data tidak berhasil tersimpan

  Scenario: TCC.Tele.019 Hanya edit activity channel dan status dan status call
    When TCC.Tele.019 Pilih channel
    And TCC.Tele.019 Pilih status
    And TCC.Tele.019 Pilih status call
    And TCC.Tele.019 Klik submit
    And TCC.Tele.019 Klik close edit
    Then TCC.Tele.019 Data tidak berhasil tersimpan

  Scenario: TCC.Tele.020 Edit activity channel dan status dan status call dan status result
    When TCC.Tele.020 Pilih channel
    And TCC.Tele.020 Pilih status
    And TCC.Tele.020 Pilih status call
    And TCC.Tele.020 Pilih status result
    And TCC.Tele.020 Klik submit
    And TCC.Tele.020 Klik Yes
    Then TCC.Tele.020 Data berhasil tersimpan

  Scenario: TCC.Tele.021 Edit activity channel dan status dan status call dan status result dan reason
    When TCC.Tele.021 Klik salah satu data
    And TCC.Tele.021 Pilih channel
    And TCC.Tele.021 Pilih status
    And TCC.Tele.021 Pilih status call
    And TCC.Tele.021 Pilih status result
    And TCC.Tele.021 Pilih reason
    And TCC.Tele.021 Klik submit
    And TCC.Tele.021 Klik Yes
    Then TCC.Tele.021 Data berhasil tersimpan

