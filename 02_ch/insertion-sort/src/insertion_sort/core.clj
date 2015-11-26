(ns insertion-sort.core)

(defn insertion-sort
  [a-vec]
  (if (empty? (rest a-vec))
    (first a-vec)
    ))

(insertion-sort [ 5 4 3 2 1 ])
