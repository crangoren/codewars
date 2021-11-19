package solutions;

public class WhoLikesIt {
    public static void main(String[] args) {

        countBits(1234);

    }

    /*You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

    Implement the function likes which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

    likes {} // must be "no one likes this"
    likes {"Peter"} // must be "Peter likes this"
    likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
    likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
    likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
    For 4 or more names, the number in and 2 others simply increases.*/

    static String r = "";
    public static String whoLikesIt(String... names) {
        //Do your magic here

        if (names.length > 0 && names.length < 2) {
            r = names[0] + " likes this";
        } else if (names.length > 0 && names.length < 3) {
            r = names[0] + " and " + names[1]  + " like this";
        } else if (names.length > 0 && names.length < 4) {
            r = names[0] + ", " + names [1] + " and " + names[2] + " like this";
        } else if (names.length > 3) {
            r = names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
        } else { r = "no one likes this";}

        return r;
    }

    public static int countBits(int n){
        String bin = Integer.toBinaryString(n);
        int counter = 0;
        for (int i = 0; i < bin.length(); i++) {
            counter += Character.getNumericValue(bin.charAt(i));
        }
        return counter;
    }

}
