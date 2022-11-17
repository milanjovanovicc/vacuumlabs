package vacuumlabs;

public class ChildSpeak {

    public ChildSpeak() {
    }

    public String childSpeakMethod(String word) {
        String newWord;

        newWord = replaceWithFirstConsonant(word);
        newWord = startsWithVowel(newWord);
        newWord = consecutiveConsonants(newWord);
        newWord = consecutiveVowels(newWord);
        newWord = ignoresConsonants(newWord);

        return newWord;
    }

    public String replaceWithFirstConsonant(String word) {
        String firstConsonant = "";
        String newWord = word;

        for (int i = 0; i < newWord.length(); i++) {

            if (firstConsonant.isEmpty() && Consonants.listOfConsonants().contains(String.valueOf(newWord.charAt(i)))) {
                firstConsonant = String.valueOf(newWord.charAt(i));
            }
            if (Consonants.listOfConsonants().contains(String.valueOf(newWord.charAt(i)))) {
                newWord = newWord.replace(newWord.charAt(i), firstConsonant.charAt(0));
            }

        }
        return newWord;
    }

    public String startsWithVowel(String word) {
        String firstConsonant = "";
        String newWord = word;

        for (int i = 0; i < newWord.length(); i++) {
            if (firstConsonant.isEmpty() && Consonants.listOfConsonants().contains(String.valueOf(newWord.charAt(i)))) {
                firstConsonant = String.valueOf(newWord.charAt(i));
            }
            if (Vowels.listOfVowels().contains(String.valueOf(newWord.charAt(0)))) {
                newWord = firstConsonant + newWord;
            }

        }
        return newWord;
    }

    public String consecutiveConsonants(String word) {
        String newWord = word;
        int i = 0;
        StringBuilder builder = new StringBuilder(newWord);
        while (i < newWord.length() - 1) {
            if (Consonants.listOfConsonants().contains(String.valueOf(newWord.charAt(i)))
                    && Consonants.listOfConsonants().contains(String.valueOf(newWord.charAt(i + 1)))) {

                newWord = String.valueOf(builder.deleteCharAt(i));
                i = i - 1;
            }
            i++;

        }
        return newWord;
    }

    public String consecutiveVowels(String word) {
        String newWord = word;
        StringBuilder builder = new StringBuilder(word);

        int i = 0;
        while (i < newWord.length() - 1) {
            if (Vowels.listOfVowels().contains(String.valueOf(newWord.charAt(i)))
                    && Vowels.listOfVowels().contains(String.valueOf(newWord.charAt(i + 1)))) {

                newWord = String.valueOf(builder.deleteCharAt(i));
                i = i + 1;
            }
            i++;

        }

        return newWord;
    }

    public String ignoresConsonants(String word) {
        String newWord = word;
        int lastVowelIndex = 0;
        int max;

        for (int i = 0; i < Vowels.listOfVowels().size(); i++) {
            max = newWord.lastIndexOf(Vowels.listOfVowels().get(i));

            if (lastVowelIndex < max) {
                lastVowelIndex = max;
            }

        }

        return newWord.substring(0, lastVowelIndex + 1);
    }


}
