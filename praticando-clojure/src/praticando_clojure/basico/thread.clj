(ns praticando-clojure.basico.thread
  (:require [praticando-clojure.basico.keywords :as basico.keywords]))

(defn thread-first []
  (-> (first basico.keywords/transacoes)
      (basico.keywords/pegando-elementos)))

(defn thread-last []
  (->> (filter basico.keywords/despesa? basico.keywords/transacoes)
       (map basico.keywords/pegando-elementos)
       (reduce +)))