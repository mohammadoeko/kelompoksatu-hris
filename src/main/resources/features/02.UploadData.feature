Feature: Upload Data
  Scenario: TCC.Tele.006 Upload data kosong
    When TCC.Tele.006 klik data
    And TCC.Tele.006 klik upload data
    And TCC.Tele.006 klik button upload
    Then TCC.Tele.006 Menampilkan popup file tidak dapat dibaca/jumlah data

  Scenario: TCC.Tele.007 Simpan data kosong
    When TCC.Tele.007 klik data untuk simpan
    And TCC.Tele.007 klik upload data untuk simpan
    And TCC.Tele.007 klik button simpan
    And TCC.Tele.007 klik button simpan konfirmasi
    Then TCC.Tele.007 Menampilkan popup data kosong

  Scenario: TCC.Tele.008 Upload data file txt
    When TCC.Tele.008 klik data untuk file txt
    And TCC.Tele.008 klik upload data untuk file txt
    And TCC.Tele.008 import file txt
    And TCC.Tele.008 klik button upload untuk file txt
    Then TCC.Tele.008 Menampilkan popup file tidak dapat dibaca/jumlah data untuk file txt

  Scenario: TCC.Tele.009 Simpan data file txt
    When TCC.Tele.009 klik data untuk simpan file txt
    And TCC.Tele.009 klik upload data untuk simpan file txt
    And TCC.Tele.009 import simpan file txt
    And TCC.Tele.009 klik button simpan file txt
    And TCC.Tele.009 klik button simpan konfirmasi file txt
    Then TCC.Tele.009 Menampilkan popup data kosong file txt