Feature: Task Data All
  Scenario: TCC.Tele.001.Task.All masuk halaman task data all
    When TCC.Tele.001.Task.All klik task
    And TCC.Tele.001.Task.All klik data all
    Then TCC.Tele.001.Task.All menampilkan halaman data all

  Scenario: TCC.Tele.001.Task.All.Search search hanya memilih customer
    When TCC.Tele.001.Task.All.Search klik task
    And TCC.Tele.001.Task.All.Search klik data all
    And TCC.Tele.001.Task.All.Search input search customer
    And TCC.Tele.001.Task.All.Search klik search
    Then TCC.Tele.001.Task.All.Search muncul data sesuai keyword yang dimasukkan

  Scenario: TCC.Tele.002.Task.All.Search search hanya memilih agent
    When TCC.Tele.002.Task.All.Search klik task
    And TCC.Tele.002.Task.All.Search klik data all
    And TCC.Tele.002.Task.All.Search pilih agent
    And TCC.Tele.002.Task.All.Search klik search
    Then TCC.Tele.002.Task.All.Search muncul data sesuai agent dipilih

  Scenario: TCC.Tele.003.Task.All.Search search hanya memilih status
    When TCC.Tele.003.Task.All.Search klik task
    And TCC.Tele.003.Task.All.Search klik data all
    And TCC.Tele.003.Task.All.Search pilih status
    And TCC.Tele.003.Task.All.Search klik search
    Then TCC.Tele.003.Task.All.Search muncul data sesuai status dipilih

  Scenario: TCC.Tele.004.Task.All.Search search hanya memilih customer dan agent
    When TCC.Tele.004.Task.All.Search klik task
    And TCC.Tele.004.Task.All.Search klik data all
    And TCC.Tele.004.Task.All.Search input search customer
    And TCC.Tele.004.Task.All.Search pilih agent
    And TCC.Tele.004.Task.All.Search klik search
    Then TCC.Tele.004.Task.All.Search muncul data sesuai input customer dan agent dipilih

  Scenario: TCC.Tele.005.Task.All.Search search hanya memilih status dan agent
    When TCC.Tele.005.Task.All.Search klik task
    And TCC.Tele.005.Task.All.Search klik data all
    And TCC.Tele.005.Task.All.Search pilih status
    And TCC.Tele.005.Task.All.Search pilih agent
    And TCC.Tele.005.Task.All.Search klik search
    Then TCC.Tele.005.Task.All.Search muncul data sesuai status dipilih dan agent dipilih

  Scenario: TCC.Tele.006.Task.All.Search search hanya memilih customer dan status
    When TCC.Tele.006.Task.All.Search klik task
    And TCC.Tele.006.Task.All.Search klik data all
    And TCC.Tele.006.Task.All.Search input search customer
    And TCC.Tele.006.Task.All.Search pilih status
    And TCC.Tele.006.Task.All.Search klik search
    Then TCC.Tele.006.Task.All.Search muncul data sesuai input customer dan status dipilih

  Scenario: TCC.Tele.007.Task.All.Search search hanya memilih customer, agent dan status
    When TCC.Tele.007.Task.All.Search klik task
    And TCC.Tele.007.Task.All.Search klik data all
    And TCC.Tele.007.Task.All.Search input search customer
    And TCC.Tele.007.Task.All.Search pilih agent
    And TCC.Tele.007.Task.All.Search pilih status
    And TCC.Tele.007.Task.All.Search klik search
    Then TCC.Tele.007.Task.All.Search muncul data sesuai input customer, agent dan status dipilih

  Scenario: TCC.Tele.008.Task.All.Search Search dikosongkan
    When TCC.Tele.008.Task.All.Search klik task
    And TCC.Tele.008.Task.All.Search klik data all
    And TCC.Tele.008.Task.All.Search klik search
    Then TCC.Tele.008.Task.All.Search menampilkan semua data

  Scenario: TCC.Tele.001.Task.All.Showpage show entries 10
    When TCC.Tele.001.Task.All.Showpage klik task
    And TCC.Tele.001.Task.All.Showpage klik data all
    And TCC.Tele.001.Task.All.Showpage pilih entries 10
    Then TCC.Tele.001.Task.All.Showpage menampilkan data entries 10

  Scenario: TCC.Tele.002.Task.All.Showpage show entries 25
    When TCC.Tele.002.Task.All.Showpage klik task
    And TCC.Tele.002.Task.All.Showpage klik data all
    And TCC.Tele.002.Task.All.Showpage pilih entries 25
    Then TCC.Tele.002.Task.All.Showpage menampilkan data entries 25

  Scenario: TCC.Tele.003.Task.All.Showpage show entries 50
    When TCC.Tele.003.Task.All.Showpage klik task
    And TCC.Tele.003.Task.All.Showpage klik data all
    And TCC.Tele.003.Task.All.Showpage pilih entries 50
    Then TCC.Tele.003.Task.All.Showpage menampilkan data entries 50

  Scenario: TCC.Tele.004.Task.All.Showpage show entries 100
    When TCC.Tele.004.Task.All.Showpage klik task
    And TCC.Tele.004.Task.All.Showpage klik data all
    And TCC.Tele.004.Task.All.Showpage pilih entries 100
    Then TCC.Tele.004.Task.All.Showpage menampilkan data entries 100

  Scenario: TCC.Tele.001.Task.All.NextPage show page 2
    When TCC.Tele.001.Task.All.NextPage klik task
    And TCC.Tele.001.Task.All.NextPage klik data all
    And TCC.Tele.001.Task.All.NextPage klik page 2
    Then TCC.Tele.001.Task.All.NextPage menampilkan data page 2

  Scenario: TCC.Tele.002.Task.All.NextPage show lastpage
    When TCC.Tele.002.Task.All.NextPage klik task
    And TCC.Tele.002.Task.All.NextPage klik data all
    And TCC.Tele.002.Task.All.NextPage klik lastpage
    Then TCC.Tele.002.Task.All.NextPage menampilkan data lastpage

  Scenario: TCC.Tele.003.Task.All.NextPage show first page
    When TCC.Tele.003.Task.All.NextPage klik task
    And TCC.Tele.003.Task.All.NextPage klik data all
    And TCC.Tele.003.Task.All.NextPage klik first page
    Then TCC.Tele.003.Task.All.NextPage menampilkan data first page

  Scenario: TCC.Tele.001.Task.All.Edit input nomor telepon
    When TCC.Tele.001.Task.All.Edit klik task
    And TCC.Tele.001.Task.All.Edit klik data all
    And TCC.Tele.001.Task.All.Edit klik salah satu data
    And TCC.Tele.001.Task.All.Edit klik add phone
    And TCC.Tele.001.Task.All.Edit input nomor telepon
    And TCC.Tele.001.Task.All.Edit klik save
    Then TCC.Tele.001.Task.All.Edit muncul pop up data berhasil diajukan

  Scenario: TCC.Tele.002.Task.All.Edit input nomor telepon lebih dari 15 karakter
    When TCC.Tele.002.Task.All.Edit klik task
    And TCC.Tele.002.Task.All.Edit klik data all
    And TCC.Tele.002.Task.All.Edit klik salah satu data
    And TCC.Tele.002.Task.All.Edit klik add phone
    And TCC.Tele.002.Task.All.Edit input nomor telepon
    And TCC.Tele.002.Task.All.Edit klik save
    Then TCC.Tele.002.Task.All.Edit muncul pop up data berhasil diajukan

  Scenario: TCC.Tele.003.Task.All.Edit input nomor telepon dengan huruf
    When TCC.Tele.003.Task.All.Edit klik task
    And TCC.Tele.003.Task.All.Edit klik data all
    And TCC.Tele.003.Task.All.Edit klik salah satu data
    And TCC.Tele.003.Task.All.Edit klik add phone
    And TCC.Tele.003.Task.All.Edit input nomor telepon
    And TCC.Tele.003.Task.All.Edit klik save
    Then TCC.Tele.003.Task.All.Edit muncul pop up data berhasil diajukan

  Scenario: TCC.Tele.004.Task.All.Edit tidak input nomor telepon
    When TCC.Tele.004.Task.All.Edit klik task
    And TCC.Tele.004.Task.All.Edit klik data all
    And TCC.Tele.004.Task.All.Edit klik salah satu data
    And TCC.Tele.004.Task.All.Edit klik add phone
    And TCC.Tele.004.Task.All.Edit klik save
    Then TCC.Tele.004.Task.All.Edit muncul pop up data berhasil diajukan

  Scenario: TCC.Tele.005.Task.All.Edit tidak input data klik submit
    When TCC.Tele.005.Task.All.Edit klik task
    And TCC.Tele.005.Task.All.Edit klik data all
    And TCC.Tele.005.Task.All.Edit klik salah satu data
    And TCC.Tele.005.Task.All.Edit klik submit
    Then TCC.Tele.005.Task.All.Edit muncul pop up status result wajib diisi

  Scenario: TCC.Tele.006.Task.All.Edit memilih channel
    When TCC.Tele.006.Task.All.Edit klik task
    And TCC.Tele.006.Task.All.Edit klik data all
    And TCC.Tele.006.Task.All.Edit klik salah satu data
    And TCC.Tele.006.Task.All.Edit memilih channel
    And TCC.Tele.006.Task.All.Edit klik submit
    Then TCC.Tele.006.Task.All.Edit muncul pop up status result wajib diisi

  Scenario: TCC.Tele.007.Task.All.Edit memilih channel dan status
    When TCC.Tele.007.Task.All.Edit klik task
    And TCC.Tele.007.Task.All.Edit klik data all
    And TCC.Tele.007.Task.All.Edit klik salah satu data
    And TCC.Tele.007.Task.All.Edit memilih channel dan status
    And TCC.Tele.007.Task.All.Edit klik submit
    Then TCC.Tele.007.Task.All.Edit muncul pop up status result wajib diisi

  Scenario: TCC.Tele.008.Task.All.Edit memilih channel, status dan status call
    When TCC.Tele.008.Task.All.Edit klik task
    And TCC.Tele.008.Task.All.Edit klik data all
    And TCC.Tele.008.Task.All.Edit klik salah satu data
    And TCC.Tele.008.Task.All.Edit memilih channel, status dan status call
    And TCC.Tele.008.Task.All.Edit klik submit
    Then TCC.Tele.008.Task.All.Edit muncul pop up status result wajib diisi

  Scenario: TCC.Tele.009.Task.All.Edit memilih channel, status, status call dan status result
    When TCC.Tele.009.Task.All.Edit klik task
    And TCC.Tele.009.Task.All.Edit klik data all
    And TCC.Tele.009.Task.All.Edit klik salah satu data
    And TCC.Tele.009.Task.All.Edit memilih channel, status, status call dan status result
    And TCC.Tele.009.Task.All.Edit klik submit
    And TCC.Tele.009.Task.All.Edit klik yes
    Then TCC.Tele.009.Task.All.Edit menampilkan status result

  Scenario: TCC.Tele.010.Task.All.Edit memilih channel, status, status call, status result dan reason
    When TCC.Tele.010.Task.All.Edit klik task
    And TCC.Tele.010.Task.All.Edit klik data all
    And TCC.Tele.010.Task.All.Edit klik salah satu data
    And TCC.Tele.010.Task.All.Edit memilih channel, status, status call, status result dan reason
    And TCC.Tele.010.Task.All.Edit klik submit
    And TCC.Tele.010.Task.All.Edit klik yes
    Then TCC.Tele.010.Task.All.Edit menampilkan status result dan reason

  Scenario: TCC.Tele.011.Task.All.Edit pilih phone, edit status activity, klik submit
    When TCC.Tele.011.Task.All.Edit klik task
    And TCC.Tele.011.Task.All.Edit klik data all
    And TCC.Tele.011.Task.All.Edit klik salah satu data
    And TCC.Tele.011.Task.All.Edit pilih phone
    And TCC.Tele.011.Task.All.Edit memilih channel, status, status call, status result dan reason
    And TCC.Tele.011.Task.All.Edit klik submit
    And TCC.Tele.011.Task.All.Edit klik yes
    Then TCC.Tele.011.Task.All.Edit menampilkan status result, reason dan data phone tidak terisi
