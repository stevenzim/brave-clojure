
;;exercises for chapter 3
(ns brave-clojure.do-things.exercises)

; ex 1
(str "Kill" " Hobbits!!")
(vector "Sun" "Clouds")
(= '("Cats" "Tigers" "Cheetahs") (list "Cats" "Tigers" "Cheetahs"))
(hash-map "Cats" '("House cat" "Lion" "Tiger"))
(hash-set "Cat" "Cat" "Dog" "Dog")


;ex 2
(defn add100
  "Add 100 to a number passed in"
  [number]
  (+ 100 number))


(if (= (add100 607) 707) "Test passes" "Test fails")

;ex 3
(defn dec-maker
  "Create a custom decreaser, decreases by number specified"
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))

dec9
(if (= (dec9 10) 1) "Test passes" "Test fails")


;ex 4
(defn mapset
  "a function, mapset, that works like map except the return value is a set"
  [f coll]
  (set (map f coll)))

dec9
(if (= (mapset inc [1 1 2 2]) #{2 3}) "Test passes" "Test fails")
