(ns test-runner
  (:gen-class)
  (:require  [clojure.test :refer [run-tests]])
  (:use [core-test]))

(defn -main []
  (run-tests 'core-test))

