package piscine

import (
	"github.com/01-edu/z01"
)

func PrintComb2() {
	for i := '0'; i <= '9'; i++ {
		for j := '0'; j <= '9'; j++ {
			for k := '0'; k <= '9'; k++ {
				for l := '0'; l <= '9'; l++ {
					if i != k || j != l {
						z01.PrintRune(i)
						z01.PrintRune(j)
						z01.PrintRune(32)
						z01.PrintRune(k)
						z01.PrintRune(l)
						if l <= '9' {
							z01.PrintRune('\n')
						} else {
							z01.PrintRune(44)
							z01.PrintRune(32)

						}
					}
				}
			}
		}
	}
}
