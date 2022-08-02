(ns praticando-clojure.basico.vectores
  (:require [praticando-clojure.basico.operadores :as basico.operadores]))


(defn criando-vector []
  (vector 1 3 4 5 6))

(defn criando-vector-com-apostrofo []
  [1 2 3 4])

(defn criando-vector-com-range []
  (vec (range 10)))

(defn contando-quantidade-numeros [vector]
  (count vector))

(defn manipulando-vector-com-map [vector])
  ;(vec (map basico.operadores/numero-quadrado vector)))

(defn pegando-elemento-vector [vector index]
  (get vector index))

(defn pegando-primeiro-elemento-vector [vector]
  (first vector))

(defn pegando-ultimo-elemento-vector [vector]
  (last vector))

(defn incluindo-novos-elementos-vector [vector elemento]
  (conj vector elemento))
