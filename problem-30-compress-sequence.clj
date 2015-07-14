;;Write a function which removes consecutive duplicates from a sequence.

;;test
;;(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")

;;test 
;;(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

;;test
;;(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])

(fn[sq] (
         map (fn[y] (first y )  ) (
                 map (fn[x] (distinct x) )  (
                       partition-by identity sq))))