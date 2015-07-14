;;Write a function which returns the nth row of Pascal's Triangle.

;;test
;;(= (__ 1) [1])

;;test
;;(= (map __ (range 1 6))

 ;  [     [1]

;;        [1 1]

;;       [1 2 1]

;;      [1 3 3 1]

;;     [1 4 6 4 1]])

;;test 
;;(= (__ 11)
;;   [1 10 45 120 210 252 210 120 45 10 1])

(fn[nth-row-asked]
  
    (loop [nth-row-computed 1 ligne-triangle [1] ]
       (if (= nth-row-asked nth-row-computed)
            ligne-triangle
          (recur (inc nth-row-computed) (conj (vec(cons 1 
              (into [] (for[x (range 0 (- (count ligne-triangle) 1))] (+ (nth ligne-triangle x) (nth ligne-triangle (+ x 1)  ))))  ) ) 1)   )
        )
    )
  
  )