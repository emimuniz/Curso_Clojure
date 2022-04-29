(ns curso.aula4)

(def precos [30 700 1000])

(println precos)
(println (get precos 0))
(println (get precos 2))
(println "Valor padrao nill" (get precos 17))
(println "Valor padrao 0" (get precos 17 0))


(println (conj precos 2000))


(println (update precos 0 inc))
(println (update precos 0 dec))


(defn soma-1
  [valor]
  (println "Estou somando em" valor)
  (+ valor 1))

(println (update precos 0 soma-1))



(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(println (map valor-descontado precos))

(println (filter even? (range 10)))
(println (filter aplica-desconto? precos))

(println (map valor-descontado (filter aplica-desconto? precos)))


(println (reduce + precos))

(defn minha-soma
  [valor-1 valor-2]
  println "Somando" valor-1 valor-2
  (+ valor-1 valor-2))

(println (reduce minha-soma precos))