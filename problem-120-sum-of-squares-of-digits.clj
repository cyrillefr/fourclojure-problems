;;Write a function which takes a collection of integers as an argument. Return the count of how many elements are smaller than the sum of their squared component digits. For example: 10 is larger than 1 squared plus 0 squared; whereas 15 is smaller than 1 squared plus 5 squared.

;;test
;;(= 8 (__ (range 10)))

;;test    
;;(= 19 (__ (range 30)))

;;test    
;;(= 50 (__ (range 100)))

;;test    
;;(= 50 (__ (range 1000)))


(fn[coll](count (filter true? 
                        (map < coll  
                             ((fn[sq](map (fn[b] (reduce + (
                                                      map (fn[a] (* a a)) b ) )  ) (
                                                              map (fn[y] (map (fn[x] (Character/getNumericValue x) ) (
                                                                                                  concat (str y))))  sq )  )) coll)  ))) )