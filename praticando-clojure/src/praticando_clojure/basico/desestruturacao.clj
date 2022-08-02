(ns praticando-clojure.basico.desestruturacao
  (:require [praticando-clojure.basico.composicoes :as basico.composicoes]))

;destructuring permite aprimoramos o uso de let
;quando  precisamos extrair valores de um argumento que é um mapa
(defn transacao-em-yuan [transacao]
  (let [{yuan :yuan} basico.composicoes/cotacoes]
    (assoc transacao :valor (* (:cotacao yuan) (:valor transacao))
                     :moeda (:simbolo yuan))))

(defn transacao-em-yuan-v2 [transacao]
  (let [{{cotacao :cotacao simbolo :simbolo} :yuan} basico.composicoes/cotacoes]
    (assoc transacao :valor (* cotacao (:valor transacao))
                     :moeda simbolo)))

(defn transacao-em-outra-moeda [moeda transacao]
  (let [{{cotacao :cotacao simbolo :simbolo} moeda} basico.composicoes/cotacoes]
    (assoc transacao :valor (* cotacao (:valor transacao))
                     :moeda simbolo)))

;a aplicacao partial de uma funcao significa que pegamos uma funcao
; que tem varios argumentos e criamos um nova, baseada nela,
; mas que recebe menos argumentos
(def transacao-em-euro (partial transacao-em-outra-moeda :euro))

(defn listando-resumo-partial []
  (map transacao-em-euro basico.composicoes/transacoes))

(def juntar-tudo (partial clojure.string/join ","))

(juntar-tudo (map transacao-em-yuan basico.composicoes/transacoes))

(defn transacao-convertida [cotacoes moeda transacao]
  (let [{{cotacao :cotacao simbolo :simbolo} moeda} cotacoes]
    (assoc transacao :valor (* cotacao (:valor transacao))
                     :moeda simbolo)))


(def transacao-em-outra-moeda (partial transacao-convertida basico.composicoes/cotacoes))


;aridade multiplan - uma funcao que que se comporta de formas diferentes
;de acordo com a quantidade de argumentos que recebe
(defn transacao-em-outra-moeda
  ([cotacoes moeda transacao]
   (let [{{cotacao :cotacao simbolo :simbolo} moeda} cotacoes]
     (assoc transacao :valor (* cotacao (:valor transacao))
                      :moeda simbolo)))
  ([moeda transacao]
   (transacao-em-outra-moeda basico.composicoes/cotacoes moeda transacao)))
