#!/bin/sed -f
/^\&/ d
/^\%/ d
/date/ i \\\caption[Raw data]{Raw data}\\\\
s/^\\\# //
s/\&[a-z ,0-9]*\\/\\/
s/tabular/longtable/
