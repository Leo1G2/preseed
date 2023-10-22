package piscine

func UltimateDivMod(a *int, b *int, x *int) {
	*x = *x / *b
	*b = *a % *b
}
