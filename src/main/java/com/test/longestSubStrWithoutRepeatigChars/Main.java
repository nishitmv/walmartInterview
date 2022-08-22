package com.test.longestSubStrWithoutRepeatigChars;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args)
    {

        String input = "abcbedacd";

        log.info(" Length : "+new LongestSubStrWOrepeatCharsCalc().calcLongestSubStringWithoutRepeatingChars(input));

    }



}
