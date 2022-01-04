public class passTheBall {
    public static int positionFinder(int balls, int students, int pos){
        int result=(balls+pos)%students==0?students:(balls+pos)%students;
        return result-1==0?students:result-1;
    }
    public static void main(String[] args){
        int balls=8;
        int students=5;
        int startPos=2;
        System.out.println(positionFinder(balls, students, startPos));
    }
}
