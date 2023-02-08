## Definition
Sei $K$ ein [[Körper]] und $V$ ein $K$-[[Vektorräume|Vektorraum]]

Der __Dualraum__ ist definiert als Raum aller [[Vektorräume#Linearform|Linearformen]] von $V$:
	$V^* := Hom(V, K)$   daher gilt nach der [[Vektorräume#Lineare Fortsetzung|linearen Fortsetzung]]:
	$V^* \cong Abb(B, K)$

Der __Dualraum__ ist selbst also auch ein [[Vektorräume|Vektorraum]], allerdings mit besonderen eigenschaften.
Die [[Vektorräume#Dimension|Dimension]] von $V^*$ ist gleich die von $V$.

### Duale Basis
Sei $B := \{b_1, \dots, b_d\}$ eine [[Vektorräume#Basis|Basis]] von $V$.
Die [[Vektorräume#Basis|Basis]] $B^* := \{b_1^*, \dots, b_d^*\}$ von $V^*$ heißt die zu $B$ __duale Basis__.

Sie ist definiert durch:
	$b_i^*(b_j) := \begin{cases}1 & \text{falls } i = j \\ 0 & \text{falls } i \neq j\end{cases}$

### Duale Abbildung
Seien $V, W$ zwei [[Vektorräume]] über den [[Körper]] $K$. 
Sei $\Phi$ eine [[Vektorräume#Lineare Abbildung|lineare Abbildung]] $\Phi: V \rightarrow W$.

Die zu $\Phi$ __duale Abbildung__ $\Phi^*: W^* \rightarrow V^*$ ist definiert durch
	$\Phi^*(\kappa) := \kappa \circ \Phi$  mit $\kappa \in W^*$

Die __duale Abbildung__ $\Phi^*$ ist ebenfalls eine [[Vektorräume#Lineare Abbildung|lineare Abbildung]].
Wenn $\Phi$ [[Abbildungen#Surjektiv|surjektiv]] ist, ist $\Phi^*$ [[Abbildungen#Injektiv|injektiv]].
Wenn $\Phi$ [[Abbildungen#Injektiv|injektiv]] ist, ist $\Phi^*$ [[Abbildungen#Surjektiv|surjektiv]].
