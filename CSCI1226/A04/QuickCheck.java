#!/bin/tcsh
set className = DateChecker
if (! -e $className.java) then
    echo "You don't have the right java file name"
else
    javac $className.java
    if ($status == 0) then
        echo "19 September 2011" | java $className
        echo "==> VALID"
        echo "31 April 2011" | java $className
        echo "==> INVALID (bad day)"
        echo "0 January 2011" | java $className
        echo "==> INVALID (bad day)"
        echo "31 Grune 2011" | java $className
        echo "==> INVALID (bad month)"
        echo "31 July -2011" | java $className
        echo "==> INVALID (bad year)"
        echo "-5 Grune -1788" | java $className
        echo "==> INVALID INVALID INVALID (all wrong)"
        echo "29 February 2011" | java $className
        echo "==> INVALID (non-leap year)"
        echo "29 February 2012" | java $className
        echo "==> VALID (leap year)"
        echo "29 February 2000" | java $className
        echo "==> VALID (Century divisible by 400)"
        echo "29 February 1900" | java $className
        echo "==> NOT VALID (Century not divisible by 400)"
    else
        echo "$className.java did not compile!"
    endif
endif
echo

