(defproject simple-clj-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/core.async "1.5.648"]
                 [ring/ring-core "1.9.5"]
                 [ring/ring-jetty-adapter "1.9.5"]
                 [metosin/reitit "0.5.15"]
                 [metosin/jsonista "0.3.5"]
                 [metosin/muuntaja "0.6.8"]
                 [ring-cors "0.1.13"]
                 [environ "1.2.0"]]
  :plugins [[lein-environ "1.2.0"]]
  :main simple-clj-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot      :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"
                                  "-Dclojure.compiler.elide-meta=[:doc :file :line :added]"]}
             :dev     {:plugins [[lein-shell "0.5.0"]]}})
