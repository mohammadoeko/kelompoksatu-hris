Feature: Report Agree
  Scenario: TCC.Tele.001 Masuk halaman report agree
    When TCC.Tele.001 klik report
    And TCC.Tele.001 klik report agree
    Then TCC.Tele.001 menampilkan halaman report agree

  Scenario: TCC.Tele.001.Agree.View Memasukkan start date dan end date
    When TCC.Tele.001.Agree.View klik report
    And TCC.Tele.001.Agree.View klik report agree
    And TCC.Tele.001.Agree.View input start date
    And TCC.Tele.001.Agree.View klik tanggal 9
    And TCC.Tele.001.Agree.View input end date
    And TCC.Tele.001.Agree.View klik tanggal 14
    And TCC.Tele.001.Agree.View klik button view
    Then TCC.Tele.001.Agree.View menampilkan report sesuai tanggal input

  Scenario: TCC.Tele.002.Agree.View Tidak memasukkan tanggal awal dan akhir
    When TCC.Tele.002.Agree.View klik report
    And TCC.Tele.002.Agree.View klik report agree
    And TCC.Tele.002.Agree.View klik button view
    Then TCC.Tele.002.Agree.View menampilkan report sesuai tanggal input

  Scenario: TCC.Tele.003.Agree.View Memasukkan start date
    When TCC.Tele.003.Agree.View klik report
    And TCC.Tele.003.Agree.View klik report agree
    And TCC.Tele.003.Agree.View input start date
    And TCC.Tele.001.Agree.View klik tanggal 9
    And TCC.Tele.003.Agree.View klik button view
    Then TCC.Tele.003.Agree.View menampilkan report sesuai tanggal input

  Scenario: TCC.Tele.004.Agree.View Memasukkan end date
    When TCC.Tele.004.Agree.View klik report
    And TCC.Tele.004.Agree.View klik report agree
    And TCC.Tele.004.Agree.View input end date
    And TCC.Tele.004.Agree.View klik tanggal 14
    And TCC.Tele.004.Agree.View klik button view
    Then TCC.Tele.004.Agree.View menampilkan report sesuai tanggal input

  Scenario: TCC.Tele.001.Agree.Export Memasukkan start date dan end date
    When TCC.Tele.001.Agree.Export klik report
    And TCC.Tele.001.Agree.Export klik report agree
    And TCC.Tele.001.Agree.Export input start date
    And TCC.Tele.001.Agree.Export klik tanggal 9
    And TCC.Tele.001.Agree.Export input end date
    And TCC.Tele.001.Agree.Export klik tanggal 14
    And TCC.Tele.001.Agree.Export klik button export
    Then TCC.Tele.001.Agree.Export mendownload file sesuai tanggal input

  Scenario: TCC.Tele.002.Agree.Export Tidak memasukkan start date dan end date
    When TCC.Tele.002.Agree.Export klik report
    And TCC.Tele.002.Agree.Export klik report agree
    And TCC.Tele.002.Agree.Export klik button export
    Then TCC.Tele.002.Agree.Export mendownload file sesuai tanggal input

  Scenario: TCC.Tele.001.Agree.Showpage show entries 10
    When TCC.Tele.001.Agree.Showpage klik report
    And TCC.Tele.001.Agree.Showpage klik report agree
    And TCC.Tele.001.Agree.Showpage pilih show page 10
    Then TCC.Tele.001.Agree.Showpage menampilkan data sampai 10

  Scenario: TCC.Tele.002.Agree.Showpage show entries 25
    When TCC.Tele.002.Agree.Showpage klik report
    And TCC.Tele.002.Agree.Showpage klik report agree
    And TCC.Tele.002.Agree.Showpage pilih show page 25
    Then TCC.Tele.002.Agree.Showpage menampilkan data sampai 25

  Scenario: TCC.Tele.003.Agree.Showpage show entries 50
    When TCC.Tele.003.Agree.Showpage klik report
    And TCC.Tele.003.Agree.Showpage klik report agree
    And TCC.Tele.003.Agree.Showpage pilih show page 50
    Then TCC.Tele.003.Agree.Showpage menampilkan data sampai 50

  Scenario: TCC.Tele.004.Agree.Showpage show entries 100
    When TCC.Tele.004.Agree.Showpage klik report
    And TCC.Tele.004.Agree.Showpage klik report agree
    And TCC.Tele.004.Agree.Showpage pilih show page 100
    Then TCC.Tele.004.Agree.Showpage menampilkan data sampai 100

  Scenario: TCC.Tele.001.Agree.Nextpage show page 2
    When TCC.Tele.001.Agree.Nextpage klik report
    And TCC.Tele.001.Agree.Nextpage klik report agree
    And TCC.Tele.001.Agree.Nextpage klik button page 2
    Then TCC.Tele.001.Agree.Nextpage menampilkan data page 2

  Scenario: TCC.Tele.002.Agree.Nextpage show last page
    When TCC.Tele.002.Agree.Nextpage klik report
    And TCC.Tele.002.Agree.Nextpage klik report agree
    And TCC.Tele.002.Agree.Nextpage klik button last page
    Then TCC.Tele.002.Agree.Nextpage menampilkan data last page

  Scenario: TCC.Tele.003.Agree.Nextpage show first page
    When TCC.Tele.003.Agree.Nextpage klik report
    And TCC.Tele.003.Agree.Nextpage klik report agree
    And TCC.Tele.003.Agree.Nextpage klik button first page
    Then TCC.Tele.003.Agree.Nextpage menampilkan data first page