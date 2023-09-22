
public class Main {

    //Question 1 - code could break if array has <1 elements
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2 - code could break if array has <2 elements
    public static int getSecondToLastIndex(String[] names) {
        //if statement added to throw error incase input is invalid
//        if (names.length < 2){
//            throw new IllegalArgumentException("Array has fewer than 2 elements");
//        }
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {
        return names[names.length -1];
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    //Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i : ints){ //enhanced/foreach loop
            sum += i;
        }
        return sum;
    }

    //Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int i : ints){
            sum += i;
        }
        int average = sum/ints.length;
        return average;
    }

    //Question 8 - learn how to use stringbuilder to be more efficient
    public static String extractAllOddNumbers(int[] numbers) {

        /*
        **This was populated automatically by IntelliJ**

        StringBuilder oddNumbers = new StringBuilder();

        for (int i : numbers){
            if (i%2 != 0){
                oddNumbers.append(i);
            }
        }
        return oddNumbers.toString();
        */

        String oddNumbers = "";

            for (int i : numbers){
                if (i%2 != 0){
                    oddNumbers += i;
                }
            }
            return oddNumbers;
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNumbers = "";

        for (int i : numbers){
            if (i%2 == 0){
                evenNumbers += i;
            }
        }
        return evenNumbers;

    }

    //Question 10 -- checking to see names[] contains a value == element??
    public static boolean contains(String[] names, String element) {
        for (String name : names) {
            if(name.equals(element)){
                return true;
            }
        } return false;
    }

    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        int i = 0;
        for (String name : names){
            if (name.equals(element)){
                return i;
            }
            i++;
        }
        return -1; //if element isn't found return this value
    }

    //Question 12
    public static void printOddNumbersInRange(int start, int end){
        if (start % 2 == 0){
            start++;
        }

        for( int i = start; i <= end; i += 2){
            System.out.println(i);
        }
    }

   //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        StringBuilder repeater = new StringBuilder();
        for (int i = 0; i < n; i++){
            repeater.append(str);
            repeater.append(" ");
        }
        return repeater.toString();
    }

    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThreeLetters = str.substring(0, 3);

        StringBuilder solution = new StringBuilder();

        for(int i = 0; i < n; i++){
            solution.append(firstThreeLetters);
            solution.append(" ");
        }
        return solution.toString();
    }

    //Question 15 write a java method to count all words in a string
    public static int WordsInAStringCounter(String str){
        /*
        -Count all words in a string
        -count the " " value in a string
        -Method to scan a string for certain values?
        -sum of all " " value + 1

        -If user accidentally adds more spaces, will incorrectly read how many words
        -Instead, count the separators as "OUT" (non counted values)
        - ex: (" ", \n, \t, would be excluded from string count since they are OUT values, and our variable will only accept values != OUT
        -.charAt() method retrieves character at index. Create if statement to iterate through all chars of String and return values that are non separator
         */

       final int OUT = 0;
       final int IN = 1;

        int state = OUT;
        int wordCount = 0;
        int i = 0;

        //scans all characters 1x1
        while (i < str.length()){
            //a lot of edge cases here, if the user decides to have poor grammar and write things out as such: "hello , i am Mike", the "," between hello and i is added in the wordcount. Many more symbols can be added as well to account for faulty user input. How do you condense?
            if(str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t' || str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == ';' || str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == '-'){
                state = OUT;
            } else if(state == OUT) {
                state = IN;
                ++wordCount;
            }
            i++;
        }
        return wordCount;
    }

   // Question 16
   // A, E, I, O, U, and sometimes Y

    public static int VowelsCounter(String str) {
        /*
        -Has to count specific elements of a string.
        -if String myString = "eutopia", how do we make an int value that counts the 6 vowels:
        -Method to compare the indexes of an array {a, e, i, o, u} to a String input?
        -
        -
        -
         */
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'}; //, 'A', 'E', 'I','O','U'};
        int counts = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i)); //to make sure cases are lowercase, easier to just add those to the array though as AEIOU in my opinion, added above for clarity
            for (int x = 0; x < vowelArray.length; x++) {               //after testing, A E I O U come out as extra unnecessary data rows since we are refactoring chars to their lower case value anyway
                if (currentChar == vowelArray[x]) {
                    counts++;
                    break;
                }
            }
        }
        return counts;
    }





    //Question 17
    //Swap the first element in an array with the last element in an array and return

    public static String[] swap(String[] stringArray) {
        /*
        -- swap stringArray[0] --> stringArray[1]
        -- ex: stringArray[] = {"Alfonse", "Ed", "Hohenheim", "The Dwarf", "Mustang"}
        -- how do you swap Alfonse with Mustang?
         */

        String temp = stringArray[0]; //temp is acting as a placeholder for the first index, so after it gets replaced by the last index, we can insert it back into the array. Holding it like memory

        stringArray[0] = stringArray[stringArray.length - 1];

        stringArray[stringArray.length - 1] = temp;

        return stringArray;

    }

   //Question 18
    /**
     * Given the following legend
     *
     * f >> 7
     * s >> $
     * 1 >> !
     * a >> @
     *
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     *
     */

    public static String replaceCharacters(String str) {
    /*
    -replace all f's with 7, all s with $, all 1 with !, and all a with @
    -identify all of those elements within a string
    -replace them with predefined elements (conversion items)
    -have to iterate through the chars of a string
    -
     */
    StringBuilder replacer = new StringBuilder(); //sb basically allows modification

    for (char i : str.toCharArray()){ //.toCharArray() is a String Object method that converts string to an array of chars. Easy to iterate through letter-by-letter
        char lowerCase = Character.toLowerCase(i); //convert the char to lower case, won't miss the capital letters when converting (Farmer --> 7@rmer and NOT --> F@rmer)

        switch (lowerCase){
            case 'f':
                replacer.append('7');
                break;
            case 's':
                replacer.append('$');
                break;
            case '1':
                replacer.append('!');
                break;
            case 'a':
                replacer.append('@');
                break;
            default:
                //if doesn't match any cases, append the string as is with the letter of the char
                replacer.append(i);
                break;
        }
    } return replacer.toString(); //replacer is currently a char[], needs to be converted to a string to print

    }

    //Question 19
      //      " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "

    public static String replaceWuTangTwoThreeDivisible(String stringInput) {

        /*
        -replace every element divisible by 2 with wu
        -replace every element divisible by 3 with wu tang
        -convert string to array of int indices
         */

        String[] testSentence = stringInput.split(" ");             //.split() method splits a String into an array of substrings, delimiter can be " " ---- "," ---- etc.

        for (int i = 0; i < testSentence.length; i++){
            if ((i + 1) % 2 == 0){
                testSentence[i] = "Wu";
            } else if ((i+1) % 3 ==0){
                testSentence[i] = "Tang";
            }


        }

        return String.join(" ", testSentence);               //joins the modified array back into a String data type (reading from left to right)
                                                                         //EX: "This is a test" [string input into param] --> {"This", "is", "a", "test"} [converted String to array with split()] -->
                                                                         // {"This", "Wu", "Tang", "Wu} [converted after replacing indexes via if statement] -->
                                                                        // "This Wu Tang Wu" [converted back with .join() method, join by concatenating testSentence[0]+testSentence[1]+testSentence[n]]


    }

    //Question 20

    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        /*
        Fibonacci sequence = series of numbers where next num is found by adding two previous nums
        ex: 0 1 1 2 3 5 8 13 21 34 55 89 144 ... etc

         */
        int first = 0;
        int second = 1;
        String fibonnaciString = "";

        if (maxnumber >= 1) {
            fibonnaciString += first;                                    //adds first element, always 0
        }

        while (second <= maxnumber){
            fibonnaciString += ", " + second;                            //adds second element
            int temp = second;
            second = first + second;
            first = temp;                                                //this logic creates the fib sequence by summing the first and second vars, storing it in a temp placeholder,
        }                                                                //and appending that to the string using the while statement
        return fibonnaciString;
    }

    public static void main(String[] args) {

        printOddNumbersInRange(3,53);

        String repeater = printGivenStringTimesNumberGiven("BOOYAKA", 12);
        System.out.println(repeater);

        String solution = repeatFirstThreeLetters("Gift", 6);
        System.out.println(solution);

        int howManyWords = WordsInAStringCounter("this , is my \n test            \t sentence    ");
        System.out.println(howManyWords);

        int howManyVowels = VowelsCounter("She sells sea shells down by the seashore");
        System.out.println(howManyVowels);

        String[] fMArray = {"Alfonse", "Ed", "Hohenheim", "The Dwarf", "Mustang"};
        fMArray = swap(fMArray);

        for(String characters : fMArray){
            System.out.println(characters);
        }

        String characterReplacer = replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer");
        System.out.println(characterReplacer);

        String wuTangNameGenerator = replaceWuTangTwoThreeDivisible("You thought this was a challenge? Ha ha ha ha!");
        System.out.println(wuTangNameGenerator);

        String fibonnaciMachine = createStringOfFibonnaciUpToMax(100);
        System.out.println(fibonnaciMachine);
    }

}
