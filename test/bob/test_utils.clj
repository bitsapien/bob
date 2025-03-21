;   This file is part of Bob.
;
;   Bob is free software: you can redistribute it and/or modify
;   it under the terms of the GNU General Public License as published by
;   the Free Software Foundation, either version 3 of the License, or
;   (at your option) any later version.
;
;   Bob is distributed in the hope that it will be useful,
;   but WITHOUT ANY WARRANTY; without even the implied warranty of
;   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
;   GNU General Public License for more details.
;
;   You should have received a copy of the GNU General Public License
;   along with Bob. If not, see <http://www.gnu.org/licenses/>.

(ns bob.test-utils
  (:require [clojure.set :as s]))

(defn check-and-fail
  ([pred]
   (check-and-fail pred "Unexpected args!"))
  ([pred ^String message]
   (when-not (pred)
     (throw (Exception. message)))))

(defn subseq?
  [s1 s2]
  (s/subset? (set s1) (set s2)))
