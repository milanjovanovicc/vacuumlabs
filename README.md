Childspeak

My young daughter is learning how to talk. Talking is a hard challenge though. The consonants in particular give her a hard time! Therefore, she creates her own childspeak. After some time, we started to notice some rules: 

• She uses exactly one unique consonant in the word—once she comes to the first consonants, she replaces all the subsequent consonants with the first one. Example: instead of "maps", she says "mama".

• If the word starts with a vowel, she puts the first consonant to the very beginning, so instead of "alibaba" she says "lalilala". 

• If there is a group of consecutive consonants, she replaces the whole group with just a single consonant. For example instead of "lampa", she says "lala", instead of "bratislava" she says "babibaba".

• If there is a group of consecutive vowels, she replaces that group with the last vowel from the group. So instead of "naomi" she says "noni", instead of "aikido" she says "kikiko" ("ai" was replaced by "i" and prepended by "k, because of the 2nd rule).

• She ignores all the consonants after the last vowel, so instead of "ahoj" she says "haho". 

Understanding this kind of childspeak is a demanding task, especially because the pronunciation of many words is the same. 

In this task, you'll be given a list of all the words that matter. Your job is to calculate for each word how many other words (from the same list) have the same pronunciation in my daughter's childspeak. 

The input contains multiple words, one word per line. For every word, produce a word n line in the output file, where n is a number of words from the list having the same pronunciation as word . All lines in your output file have to be alphabetically sorted. (i.e. line with word alan has to precede line with mapa ). Alternatively, you can use a JSON input file with an array of words. 

You can assume that the input has less than 100,000 words. It consists only of lowercase words, using the 26-letter English alphabet: "abcdefghijklmnopqrstuvwxyz". You can also assume that each word in the list contains at least one consonant and one of the vowels: "aeiouy". The input may contain the same words multiple times. Even if a word is present multiple times in the input, the output should only contain it once. 

Sample input: 

mapa 
alan 
island 
lampa 
lajdak 
alan 
mama 

Sample output:
 
alan 2 
island 0 
lajdak 2 
lampa 2 
mama 1 
mapa 1 

Explanation: "alan", "lajdak" and "lampa" have the same pronunciation. "alan" is duplicated in the input, but it is only present once in the output. There is no other word that has the same pronunciation as "island". Finally, similarly to the first group, "mama" and "mapa" are both pronounced as "mama", for each of these words, there is exactly one other word with the same pronunciation. 
