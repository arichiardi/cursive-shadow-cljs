(ns cursive-shadow-cljs.core
  (:require [cljs.spec.alpha :as s]))

(defn add-one
  [x]
  (+ 1 x))

(s/fdef add-one
  :args (s/cat :x number?)
  :ret number?
  :fn (fn [{:keys [ret args]}]
        (= ret (inc (:x args)))))

(defn -main [& cli-args]
  (print "hello world"))

(comment
  (require '[orchestra-cljs.spec.test :as orchestra])
  (orchestra/instrument))
