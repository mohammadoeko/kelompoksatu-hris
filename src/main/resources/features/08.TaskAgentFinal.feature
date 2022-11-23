Feature: Task Final
  Scenario: TCC.Tele.001.Task.Final masuk halaman task final
    When TCC.Tele.001.Task.Final klik task
    And TCC.Tele.001.Task.Final klik final
    Then TCC.Tele.001.Task.Final menampilkan halaman task final

  Scenario: TCC.Tele.001.Task.Final.Search Input data klik search
    When TCC.Tele.001.Task.Final.Search klik task
    And TCC.Tele.001.Task.Final.Search klik final
    And TCC.Tele.001.Task.Final.Search input data di kolom search
    And TCC.Tele.001.Task.Final.Search klik search
    Then TCC.Tele.001.Task.Final.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.002.Task.Final.Search input data berupa angka klik search
    When TCC.Tele.002.Task.Final.Search klik task
    And TCC.Tele.002.Task.Final.Search klik final
    And TCC.Tele.002.Task.Final.Search input data di kolom search
    And TCC.Tele.002.Task.Final.Search klik search
    Then TCC.Tele.002.Task.Final.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.003.Task.Final.Search input data berupa simbol klik search
    When TCC.Tele.003.Task.Final.Search klik task
    And TCC.Tele.003.Task.Final.Search klik final
    And TCC.Tele.003.Task.Final.Search input data di kolom search
    And TCC.Tele.003.Task.Final.Search klik search
    Then TCC.Tele.003.Task.Final.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.004.Task.Final.Search tidak input data klik search
    When TCC.Tele.004.Task.Final.Search klik task
    And TCC.Tele.004.Task.Final.Search klik final
    And TCC.Tele.004.Task.Final.Search klik search
    Then TCC.Tele.004.Task.Final.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.001.Task.Final.Showpage show entries 10
    When TCC.Tele.001.Task.Final.Showpage klik task
    And TCC.Tele.001.Task.Final.Showpage klik final
    And TCC.Tele.001.Task.Final.Showpage klik dropdown show page pilih 10
    Then TCC.Tele.001.Task.Final.Showpage muncul data sesuai showpage

  Scenario: TCC.Tele.002.Task.Final.Showpage show entries 25
    When TCC.Tele.002.Task.Final.Showpage klik task
    And TCC.Tele.002.Task.Final.Showpage klik final
    And TCC.Tele.002.Task.Final.Showpage klik dropdown show page pilih 25
    Then TCC.Tele.002.Task.Final.Showpage muncul data sesuai showpage

  Scenario: TCC.Tele.001.Task.Final.Nextpage show page 2
    When TCC.Tele.001.Task.Final.Nextpage klik task
    And TCC.Tele.001.Task.Final.Nextpage klik final
    And TCC.Tele.001.Task.Final.Nextpage klik page 2
    Then TCC.Tele.001.Task.Final.Nextpage muncul data sesuai page 2

  Scenario: TCC.Tele.002.Task.Final.Nextpage show lastpage
    When TCC.Tele.002.Task.Final.Nextpage klik task
    And TCC.Tele.002.Task.Final.Nextpage klik final
    And TCC.Tele.002.Task.Final.Nextpage klik lastpage
    Then TCC.Tele.002.Task.Final.Nextpage muncul data sesuai lastpage

  Scenario: TCC.Tele.003.Task.Final.Nextpage show first page
    When TCC.Tele.003.Task.Final.Nextpage klik task
    And TCC.Tele.003.Task.Final.Nextpage klik final
    And TCC.Tele.003.Task.Final.Nextpage klik first page
    Then TCC.Tele.003.Task.Final.Nextpage muncul data sesuai first page

