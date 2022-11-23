Feature: Upload Data
  ##Scenario: TCC.Tele.006 Upload data kosong
   ## //When TCC.Tele.006 klik data
    ##//And TCC.Tele.006 klik upload data
    ##//And TCC.Tele.006 klik button upload
    ##//Then TCC.Tele.006 Menampilkan popup file tidak dapat dibaca/jumlah data

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

