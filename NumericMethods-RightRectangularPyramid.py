def main():

    length = float(input("Enter the base length of the pyramid: "))
    width = float(input("Enter the base width of the pyramid: "))
    height = float(input("Enter the height of the pyramid: "))
    slices = int(input("Enter number of slices for the pyramid: "))

    volume = pyramid_volume(length, width, height)
    approx_volume = approx_pyramid_volume(length, width, height, slices)

    print("The volume of the pyramid is " + str(volume))
    print("The approximate volume of the pyramid is " + str(approx_volume))


def pyramid_volume(l, w, h):
    return (l*w*h)/3


def approx_pyramid_volume(l, w, h, n):
    total = 0
    lwh = l*w*h
    for i in range(1, n+1):
        num = (2*i-1)**2
        den = 4 * (n**3)
        total += (num/den) * lwh
    return total


main()

