compile application: 
dir /s /B *.java > sources.txt
javac -cp src\main\*;lib\* -d target\classes @sources.txt

run application:
java -cp target\classes;lib\* it.mcella.kata.Main

run tests:
copy src\test\it\mcella\kata\digits.dat target\classes\it\mcella\kata
java -cp target\classes;lib\* it.mcella.kata.TestRunner

run single test:
java -cp target\classes;lib\* org.junit.runner.JUnitCore it.mcella.kata.MainTest