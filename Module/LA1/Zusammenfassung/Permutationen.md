## Definition

Sei $D$ eine [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]] von $1$ bis $n \in \mathbb{N}$
	$D := \{1, 2, \dots, n\}$
Eine __Permutation__ ist eine [[Abbildungen#Bijektiv|bijektive]] [[Abbildungen|Abbildung]] $\sigma: D \rightarrow D$. Sie vertauscht sozusagen _Indizes_ in einer _Menge_.
Eine __Permutation__ kann auf verschiedene Arten gegeben sein:
__Als Wertetabelle:__
| x           | 1   | 2   | 3   | 4   | 5   | 6   | 7   |
| ----------- | --- | --- | --- | --- | --- | --- | --- |
| $\sigma(x)$ | 2   | 5   | 4   | 7   | 1   | 3   | 6   |

__Funktionswerte oder als Funktion__
$\sigma(1) = 2$,  $\sigma(2) = 5$,  $\sigma(3) = 4$,  $\sigma(4)=7$, 
$\sigma(5)=1$,  $\sigma(6)=3$,  $\sigma(7)=6$

__Als $k$-[[#Zykel]]__
(Siehe unter für Definition)
$\sigma = (1\ 2\ 5)(3\ 4\ 7\ 6)$
oder: $\sigma = (1\ 2)(1\ 5)(3\ 4)(3\ 7)(3\ 6)$

### Zykel
Seien $x_1, x_2, \dots, x_k \in D$ _paarweise verschiedene_ Elemente. 
Sei eine __Permutation__ gegeben durch die Funktion
$$\zeta(x) := 
		\begin{cases} 
			x_{i+1} &\text{wenn \(x=x_i, i < k\)} \\ 
			x_1 &\text{wenn \(x = x_k\)} \\ 
			x &\text{wenn \(x \not\in \{x_1, \dots, x_k\}\)}
		\end{cases}
$$
Man schreibt auch: $\zeta =: (x_1, x_2, \dots, x_k)$
Die [[Gruppen#Ordnung|Ordnung]] eines $k$-Zykels ist $k$.

### Transposition
Einen $2$-[[#Zykel]] nennt man auch __Transposition__.
Da bei einer __Transposition__ $\tau = (i_1, i_2)$ nur die Indizes $i_1$ und $i_2$ vertauscht werden, gilt:
	$\tau = \tau^{-1}$ bzw. $(i_1, i_2) = (i_2, i_1)$
Jeder $k$-[[#Zykel]] kann als Produkt von $k-1$ __Transpositionen__ geschrieben werden:
	Sei $\sigma = (x_1, x_2, \dots, x_k)$ ein $k$-Zykel.
	Dann gilt: $\sigma = (x_1, x_2)(x_1, x_2)\dots(x_1, x_k)$

### Signum
Das __Signum__ ist eine _Kennzahl_ einer __Permutation__.
Das __Signum__ ist stets $\pm1$.
Definition:
	$sign(\sigma) := \prod\limits_{l \leq i < j \leq n} \frac{\sigma(j) - \sigma(i)}{j - i}$
Das __Signum__ ist ein [[Homomorphismen#Gruppenhomomorphismus|Gruppenhomomorphismus]] von $S_n$ nach $(\{\pm1\}, \cdot)$.
Es gilt:
	$sign(\sigma \circ \tau) = sign(\sigma) \cdot sign(\tau)$

___[[#Transposition|Transpositionen]] haben immer das Signum -1!___
Deshalb gilt für ein $k$-Zykel $\sigma$, der in $k-1$ [[#Transposition|Transpositionen]] umgewandelt werden kann:
	$sign(\sigma) = (-1)^{k-1}$
