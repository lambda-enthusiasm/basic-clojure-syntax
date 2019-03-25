(ns core-test
  (:require [core :refer :all]
            [clojure.test :refer :all]))

(deftest basic-test
  (testing "one"
    (is (= (one) 1))))
