(ns cursive-shadow-cljs.preload
  (:require [cljs.spec.alpha :as s]
            [cljs.test :as test]
            [expound.alpha :as expound]
            [orchestra-cljs.spec.test :as orchestra]))

(set! s/*explain-out* (expound/custom-printer {:theme :figwheel-theme}))

(defn after-load!
  []
  (orchestra/instrument))
