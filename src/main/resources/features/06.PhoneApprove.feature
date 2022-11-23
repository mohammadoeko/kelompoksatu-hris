Feature: Phone Approve
  Scenario: TCC.Tele.001.PhoneApprove mengakses user management
    When TCC.Tele.001.PhoneApprove klik user management
    Then TCC.Tele.001.PhoneApprove menampilkan menu user management

  Scenario: TCC.Tele.002.PhoneApprove menuju halaman phone approve
    When TCC.Tele.002.PhoneApprove klik user management
    And TCC.Tele.002.PhoneApprove klik phone approve
    Then TCC.Tele.002.PhoneApprove menampilkan phone approve page

  Scenario: TCC.Tele.003.PhoneApprove tidak menginputkan search agent
    When TCC.Tele.003.PhoneApprove klik search
    Then TCC.Tele.003.PhoneApprove menampilkan seluruh data nomor user

  Scenario: TCC.Tele.004.PhoneApprove mencari data user yang terdaftar
    When TCC.Tele.004.PhoneApprove input search agent
    And TCC.Tele.004.PhoneApprove klik search
    Then TCC.Tele.004.PhoneApprove menampilkan data sesuai yang diminta

  Scenario: TCC.Tele.005.PhoneApprove mencari data user yang belum terdaftar
    When TCC.Tele.005.PhoneApprove input search agent
    And TCC.Tele.005.PhoneApprove klik search
    Then TCC.Tele.005.PhoneApprove tidak ditampilkan data apapun

  Scenario: TCC.Tele.006.PhoneApprove klik approve nomor
    When TCC.Tele.006.PhoneApprove klik centang nomor yang akan di approve
    And TCC.Tele.006.PhoneApprove klik approve
    Then TCC.Tele.006.PhoneApprove menampilkan approval nomor ya/tidak

  Scenario: TCC.Tele.007.PhoneApprove klik approve nomor yes
    When TCC.Tele.007.PhoneApprove klik centang nomor yang akan di approve
    And TCC.Tele.007.PhoneApprove klik approve
    And TCC.Tele.007.PhoneApprove klik yes
    Then TCC.Tele.007.PhoneApprove menampilkan informasi berhasil menyetujui nomor

  Scenario: TCC.Tele.008.PhoneApprove klik approve nomor no
    When TCC.Tele.008.PhoneApprove klik centang nomor yang akan di approve
    And TCC.Tele.008.PhoneApprove klik approve
    And TCC.Tele.008.PhoneApprove klik no
    Then TCC.Tele.008.PhoneApprove kembali ke tampilan semua data nomor

  Scenario: TCC.Tele.009.PhoneApprove klik reject nomor
    When TCC.Tele.009.PhoneApprove klik reject
    And TCC.Tele.009.PhoneApprove klik yes
    Then TCC.Tele.009.PhoneApprove menampilkan informasi data berhasil ditolak

  Scenario: TCC.Tele.010.PhoneApprove mereject user yang ditentukan
    When TCC.Tele.010.PhoneApprove klik centang nomor yang akan di reject
    And TCC.Tele.010.PhoneApprove klik reject
    And TCC.Tele.010.PhoneApprove klik yes
    Then TCC.Tele.010.PhoneApprove menampilkan informasi berhasil di tolak

  Scenario: TCC.Tele.011.PhoneApprove batal reject user yang ditentukan
    When TCC.Tele.011.PhoneApprove klik centang nomor yang akan di reject
    And TCC.Tele.011.PhoneApprove klik reject
    And TCC.Tele.011.PhoneApprove klik no
    Then TCC.Tele.011.PhoneApprove kembali ke tampilan semua data nomor

  Scenario: TCC.Tele.012.PhoneApprove show entries 10
    When TCC.Tele.012.PhoneApprove pilih showpage 10
    Then TCC.Tele.012.PhoneApprove menampilkan showpage 10

  Scenario: TCC.Tele.013.PhoneApprove show entries 25
    When TCC.Tele.013.PhoneApprove pilih showpage 25
    Then TCC.Tele.013.PhoneApprove menampilkan showpage 25

  Scenario: TCC.Tele.014.PhoneApprove show entries 50
    When TCC.Tele.014.PhoneApprove pilih showpage 50
    Then TCC.Tele.014.PhoneApprove menampilkan showpage 50

  Scenario: TCC.Tele.015.PhoneApprove menampilkan grid agent
    When TCC.Tele.015.PhoneApprove klik user management dan phone approve
    Then TCC.Tele.015.PhoneApprove menampilkan grid agent

  Scenario: TCC.Tele.016.PhoneApprove menampilkan grid number phone
    When TCC.Tele.016.PhoneApprove klik user management dan phone approve
    Then TCC.Tele.016.PhoneApprove menampilkan grid number phone

  Scenario: TCC.Tele.017.PhoneApprove menampilkan grid tanggal request
    When TCC.Tele.017.PhoneApprove klik user management dan phone approve
    Then TCC.Tele.017.PhoneApprove menampilkan grid tanggal request

  Scenario: TCC.Tele.018.PhoneApprove menampilkan grid nama
    When TCC.Tele.018.PhoneApprove klik user management dan phone approve
    Then TCC.Tele.018.PhoneApprove menampilkan grid nama

  Scenario: TCC.Tele.019.PhoneApprove menampilkan grid status
    When TCC.Tele.019.PhoneApprove klik user management dan phone approve
    Then TCC.Tele.019.PhoneApprove menampilkan grid status

