import javax.swing.Timer;

public class QuizController {
    private AdminHome model1;
    private instructionStudent model2;
    private QuizStudent model3;
    private QuizView model4;
    
    public QuizController(AdminHome model1, instructionStudent model2,QuizStudent model3){
        this.model1= model1;
        this.model2= model2;
        this.model3= model3;
    }
    
     public void setOpen(int open){
         model1.setopen(open);
     }
     public int getOpen(){
         return model1.getopen();
     }
     
     public void setRollNO(String rollNo){
         model2.setrollno(rollNo);
     }
     public String getRollNO(){
         return model2.getrollno();
     }
     
     public void setquestionId(String questionId){
         model3.setquestionid(questionId);
     }
     public String getquestionId(){
         return model3.getquestionid();
     }
     
     public void setAnswer(String answer){
         model3.setanswer(answer);
     }
     public String getAnswer(){
         return model3.getanswer();
     }
     
     public void setMin(int min){
         model3.setmin(min);
     }
     public int getMin(){
         return model3.getmin();
     }
     
     public void setSec(int sec){
         model3.setsec(sec);
     }
     public int getSec(){
         return model3.getsec();
     }
     
     public void setMarks(int marks){
         model3.setmarks(marks);
     }
     public int getMarks(){
         return model3.getmarks();
     }
     
     public void setTime(Timer time){
         model3.settime(time);
     }
     public Timer getTime(){
         return model3.gettime();
     }
}
