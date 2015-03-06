(ns wife.system
  (:require [de.otto.tesla.system :as system]
            [wife.pages :as pages]
            [com.stuartsierra.component :as c])
  (:gen-class))

(defn wife-system [runtime-config]
  (-> (system/empty-system (merge {:name "wife-service"} runtime-config))
      (assoc :home-page
             (c/using (pages/new-home-page) [:routes :app-status]))
      (c/system-using {:server [:home-page]})))

(defn -main
  "starts up the production system."
  [& args]
  (system/start-system (wife-system{})))

