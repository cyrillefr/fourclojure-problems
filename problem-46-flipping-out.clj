;;Write a higher-order function which flips the order of the arguments of an input function.

;;test 
;;(= 3 ((__ nth) 2 [1 2 3 4 5]))

;;test    
;;(= true ((__ >) 7 8))

;;test
;;(= 4 ((__ quot) 2 8))

;;test    
;;(= [1 2 3] ((__ take) [1 2 3 4 5] 3))

(fn[f] (fn[& nums] (apply f (reverse nums))))



