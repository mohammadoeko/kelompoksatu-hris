Feature: Search
  Scenario: TCC.USERMANAGEMENT.003 Tidak ada data dan klik search
    When TCC.USERMANAGEMENT.003 Mencari data tanpa mengisi kolom
    And TCC.USERMANAGEMENT.003 Klik Search
    Then TCC.USERMANAGEMENT.003 Menampilkan seluruh data user

  Scenario: TCC.USERMANAGEMENT.004 Search Data Terdaftar
    When TCC.USERMANAGEMENT.004 Memasukan data terdaftar pada kolom
    And TCC.USERMANAGEMENT.004 Klik Search
    Then TCC.USERMANAGEMENT.004 Data User ditampilkan