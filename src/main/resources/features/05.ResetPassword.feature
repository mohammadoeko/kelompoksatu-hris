Feature: Reset Password
  Scenario: TCC.USERMANAGEMENT.015 Tanpa memilih data yang akan direset password
    When TCC.USERMANAGEMENT.015 Menekan button Reset Password
    And TCC.USERMANAGEMENT.015 Konfirmasi Reset Password
    Then TCC.USERMANAGEMENT.015 Menampilkan halaman User

  Scenario: TCC.USERMANAGEMENT.016 Reset password data yang ada
    When TCC.USERMANAGEMENT.016 Memilih data yang akan direset
    And TCC.USERMANAGEMENT.016 Konfirmasi Reset Password
    And TCC.USERMANAGEMENT.016 Konfirmasi data sudah direset
    Then TCC.USERMANAGEMENT.016 Menampilkan halaman user
