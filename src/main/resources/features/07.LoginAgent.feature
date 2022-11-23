Feature: Login Agent

  Scenario: TCC.Tele.001 Input username dan password invalid
    When TCC.Tele.001 Memasukkan URL
    And TCC.Tele.001 Memasukkan username dan password invalid
    And TCC.Tele.001 Klik Sign In
    Then TCC.Tele.001 Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif

  Scenario: TCC.Tele.002 Input username valid dan password invalid
    When TCC.Tele.002 Memasukkan URL
    And TCC.Tele.002 Memasukkan username valid dan password invalid
    And TCC.Tele.002 Klik Sign In
    Then TCC.Tele.002 Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif

  Scenario: TCC.Tele.003 Input username invalid dan password valid
    When TCC.Tele.003 Memasukkan URL
    And TCC.Tele.003 Memasukkan username invalid dan password valid
    And TCC.Tele.003 Klik Sign In
    Then TCC.Tele.003 Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif


  Scenario: TCC.Tele.005 Input username dan password valid
    When TCC.Tele.005 Memasukkan URL
    And TCC.Tele.005 Memasukkan username dan password valid
    And TCC.Tele.005 Klik Sign In
    Then TCC.Tele.005 Klik Ok

  Scenario: TCC.Tele.006 Logout
    When TCC.Tele.006 Klik profile
    And TCC.Tele.006 Klik Ya
    Then TCC.Tele.006 Muncul halaman login

  Scenario: TCC.Tele.007 Input username huruf kapital dan password valid
    When TCC.Tele.007 Memasukkan username huruf kapital dan password valid
    And TCC.Tele.007 Klik Sign In
    Then TCC.Tele.007 Klik Ok

