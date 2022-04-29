(ns teste.aula5)

(def estoque {"Mochila" 10, "Camiseta" 5})

(println estoque)
(println "Temos" (count estoque) "elementos")
(println "Chaves sao" (keys estoque))
(println "Valores sao" (vals estoque))


;keyword
(def estoque {:mochila 10, :camiseta 5})
(println estoque)

(println (assoc estoque :cadeira 2))

(println (update estoque :mochila inc))

(defn tira-um
  [valor]
  (println "tirando um de" valor)
  (- valor 1))

(println (update estoque :mochila tira-um))

(println (update estoque :mochila #(- % 3)))

(println (dissoc estoque :mochila))



(def pedido {:mochila { :quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})
(println "\n\n\n\n")
(println pedido)



(def pedido (assoc pedido :chaveiro {:quantidade 1, :preco 10}))
(println pedido)

(println (update-in pedido [:mochila :quantidade] inc))

(println (-> pedido
             :mochila
             :quantidade))

(-> pedido
    :mochila
    :quantidade
    println)