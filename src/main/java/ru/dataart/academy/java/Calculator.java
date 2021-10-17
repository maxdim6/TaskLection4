package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */


    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int firstSize = firstNumber.size() - 1;
        int secondSize = secondNumber.size() - 1;
        int ans = 0;
        while (firstSize > -1) {
            ans += firstNumber.get(firstSize) * Math.pow(10, firstSize);
            firstSize--;
        }
        while (secondSize > -1) {
            ans += secondNumber.get(secondSize) * Math.pow(10, secondSize);
            secondSize--;
        }
        return ans;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        int count = 0;
        List<T> answer = new ArrayList();
        if (count % 2 == 1){
            count--;
        }
        while (count < list.size()){
            answer.add(list.get(count));
            count += 2;
        }
        return answer;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> answer2 = new ArrayList();
        if (list.size() > 0) {
            answer2.add(list.get(0));
            answer2.add(list.get(list.size() - 1));
        }

        return answer2;
    }
}
