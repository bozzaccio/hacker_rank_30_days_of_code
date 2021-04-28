#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    reverse_array = arr[::-1]
    separator = " "
    result = separator.join([str(n) for n in reverse_array])
    print(result)
