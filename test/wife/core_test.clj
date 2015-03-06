(ns wife.core-test
  (:require [clojure.test :refer :all]
            [wife.core :refer :all]))

(deftest say-test
  (testing "when I say yes, she says no"
    (is (= "No"
           (say "Yes"))))
  (testing "when I say no, she says yes"
    (is (= "Yes"
           (say "No"))))
  (testing "case does not matter"
    (is (= "Yes"
           (say "no"))))
  (testing "she does repeat what i say if its not yes or no"
    (is (= "Hello?"
           (say "Hello?"))))
  (testing "exclamation marks will be matched"
    (is (= "Yes!!!"
           (say "No!!!"))))
  (testing "other marks will be matched, too"
    (is (= "Yes.!?"
           (say "No.!?"))))
)

(deftest analyse-question-test
  (testing "it gets the correct question and punctuation"
    (is (= {:q "yes" :punctuation "!!!"}
           (analyse "Yes!!!"))))
  (testing "it works without punctuation marks"
    (is (= {:q "no" :punctuation ""}
           (analyse "No"))))
  (testing "it works with different punctuation marks"
    (is (= {:q "no" :punctuation "?!?"}
           (analyse "No?!?"))))
)
