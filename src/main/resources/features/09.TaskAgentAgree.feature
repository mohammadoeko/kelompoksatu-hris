Feature: Agent Agree

  Scenario: TCC.Tele.022 Masuk halaman task agree
    When TCC.Tele.022 Klik Task
    And TCC.Tele.022 Klik Task lagi
    And TCC.Tele.022 Klik Agree
    Then TCC.Tele.022 Menampilkan halaman Task bucket Agree

  Scenario: TCC.Tele.023 Mencari data huruf
    When TCC.Tele.023 Input data di kolom search
    And TCC.Tele.023 Klik search
    Then TCC.Tele.023 Menampilkan data sesuai keyword

  Scenario: TCC.Tele.024 Mencari data kosong
    When TCC.Tele.024 Klik Agree
    And TCC.Tele.024 Klik search
    Then TCC.Tele.024 Menampilkan data sesuai keyword

  Scenario: TCC.Tele.025 Mencari data angka
    When TCC.Tele.025 Klik Agree
    And TCC.Tele.025 Input data di kolom search
    And TCC.Tele.025 Klik search
    Then TCC.Tele.025 Menampilkan data sesuai keyword

  Scenario: TCC.Tele.026 Mencari data simbol
    When TCC.Tele.026 Klik Agree
    And TCC.Tele.026 Input data di kolom search
    And TCC.Tele.026 Klik search
    Then TCC.Tele.026 Menampilkan data sesuai keyword

  Scenario: TCC.Tele.027 Mencari data dan memunculkan data halaman berikutnya
    When TCC.Tele.027 Klik Agree
    And TCC.Tele.027 Input data di kolom search
    And TCC.Tele.027 Klik search
    And TCC.Tele.027 Klik page two
    Then TCC.Tele.027 Menampilkan data sesuai keyword page two

  Scenario: TCC.Tele.028 Menampilkan 25 data per halaman
    When TCC.Tele.028 Klik Agree
    And TCC.Tele.028 Klik Dropdown Show Page
    Then TCC.Tele.028 Menampilkan 25 data per halaman

  Scenario: TCC.Tele.029 Menampilkan 10 data per halaman
    When TCC.Tele.029 Klik Agree
    And TCC.Tele.029 Klik Dropdown Show Page
    Then TCC.Tele.029 Menampilkan 10 data per halaman

  Scenario: TCC.Tele.030 Menampilkan data urutan sesuai halaman
    When TCC.Tele.030 Klik Agree
    And TCC.Tele.030 Klik page two
    And TCC.Tele.030 Klik page three
    Then TCC.Tele.030 Menampilkan data urutan sesuai halaman

  Scenario: TCC.Tele.031 Menampilkan data halaman terakhir
    When TCC.Tele.031 Klik Agree
    And TCC.Tele.031 Klik last page
    Then TCC.Tele.031 Menampilkan data halaman terakhir

  Scenario: TCC.Tele.032 Menampilkan data halaman pertama
    When TCC.Tele.032 Klik Agree
    And TCC.Tele.032 Klik last page
    And TCC.Tele.032 Klik first page
    Then TCC.Tele.032 Menampilkan data halaman pertama

  Scenario: TCC.Tele.033 Update link
    When TCC.Tele.033 Klik salah satu data
    And TCC.Tele.033 Input link
    And TCC.Tele.033 Klik update
    And TCC.Tele.033 Klik ok
    Then TCC.Tele.033 Link berhasil terupdate

  Scenario: TCC.Tele.034 Update link kosong
    When TCC.Tele.034 Klik salah satu data
    And TCC.Tele.034 Klik update
    And TCC.Tele.034 Klik ok
    Then TCC.Tele.034 Link berhasil terupdate