package piscine

func StrLen(s string) int {
	x := len(s)
	for _, char := range s {
			if char == 'é' {
			x = x - 1
			}
		}
	return x
}
