
## Definition
Sei $R$ ein [[Ringe|Ring]]. 
Ein __Lineares Gleichungssystem__ in $R$ ist ein System aus $p$ Gleichungen und $q$ unbekannten:
$$* =\begin{pmatrix}
a_{1_1}x_1 &+& a_{1_2}x_2 &+& \dots &+& a_{1_q}x_q &=& b_1 \\
a_{2_1}x_1 &+& a_{2_2}x_2 &+& \dots &+& a_{2_q}x_q &=& b_2 \\
\vdots && \vdots &&  && \vdots &=& \vdots            \\
a_{p_1}x_1 &+& a_{p_2}x_2 &+& \dots &+& a_{p_q}x_q &=& b_p
\end{pmatrix}
$$
__Es wird zuerst die Reihe, dann die Spalte inidiziert__.
$p$ ist die __Anzahl der Reihen (Gleichungen)__
$q$ ist die __Anzahl der Spalten (Unbekannten)__

Alle Einträge sind Elemente von $R$.
Die __Lösungsmenge__ von $*$ wird mit $\mathcal{L}(*)$ bezeichnet.
Statt der Matrixschreibweise schreibt man auch:
	$* = \sum\limits_{j=1}^{q} (a_{ij} x_j) = b_i$   mit $1 \leq i \leq p$

#### Matrixschreibweise
Statt $*$ schreibt man die _Koeffizienten_ $a_{ij}$ auch in eine [[Matrizen|Matrix]] $A \in R^{p\times q}$, $b \in R^{p}$.
Jetzt kann das __LGS__ als $Ax = b$ aufgefasst werden.

### Homogenes Gleichungssystem
Sei $*$ ein LGS.
Ersetzt man die Lösungen $b_i$ jeweils durch $0$, heißt das resultierende LGS das zu $*$ gehörende __homogene Gleichungssystem__.

### Fundamentallösungen
Sei $T \in R^{p \times q}$ eine [[Matrizen|Matrix]] in [[Matrizen#Gauß-Normalform|Treppenform]]. 
Sei $b \in R^{p}$. 
Damit wird das LGS $T\cdot x = b$ gebildet.
Sei $r$ der [[Matrizen#Gauß-Normalform#Rang|Rang]] der Matrix $T$ und $s_1, \dots, s_r$ die [[Matrizen#Gauß-Normalform#Stufenindizes|Stufenindizes]] von $T$.

Es wird $J := \{1, \dots, q\} \setminus \{s_1, \dots, s_r \}$ definiert.
Für alle $j \in J$ gibt es eine Lösung für das zu $T\cdot x = b$ gehörende [[#Homogenes Gleichungssystem|homogene Gleichungssystem]]:
	$F^{(j)} := e_j - \sum\limits_{i=1}^{r} T(i, j) e_{s_i}$
Die $F^{(j)}$ werden __Fundamentallösungen__ des [[#Homogenes Gleichungssystem|homogenen LGS]] genannt.

TODO: Hat wohl was mit Vektorräumen und Basen zu tun.
