(ns ladder.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [ladder.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'ladder.core-test))
    0
    1))
