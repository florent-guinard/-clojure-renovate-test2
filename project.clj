(defproject clojure-renovate-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :main ^:skip-aot my-project.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :dependencies [[org.clojure/clojure "1.9.0"]])
