Feature: Logout User

  ##Scenario:TCC.Tele.Logout.001 User logout telemarketing
    ##When TCC.Tele.Logout.001 User click developer profil telemarketing
    ##Then TCC.Tele.Logout.001 user ke menu login  telemarketing

  Scenario:TCC.Tele.Logout.002 User logout
    When TCC.Tele.Logout.002 User click developer profil
    And  TCC.Tele.Logout.002 muncul dialog informasi logout
    And TCC.Tele.Logout.002 User click ya logout
    Then TCC.Tele.Logout.002 user ke menu login