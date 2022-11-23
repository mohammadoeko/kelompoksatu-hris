Feature: Task Follow Up
  Scenario: TCC.Tele.001.Task.FollowUp Masuk halaman task follow up
    When TCC.Tele.001.Task.FollowUp klik task
    And TCC.Tele.001.Task.FollowUp klik follow up
    Then TCC.Tele.001.Task.FollowUp menampilkan halaman follow up

  Scenario: TCC.Tele.001.Task.FollowUp.Search Input data klik search
    When TCC.Tele.001.Task.FollowUp.Search klik task
    And TCC.Tele.001.Task.FollowUp.Search klik follow up
    And TCC.Tele.001.Task.FollowUp.Search input data di kolom search
    And TCC.Tele.001.Task.FollowUp.Search klik search
    Then TCC.Tele.001.Task.FollowUp.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.002.Task.FollowUp.Search input data berupa angka klik search
    When TCC.Tele.002.Task.FollowUp.Search klik task
    And TCC.Tele.002.Task.FollowUp.Search klik follow up
    And TCC.Tele.002.Task.FollowUp.Search input data di kolom search
    And TCC.Tele.002.Task.FollowUp.Search klik search
    Then TCC.Tele.002.Task.FollowUp.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.003.Task.FollowUp.Search input data berupa simbol klik search
    When TCC.Tele.003.Task.FollowUp.Search klik task
    And TCC.Tele.003.Task.FollowUp.Search klik follow up
    And TCC.Tele.003.Task.FollowUp.Search input data di kolom search
    And TCC.Tele.003.Task.FollowUp.Search klik search
    Then TCC.Tele.003.Task.FollowUp.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.004.Task.FollowUp.Search tidak input data klik search
    When TCC.Tele.004.Task.FollowUp.Search klik task
    And TCC.Tele.004.Task.FollowUp.Search klik follow up
    And TCC.Tele.004.Task.FollowUp.Search klik search
    Then TCC.Tele.004.Task.FollowUp.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.001.Task.FollowUp.Showpage show enties 10
    When TCC.Tele.001.Task.FollowUp.Showpage klik task
    And TCC.Tele.001.Task.FollowUp.Showpage klik follow up
    And TCC.Tele.001.Task.FollowUp.Showpage klik dropdown show page pilih 10
    Then TCC.Tele.001.Task.FollowUp.Showpage muncul data sesuai showpage

  Scenario: TCC.Tele.001.Task.FollowUp.Nextpage show page 2
    When TCC.Tele.001.Task.FollowUp.Nextpage klik task
    And TCC.Tele.001.Task.FollowUp.Nextpage klik follow up
    And TCC.Tele.001.Task.FollowUp.Nextpage klik page 2
    Then TCC.Tele.001.Task.FollowUp.Nextpage muncul data sesuai page 2

  Scenario: TCC.Tele.002.Task.FollowUp.Nextpage show lastpage
    When TCC.Tele.002.Task.FollowUp.Nextpage klik task
    And TCC.Tele.002.Task.FollowUp.Nextpage klik follow up
    And TCC.Tele.002.Task.FollowUp.Nextpage klik lastpage
    Then TCC.Tele.002.Task.FollowUp.Nextpage muncul data sesuai lastpage

  Scenario: TCC.Tele.003.Task.FollowUp.Nextpage show first page
    When TCC.Tele.003.Task.FollowUp.Nextpage klik task
    And TCC.Tele.003.Task.FollowUp.Nextpage klik follow up
    And TCC.Tele.003.Task.FollowUp.Nextpage klik first page
    Then TCC.Tele.003.Task.FollowUp.Nextpage muncul data sesuai first page

  Scenario: TCC.Tele.001.Task.FollowUp.Edit input nomor telepon
    When TCC.Tele.001.Task.FollowUp.Edit klik task
    And TCC.Tele.001.Task.FollowUp.Edit klik follow up
    And TCC.Tele.001.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.001.Task.FollowUp.Edit klik add phone
    And TCC.Tele.001.Task.FollowUp.Edit input nomor telepon
    And TCC.Tele.001.Task.FollowUp.Edit klik save
    Then TCC.Tele.001.Task.FollowUp.Edit muncul pop up data berhasil diajukan

  Scenario: TCC.Tele.002.Task.FollowUp.Edit input nomor telepon lebih dari 15 karakter
    When TCC.Tele.002.Task.FollowUp.Edit klik task
    And TCC.Tele.002.Task.FollowUp.Edit klik follow up
    And TCC.Tele.002.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.002.Task.FollowUp.Edit klik add phone
    And TCC.Tele.002.Task.FollowUp.Edit input nomor telepon
    And TCC.Tele.002.Task.FollowUp.Edit klik save
    Then TCC.Tele.002.Task.FollowUp.Edit muncul pop up data berhasil diajukan

  Scenario: TCC.Tele.003.Task.FollowUp.Edit input nomor telepon dengan huruf
    When TCC.Tele.003.Task.FollowUp.Edit klik task
    And TCC.Tele.003.Task.FollowUp.Edit klik follow up
    And TCC.Tele.003.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.003.Task.FollowUp.Edit klik add phone
    And TCC.Tele.003.Task.FollowUp.Edit input nomor telepon
    And TCC.Tele.003.Task.FollowUp.Edit klik save
    Then TCC.Tele.003.Task.FollowUp.Edit muncul pop up data berhasil diajukan

  Scenario: TCC.Tele.004.Task.FollowUp.Edit tidak input nomor telepon
    When TCC.Tele.004.Task.FollowUp.Edit klik task
    And TCC.Tele.004.Task.FollowUp.Edit klik follow up
    And TCC.Tele.004.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.004.Task.FollowUp.Edit klik add phone
    And TCC.Tele.004.Task.FollowUp.Edit klik save
    Then TCC.Tele.004.Task.FollowUp.Edit muncul pop up data berhasil diajukan

  Scenario: TCC.Tele.005.Task.FollowUp.Edit tidak input data klik submit
    When TCC.Tele.005.Task.FollowUp.Edit klik task
    And TCC.Tele.005.Task.FollowUp.Edit klik follow up
    And TCC.Tele.005.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.005.Task.FollowUp.Edit klik submit
    Then TCC.Tele.005.Task.FollowUp.Edit muncul pop up status result wajib diisi

  Scenario: TCC.Tele.006.Task.FollowUp.Edit memilih channel
    When TCC.Tele.006.Task.FollowUp.Edit klik task
    And TCC.Tele.006.Task.FollowUp.Edit klik follow up
    And TCC.Tele.006.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.006.Task.FollowUp.Edit memilih channel
    And TCC.Tele.006.Task.FollowUp.Edit klik submit
    Then TCC.Tele.006.Task.FollowUp.Edit muncul pop up status result wajib diisi

  Scenario: TCC.Tele.007.Task.FollowUp.Edit memilih channel dan status
    When TCC.Tele.007.Task.FollowUp.Edit klik task
    And TCC.Tele.007.Task.FollowUp.Edit klik follow up
    And TCC.Tele.007.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.007.Task.FollowUp.Edit memilih channel dan status
    And TCC.Tele.007.Task.FollowUp.Edit klik submit
    Then TCC.Tele.007.Task.FollowUp.Edit muncul pop up status result wajib diisi

  Scenario: TCC.Tele.008.Task.FollowUp.Edit memilih channel, status dan status call
    When TCC.Tele.008.Task.FollowUp.Edit klik task
    And TCC.Tele.008.Task.FollowUp.Edit klik follow up
    And TCC.Tele.008.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.008.Task.FollowUp.Edit memilih channel, status dan status call
    And TCC.Tele.008.Task.FollowUp.Edit klik submit
    Then TCC.Tele.008.Task.FollowUp.Edit muncul pop up status result wajib diisi

  Scenario: TCC.Tele.009.Task.FollowUp.Edit memilih channel, status, status call dan status result
    When TCC.Tele.009.Task.FollowUp.Edit klik task
    And TCC.Tele.009.Task.FollowUp.Edit klik follow up
    And TCC.Tele.009.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.009.Task.FollowUp.Edit memilih channel, status, status call dan status result
    And TCC.Tele.009.Task.FollowUp.Edit klik submit
    And TCC.Tele.009.Task.FollowUp.Edit klik yes
    Then TCC.Tele.009.Task.FollowUp.Edit menampilkan status result

  Scenario: TCC.Tele.010.Task.FollowUp.Edit memilih channel, status, status call, status result dan reason
    When TCC.Tele.010.Task.FollowUp.Edit klik task
    And TCC.Tele.010.Task.FollowUp.Edit klik follow up
    And TCC.Tele.010.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.010.Task.FollowUp.Edit memilih channel, status, status call, status result dan reason
    And TCC.Tele.010.Task.FollowUp.Edit klik submit
    And TCC.Tele.010.Task.FollowUp.Edit klik yes
    Then TCC.Tele.010.Task.FollowUp.Edit menampilkan status result dan reason

  Scenario: TCC.Tele.011.Task.FollowUp.Edit pilih phone, edit status activity, klik submit
    When TCC.Tele.011.Task.FollowUp.Edit klik task
    And TCC.Tele.011.Task.FollowUp.Edit klik follow up
    And TCC.Tele.011.Task.FollowUp.Edit klik salah satu data
    And TCC.Tele.011.Task.FollowUp.Edit pilih phone
    And TCC.Tele.011.Task.FollowUp.Edit memilih channel, status, status call, status result dan reason
    And TCC.Tele.011.Task.FollowUp.Edit klik submit
    And TCC.Tele.011.Task.FollowUp.Edit klik yes
    Then TCC.Tele.011.Task.FollowUp.Edit menampilkan status result, reason dan data phone tidak terisi


