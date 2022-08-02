(ns praticando-clojure.basico.hash-set
  (:require [praticando-clojure.basico.operadores :as basico.operadores]))

(defn criando-hash-set []
  #{"Lucia" "Silvano"})

(defn contando-quantidade-elementos [set]
  (count set))

(defn manipulando-set-com-map [])
  ;(map basico.operadores/numero-quadrado (hash-set 1 2 3)))

;assim como ele adiciona em posicoes aleatorias, também pega valores aleatoriamente.
(defn pegando-primeiro-elemento-hash [lista]
  (first lista))

(defn pegando-ultimo-elemento-hash [lista]
  (last lista))

(defn incluindo-novos-elementos-hash [lista elemento]
  (conj lista elemento))
