public class MultidimensionalArrays {

    public static void main(String[] args) {

        // 2d Array = kinda like nested arrays

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrots"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] grocerries = {fruits, vegetables, meats};

        grocerries[0][0] = "pineapple";
        // in row 0 at collum 0

        for(String [] foods : grocerries){
            // for each element of x within method y
            // x will be defined into strings in the 2nd loop since methods a references
            for(String food : foods){
                // for each element of z within method x
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
