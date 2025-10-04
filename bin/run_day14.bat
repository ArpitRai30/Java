@echo off
echo Compiling and running day14 Java files...
echo.

cd "C:\Users\arpit\Desktop\JAVA\day14"
echo Compiling GenericMethod.java...
javac GenericMethod.java

echo Compiling GenericExample.java...
javac GenericExample.java

echo Compiling LoginWindow.java...
javac LoginWindow.java

cd ..
echo.
echo Running GenericMethod...
java day14.GenericMethod

echo.
echo To run other programs:
echo java day14.GenericExample
echo java day14.LoginWindow

pause