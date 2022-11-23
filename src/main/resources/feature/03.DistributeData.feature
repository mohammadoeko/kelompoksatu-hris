Feature: Distribute Data
  ##Scenario: TCC.Tele.011 Unchecklist status dan buket data
   ## When TCC.Tele.011 klik data
    ##And TCC.Tele.011 klik distribute data
    ##And TCC.Tele.011 unchecklist field status
    #And TCC.Tele.011 unchecklist field buket data
    #And Tcc.Tele.011 klik button view
   ## Then TCC.Tele.011 Menampilkan pop up Status Tidak Boleh Kosong

  #Scenario: TCC.Tele.012 Unchecklist status
    ##When TCC.Tele.012 klik data
   # And TCC.Tele.012 klik distribute data
    ##And TCC.Tele.012 unchecklist field status
    ##And TCC.Tele.012 checklist field buket data
    ##And Tcc.Tele.012 klik button view
    ## Then TCC.Tele.012 Menampilkan pop up Status Tidak Boleh Kosong

  ##Scenario: TCC.Tele.013 Unchecklist buket data
    ##When TCC.Tele.013 klik data
    ##And TCC.Tele.013 klik distribute data
    ##And TCC.Tele.013 checklist field status
    ##And TCC.Tele.013 unchecklist field buket data
    ##And Tcc.Tele.013 klik button view
    ##Then TCC.Tele.013 Menampilkan pop up Status Tidak Boleh Kosong

  ##Scenario: TCC.Tele.014 Kosongkan distribusi dan jumlah agent
    ##When TCC.Tele.014 klik data
    ##And TCC.Tele.014 klik distribute data
    ##And Tcc.Tele.014 klik distribusi
    ###Then TCC.Tele.014 Menampilkan pop up Pilih User yang akan didistribusikan

  ##Scenario: TCC.Tele.015 Kosongkan distribusi
    ##When TCC.Tele.015 klik data
    ##And TCC.Tele.015 klik distribute data
    ##And Tcc.Tele.015 input jumlah per agent
    ##And Tcc.Tele.015 klik distribusi
    ##Then TCC.Tele.015 Menampilkan pop up Pilih User yang akan didistribusikan

  ##Scenario: TCC.Tele.016 Kosongkan jumlah agent
    ##When TCC.Tele.016 klik data
    ##And TCC.Tele.016 klik distribute data
   ## And Tcc.Tele.016 checklist distribusi ke
    ##And Tcc.Tele.016 klik distribusi
    ##Then TCC.Tele.016 Menampilkan pop up Jumlah tidak boleh Kosong

  Scenario:TCC.Tele.Distribusi.001 Add Distribusi Data
    When TCC.Tele.Distribusi.001 klik data
    And  TCC.Tele.Distribusi.001 klik distribusi data
    And  TCC.Tele.distribusi.001 checklist distribusi ke
    And  TCC.Tele.distribusi.001 input jumlah per agent
    And  TCC.Tele.distribusi.001 klik distribusi
    And  TCC.Tele.distribusi.001 tekan ya pada distribusi pada kotak dialog informasi
    Then TCC.Tele.distribusi.001 kembali ke halaman distribusi data

  Scenario:TCC.Tele.Distribusi.002 view distribusi data
    When TCC.Tele.Distribusi.002 klik data
    And  TCC.Tele.Distribusi.002 klik distribute data
    And  TCC.Tele.Distribusi.002 checklist field status
    And  TCC.Tele.Distribusi.002 checklist field buket data
    And  TCC.Tele.Distribusi.002 klik button view
    Then TCC.Tele.distribusi.002 menampilkan halaman distribusi data

  Scenario:TCC.Tele.Distribusi.003 page 2
    When TCC.Tele.Distribusi.003 klik data
    And TCC.Tele.Distribusi.003 klik distribute data
    And TCC.Tele.Distribusi.003 checklist field status
    And TCC.Tele.Distribusi.003 checklist field buket data
    And TCC.Tele.Distribusi.003 klik button view
    And TCC.Tele.distribusi.003 klik page 2
    Then TCC.Tele.distribusi.003 menampilkan halaman ke 2


  Scenario:TCC.Tele.Distribusi.004 last page
    When TCC.Tele.Distribusi.004 klik data
    And TCC.Tele.Distribusi.004 klik distribute data
    And TCC.Tele.Distribusi.004 checklist field status
    And TCC.Tele.Distribusi.004 checklist field buket data
    And TCC.Tele.Distribusi.004 klik button view
    And TCC.Tele.distribusi.004 klik last page
    Then TCC.Tele.distribusi.004 menampilkan halaman last page

  Scenario:TCC.Tele.Distribusi.005 first page
    When TCC.Tele.Distribusi.005 klik data
    And TCC.Tele.Distribusi.005 klik distribute data
    And TCC.Tele.Distribusi.005 checklist field status
    And TCC.Tele.Distribusi.005 checklist field buket data
    And TCC.Tele.Distribusi.005 klik button view
    And TCC.Tele.distribusi.005 klik last page
    And TCC.Tele.distribusi.005 klik first page
    Then TCC.Tele.distribusi.005 menampilkan halaman first page

  Scenario:TCC.Tele.Distribusi.006 page 25
    When TCC.Tele.Distribusi.006 klik data
    And TCC.Tele.Distribusi.006 klik distribute data
    And TCC.Tele.Distribusi.006 checklist field status
    And TCC.Tele.Distribusi.006 checklist field buket data
    And TCC.Tele.Distribusi.006 klik button view
    And TCC.Tele.distribusi.006 klik page 25
    Then TCC.Tele.distribusi.006 menampilkan data entries 25

  Scenario: TCC.Tele.Distribusi.007 page 50
    When TCC.Tele.Distribusi.007 klik data
    And TCC.Tele.Distribusi.007 klik distribute data
    And TCC.Tele.Distribusi.007 checklist field status
    And TCC.Tele.Distribusi.007 checklist field buket data
    And TCC.Tele.Distribusi.007 klik button view
    And TCC.Tele.distribusi.007 klik page 50
    Then TCC.Tele.distribusi.007 menampilkan data entries 50


  Scenario:TCC.Tele.Distribusi.008 page 100
    When TCC.Tele.Distribusi.008 klik data
    And TCC.Tele.Distribusi.008 klik distribute data
    And TCC.Tele.Distribusi.008 checklist field status
    And TCC.Tele.Distribusi.008 checklist field buket data
    And TCC.Tele.Distribusi.008 klik button view
    And TCC.Tele.distribusi.008 klik page 100
    Then TCC.Tele.distribusi.008 menampilkan data entries 100


  Scenario:TCC.Tele.Distribusi.009 page 500
    When TCC.Tele.Distribusi.009 klik data
    And TCC.Tele.Distribusi.009 klik distribute data
    And TCC.Tele.Distribusi.009 checklist field status
    And TCC.Tele.Distribusi.009 checklist field buket data
    And TCC.Tele.Distribusi.009 klik button view
    And TCC.Tele.distribusi.009 klik page 500
    Then TCC.Tele.distribusi.008 menampilkan data entries 500

  Scenario:TCC.Tele.Distribusi.010 page 10
    When TCC.Tele.Distribusi.010 klik data
    And TCC.Tele.Distribusi.010 klik distribute data
    And TCC.Tele.Distribusi.010 checklist field status
    And TCC.Tele.Distribusi.010 checklist field buket data
    And TCC.Tele.Distribusi.010 klik button view
    And TCC.Tele.distribusi.010 klik page 10
    Then TCC.Tele.distribusi.010 Showpage menampilkan data sampai 10