basename=pajero

.PHONY: xpdf xdvi dvi ps clean Clean plot

data.txt:
	sc data.sc
*.eps:data.txt
	gnuplot data.gnu
xpdf:*.eps
	latexmk -pdf -pvc ${basename}
pdf:*.eps
	latexmk -pdf ${basename}
xdvi:*.eps
	latexmk -dvi -pvc ${basename}
dvi:*.eps
	latexmk -dvi ${basename}
ps:*.eps
	latexmk -ps ${basename}
plot:
	gnuplot data.gnu
	root -l -b -q cost.C
clean:
	latexmk -C
	rm -f *convert*.pdf *~
Clean:clean
	rm -f *.eps *.txt *.lat
