(ns praticando-clojure.basico.listas
  (:require [praticando-clojure.basico.operadores :as basico.operadores]))

(defn criando-lista []
  (list 1 3 4 5 6))

(defn criando-lista-com-apostrofo []
  '(1 2 3 4))

(defn criando-lista-com-range []
  (range 10))

(defn contando-quantidade-numeros [lista]
  (count lista))

(defn manipulando-lista-com-map [lista])
  ;(map basico.operadores/numero-quadrado lista))

(defn pegando-elemento-lista [lista index]
  (nth lista index))

(defn pegando-primeiro-elemento-lista [lista]
  (first lista))

(defn pegando-ultimo-elemento-lista [lista]
  (last lista))

(defn incluindo-novos-elementos-lista [lista elemento]
  (conj lista elemento))

;cons é uma funcao que permite que adicionemos um elemento a uma colecao
(def membros-fundadores (list "Argentina" "Brasil" "Paraguai"))

(def membros-plenos (cons "Venezuela" membros-fundadores))

;rest é uma funcao que pega uma colecao, ignora o primeiro elemento.
(def membros (rest membros-fundadores))

;identical é uma funcao que compara 2 elementos
;para saber se sao os mesmos elementos
(def identicos? (identical? membros membros-fundadores))
