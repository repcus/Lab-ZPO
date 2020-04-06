public class Quiz {
    private String question;
    private String[] answers;

    public Quiz(String askedQuestion, String providedAnswer){
        this.question = askedQuestion;
        this.answers = new String[1];
        this.answers[0] = providedAnswer;
    }

    public String getQuestion(){
        return question;
    }

    public String[] getAnswers(){
        return answers;
    }

    public static double assessPoints(String[] answers, String answer){
        boolean isWorthFull = false, isWorthHalf = false;
        int levDistance;
        for(String currentAnswer : answers){
            levDistance = Levenshtein.levDistance(answer, currentAnswer);
            if(levDistance == 0){
                isWorthFull = true;
                break;
            }else if(levDistance == 1){
                isWorthHalf = true;
            }
        }
        if(isWorthFull){
            return 1;
        }else if(isWorthHalf){
            return 0.5;
        }else{
            return 0;
        }
    }
}
