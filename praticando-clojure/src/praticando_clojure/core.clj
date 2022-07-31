(ns praticando-clojure.core
  (:require [praticando-clojure.basico.condicionais :as basico.condicionais]
            [praticando-clojure.basico.operadores :as basico.operadores]
            [praticando-clojure.basico.listas :as basico.listas]
            [praticando-clojure.basico.vectores :as basico.vectores]
            [praticando-clojure.basico.hash-set :as basico.hash-set]
            [praticando-clojure.basico.keywords :as basico.keywords]))


(def media (basico.operadores/calculando-media-aluno 0 0))
(basico.condicionais/aluno-aprovado media "Geovanne")

(basico.listas/criando-lista-com-apostrofo)
(basico.listas/criando-lista)
(basico.listas/criando-lista-com-range)
(basico.listas/contando-quantidade-numeros (basico.listas/criando-lista-com-range))
(basico.listas/manipulando-lista-com-map (basico.listas/criando-lista-com-range))
(basico.listas/pegando-elemento-lista (basico.listas/criando-lista-com-range) 3)
(basico.listas/pegando-primeiro-elemento-lista (basico.listas/criando-lista-com-range))
(basico.listas/pegando-ultimo-elemento-lista (basico.listas/criando-lista-com-range))
(basico.listas/incluindo-novos-elementos-lista (basico.listas/criando-lista-com-range) 30)

(basico.vectores/criando-vector-com-apostrofo)
(basico.vectores/criando-vector)
(basico.vectores/criando-vector-com-range)
(basico.vectores/contando-quantidade-numeros (basico.vectores/criando-vector-com-range))
(basico.vectores/manipulando-vector-com-map (basico.vectores/criando-vector-com-range))
(basico.vectores/pegando-elemento-vector (basico.vectores/criando-vector-com-range) 5)
(basico.vectores/pegando-primeiro-elemento-vector (basico.vectores/criando-vector-com-range))
(basico.vectores/pegando-ultimo-elemento-vector (basico.vectores/criando-vector-com-range))
(basico.vectores/incluindo-novos-elementos-vector (basico.vectores/criando-vector-com-range) 30)

(basico.hash-set/criando-hash-set)
(basico.hash-set/contando-quantidade-elementos (basico.hash-set/criando-hash-set))
(basico.hash-set/incluindo-novos-elementos-hash (basico.hash-set/criando-hash-set) 30)
(basico.hash-set/pegando-primeiro-elemento-hash (basico.hash-set/criando-hash-set))
(basico.hash-set/pegando-ultimo-elemento-hash (basico.hash-set/criando-hash-set))
(basico.hash-set/manipulando-set-com-map)

(basico.keywords/criando-mapa-com-keywords)
(basico.keywords/inserindo-par-chave-valor (basico.keywords/criando-mapa-com-keywords))
(basico.keywords/pegando-elementos (basico.keywords/criando-mapa-com-keywords))
(basico.keywords/pega-rotulos)



