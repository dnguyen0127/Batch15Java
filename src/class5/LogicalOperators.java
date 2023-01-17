package class5;

public class LogicalOperators {
    public static void main(String[] args) {

        /*
        * if the score in all the subjects  are great than 90
        * prtint "brilliant student
        * otherwise print you need to work hard
        * */


        double  mathScore=92.5;
        double  historyScore=91.5;
        double  scienceScore=93.5;


        if (mathScore>=90 && historyScore>=90 && scienceScore>=90) {
            System.out.println("You are a brilliant Student");
        }
        else {
            System.out.println("You need to work harder");
        }


    }
}
