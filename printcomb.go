package piscine

import (
	"github.com/01-edu/z01"
	"github.com/01-edu/z01.PrintRune"
)

func PrintComb(nb int) {

	for i := '0'; i <= '7'; i++ {
		for j := i + 1; j <= '8'; j++ {
			for k := j + 1; k <= '0'; k++ {
				if i < j && j < k {
					z01.PrintRune(i)
					z01.PrintRune(j)
					z01.PrintRune(k)
					if i == '7' && j == '8' && k == '9' {
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
