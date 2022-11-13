Feature: Edit Data
  Scenario: TCC.Tele.011.EditData Tidak Masuk halaman edit data
    When TCC.Tele.011.EditData klik data
    And TCC.Tele.011.EditData klik distribute data
    Then TCC.Tele.011.EditData Menampilkan halaman distribusi

  Scenario: TCC.Tele.012.EditData Tidak menginputkan data dan klik search
    When TCC.Tele.012.EditData klik data
    And TCC.Tele.012.EditData klik edit data
    And TCC.Tele.012.EditData input search data kosong
    And TCC.Tele.012.EditData klik search
    Then TCC.Tele.012.EditData Menampilkan semua data

  Scenario: TCC.Tele.013.EditData Search input sempurna
    When TCC.Tele.013.EditData klik data
    And TCC.Tele.013.EditData klik edit data
    And TCC.Tele.013.EditData input search sempurna
    And TCC.Tele.013.EditData klik search
    Then TCC.Tele.013.EditData Menampilkan data kosong
