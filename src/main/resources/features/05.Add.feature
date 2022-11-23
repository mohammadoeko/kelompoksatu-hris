Feature: Add
  Scenario: TCC.USERMANAGEMENT.006 Menuju form add
    When TCC.USERMANAGEMENT.006 klik button Add
    Then TCC.USERMANAGEMENT.006 Menampilkan form add

  Scenario: TCC.USERMANAGEMENT.007 menyimpan tanpa data agent
    When TCC.USERMANAGEMENT.007 Save tanpa data
    And TCC.USERMANAGEMENT.007 Konfirmasi save
    Then TCC.USERMANAGEMENT.007 Klik Ok

  Scenario: TCC.USERMANAGEMENT.008 Mengisi data tanpa memilih privileges dikolom
    When TCC.USERMANAGEMENT.008 Klik Add
    And TCC.USERMANAGEMENT.008 Memasukkan Full Name
    And TCC.USERMANAGEMENT.008 Memasukkan supervisor
    And TCC.USERMANAGEMENT.008 Memasukkan Telephone
    And TCC.USERMANAGEMENT.008 Memasukkan Username
    And TCC.USERMANAGEMENT.008 Memasukkan Password
    And TCC.USERMANAGEMENT.008 Klik Save
    Then TCC.USERMANAGEMENT.008 Klik Yes

  Scenario: TCC.USERMANAGEMENT.009 Mengisi data memilih privileges agent dikolom
    When TCC.USERMANAGEMENT.009 Klik Add
    And TCC.USERMANAGEMENT.009 Memasukkan Full Name
    And TCC.USERMANAGEMENT.009 Memasukkan Privileges agent
    And TCC.USERMANAGEMENT.009 Memasukkan supervisor
    And TCC.USERMANAGEMENT.009 Memasukkan Telephone
    And TCC.USERMANAGEMENT.009 Memasukkan Username
    And TCC.USERMANAGEMENT.009 Memasukkan Password
    And TCC.USERMANAGEMENT.009 Klik Save
    Then TCC.USERMANAGEMENT.009 Klik Yes

  Scenario: TCC.USERMANAGEMENT.010 Mengisi data memilih privileges admin dikolom
    When TCC.USERMANAGEMENT.010 Klik Add
    And TCC.USERMANAGEMENT.010 Memasukkan Full Name
    And TCC.USERMANAGEMENT.010 Memasukkan Privileges admin
    And TCC.USERMANAGEMENT.010 Memasukkan supervisor
    And TCC.USERMANAGEMENT.010 Memasukkan Telephone
    And TCC.USERMANAGEMENT.010 Memasukkan Username
    And TCC.USERMANAGEMENT.010 Memasukkan Password
    And TCC.USERMANAGEMENT.010 Klik Save
    Then TCC.USERMANAGEMENT.010 Klik Yes

  Scenario: TCC.USERMANAGEMENT.011 Mengisi data tanpa memilih Supervisor dikolom
    When TCC.USERMANAGEMENT.011 Klik Add
    And TCC.USERMANAGEMENT.011 Memasukkan Full Name
    And TCC.USERMANAGEMENT.011 Memasukkan Privileges agent
    And TCC.USERMANAGEMENT.011 Memasukkan Telephone
    And TCC.USERMANAGEMENT.011 Memasukkan Username
    And TCC.USERMANAGEMENT.011 Memasukkan Password
    And TCC.USERMANAGEMENT.011 Klik Save
    Then TCC.USERMANAGEMENT.011 Klik Yes

  Scenario: TCC.USERMANAGEMENT.012 Mengisi data memilih Supervisor dikolom
    When TCC.USERMANAGEMENT.012 Klik Add
    And TCC.USERMANAGEMENT.012 Memasukkan Full Name
    And TCC.USERMANAGEMENT.012 Memasukkan Privileges agent
    And TCC.USERMANAGEMENT.012 Memasukkan Supervisor
    And TCC.USERMANAGEMENT.012 Memasukkan Telephone
    And TCC.USERMANAGEMENT.012 Memasukkan Username
    And TCC.USERMANAGEMENT.012 Memasukkan Password
    And TCC.USERMANAGEMENT.012 Klik Save
    Then TCC.USERMANAGEMENT.012 Klik Yes

  Scenario: TCC.USERMANAGEMENT.013 Mengisi full name dengan angka
    When TCC.USERMANAGEMENT.013 Klik Add
    And TCC.USERMANAGEMENT.013 Memasukkan Full Name
    And TCC.USERMANAGEMENT.013 Memasukkan Privileges agent
    And TCC.USERMANAGEMENT.013 Memasukkan Supervisor
    And TCC.USERMANAGEMENT.013 Memasukkan Telephone
    And TCC.USERMANAGEMENT.013 Memasukkan Username
    And TCC.USERMANAGEMENT.013 Memasukkan Password
    And TCC.USERMANAGEMENT.013 Klik Save
    Then TCC.USERMANAGEMENT.013 Klik Yes

