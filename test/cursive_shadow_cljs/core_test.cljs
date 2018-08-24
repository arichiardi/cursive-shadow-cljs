(ns cursive-shadow-cljs.core-test
  (:require [cursive-shadow-cljs.core :as core]
            [cljs.test :as t :refer-macros [deftest is testing]]
            [orchestra-cljs.spec.test :as orchestra]))

(orchestra/instrument)

(defn throw-oh-no
  []
  (throw (js/Error. "Oh no!")))

(deftest my-weird-tests
  (is (= 0 0) "should succeed")
  (is (thrown? js/Error (throw-oh-no)) "should throw"))

(deftest test-add-one
  (is (= 2 (core/add-one 1))))
