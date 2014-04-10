# This data file was generated by the Spreadsheet Calculator.
# You almost certainly shouldn't edit it.

set numeric tblstyle = latex craction = 1
format 5 = "%F"
format A 10 0 0
format B 8 0 0
format C 6 2 0
format D 6 2 0
format E 11 2 0
format F 11 2 0
format G 6 0 0
format H 11 2 0
format I 13 1 0
fkey 3 = "Get \"!co -q -p test.sc\""
fkey 4 = "Get \"|co -q -p`rlog test.sc|grep locked|awk '{ print $2 }'` test.sc\""
leftstring A0 = "date of"
rightstring B0 = "mileage"
rightstring C0 = "added"
rightstring D0 = "after"
rightstring E0 = "efficiency"
rightstring F0 = "unit price"
rightstring G0 = "price"
rightstring H0 = "total cost"
rightstring I0 = "comments"
leftstring A1 = "filling"
rightstring B1 = "(km)"
rightstring C1 = "(L)"
rightstring D1 = "(L)"
rightstring E1 = "(km/L)"
rightstring F1 = "(yen/L)"
rightstring G1 = "(yen)"
rightstring H1 = "(man yen)"
let A2 = @dts(2012,8,26)
fmt A2 "%F"
let B2 = 15121
let C2 = 27.33
let D2 = 34
let E2 = @avg(E3:E140)
let F2 = 134
let G2 = 3662
let H2 = G2/10000
let A3 = @dts(2012,9,2)
fmt A3 "%F"
let B3 = 15453
let C3 = 20.34
let D3 = 34
let E3 = (B3-B2)/C3
let F3 = 136
let G3 = 2766
let H3 = G3/10000+H2
let A4 = @dts(2012,9,13)
fmt A4 "%F"
let B4 = 16046
let C4 = 10
let D4 = 10
let E4 = (B5-B3)/(C5+C4)
let F4 = 147
let G4 = 1470
let H4 = G4/10000+H3
let A5 = @dts(2012,9,14)
fmt A5 "%F"
let B5 = 16106
let C5 = 25.8
let D5 = 34
let E5 = (B5-B3)/(C5+C4)
let F5 = 142
let G5 = 3664
let H5 = G5/10000+H4
let A6 = @dts(2012,10,7)
fmt A6 "%F"
let B6 = 16569
let C6 = 29.87
let D6 = 34
let E6 = (B6-B5)/C6
let F6 = 139
let G6 = 4152
let H6 = G6/10000+H5
let A7 = @dts(2012,10,14)
fmt A7 "%F"
let B7 = 16893
let C7 = 16.12
let D7 = 34
let E7 = (B7-B6)/C7
let F7 = 139
let G7 = 2241
let H7 = G7/10000+H6
let A8 = @dts(2012,10,25)
fmt A8 "%F"
let B8 = 17473
let C8 = 33.06
let D8 = 34
let E8 = (B8-B7)/C8
let F8 = 141
let G8 = 4461
let H8 = G8/10000+H7
let A9 = @dts(2012,11,3)
fmt A9 "%F"
let B9 = 17917
let C9 = 25.65
let D9 = 34
let E9 = (B9-B8)/C9
let F9 = 137
let G9 = 3514
let H9 = G9/10000+H8
let A10 = @dts(2012,11,10)
fmt A10 "%F"
let B10 = 18325
let C10 = 22.8
let D10 = 34
let E10 = (B10-B9)/C10
let F10 = 137
let G10 = 3124
let H10 = G10/10000+H9
let A11 = @dts(2012,11,18)
fmt A11 "%F"
let B11 = 18648
let C11 = 18.41
let D11 = 34
let E11 = (B11-B10)/C11
let F11 = 135
let G11 = 2486
let H11 = G11/10000+H10
rightstring I11 = "snow tires"
let A12 = @dts(2012,11,25)
fmt A12 "%F"
let B12 = 18905
let C12 = 15.2
let D12 = 34
let E12 = (B12-B11)/C12
let F12 = 136
let G12 = 2067
let H12 = G12/10000+H11
let A13 = @dts(2012,12,2)
fmt A13 "%F"
let B13 = 19305
let C13 = 23.77
let D13 = 34
let E13 = (B13-B12)/C13
let F13 = 138
let G13 = 3280
let H13 = G13/10000+H12
let A14 = @dts(2012,12,8)
fmt A14 "%F"
let B14 = 19648
let C14 = 20.99
let D14 = 34
let E14 = (B14-B13)/C14
let F14 = 140
let G14 = 2939
let H14 = G14/10000+H13
let A15 = @dts(2012,12,16)
fmt A15 "%F"
let B15 = 19991
let C15 = 23.07
let D15 = 34
let E15 = (B15-B14)/C15
let F15 = 140
let G15 = 3253
let H15 = G15/10000+H14
rightstring I15 = "4 wheel"
let A16 = @dts(2012,12,24)
fmt A16 "%F"
let B16 = 20373
let C16 = 22.94
let D16 = 34
let E16 = (B16-B15)/C16
let F16 = 138
let G16 = 3167
let H16 = G16/10000+H15
let A17 = @dts(2013,1,6)
fmt A17 "%F"
let B17 = 20854
let C17 = 31.95
let D17 = 34
let E17 = (B17-B16)/C17
let F17 = 141
let G17 = 4505
let H17 = G17/10000+H16
rightstring I17 = "4w,hw,4p"
let A18 = @dts(2013,1,17)
fmt A18 "%F"
let B18 = 21368
let C18 = 32.08
let D18 = 34
let E18 = (B18-B17)/C18
let F18 = 146
let G18 = 4684
let H18 = G18/10000+H17
rightstring I18 = "some snow"
let A19 = @dts(2013,1,26)
fmt A19 "%F"
let B19 = 21736
let C19 = 22.74
let D19 = 34
let E19 = (B19-B18)/C19
let F19 = 142
let G19 = 3230
let H19 = G19/10000+H18
rightstring I19 = "oil change"
let A20 = @dts(2013,2,3)
fmt A20 "%F"
let B20 = 22184
let C20 = 26.71
let D20 = 34
let E20 = (B20-B19)/C20
let F20 = 141
let G20 = 3766
let H20 = G20/10000+H19
rightstring I20 = "engine break"
let A21 = @dts(2013,2,10)
fmt A21 "%F"
let B21 = 22570
let C21 = 23.95
let D21 = 34
let E21 = (B21-B20)/C21
let F21 = 144
let G21 = 3449
let H21 = G21/10000+H20
let A22 = @dts(2013,2,17)
fmt A22 "%F"
let B22 = 22828
let C22 = 17.52
let D22 = 34
let E22 = (B22-B21)/C22
let F22 = 147
let G22 = 2575
let H22 = G22/10000+H21
rightstring I22 = "gas station"
let A23 = @dts(2013,2,23)
fmt A23 "%F"
let B23 = 23210
let C23 = 22.05
let D23 = 34
let E23 = (B23-B22)/C23
let F23 = 148
let G23 = 3263
let H23 = G23/10000+H22
rightstring I23 = "gas station"
let A24 = @dts(2013,3,3)
fmt A24 "%F"
let B24 = 23736
let C24 = 31.52
let D24 = 34
let E24 = (B24-B23)/C24
let F24 = 147
let G24 = 4633
let H24 = G24/10000+H23
let A25 = @dts(2013,3,10)
fmt A25 "%F"
let B25 = 24057
let C25 = 19.57
let D25 = 34
let E25 = (B25-B24)/C25
let F25 = 147
let G25 = 2877
let H25 = G25/10000+H24
let A26 = @dts(2013,3,16)
fmt A26 "%F"
let B26 = 24376
let C26 = 18.74
let D26 = 34
let E26 = (B26-B25)/C26
let F26 = 143
let G26 = 2680
let H26 = G26/10000+H25
rightstring I26 = "full padal"
let A27 = @dts(2013,3,31)
fmt A27 "%F"
let B27 = 24697
let C27 = 18.14
let D27 = 34
let E27 = (B27-B26)/C27
let F27 = 146
let G27 = 2648
let H27 = G27/10000+H26
let A28 = @dts(2013,4,22)
fmt A28 "%F"
let B28 = 25094
let C28 = 24.42
let D28 = 34
let E28 = (B28-B27)/C28
let F28 = 147
let G28 = 3590
let H28 = G28/10000+H27
let A29 = @dts(2013,4,28)
fmt A29 "%F"
let B29 = 25421
let C29 = 18.27
let D29 = 34
let E29 = (B29-B28)/C29
let F29 = 145
let G29 = 2649
let H29 = G29/10000+H28
let A30 = @dts(2013,5,11)
fmt A30 "%F"
let B30 = 25923
let C30 = 27.69
let D30 = 34
let E30 = (B30-B29)/C30
let F30 = 144
let G30 = 3988
let H30 = G30/10000+H29
rightstring I30 = "speed up"
let A31 = @dts(2013,5,20)
fmt A31 "%F"
let B31 = 26380
let C31 = 24.92
let D31 = 34
let E31 = (B31-B30)/C31
let F31 = 144
let G31 = 3588
let H31 = G31/10000+H30
rightstring I31 = "oil change"
let A32 = @dts(2013,5,29)
fmt A32 "%F"
let B32 = 26910
let C32 = 28.61
let D32 = 34
let E32 = (B32-B31)/C32
let F32 = 143
let G32 = 4091
let H32 = G32/10000+H31
let A33 = @dts(2013,6,6)
fmt A33 "%F"
let B33 = 27349
let C33 = 23.92
let D33 = 34
let E33 = (B33-B32)/C33
let F33 = 141
let G33 = 3373
let H33 = G33/10000+H32
let A34 = @dts(2013,6,16)
fmt A34 "%F"
let B34 = 27895
let C34 = 29.46
let D34 = 34
let E34 = (B34-B33)/C34
let F34 = 143
let G34 = 4213
let H34 = G34/10000+H33
let A35 = @dts(2013,6,22)
fmt A35 "%F"
let B35 = 28276
let C35 = 21.35
let D35 = 34
let E35 = (B35-B34)/C35
let F35 = 143
let G35 = 3053
let H35 = G35/10000+H34
let A36 = @dts(2013,6,30)
fmt A36 "%F"
let B36 = 28689
let C36 = 22.4
let D36 = 34
let E36 = (B36-B35)/C36
let F36 = 144
let G36 = 3226
let H36 = G36/10000+H35
let A37 = @dts(2013,7,18)
fmt A37 "%F"
let B37 = 29213
let C37 = 28.15
let D37 = 34
let E37 = (B37-B36)/C37
let F37 = 150
let G37 = 4251
let H37 = G37/10000+H36
let A38 = @dts(2013,7,27)
fmt A38 "%F"
let B38 = 29795
let C38 = 32.47
let D38 = 34
let E38 = (B38-B37)/C38
let F38 = 149
let G38 = 4839
let H38 = G38/10000+H37
let A39 = @dts(2013,8,6)
fmt A39 "%F"
let B39 = 30359
let C39 = 29.21
let D39 = 34
let E39 = (B39-B38)/C39
let F39 = 152
let G39 = 4440
let H39 = G39/10000+H38
let A40 = @dts(2013,8,21)
fmt A40 "%F"
let B40 = 30904
let C40 = 30.29
let D40 = 34
let E40 = (B40-B39)/C40
let F40 = 151
let G40 = 4574
let H40 = G40/10000+H39
rightstring I40 = "summer tires"
let A41 = @dts(2013,9,1)
fmt A41 "%F"
let B41 = 31362
let C41 = 25.1
let D41 = 34
let E41 = (B41-B40)/C41
let F41 = 151
let G41 = 3790
let H41 = G41/10000+H40
let A42 = @dts(2013,9,13)
fmt A42 "%F"
let B42 = 31952
let C42 = 29.19
let D42 = 34
let E42 = (B42-B41)/C42
let F42 = 153
let G42 = 4466
let H42 = G42/10000+H41
let A43 = @dts(2013,9,28)
fmt A43 "%F"
let B43 = 32530
let C43 = 31.37
let D43 = 34
let E43 = (B43-B42)/C43
let F43 = 150
let G43 = 4706
let H43 = G43/10000+H42
let A44 = @dts(2013,10,9)
fmt A44 "%F"
let B44 = 33082
let C44 = 29.94
let D44 = 34
let E44 = (B44-B43)/C44
let F44 = 147
let G44 = 4401
let H44 = G44/10000+H43
let A45 = @dts(2013,10,20)
fmt A45 "%F"
let B45 = 33660
let C45 = 31.19
let D45 = 34
let E45 = (B45-B44)/C45
let F45 = 149
let G45 = 4648
let H45 = G45/10000+H44
let A46 = @dts(2013,10,30)
fmt A46 "%F"
let B46 = 34226
let C46 = 31.33
let D46 = 34
let E46 = (B46-B45)/C46
let F46 = 151
let G46 = 4731
let H46 = G46/10000+H45
let A47 = @dts(2013,11,8)
fmt A47 "%F"
let B47 = 34681
let C47 = 25.39
let D47 = 34
let E47 = (B47-B46)/C47
let F47 = 147
let G47 = 3732
let H47 = G47/10000+H46
let A48 = @dts(2013,11,17)
fmt A48 "%F"
let B48 = 35061
let C48 = 22.04
let D48 = 34
let E48 = (B48-B47)/C48
let F48 = 145
let G48 = 3196
let H48 = G48/10000+H47
let A49 = @dts(2013,11,26)
fmt A49 "%F"
let B49 = 35577
let C49 = 30.6
let D49 = 34
let E49 = (B49-@nval("B",@myrow-1))/C49
let F49 = 146
let G49 = 4468
let H49 = G49/10000+@nval("H",@myrow-1)
rightstring I49 = "snow tires"
let A50 = @dts(2013,12,5)
fmt A50 "%F"
let B50 = 36035
let C50 = 27.62
let D50 = 34
let E50 = (B50-@nval("B",@myrow-1))/C50
let F50 = 145
let G50 = 4005
let H50 = G50/10000+@nval("H",@myrow-1)
let A51 = @dts(2013,12,13)
fmt A51 "%F"
let B51 = 36487
let C51 = 28.41
let D51 = 34
let E51 = (B51-@nval("B",@myrow-1))/C51
let F51 = 146
let G51 = 4176
let H51 = G51/10000+@nval("H",@myrow-1)
rightstring I51 = "oil change"
let A52 = @dts(2013,12,25)
fmt A52 "%F"
let B52 = 36876
let C52 = 25.89
let D52 = 34
let E52 = (B52-@nval("B",@myrow-1))/C52
let F52 = 146
let G52 = 3781
let H52 = G52/10000+@nval("H",@myrow-1)
rightstring I52 = "4 w all time"
let A53 = @dts(2014,1,5)
fmt A53 "%F"
let B53 = 37152
let C53 = 17.47
let D53 = 34
let E53 = (B53-@nval("B",@myrow-1))/C53
let F53 = 145
let G53 = 2534
let H53 = G53/10000+@nval("H",@myrow-1)
let A54 = @dts(2014,1,15)
fmt A54 "%F"
let B54 = 37562
let C54 = 27.78
let D54 = 34
let E54 = (B54-@nval("B",@myrow-1))/C54
let F54 = 147
let G54 = 4084
let H54 = G54/10000+@nval("H",@myrow-1)
let A55 = @dts(2014,1,20)
fmt A55 "%F"
let B55 = 37941
let C55 = 24.01
let D55 = 34
let E55 = (B55-@nval("B",@myrow-1))/C55
let F55 = 148
let G55 = 3553
let H55 = G55/10000+@nval("H",@myrow-1)
let A56 = @dts(2014,1,28)
fmt A56 "%F"
let B56 = 38396
let C56 = 28.39
let D56 = 34
let E56 = (B56-@nval("B",@myrow-1))/C56
let F56 = 147
let G56 = 4173
let H56 = G56/10000+@nval("H",@myrow-1)
let A57 = @dts(2014,2,6)
fmt A57 "%F"
let B57 = 38720
let C57 = 20.41
let D57 = 34
let E57 = (B57-@nval("B",@myrow-1))/C57
let F57 = 146
let G57 = 2980
let H57 = G57/10000+@nval("H",@myrow-1)
let A58 = @dts(2014,2,17)
fmt A58 "%F"
let B58 = 39168
let C58 = 28.89
let D58 = 34
let E58 = (B58-@nval("B",@myrow-1))/C58
let F58 = 150
let G58 = 4334
let H58 = G58/10000+@nval("H",@myrow-1)
let A59 = @dts(2014,2,26)
fmt A59 "%F"
let B59 = 39656
let C59 = 31.77
let D59 = 34
let E59 = (B59-@nval("B",@myrow-1))/C59
let F59 = 149
let G59 = 4735
let H59 = G59/10000+@nval("H",@myrow-1)
let A60 = @dts(2014,3,8)
fmt A60 "%F"
let B60 = 40144
let C60 = 31.18
let D60 = 34
let E60 = (B60-@nval("B",@myrow-1))/C60
let F60 = 148
let G60 = 4615
let H60 = G60/10000+@nval("H",@myrow-1)
let A61 = @dts(2014,3,26)
fmt A61 "%F"
let B61 = 40673
let C61 = 33.58
let D61 = 34
let E61 = (B61-@nval("B",@myrow-1))/C61
let F61 = 150
let G61 = 5037
let H61 = G61/10000+@nval("H",@myrow-1)
let A62 = @dts(2014,4,8)
fmt A62 "%F"
let B62 = 41179
let C62 = 29.14
let D62 = 34
let E62 = (B62-@nval("B",@myrow-1))/C62
let F62 = 157
let G62 = 4575
let H62 = G62/10000+@nval("H",@myrow-1)
leftstring A64 = "# daily"
leftstring B64 = "mileage"
leftstring C64 = "[km]"
leftstring D64 = "..."
leftstring E64 = "..."
leftstring F64 = "..."
leftstring G64 = "..."
let H64 = (@nval("B",@myrow-2)-B2)/((@nval("A",@myrow-2)-A2)/24/3600)
leftstring A65 = "# daily"
leftstring B65 = "cost"
leftstring C65 = "of"
leftstring D65 = "fuel"
leftstring E65 = "[yen]"
leftstring F65 = "..."
leftstring G65 = "..."
let H65 = (@nval("H",@myrow-3)-H2)/((@nval("A",@myrow-3)-A2)/24/3600)*10000
fmt H65 "0"
goto H62 A0
