BOOK=magisterka

TEX=xelatex
BIBTEX=bibtex

.PHONY: pdf

%.pdf : %.tex
	$(TEX) $* 

mgr :
	$(TEX) $(BOOK)
	$(BIBTEX) $(BOOK)
	$(TEX) $(BOOK)
	$(TEX) $(BOOK)

clean : 
	rm -f *.log *.aux *.out *.lot *.lof *.ilg *.toc *.blg

xclean : clean
	rm -rf *.ind *.pdf *.idx *.bbl
	
open : 
	acroread $(BOOK).pdf

totalReload : xclean; make; acroread $(BOOK).pdf
