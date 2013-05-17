#!/usr/bin/gnuplot -persist
set title "" offset 0.000000,0.000000  font ""
set xlabel "mileage [10,000 km]" offset 0.000000,0.000000  font ""
set xrange [ * : * ] noreverse nowriteback
set ylabel "fuel consumption [km/L]" offset 0.000000,0.000000  font ""
set yrange [ 10 : 25 ] noreverse nowriteback
set lmargin -1
set bmargin -1
set rmargin -1
set tmargin -1
set size 1.8, 1.2
set terminal postscript eps "Times" 32 # define size of fonts on the picture
set output 'consumption.eps'
plot "data.txt" every ::2 using ($2/10000):5 notitle with line
set output # important! close output file

set title "" offset 0.000000,0.000000  font ""
set xlabel "" offset 0.000000,0.000000  font ""
set xrange [ * : * ] noreverse nowriteback
set ylabel "fuel consumption [km/L]" offset 0.000000,0.000000  font ""
set yrange [ 10 : 25 ] noreverse nowriteback
set lmargin -1
set bmargin -1
set rmargin -1
set tmargin -1
set size 1.8, 1.2
set output 'consumpVStime.eps'
set xdata time
set timefmt "%Y-%m-%d"
set format x "%Y\n%m/%d"
plot "data.txt" every ::2 using 1:5 notitle with line
set output # important! close output file

set title "" offset 0.000000,0.000000  font ""
set xlabel "" offset 0.000000,0.000000  font ""
set xrange [ * : * ] noreverse nowriteback
set ylabel "mileage [10,000 km]" offset 0.000000,0.000000  font ""
set yrange [ * : * ] noreverse nowriteback
set lmargin -1
set bmargin -1
set rmargin -1
set tmargin -1
set size 1.8, 1.2
set output 'mileage.eps'
plot "data.txt" every ::2 using 1:($2/10000) notitle with line
set output # important! close output file

set title "" offset 0.000000,0.000000  font ""
set xlabel "" offset 0.000000,0.000000  font ""
set xrange [ * : * ] noreverse nowriteback
set ylabel "unit price [yen/L]" offset 0.000000,0.000000  font ""
set yrange [ 110 : 160 ] noreverse nowriteback
set lmargin -1
set bmargin -1
set rmargin -1
set tmargin -1
set size 1.8, 1.2 # define size of picture
set output 'fuelprice.eps'
plot "data.txt" every ::2 using 1:6 notitle with line
set output # important! close output file

set title "" offset 0.000000,0.000000  font ""
set xlabel "" offset 0.000000,0.000000  font ""
set xrange [ * : * ] noreverse nowriteback
set ylabel "total cost of fuel [10,000 yen]" offset 0.000000,0.000000  font ""
set yrange [ * : * ] noreverse nowriteback
set lmargin -1
set bmargin -1
set rmargin -1
set tmargin -1
set size 1.8, 1.2
#set terminal postscript eps "Times" 32
set output 'fuelcost.eps'
plot "data.txt" every ::2 using 1:8 notitle with line
set output # important! close output file

