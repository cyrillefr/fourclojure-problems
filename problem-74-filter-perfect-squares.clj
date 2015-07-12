;;Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.

;;test
;;(= (__ "4,5,6,7,8,9") "4,9")

;;test
;;(= (__ "15,16,25,36,37") "16,25,36")



(fn[seq1] (clojure.string/join ","  
     (filter (fn[a] (== (mod a (Math/sqrt a)) 0)  )  
             (map (fn[z] (Integer/parseInt z)  )  
                  (remove (fn[y] (= \, y) )  
                          (map (fn[x] x)  
                               (clojure.string/split seq1 #"," ))) ))))
