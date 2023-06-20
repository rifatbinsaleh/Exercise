    class Library {
        private String name;
        private String address;
        private Book[] books;
        private LibraryMember[] members;
        private int bookCount;
        private int memberCount;


        public Library(String name, String address) {
            System.out.println(name);
            System.out.println(address);
            this.books = new Book[100];
            this.members = new LibraryMember[100];
            this.bookCount = 0;
            this.memberCount = 0;
        }

        public void addBook(Book book) {
            books[bookCount] = book;
            bookCount++;
        }

        public void removeBook(Book book) {
            for (int i = 0; i < bookCount; i++) {
                if (books[i].equals(book)) {
                    books[i] = books[bookCount - 1];
                    books[bookCount - 1] = null;
                    bookCount--;
                    break;
                }
            }
        }

        public void addMember(LibraryMember member) {
            members[memberCount] = member;
            memberCount++;
        }

        public void removeMember(LibraryMember member) {
            for (int i = 0; i < memberCount; i++) {
                if (members[i].equals(member)) {
                    members[i] = members[memberCount - 1];
                    members[memberCount - 1] = null;
                    memberCount--;
                    break;
                }
            }
        }

        public Book[] searchBook(String keyword) {
            Book[] searchResults = new Book[100];
            int count = 0;
            for (int i = 0; i < bookCount; i++) {
                if (books[i].getTitle().contains(keyword) || books[i].getAuthor().contains(keyword)) {
                    searchResults[count] = books[i];
                    count++;
                }
            }
            return searchResults;
        }

        public void displayBooks() {
            System.out.println("Books in the library:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i].getTitle() + " by " + books[i].getAuthor());
            }
        }
    }