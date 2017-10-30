package com.example.ali_pc.quizapplication;

/**
 * Created by Ali-pc on 10/29/2017.
 */

public class Questions {
    private String Ques []={

                        "'OS' computer abbreviation usually means ?",
            "What is part of a database that holds only one type of information?",

                    "'.MOV' extension refers usually to what kind of file?",
            "'.MPG' extension refers usually to what kind of file?",

                    "Which is a type of Electrically-Erasable Programmable Read-Only Memory?"


    };





    private String Choice [] [] = {


            {"Open Software","Operating System","Operating Service","Open Source"},
            {"Field","Report","Record","File"},
            {"WordPerfect Document file","MS Office document","Image File","Movie File"},
            {"WordPerfect Document file","MS Office document","Movie file","Image File"},
            {"Flash","Flange","FRAM","Fury"}
    };

    private String Answers[] ={"Operating System","Field","Movie File","Movie File","Flash"};

    public String getQues(int a){
     String question = Ques[a];
        return question;

    }
    public String getChoice1(int a){
        String choice = Choice[a][0];
        return choice;

    }
   public String getChoice2(int a){
        String choice1 = Choice[a][1];
        return choice1;

    }
    public String getChoice3(int a){
        String choice2 = Choice[a][2];
        return choice2;

    }
    public String getChoice4(int a){
        String choice3 = Choice[a][3];
        return choice3;

    }

    public String getAnswer(int a){
        String answer = Answers[a];
        return answer;
    }


}
