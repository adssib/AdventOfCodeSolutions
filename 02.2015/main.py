f = open("input.txt", "r")
totalWantedSheets = 0 

for lines in f:
    l, w, h = map(int, lines.strip().split("x"))
    
    side1 = l * w
    side2 = w * h
    side3 = h * l
    surfaceArea = 2 * side1 + 2 * side2 + 2 * side3
    slack = min(side1, side2, side3)
    
    totalWantedSheets += surfaceArea + slack

print(totalWantedSheets)
