# JavaSnippets - A Java Utility Library

A collection of lightweight, reusable Java code snippets to help you solve common problems. This library includes utilities for time conversion, validation, security, I/O operations, number formatting, string manipulation, and network utilities.

## 🚀 Features
- **Convert Local Time to UTC**
- **Convert UTC to Local Time**
- **Validate Email**
- **Generate Secure Random Password**
- **Download File from URL**
- **Format Number with Commas**
- **Convert camelCase to snake_case**
- **Slugify a String**
- **Strip HTML Tags**
- **Get Public IP Address**

## 📦 Installation

You can use this project in your Java project in two ways:

## Clone the Repository

Clone this repository to your local machine:

git clone https://github.com/yourname/JavaSnippets.git

## Usage

### 1. Convert Local Time to UTC:

String utcTime = JavaSnippets.convertLocalToUTC();
System.out.println("Local to UTC: " + utcTime);
### 2. Convert UTC to Local Time:

String localTime = JavaSnippets.convertUTCToLocal("2025-05-15T10:00:00Z");
System.out.println("UTC to Local: " + localTime);
### 3. Validate Email:

boolean isValid = JavaSnippets.isValidEmail("example@domain.com");
System.out.println("Is valid email: " + isValid);
### 4. Generate Secure Random Password:

String password = JavaSnippets.generateRandomPassword(12);
System.out.println("Generated password: " + password);
### 5. Download File from URL:

try {
    JavaSnippets.downloadFile("http://example.com/file.txt", "file.txt");
} catch (IOException e) {
    e.printStackTrace();
}
### 6. Format Number with Commas:

double number = 1234567.89;
String formatted = JavaSnippets.formatNumberWithCommas(number);
System.out.println("Formatted number: " + formatted);
### 7. Convert camelCase to snake_case:

String snakeCase = JavaSnippets.camelToSnake("camelCaseString");
System.out.println("Snake case: " + snakeCase);
### 8. Slugify a String:

String slug = JavaSnippets.slugify("This is a test string!");
System.out.println("Slugified string: " + slug);
### 9. Strip HTML Tags:

String htmlString = "<p>This is <b>HTML</b> content</p>";
String cleanString = JavaSnippets.stripHtmlTags(htmlString);
System.out.println("Cleaned string: " + cleanString);
### 10. Get Public IP Address:

try {
    String publicIP = JavaSnippets.getPublicIP();
    System.out.println("Public IP: " + publicIP);
} catch (IOException e) {
    e.printStackTrace();
}


## License


This project is licensed under the MIT License - see the LICENSE file for details.

##  Contributing

If you'd like to contribute to this project, feel free to fork the repository, make your changes, and submit a pull request. Please make sure your code adheres to the following guidelines:

Follow Java conventions for readability.

Write meaningful commit messages.

Ensure your code is well-documented.

## Author
Sarah Khan
