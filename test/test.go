package main

import (
	"fmt"
	"piscine"
)

func main() {
	a := 6
	b := 3
	piscine.UltimateDivMod(&a, &b)
	fmt.Println(a)
	fmt.Println(b)
}
