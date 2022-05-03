(ns curso.aula01)

(map println ["Daniele" "Guilherme" "Carlos"])
(println (first ["Daniele" "Guilherme" "Carlos"]))
(println (rest ["Daniele" "Guilherme" "Carlos"]))
(println (next ["Daniele" "Guilherme" "Carlos"]))
(println (rest []))
(println (next []))
(println (seq [1,2,3,4]))


(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (funcao primeiro)))


(meu-mapa println ["Daniele", "Guilherme", "Carlos", "Paulo"])


(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if (not(nil? primeiro))
      (do
        (funcao primeiro)
        (meu-mapa funcao(rest sequencia))))))

(meu-mapa println ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"])
(meu-mapa println ["daniela" false "carlos" "paulo" "lucia" "ana"])


