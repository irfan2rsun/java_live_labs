package week05;

/*
Your cell phone rings. Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.

boolean isMorning, isMom, isAsleep

1. declare variable and assign it
2. if isMorning is true and isMom is true => answer
3. if isMorning is true and isMon is false => notAnswer
4. if isAsleep is true not going to answer
 */
public class AnswerCall {
    public static void main(String[] args) {

        answerThePhone(true, true, true);
        answerThePhone(true,true,false);
        answerThePhone(false,true,false);

    }

    static void answerThePhone(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (isAsleep == true) {
            System.err.println("The phone owner you have called is not currently in this dimension");
            return;
        }

        if (isMorning == true && isMom == true) {
            System.out.println("Answer the call");
        } else if (isMorning == true && isMom == false) {
            System.out.println("Not going to answer");
        } else {
            System.out.println("Not going to answer");
        }


    }

}


