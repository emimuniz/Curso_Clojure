(ns hospital.colecoes)

(defn teste-vetor []
  (let [espera [111 222]]
    (println espera)
    (println (conj espera 3333))
    (println (conj espera 4444))
    (println (pop espera))))

(teste-vetor)

(defn teste-lista []
  (let [espera '(111 222)]
    (println espera)
    (println (conj espera 3333))
    (println (conj espera 4444))
    (println (pop espera))))

(teste-lista)

