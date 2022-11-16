Feature: Report Activity
  Scenario: TCC.Tele.001.Report.Activity Masuk halaman report activity
    When TCC.Tele.001.Report.Activity klik report
    And TCC.Tele.001.Report.Activity klik report activity
    Then TCC.Tele.001.Report.Activity menampilkan halaman report activity

  Scenario: TCC.Tele.001.Activity.View Memilih agent dan tanggal
    When TCC.Tele.001.Activity.View klik report
    And TCC.Tele.001.Activity.View klik report activity
    And TCC.Tele.001.Activity.View memilih agent
    And TCC.Tele.001.Activity.View input start date
    And TCC.Tele.001.Activity.View klik tanggal 9
    And TCC.Tele.001.Activity.View input end date
    And TCC.Tele.001.Activity.View klik tanggal 14
    And TCC.Tele.001.Activity.View klik button view
    Then TCC.Tele.001.Activity.View menampilkan perform report sesuai agent dan tanggal input

  Scenario: TCC.Tele.002.Activity.View Memilih tanggal dan tidak memilih agent
    When TCC.Tele.002.Activity.View klik report
    And TCC.Tele.002.Activity.View klik report activity
    And TCC.Tele.002.Activity.View input start date
    And TCC.Tele.002.Activity.View klik tanggal 9
    And TCC.Tele.002.Activity.View input end date
    And TCC.Tele.002.Activity.View klik tanggal 14
    And TCC.Tele.002.Activity.View klik button view
    Then TCC.Tele.002.Activity.View menampilkan perform report sesuai tanggal input

  Scenario: TCC.Tele.001.Activity.Export Export data setelah memilih agent dan memasukkan tanggal awal dan akhir
    When TCC.Tele.001.Activity.Export klik report
    And TCC.Tele.001.Activity.Export klik report agree
    And TCC.Tele.001.Activity.Export memilih agent
    And TCC.Tele.001.Activity.Export input start date
    And TCC.Tele.001.Activity.Export klik tanggal 9
    And TCC.Tele.001.Activity.Export input end date
    And TCC.Tele.001.Activity.Export klik tanggal 14
    And TCC.Tele.001.Activity.Export klik button export
    Then TCC.Tele.001.Activity.Export mendownload file sesuai agent dan tanggal input

  Scenario: TCC.Tele.002.Activity.Export Export data tanpa memilih agent dan memasukkan tanggal awal dan akhir
    When TCC.Tele.002.Activity.Export klik report
    And TCC.Tele.002.Activity.Export klik report agree
    And TCC.Tele.002.Activity.Export input start date
    And TCC.Tele.002.Activity.Export klik tanggal 9
    And TCC.Tele.002.Activity.Export input end date
    And TCC.Tele.002.Activity.Export klik tanggal 14
    And TCC.Tele.002.Activity.Export klik button export
    Then TCC.Tele.002.Activity.Export mendownload file sesuai tanggal input

  Scenario: TCC.Tele.001.Activity.Showpage Show entries 10
    When TCC.Tele.001.Activity.Showpage klik report
    And TCC.Tele.001.Activity.Showpage klik report activity
    And TCC.Tele.001.Activity.Showpage input start date
    And TCC.Tele.001.Activity.Showpage klik tanggal 9
    And TCC.Tele.001.Activity.Showpage input end date
    And TCC.Tele.001.Activity.Showpage klik tanggal 14
    And TCC.Tele.001.Activity.Showpage klik button view
    And TCC.Tele.001.Activity.Showpage pilih show page 10
    Then TCC.Tele.001.Activity.Showpage menampilkan data sampai 10

  Scenario: TCC.Tele.001.Activity.Nextpage Show page 2
    When TCC.Tele.001.Activity.Nextpage klik report
    And TCC.Tele.001.Activity.Nextpage klik report activity
    And TCC.Tele.001.Activity.Nextpage input start date
    And TCC.Tele.001.Activity.Nextpage klik tanggal 9
    And TCC.Tele.001.Activity.Nextpage input end date
    And TCC.Tele.001.Activity.Nextpage klik tanggal 14
    And TCC.Tele.001.Activity.Nextpage klik button view
    And TCC.Tele.001.Activity.Nextpage klik button page 2
    Then TCC.Tele.001.Activity.Nextpage menampilkan data page 2

  Scenario: TCC.Tele.002.Activity.Nextpage Show lastpage
    When TCC.Tele.002.Activity.Nextpage klik report
    And TCC.Tele.002.Activity.Nextpage klik report activity
    And TCC.Tele.002.Activity.Nextpage input start date
    And TCC.Tele.002.Activity.Nextpage klik tanggal 9
    And TCC.Tele.002.Activity.Nextpage input end date
    And TCC.Tele.002.Activity.Nextpage klik tanggal 14
    And TCC.Tele.002.Activity.Nextpage klik button view
    And TCC.Tele.002.Activity.Nextpage klik button lastpage
    Then TCC.Tele.002.Activity.Nextpage menampilkan data lastpage

  Scenario: TCC.Tele.003.Activity.Nextpage Show firstpage
    When TCC.Tele.003.Activity.Nextpage klik report
    And TCC.Tele.003.Activity.Nextpage klik report activity
    And TCC.Tele.003.Activity.Nextpage input start date
    And TCC.Tele.003.Activity.Nextpage klik tanggal 9
    And TCC.Tele.003.Activity.Nextpage input end date
    And TCC.Tele.003.Activity.Nextpage klik tanggal 14
    And TCC.Tele.003.Activity.Nextpage klik button view
    And TCC.Tele.003.Activity.Nextpage klik button firstpage
    Then TCC.Tele.003.Activity.Nextpage menampilkan data firstpage