(ns praticando-clojure.basico.composicoes)

(def transacoes [{:valor 33.0 :tipo "despesa" :comentario "Almoco" :moeda "R$" :data "19/11/2016"}
                 {:valor 2700.0 :tipo "receita" :comentario "Bico" :moeda "R$" :data "01/12/2016"}
                 {:valor 29.0 :tipo "despesa" :comentario "Livro de Clojure" :moeda "R$" :data "03/12/2016"}])

(def cotacoes {:yuan {:cotacao 2.15 :simbolo "Y"}})

(defn valor-sinalizado [transacao]
  (let [moeda (:moeda transacao "R$")
        valor (:valor transacao)]
    (if (= (:tipo transacao) "despesa")
      (str moeda "-" valor)
      (str moeda "+" valor))))

(defn data->valor [transacao]
  (str (:data transacao) " => " (valor-sinalizado transacao)))


(defn alterando-transacao-em-yuan [transacao]
  
  (assoc transacao :valor (* 2.15 (:valor transacao)) :moeda "Y"))

(defn transacao-em-yaun [transacao]
  (assoc transacao :valor (* (:cotacao (:yuan cotacoes))
                             (:valor transacao))
                   :moeda (:simbolo (:yuan cotacoes))))

(defn transacao-em-yaun-get [transacao]
  (assoc transacao :valor (* (get-in cotacoes [:yuan :cotacao])
                             (:valor transacao))
                   :moeda (get-in cotacoes [:yuan :simbolo])))
