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


