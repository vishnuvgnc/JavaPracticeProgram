class LibraryManagement{
    int user_id;
    String book_name;
    String author_name;
    int card_number;
    String reminder_message;

    public String getAuthor_name() {
        return author_name;
    }public String getBook_name() {
        return book_name;
    }public int getUser_id() {
        return user_id;
    }public int getCard_number() {
        return card_number;
    }public String getReminder_message() {
        return reminder_message;
    }




    public static void main(String[] args) {
        LibraryManagement liba = new LibraryManagement();
        liba.user_id = 12564;
        liba.author_name = "vishnu";
        liba.reminder_message = "your return time period is one day";
        liba.book_name = "A little thing make memorable";
        liba.card_number = 456;
        System.out.println(liba.getUser_id());
        System.out.println(liba.getBook_name());
        System.out.println(liba.author_name);
        System.out.println(liba.getReminder_message());
        System.out.println(liba.card_number);
    }
}
