(ns mastermind.core-test
  (:use midje.sweet)
  (:use [mastermind.core]))

(facts "Code Breaker"
  (fact "score guess with no matches"
    (score [0 0 0 0] [1 1 1 1]) => [0 0])

  (fact "score guess with one :pos match"
    (score [0 0 0 0] [0 1 1 1]) => [1 0])

  (fact "score guess two :pos matches"
    (score [0 0 0 0] [0 1 1 0]) => [2 0]
    (score [0 0 0 0] [1 0 1 0]) => [2 0]
    (score [0 0 0 0] [0 1 0 1]) => [2 0])

  (fact "score guess many"
    (score [1 1 1 1] [0 1 1 1]) => [3 0]
    (score [0 0 0 0] [0 0 0 1]) => [3 0]
    (score [1 2 3 4] [1 2 3 4]) => [4 0])
)

(facts
  "Scoring Value Matches"
  
  (fact
    "one value match"
    (score [1 2 3 4] [2 0 0 0])=>[0 1]))
