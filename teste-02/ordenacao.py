def frequencia(palavra: str, caracter: str) -> int:
    return palavra.count(caracter);

if __name__ == "__main__":

    n = int(input()) # Quantidade de palavras
    caracter = input() # O caracter
    palavras = []

    for i in range(0, n):
        palavra = input()

        palavras.append((
            frequencia(palavra, caracter),
            palavra
        ))
        
    # Ordena pela primeira chave (frequência) de forma decrescente.
    palavras.sort(reverse=True)

    palavras = list(map(lambda tup: tup[1], palavras))
    print(palavras)
