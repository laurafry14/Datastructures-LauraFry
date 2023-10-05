package Arrays;

public class TwoDimensionalArray {
    int arr[][] = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfCols) {
        this.arr = new int[numberOfRows][numberOfCols];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    //Inserting value in the array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index for 2D array");
        }
    }

    //Accessing cell value from a given array
    public void selectCell(int row, int col) {
        int cellValue;
        cellValue = arr[row][col];
        System.out.println("The cell value for the given array is " + cellValue);
        System.out.println();
    }

    //Traverse 2D
    public void traverseArray() {
        try {
            int numRows = arr.length;
            int numCols = arr[0].length;

            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    int element = arr[row][col];
                    System.out.println(element + " ");
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
    }

    //Search a single value from the array
    public void searchArray(int valueToSearch) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == valueToSearch) {
                    System.out.println("The value " + valueToSearch + " is found at " + row + ", " + col);
                    return;
                }

            }
        }
        System.out.println("The value does not exist");
    }

    //Deleting a value from Array
    public void deleteValue(int rowToDeleteIndex, int colToDeleteIndex){
        try {
            arr[rowToDeleteIndex][colToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }
}