#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())
    binary_value = str(bin(n)[2:])
    consecutive_counter = 0
    max_consecutive_counter = 0

    for c in binary_value:
        if c == str(1):
            consecutive_counter = consecutive_counter + 1
            if max_consecutive_counter < consecutive_counter:
                max_consecutive_counter = consecutive_counter
        else:
            if max_consecutive_counter < consecutive_counter:
                max_consecutive_counter = consecutive_counter
                
            consecutive_counter = 0
            
    print(max_consecutive_counter)
