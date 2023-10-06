package main // main = dossier principal, branche principale

import "github.com/01-edu/z01" // import de fonction ou de ressources git hub

func main() { //func est toujours accompagné de () {}, et elle appelle toujours main 
	for i := 48; i < 58; i++ { //i :=  pour definir variable, pour i < x la boucle continue jusqu'a atteindre x; i ++ = I+1
		z01.PrintRune(rune(i))
	}
	z01.PrintRune('\n')
}
