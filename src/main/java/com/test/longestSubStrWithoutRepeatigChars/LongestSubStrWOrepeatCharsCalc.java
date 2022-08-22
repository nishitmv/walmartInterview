package com.test.longestSubStrWithoutRepeatigChars;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class LongestSubStrWOrepeatCharsCalc {


    public int calcLongestSubStringWithoutRepeatingChars(String input)
    {
        if(input==null)
            return 0;
        if(input.length()==0)
            return 0;

        Map<Character, Integer> charCountMap = new HashMap<>();

        int longestSubString =0;
        int pointer1 = 0 ;
        int pointer2 = 0;

        int length = input.length();


        while(pointer1<length)
        {

            while(pointer1<length)
            {
                char character = input.charAt(pointer1);

                if(!charCountMap.containsKey(character))
                {
                    charCountMap.put(character, 1);

                    pointer1++;
                    longestSubString = Math.max(longestSubString,charCountMap.size() );
                }
                else{
                    charCountMap.computeIfPresent(character, (k,v) -> v+1);
                    pointer1++;
                    break;
                }

            }

            while( pointer2<pointer1)
            {
                char character = input.charAt(pointer2);

                if(charCountMap.containsKey(character) )
                {
                    if(charCountMap.get(character)>1) {
                        charCountMap.computeIfPresent(character, (k, v) -> v - 1);
                        pointer2++;
                        break;
                    }

                    else {
                        charCountMap.remove(character);
                        pointer2++;
                    }
                }
            }
        }

        return longestSubString;
    }

}
