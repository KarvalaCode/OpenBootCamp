lista_primos=[]

#Saber si un número es primo o no
def es_primo(num):
    if num <= 1:
        return False
    elif num == 2:
        return True
    else:
        for i in range(2,num):
            if num % i ==0:
                return False
                break
        return True

#Calcular números primos entre 1 y num añadiéndolos a la lista lista_primos
def primos(num):
    for i in range (1, num):
        if es_primo(i):
            lista_primos.append(i)

#Aquí empezamos
def main():
    num = int(input('Introduce un número: '))
    if es_primo(num):
        print(f' {num} es un número primo')
    else:
        print(f'{num} no es un número primo')
    primos(num)
    print(f'Los números primos entre 1 y {num} son: {lista_primos}')

if __name__ =='__main__':
    main()
