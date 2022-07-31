(ns praticando-clojure.basico.condicionais)

(defn aluno-aprovado [media nome]
  (cond (>= media 6) (str nome " aprovado!")
        (and (not= media 0) (< media 6)) (str nome " reprovado :c")
        :else "DP"))