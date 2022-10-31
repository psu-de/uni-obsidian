
$\forall c \in \mathbb{Z}: \exists a,b \in \mathbb{Z}: 3a + 2b = c$


$A(N) := [\forall n \in \mathbb(N_0): [n <= N \Rightarrow \exists a,b \in \mathbb{N_0}: 3a + 2b = c]]$
"Fuer alle Zahlen bis N in N0 gibt es zwei Zahlen a, b in N0, fuer die gilt 3a + 2b = c"

A(0) ist wahr, da a=0 + b=0, 0 ergeben
A(1) ist wahr, da a=1 + b=-1, 1 ergeben

Da bewisen ist, dass es ein a und b gibt, sodass 3a + 2b = N gilt,
gilt fuer 3(a + 1) + 2(b - 1) = N + 1, 
bzw fuer (3a - 1) + 2(b + 1) = N - 1

Fuer negative Zahlen gilt:
3(-|a + 1|) + 2(|b-1|) = N - 1

A(2): a = 2, b = -2
A(1): a = 1, b = -1
A(0): a = 0, b = 0
A(-1): a = -1, b = 1
A(-2): a = -2, b = 2

P({}) = {{}}
P(P({})) = {{}, {{}}}
P(P(P({}))) = {{}, {{}}, {{}, {{}}}}