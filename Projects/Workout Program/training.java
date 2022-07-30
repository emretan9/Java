
package Projects;

public class training {
    private int burpee_num;
    private int pushUp_num;
    private int sitUp_num;
    private int squat_num;

    //constructor
    training(int burpee_num,int pushUp_num,int sitUp_num,int squat_num){
        this.burpee_num=burpee_num;
        this.pushUp_num=pushUp_num;
        this.sitUp_num=sitUp_num;
        this.squat_num=squat_num;
    }
    //getter and setter
    public int getBurpee_num() {
        return burpee_num;
    }

    public void setBurpee_num(int burpee_num) {
        this.burpee_num = burpee_num;
    }

    public int getPushUp_num() {
        return pushUp_num;
    }

    public void setPushUp_num(int pushUp_num) {
        this.pushUp_num = pushUp_num;
    }

    public int getSitUp_num() {
        return sitUp_num;
    }

    public void setSitUp_num(int sitUp_num) {
        this.sitUp_num = sitUp_num;
    }

    public int getSquat_num() {
        return squat_num;
    }

    public void setSquat_num(int squat_num) {
        this.squat_num = squat_num;
    }
    public void workOut(String moveType,int number){
        if(moveType.equalsIgnoreCase("burpee")){
            doBurpee(number);
        }
        else if(moveType.equalsIgnoreCase("pushup")){
            doPushUp(number);
        }
        else if(moveType.equalsIgnoreCase("situp")){
            doSitUp(number);
        }
        else if(moveType.equalsIgnoreCase("squat")){
            doSquat(number);
        }
        else{
            System.out.println("Invalid training move!!");
        }
    }




    public void doBurpee(int number){
        if(burpee_num==0) System.out.println("We have no burpee move to do");
        if(burpee_num-number<0){
            System.out.println("CONGRATS! You passed the burpee number that you aim");
            burpee_num=0;//because we finished
            System.out.println("Remaininng burpee"+burpee_num);
        }
        else {
            //if we have more burpee number to do we extract from we did.
            burpee_num-=number;
            System.out.println("You have more burpee to do \nRemaining burpee number:"+burpee_num);
        }
    }
    public void doPushUp(int number){
        if(pushUp_num==0) System.out.println("We have no push up move to do");
        if(pushUp_num-number<0){
            System.out.println("CONGRATS! You passed the push up number that you aim");
            pushUp_num=0;//because we finished
            System.out.println("Remaininng push up"+pushUp_num);
        }
        else {
            //if we have more burpee number to do we extract from we did.
            pushUp_num-=number;
            System.out.println("You have more push up to do \nRemaining push up number:"+pushUp_num);
        }
    }
    public void doSitUp(int number){
        if(sitUp_num==0) System.out.println("We have no sit up move to do");
        if(sitUp_num-number<0){
            System.out.println("CONGRATS! You passed the sit up number that you aim");
            sitUp_num=0;//because we finished
            System.out.println("Remaininng sit up"+sitUp_num);
        }
        else{
            //if we have more burpee number to do we extract from we did.
            sitUp_num-=number;
            System.out.println("You have more sit up to do \nRemaining sit up number:"+sitUp_num);
        }
    }
    public void doSquat(int number){
        if(squat_num==0) System.out.println("We have no squat move to do");
        if(squat_num-number<0){
            System.out.println("CONGRATS! You passed the squat number that you aim");
            squat_num=0;//because we finished
            System.out.println("Remaininng squat"+squat_num);
        }
        else{
            //if we have more burpee number to do we extract from we did.
            squat_num-=number;
            System.out.println("You have more squat to do \nRemaining push up number:"+squat_num);
        }
    }
    public boolean isWorkOutFinish(){
        return(burpee_num == 0) && (pushUp_num == 0) && (sitUp_num == 0) && (squat_num == 0);
    }



}
