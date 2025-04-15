package Q3.LibraryManagement;

public class Transaction {
        private String isbn;
        private String patronId;
        private String checkoutDate; // Simple date format
        private String returnDate; // Optional, can be null if not returned yet

        // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default

        public Transaction(String nbsi, String someID, String dateChecked)
        {
                isbn = nbsi;
                patronId = someID;
                checkoutDate = dateChecked;
                returnDate = null;
        }

        // TODO: Implement getters and setters
        public void updateReturnDate(String newDate)
        {
                returnDate = newDate;
        }



        @Override
        public String toString() {
            return "Transaction{" +
                    "isbn='" + isbn + '\'' +
                    ", patronId='" + patronId + '\'' +
                    ", checkoutDate='" + checkoutDate + '\'' +
                    ", returnDate='" + returnDate + '\'' +
                    '}';
        }
}
