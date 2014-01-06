#!/bin/sed -f
/^\%/ d
2 a \\\caption[Raw data]{Raw data}\\\\
4 a \\\endfirsthead\
\\\multicolumn{8}{c}{\\tablename\\ \\thetable{} Raw data (continued)}\\\\ \
\\\endhead\
\\\multicolumn{8}{r}{Continued on next page}\\\\ \
\\\endfoot\
\\\endlastfoot
s/^\\\# //
s/\&[a-z ,0-9]*\\/\\/
s/tabular/longtable/
/^\&/ d
