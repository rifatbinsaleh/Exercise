import java.io.IOException;
interface FileOperations {
    void saveToFile() throws IOException;
    void loadFromFile();
}