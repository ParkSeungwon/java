CFLAG = #-g -fmax-errors=1 -lm -std=c++14
CC = javac
SRC = $(wildcard *.java)
EXE = $(patsubst %.java, %.class, $(SRC))
PNG = $(patsubst %.java, %.png, $(SRC))

all : $(EXE)
png : $(PNG)
tex : report.pdf

%.class : %.java
	$(CC) $< 

%.png : %.class
	@head $*.java
	@echo "---------- 문제 $<\b\b\b\b\b번 실행을 시작합니다. --------------------------"
	java $*
	@echo "---------- 문제 $<\b\b\b\b\b번 실행을 종료합니다. -----------------------------"
	@gnome-screenshot -wBf $@

report.pdf : report.tex $(PNG) $(EXE) $(SRC)
	pdflatex report.tex
	evince report.pdf

clean:
	rm $(EXE)
