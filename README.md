# FormeGeometriche
Si vuole implementare un insieme di classi che rappresentino le diverse Figure geometriche che hanno in comune due proprietà: un perimetro e l’area

## Testo dell'esercizio
Si vuole implementare un insieme di classi che rappresentino le diverse Figure geometriche che
hanno in comune due proprietà: un perimetro e l’area.
Si realizzi una classe Figura che rappresenti una generica figura, con due operazioni per
ottenere rispettivamente il perimetro e l’area, e una operazione che stampi le informazioni sul
perimetro e l’area. In questo caso, ovviamente il perimetro e l’area saranno 0. Il Costruttore di Figura
deve prendere in input solo il nome della figura (come String).
Si realizzino poi le classi che implementano le particolari figure:
- Triangolo
- Triangolo Rettangolo
- Rettangolo
- Quadrato
- Cerchio
che specializzano appropriatamente la classe Figura aggiungendo gli attributi necessari (lati/raggio).
I metodi per calcolare area e perimetro dovranno ovviamente essere riscritti per ogni classe. Inoltre
creare la giusta gerarchia tra le varie classi (Esempio: Quadrato è un caso particolare di Rettangolo).
Dove appropriato definire anche metodi quali get/setBase e get/setAltezza (o get/setRaggio).
Si implementi un metodo main che testi l'utilizzo e il funzionamento delle classi sviluppate.
Le varie classi dovranno essere salvate in un package chiamato “figure”, mentre la classe contenente
il main dovrà essere posta nel package di default
