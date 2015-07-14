;;Write a function which drops every Nth item from a sequence.

;;test
;;(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

;;test
;;(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])

;;test
;;(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])

(fn[sq n] (remove nil? (map-indexed (fn[idx itm] (if (= 0 (mod (+ 1 idx) n)) nil itm )) sq)))