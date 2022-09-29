(ns simple-clj-api.core
  (:require [simple-clj-api.web :as w]
            [environ.core :refer [env]])
  (:gen-class))

(set! *warn-on-reflection* true)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [port (Integer/parseInt (or (env :port) "3000"))]
    (println "Starting web server on port:" port)
    (def server (w/start-server {:port port}))))

(comment
  (-main)
  )