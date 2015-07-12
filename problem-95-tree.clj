;;Write a predicate which checks whether or not a given sequence represents a binary tree. Each node in the tree must have a value, a left child, and a right child.

;;test    
;;(= (__ '(:a (:b nil nil) nil))
;;    true)

;;test 
;;(= (__ '(:a (:b nil nil)))
;;false)

;;test
;;(= (__ [1 nil [2 [3 nil nil] [4 nil nil]]])
;;true)

;;test
;;(= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]])
;; false)

;;test
;;(= (__ [1 [2 [3 [4 nil nil] nil] nil] nil])
;;true)

;;test 
;;(= (__ [1 [2 [3 [4 false nil] nil] nil] nil])
;;false)

;;test not run    
;;(= (__ '(:a nil ()))
;;false)

(fn istree[tree]
    (if (nil? tree)
        true
        (and (coll? tree) (= 3 (count tree)) (istree (second tree)) (istree (second(next tree))) )
    )  
)