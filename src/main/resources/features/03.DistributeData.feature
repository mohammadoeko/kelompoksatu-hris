Feature: Distribute Data
  Scenario: TCC.Tele.011 Unchecklist status dan buket data
    When TCC.Tele.011 klik data
    And TCC.Tele.011 klik distribute data
    And TCC.Tele.011 unchecklist field status
    And TCC.Tele.011 unchecklist field buket data
    And Tcc.Tele.011 klik button view
    Then TCC.Tele.011 Menampilkan pop up Status Tidak Boleh Kosong

  Scenario: TCC.Tele.012 Unchecklist status
    When TCC.Tele.012 klik data
    And TCC.Tele.012 klik distribute data
    And TCC.Tele.012 unchecklist field status
    And TCC.Tele.012 checklist field buket data
    And Tcc.Tele.012 klik button view
    Then TCC.Tele.012 Menampilkan pop up Status Tidak Boleh Kosong

  Scenario: TCC.Tele.013 Unchecklist buket data
    When TCC.Tele.013 klik data
    And TCC.Tele.013 klik distribute data
    And TCC.Tele.013 checklist field status
    And TCC.Tele.013 unchecklist field buket data
    And Tcc.Tele.013 klik button view
    Then TCC.Tele.013 Menampilkan pop up Status Tidak Boleh Kosong

  Scenario: TCC.Tele.014 Kosongkan distribusi dan jumlah agent
    When TCC.Tele.014 klik data
    And TCC.Tele.014 klik distribute data
    And Tcc.Tele.014 klik distribusi
    Then TCC.Tele.014 Menampilkan pop up Pilih User yang akan didistribusikan

  Scenario: TCC.Tele.015 Kosongkan distribusi
    When TCC.Tele.015 klik data
    And TCC.Tele.015 klik distribute data
    And Tcc.Tele.015 input jumlah per agent
    And Tcc.Tele.015 klik distribusi
    Then TCC.Tele.015 Menampilkan pop up Pilih User yang akan didistribusikan

  Scenario: TCC.Tele.016 Kosongkan jumlah agent
    When TCC.Tele.016 klik data
    And TCC.Tele.016 klik distribute data
    And Tcc.Tele.016 checklist distribusi ke
    And Tcc.Tele.016 klik distribusi
    Then TCC.Tele.016 Menampilkan pop up Jumlah tidak boleh Kosong
