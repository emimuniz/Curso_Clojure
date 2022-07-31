(ns praticando-clojure.basico.keywords)

(def transacao-desnecessaria {:valor 34 :tipo "despesa" :rotulos '("desnecessaria" "cartao")})

(def transacoes [{:valor 33.0 :tipo "despesa" :comentario "Almoco" :data "19/11/2016"}
                 {:valor 2700.0 :tipo "receita" :comentario "Bico" :data "01/12/2016"}
                 {:valor 29.0 :tipo "despesa" :comentario "Livro de Clojure" :data "03/12/2016"}])

(defn criando-mapa-com-keywords []
  (hash-map :valor 200 :tipo "receita"))

(defn inserindo-par-chave-valor [transacao]
  (assoc transacao :categoria "Educação"))

(defn pegando-elementos [transacao]
  (:valor transacao))

(defn pega-rotulos []
  (:rotulos transacao-desnecessaria))

(defn elemento-nao-existe []
  (:cidade transacao-desnecessaria '()))

(defn resumo [transacoes]
  (select-keys transacoes [:valor :tipo :data]))

(defn listando-transacoes []
  (map resumo transacoes))


(defn despesa? [transacao]
  (= (:tipo transacao) "despesa"))

(defn filtrando-transacoes []
  (filter despesa? transacoes))

(defn lista-valores []
  (map pegando-elementos (filtrando-transacoes)))

(defn somando-valores []
  (reduce + (lista-valores)))

(defn valor-maior-que-100? [transacao]
  (> (:valor transacao) 100))

(defn verfica-valor []
  (filter valor-maior-que-100? transacoes))



