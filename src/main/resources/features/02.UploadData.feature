Feature: Upload Data

  Scenario:TCC.Tele.001 Upload data isi
    When TCC.Tele.001 klik data isi
    And TCC.Tele.001 klik menu upload data isi
    And TCC.Tele.001 Tekan tombol choose file
    And TCC.Tele.001 Tekan upload data file excel
    And TCC.Tele.001 klik simpan file isi
  ## And TCC.Tele.001 muncul dialog yakin menyimpan
    And TCC.Tele.001 tekan tombol simpan 1 pada dialog yakin menyimpan
    And TCC.Tele.001 tekan ok pada dialog informasi
    Then TCC.Tele.001 muncul dialog data berhasil disimpan

  Scenario: TCC.Tele.002 Upload data kosong
    When TCC.Tele.002 klik data
    And TCC.Tele.002 klik menu upload data
    And TCC.Tele.002 klik button upload
    Then TCC.Tele.002 Menampilkan popup file tidak dapat dibaca/jumlah data

  Scenario: TCC.Tele.003 Simpan data kosong
    When TCC.Tele.003 klik data untuk simpan
    And TCC.Tele.003 klik menu upload data untuk simpan
    And TCC.Tele.003 klik button simpan
    And TCC.Tele.003 klik button simpan konfirmasi
    Then TCC.Tele.003 Menampilkan popup data kosong

  Scenario: TCC.Tele.004 Upload data file txt
    When TCC.Tele.004 klik data untuk file txt
    And TCC.Tele.004 klik menu upload data untuk file txt
    And TCC.Tele.004 import file txt
    And TCC.Tele.004 klik button upload untuk file txt
    Then TCC.Tele.004 Menampilkan popup file tidak dapat dibaca/jumlah data untuk file txt

  Scenario: TCC.Tele.005 Simpan data file txt
    When TCC.Tele.005 klik data untuk simpan file txt
    And TCC.Tele.005 klik menu upload data untuk simpan file txt
    And TCC.Tele.005 import simpan file txt
    And TCC.Tele.005 klik button simpan file txt
    And TCC.Tele.005 klik button simpan konfirmasi file txt
    Then TCC.Tele.005 Menampilkan popup data kosong file txt