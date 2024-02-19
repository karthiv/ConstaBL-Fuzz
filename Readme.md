## The ConstaBL simulator can be run by following commands

Prerequisites: Java 11 (JDK 11 & JRE 11), System configuration - 32 GB RAM, 10-50 GB free space, Ubuntu

Run the following commands in the src\dfa directory

## To clean all the class files

make clean

## To build the lexer and parser

make constabl-lp

## To build the constabl ast

make constabl-build

## To build the simulator and testcases

make simulator2-build

## To run the fuzz testcases

make simulator2-eventfuzz

To change the input testcase, edit the testcases/simulator2/TestFuzzer.java under the *maktestcase* method.

## To run uwfms case study

make simulator2-fuzzcasestudy

To change the input testcase, edit the testcases/simulator2/TestCaseStudyFuzzer.java

## Data files

- location : src/dfa/data


