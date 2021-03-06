# Week 4 Lab Report

## Code Change 1

![Image](fix1.png)

[Failure-inducing input file](https://github.com/MichaelYe48/markdown-parser/blob/main/test-file2.md)

![Image](firsterror.png)

The bug in my code was the failure to address possible failure inducing inputs, such as a file with an extra line at the end. This failure inducing input changes one of my variables in the while loop to -1. My while loop cannot terminate when the variables inside are negative, which causes my program to have an infinite loop and cause the "OutOfMemoryError" runtime exception.

## Code Change 2

![Image](fix2.png)

[Failure-inducing input file](https://github.com/MichaelYe48/cse15l-lab-reports/blob/main/example3.md)

![Image](seconderror.png)

The bug in my code was the lack of checks to determine the end of a link without the end parantheses. The failure inducing input is a markdown file that has the opening parantheses but not the closing parantheses around the link. Since my code is still looking for the closing parantheses, it will include everything in the middle as part of the link before the next closing parantheses it finds. 

## Code Change 3

![Image](fix3.png)

[Failure-inducing input file](https://github.com/MichaelYe48/cse15l-lab-reports/blob/main/empty.md)

![Image](thirderror.png)

The third bug in my code regarded the failure to take in account the possibility for other variables to have a negative value. While I accounted for the openBracket variable to have a negative value, I did not think of the other variables that could also be negative, thus a failure inducing input was one that gave the rest of my variables negative values. The symptom this time was an OutOfBounds exception, due to the fact that the value determining the end of a substring was negative, which cannot happen.