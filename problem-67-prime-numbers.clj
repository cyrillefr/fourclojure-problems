;;Write a function which returns the first x number of prime numbers.
	

;;(= (__ 2) [2 3])

;;(= (__ 5) [2 3 5 7 11])	

;;(= (last (__ 100)) 541)


(fn [number-of-primes]
    (loop [number-to-test 2 elts []]
      (if (= (count elts) number-of-primes )
        elts
        (recur (inc number-to-test)   
               (if  (= true (
                            (fn[n]
                            (if (> (count (filter (fn[y] (=  (/ n y ) (int(/ n y))  )   ) (map (fn[x] x) (range 2 n )) )) 0  ) false true  )    
                            ) number-to-test) ) (conj elts number-to-test) elts  )       
        )
      )
    )  
  )
