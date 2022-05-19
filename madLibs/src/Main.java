/*In this project, I’ll use Java to write a Mad Libs word game! Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).

Mad Libs require:

- A short story with blank spaces (asking for different types of words).
- Words from the player to fill in those blanks.

Challenge:

1. Create a story!
2. Create all the variables needed for the story!
3. Print the story with the variables in the right places!

*/

public class Main {
    /*
    My description here:
    This program generates a mad libbed story.
    Author: MackInTech
    Date: 05/19/2022
    */
    public static void main(String[] args){
        String name1 = "Mr. Java";
        String adjective1 = "great";
        String adjective2  = "awesome";
        String adjective3 = "powerful";
        String verb1 = "code";
        String noun1 = "developer";
        String noun2 = "C#";
        String noun3 = "chants";
        String noun4 = "protester";
        String noun5 = "software";
        String noun6 = "Java Dev";
        String name2 = "Mrs. Java";
        int number = 2030;
        String place1 = "The C# Islands";



        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);

    }
}