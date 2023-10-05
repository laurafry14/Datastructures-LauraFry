package Arrays;

public class MovieTheaterSeating {
    public static void main(String[] args) {
        // Define a 2D array to represent the seating chat
        boolean[][] seatingChat = new boolean[10][10];

        // Initialize the seating chart with all the seats as available
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                seatingChat[i][j] = true;
            }
        }
        //Display the initial seating chart
        System.out.println("Welcome to the Movie Theater!");
        displaySeatingChart(seatingChat);

        //Simulate ticket reservations
        reserveSeat(seatingChat, 2, 3);
        reserveSeat(seatingChat, 1, 0);
        reserveSeat(seatingChat, 3, 2);

        //Display the updated seating chart
        System.out.println("\nUpdated Seating Chart: ");
        displaySeatingChart(seatingChat);

    }
    //Method to display the seating chart
    public static void displaySeatingChart(boolean[][] charts){
        for (int i = 0; i < charts.length; i++){
            for (int j = 0; j < charts[i].length; j++){
                if (charts[i][j]){
                    System.out.print("0 "); //0 represents an available seat
                } else {
                    System.out.print("X "); //X represents a reserved seat
                }
            }
            System.out.println(); //move to the next row
        }
    }
    //method to reserve a seat
    public static void  reserveSeat(boolean[][] charts, int row, int col){
        if (row >= 0 && row < charts.length && col >=0 && col < charts[0].length ){
            if(charts[row][col]){
                charts[row][col] = false; // Seat is reserve
                System.out.println("Seat at Row " + (row + 1) + ", Column " + (col + 1) + " has been reserved. ");
            }else {
                System.out.println("Seat at Row " + (row + 1) + ", Column " + (col + 1) + " is already reserved. ");
            }
        } else {
            System.out.println("Invalid seat selection. ");
        }
    }
}
