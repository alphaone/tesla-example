(ns wife.core)

(defn analyse [q]
  (let [[_ q punctuation] (re-find #"(yes|no)([!?.]*)" (clojure.string/lower-case q))]
    {:q q :punctuation punctuation}))

(defn say [q]
  (let [aq (analyse q)]
    (case (aq :q)
      "no" (str "Yes" (aq :punctuation))
      "yes" (str "No" (aq :punctuation))
      q)))

