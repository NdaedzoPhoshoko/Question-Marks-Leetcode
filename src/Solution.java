public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(QuestionMarks("aacc?7??sss?3rr1??????5"));
    }
    public static String QuestionMarks(String str)
    {
        int first = 0, second = 0;
        String truth = "true";
        for(int i=0; i< str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                first = Integer.parseInt(str.charAt(i)+"");//first digit
                int count_qm = 0;
                for(int j=i+1; j< str.length(); j++){
                    if(str.charAt(j) == '?'){
                        count_qm++;
                    }else if(Character.isDigit(str.charAt(j))){
                        second = Integer.parseInt(str.charAt(j)+""); //second digit
                        System.out.println("first:"+ first+ " and second: "+second);
                        if((first+second == 10) && count_qm != 3){
                            truth = "false";
                            j = str.length(); //stops the inner loop
                            i = str.length();//stops the outer loop
                        }else{
                            first = second;//second becomes the new first
                            i = j;
                        }
                    }
                }
            }
        }
        return truth;
    }
}
