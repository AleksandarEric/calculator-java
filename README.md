Metrika, pregled i staticka analiza


Za kompletan projekat LOC iznosi 153.

Ciklomatsku slozenost smo racunali uz pomoc ekstenzije Codalyze u okviru Visual Studio Code-a i ona za metode calculate i evaluateExpression iznosi 12 za Calculator.java i 3 za Start.java. Na osnovu ovoga mozemo zakljuciti da je kod u okviru fajla Calculator.java umereno kompleksan, dok je kod fajla Start.java jednostavan kod.

Kognitivna slozenost projekta je metricki priblizna ciklomatskoj slozenosti (s obzirom na to da u kodu nema funkcije "switch"). Kako su se velike softverske kuce slozile da je vrednost kognitivne slozenosti do 15 prihvatljiva, ovaj projekat se moze smatrati lako citljivim i razumljivim programeru.


Calculator.java - LOC=134, broj linija koda=188

Neformalnim pregledom ovog fajla mozemo reci da je ovo program napisan Java jezikom koji sadrzi logiku izvrsavanja matematickih operacija sabiranje, oduzimanje, deljenje i mnozenje.

Uz pomoc alata SonarLint u okviru koda fajla Calculator.java je detektovano 8 nedoslednosti i predloga za poboljsanje koda, prilozenih u nastavku izvestaja:
1. Add a private constructor to hide the implicit public one. [Ln 4, Col 14]
2. Rename method "ToString" to prevent any misunderstanding/clash with method "toString" defined in superclass "java.lang.Object". [Ln 18, Col 30]
3. Move this file to a named package. [Ln 1, Col 1]
4. Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. [Ln 18, Col 30]
5. Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. [Ln 24, Col 26]
6. Immediately return this expression instead of assigning it to the temporary variable "textResult". [Ln 70, Col 29]
7. Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. [Ln 74, Col 25]
8. Remove this redundant jump. [Ln 183, Col 13]


Start.java - LOC=19, broj linija koda=26

Neformalnim pregledom ovog fajla zakljucujemo da je ovo klasa napisana Java jezikom i ona sadrzi "main" metodu koja se izvrsava prilikom pokretanja programa. Putem nje se vrsi komunikacija sa korisnikom.

Za fajl Start.java je detektovano 4 sugestije:
1. Replace this use of System.out or System.err by a logger. [Ln 8, Col 3]
2. Replace this use of System.out or System.err by a logger. [Ln 19, Col 5]
3. Move this file to a named package. [Ln 1, Col 1]
4. Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'. [Ln 6, Col 10]
