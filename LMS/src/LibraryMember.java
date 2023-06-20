import java.io.*;
abstract class LibraryMember implements FileOperations{
        private String name;
        private String address;
        public String fileName = "project.txt";
        public String contentToWrite = "Your file is ready!";
        public String contentRead;
    public LibraryMember(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract String getMembershipId();

        public void saveToFile() throws IOException {
            FileWriter writer = new FileWriter(fileName);
            writer.write(contentToWrite);
            writer.close();
            System.out.println("Content written to file: " + fileName);
        }
    public void loadFromFile() {
            try {
                FileReader reader = new FileReader(fileName);
                StringBuilder stringBuilder = new StringBuilder();
                int character;
                while ((character = reader.read()) != -1) {
                    stringBuilder.append((char) character);
                }
                reader.close();
                contentRead = stringBuilder.toString();
                System.out.println("Content read from file:\n" + contentRead);
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
}
