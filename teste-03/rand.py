import sys
import random

n = int(sys.argv[1])
valor_soma = sys.argv[2]

print(n)
print(valor_soma)


for i in range(n):
    print(random.randint(-1_000_000, 1_000_000))