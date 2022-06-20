public class Main {

    public static void main(String[] args){

        IfElse ifelse = new IfElse();

       // String newString = "This is Hello World";
        //System.out.println(ifelse.checkStringLength("Stanley"));
       // System.out.println(ifelse.printTStringsOnly(newString));

/*

                           For Loops





 */

        //here we are creating our String array right in the param of our method
       // ForLoops.printAssociatesNames(new String[] {"Jo Jo","CJ","DeeAnne","David","Shane"});

        //the other way is to declare the array first
        //assign it to a variable
        //and use the variable in the method param
        String[] associates = {"Shaquana","Mark", "Tyler", "Eric","Janga","Li" };
               // System.out.println(ForLoops.printTotalAssociatesNamesCount(associates));

/*
           While Loops
 */

       // WhileLoops.printFirst3Indexes(associates);

        /*
                 Do-While Loop
         */

       // DoWhile doWhile = new DoWhile();
        //doWhile.printValueIfTrue();

        /*
               Switch Statements
         */

        SwitchStatements switchStatements = new SwitchStatements();
        switchStatements.gradeCalculator(95);




    }



}
