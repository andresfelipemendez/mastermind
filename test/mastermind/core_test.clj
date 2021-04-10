(ns mastermind.core-test
  (:use midje.sweet)
  (:use [mastermind.core]))

(facts "Code Breaker"
  (fact "initial guess"
    (break-code []) => [0 0 0 0]))
