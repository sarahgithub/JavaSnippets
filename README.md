# JavaSnippets
A lightweight Java utility library with ready-to-use snippets for dates, strings, validation, and more.
💡 Solve common Java problems with a simple, reusable toolkit.

🚀 Features
Date & Time: Convert between time zones, format dates, and more. 
Validation: Email, phone, password, etc.
String Manipulation: Convert case, truncate, slugify, etc.
Networking: Get public IP address, ping servers, etc.
I/O: Download files from a URL, read from files, etc.

#Functions:
Convert local time to UTC
Convert UTC to local
Validate email
Generate random password
Download file from URL
Format number with commas
Convert camelCase to snake_case
Slugify a string
Strip HTML tags
Get public IP address

📦 Installation
1. Maven / Gradle Installation (JitPack)
You can easily integrate JavaSnippets into your project using Maven or Gradle.

<dependency>
    <groupId>com.snippets</groupId>
    <artifactId>JavaSnippets</artifactId>
    <version>1.0.0</version>
</dependency>

dependencies {
    implementation 'com.yourname:JavaSnippets:1.0.0'
}
2. Copy & Paste from GitHub
If you prefer to manually include the code, simply copy the snippets you need directly from the JavaSnippets GitHub repo.

JavaSnippets/
├── README.md
├── src/
│   └── com/
│           └── snippets/
│               ├── TimeUtils.java
│               ├── Validator.java
│               ├── SecurityUtils.java
│               ├── IOUtils.java
│               ├── NumberUtils.java
│               ├── StringUtils.java
│               └── NetworkUtils.java
└── pom.xml 

💻 Usage
1. Convert Local Time to UTC:
     String utcTime = TimeUtils.convertLocalToUTC();
     System.out.println("Local to UTC: " + utcTime);

2. Validate Email:
     boolean isValid = Validator.isValidEmail("example@domain.com");
     System.out.println("Is valid email: " + isValid);


License
This project is licensed under the MIT License - see the LICENSE file for details.



🌐 Contributing
Contributions are welcome! Feel free to fork the repo, create issues, and submit pull requests for new snippets.



