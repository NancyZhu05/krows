public class CheckEight {

    public String checkEight(int[][] testArray, int startRow, int startCol, char dir) {

        // If the check is valid pull the valid check position to the valid array and
        // then solve each row to output the final result
        if (dir == 'h') {
            if (startRow == testArray.length) {
                for (int col = startCol; col < (startCol + 4); col++) {
                    // row 1
                    if(testArray[0][col] == 0){
                        return "false";
                    }
                    // row 4
                    if(testArray[3][col] == 0){
                        return "false";
                    }
                }
            } else {
                for (int row = startRow; row < (startRow + 2); row++) {
                    for (int col = startCol; col < (startCol + 4); col++) {
                        if(testArray[row][col] == 0){
                            return "false";
                        }
                    }
                }
            }
            switch (startRow){
                case 0:
                    return "A'";
                case 1: 
                    return "B";
                case 2:
                    return "A";
                case 3:
                    return "B'";
            }
        } else {
            if (startCol == testArray[0].length) {
                for (int row = startRow; row < (startRow + 4); row++) {
                    // col 1
                    if(testArray[row][0] == 0){
                        return "false";
                    }
                    // col 4
                    if(testArray[row][3] == 0){
                        return "false";
                    }
                }
            } else {
                for (int row = startRow; row < (startRow + 4); row++) {
                    for (int col = startCol; col < (startCol + 2); col++) {
                        if(testArray[row][col] == 0){
                            return "false";
                        }
                    }
                }
            }
            switch (startCol){
                case 0:
                    if(testArray[0].length == 2){
                        return "1";
                    }else{
                        return "C'";
                    }
                case 1: 
                    return "D";
                case 2:
                    return "C";
                case 3:
                    return "D'";
            }
        }
        return "error";
    }
}
