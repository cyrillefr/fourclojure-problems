;;Given two integers, write a function which returns the greatest common divisor.

;;test  
;;(= (__ 2 4) 2)

;;test
;;(= (__ 10 5) 5)

;;test
;;(= (__ 5 7) 1)

;;test
;;(= (__ 1023 858) 33)


(fn[Num1 Num2]
    ; for each of the parameters, find all the divisors
    ; range gives all number above
    ; for each of the ranges, we keep divisors
    ; store in a set
    ; reduce it with intersection
    ; sort then take the last which means the greatest
      (last(sort
        (reduce (fn[a b] (clojure.set/intersection a b) )
         (map (fn[x] (set (filter (fn[y]  (= 0 (mod x y)) ) (range 1 (+ x 1))))   ) [Num1 Num2])
        ))
      )
  )