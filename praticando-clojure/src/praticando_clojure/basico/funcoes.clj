(ns praticando-clojure.basico.funcoes
  (:require [praticando-clojure.basico.keywords :as basico.keywords]))

(defn funcao-anonima []
  (filter (fn [transacao] (> (:valor transacao) 100)) basico.keywords/transacoes))

(defn funcao-anonima-v2 []
  (filter #(> (:valor %) 100) basico.keywords/transacoes))