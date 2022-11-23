Feature: Login User

  Scenario:TCC.Tele.Login.001 User invalid login
    When TCC.Tele.Login.001 User go to Web Tele
    And TCC.Tele.Login.001 User enter username password invalid
    And TCC.Tele.Login.001 User click button login
    Then TCC.Tele.Login.001 User pop invalid credentials
   ## And TCC.Tele.Login.001 User click button ok invalid credentials







  Scenario:TCC.Tele.Login.002 User invalid login username kosong
    When  TCC.Tele.Login.002 User enter username kosong
    And  TCC.Tele.Login.002 User click button login username kosong
    Then  TCC.Tele.Login.002 User invalid credentials username kosong
    ##Then TCC.Tele.Login.004 User click button ok invalid credentials username kosong

  Scenario:TCC.Tele.Login.003 User invalid login password kosong
   When  TCC.Tele.Login.003 User enter password kosong
   And  TCC.Tele.Login.003 User click button login password kosong
   Then  TCC.Tele.Login.003 User invalid credentials password kosong
    ##Then TCC.Tele.Login.005 User click button ok invalid credentials password kosong

  Scenario:TCC.Tele.Login.004 User invalid login username invalid
    When  TCC.Tele.Login.004 User enter username invalid
    And  TCC.Tele.Login.004 User click button login username invalid
    Then  TCC.Tele.Login.004 User invalid credentials username invalid
    ###Then TCC.Tele.Login.006 User click button ok invalid credentials username invalid

  Scenario: TCC.Tele.Login.005 User invalid login password invalid
    When  TCC.Tele.Login.005 User enter password invalid
    And  TCC.Tele.Login.005 User click button login password invalid
    Then  TCC.Tele.Login.005 User invalid credentials password invalid
    ##Then TCC.Tele.Login.007 User click button ok invalid credentials password invalid


  Scenario:TCC.Tele.Login.006 User invalid login username password kosong
    When TCC.Tele.Login.006 User enter username password kosong
    And TCC.Tele.Login.006 User click button login username password kosong
    And TCC.Tele.Login.006 User valid credentials
    And TCC.Tele.Login.006 user click btnok welcome
    Then TCC.Tele.Login.006 User valid credentials 2

  Scenario:TCC.Tele.Login.007 User valid login
    When TCC.Tele.Login.007 User go to Web Tele
    And TCC.Tele.Login.007 User enter username password valid
    And TCC.Tele.Login.007 User click button login valid
    Then TCC.Tele.Login.007 User valid credentials

  Scenario:TCC.Tele.Login.008 User logout
    When TCC.Tele.Login.008 User click developer profil
    And  TCC.Tele.Login.008 muncul dialog informasi logout
    And TCC.Tele.Login.008 User click ya logout
    Then TCC.Tele.Login.008 user ke menu login



