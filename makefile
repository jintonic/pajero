basename=pajero

.PHONY: xpdf xdvi dvi ps clean Clean plot

dvi:*.eps data.tab
	latexmk -dvi ${basename}
xpdf:*.eps data.tab
	latexmk -pdf -pvc ${basename}
pdf:*.eps data.tab
	latexmk -pdf ${basename}
xdvi:*.eps data.tab
	latexmk -dvi -pvc ${basename}
ps:*.eps data.tab
	latexmk -ps ${basename}
*.eps:data.txt data.gnu
	gnuplot data.gnu
	root -l -b -q cost.C
data.tab:data.lat
	reformat.sed $^ > data.tab
data.lat data.txt:
	sc data.sc
clean:
	latexmk -C
	rm -f *convert*.pdf *~
Clean:clean
	rm -f *.eps *.txt *.lat *.tab
