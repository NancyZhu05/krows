public class MainController {
    public static void main(String[] args){

        int[][] test = {{1, 1, 0, 0},
                        {1, 1, 0, 0},
                        {1, 1, 0, 0},
                        {1, 1, 0, 0}};
        
        CheckEight tester = new CheckEight();
        System.out.println(tester.checkEight(test, 0, 0, 'v'));

    }
}
