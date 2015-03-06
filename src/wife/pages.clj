(ns wife.pages
  (:require
    [com.stuartsierra.component :as c]
    [de.otto.tesla.stateful.routes :as routes]
    [de.otto.status :as status]
    [de.otto.tesla.stateful.app-status :as app-status]
    [wife.core :as w]
    [compojure.core :as compojure]
    [hiccup.core :as hiccup]))

(defn usage-page [self]
  (let [x 1]
    (hiccup/html [:body [:h1 "SAY SOMETHING"]
                  [:div (str "call /say/no to get Yes")]
                  [:div (str x " calculations so far")]])))

(defn result-page [self input]
  (let [result (w/say input)]
    (hiccup/html [:body [:h1 (str "Answer to '" input "' is:")]
                  [:div (str result)]])))


(defrecord HomePage []
  c/Lifecycle
  (start [self]
    (routes/register-routes (:routes self)
                            [(compojure/GET "/say" [_] (usage-page self))
                             (compojure/GET "/say/:input" [input] (result-page self input))])
    ; (app-status/register-status-fun (:app-status self)
      ; (fn [] (status/status-detail :home-page :ok "page is always fine")))
    self)
  (stop [self]
    self))

(defn new-home-page [] (map->HomePage {}))