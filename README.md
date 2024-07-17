# FileOperationsLibrary

`FileOperationsLibrary` is a Java library that simplifies basic and advanced file operations. It includes functionality for reading and writing files, appending to files, searching within files, and handling CSV file operations.

## Features

- **Basic File Operations**
  - Reading from a file
  - Writing to a file
  - Appending to a file

- **Advanced File Operations**
  - Searching for text within files
  - Reading and writing CSV files

## Installation

### Using the JAR File

1. **Download the JAR file**:
   - Locate the `FileOperationsLibrary.jar` in the `dist` directory of this project.

2. **Add the JAR file to your project**:
   - In NetBeans or your preferred IDE, right-click on your project.
   - Select `Properties`.
   - Navigate to `Libraries`.
   - Click `Add JAR/Folder` and select the `FileOperationsLibrary.jar` file.

## Usage

### Importing the Library

```java
import main.java.com.virul.fileops.FileReaderUtil;
import main.java.com.virul.fileops.FileWriterUtil;
import main.java.com.virul.fileops.FileSearchUtil;
import main.java.com.virul.fileops.FileFormatUtil;
```

### Examples

#### Reading from a File

```java
String content = FileReaderUtil.readFile("path/to/your/file.txt");
System.out.println(content);
```

#### Writing to a File

```java
FileWriterUtil.writeFile("path/to/your/file.txt", "Hello, World!");
```

#### Appending to a File

```java
FileWriterUtil.appendToFile("path/to/your/file.txt", "\nAppending this line.");
```

#### Searching within a File

```java
List<String> results = FileSearchUtil.searchInFile("path/to/your/file.txt", "search keyword");
for (String line : results) {
    System.out.println(line);
}
```

#### Reading a CSV File

```java
List<String[]> csvData = FileFormatUtil.readCSV("path/to/your/file.csv");
for (String[] row : csvData) {
    System.out.println(String.join(", ", row));
}
```

#### Writing to a CSV File

```java
List<String[]> data = new ArrayList<>();
data.add(new String[]{"Name", "Age", "City"});
data.add(new String[]{"Alice", "30", "New York"});
FileFormatUtil.writeCSV("path/to/your/file.csv", data);
```

## Building from Source

1. **Clone the repository**:

```bash
git clone https://github.com/yourusername/FileOperationsLibrary.git
```

2. **Build the project**:

- Open the project in NetBeans.
- Go to `Run > Clean and Build Project`.

3. **Locate the JAR file**:
   - The JAR file will be located in the `dist` directory.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue to discuss your ideas.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

Virul Nirmala Wickramasinghe
