import math


def main():
    num = float(input("Enter a number to convert: "))
    base = int(input("Enter the base to which the number should be converted: "))
    print("Result = " + str(convert_decimal_to_base(num, base)))


def convert_decimal_to_base(num, base):
    whole_num = math.floor(num)
    dec_num = num - whole_num
    whole_total = ""
    dec_total = ""

    while whole_num > 0:
        rem = whole_num % base
        whole_num //= base
        if rem > 9:
            rem = number_conversion(rem)
        whole_total += str(rem)

    while len(dec_total) < 10:
        dec_num *= base
        rem = 0
        if dec_num > 0:
            rem = math.floor(dec_num)
            dec_num -= rem
            if rem > 9:
                rem = number_conversion(rem)
        dec_total += str(rem)

    result = whole_total[::-1] + "." + dec_total

    return result


def number_conversion(rem):
    letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J']
    for ix in range(10, 20):
        if rem == ix:
            rem = letters[ix - 10]
    return rem


main()

