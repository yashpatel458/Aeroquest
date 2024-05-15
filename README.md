# Aeroquest

<img width="783" alt="Screenshot 2023-11-14 at 9 29 32 PM" src="https://github.com/yashpatel458/Aeroquest/assets/68161473/b4add01d-e42b-4f4a-9e67-397f00e303df">



https://github.com/yashpatel458/Aeroquest/assets/68161473/13801adb-41ad-44ae-9c7f-8d4f68f33d62



## Introduction

Aeroquest is a project designed to analyze and understand flight prices to help users get the best deals when booking tickets close to their travel dates. The project involves crawling three flight booking websites to collect data and present users with the best deals based on specified parameters. This project showcases the implementation of various data structures and algorithms and their real-world applications.

## Features Implemented

### Web Crawler

- **Technology Used**: Selenium Web Driver
- **Description**: A web crawler using the breadth-first-search method to systematically explore and gather data from specified URLs. The crawler collects information such as destination, origin, airports, stops, airlines, and travel costs, storing it in a custom array for further processing.

### HTML Parser

- **Technology Used**: JSOUP library
- **Description**: Parses the crawled HTML data and temporarily saves it in files. The parsing process has a time complexity of O(N), where N is the size of the HTML document.

### Page Ranking

- **Data Structure Used**: ArrayList
- **Algorithm**: Boyer-Moore
- **Description**: Ranks pages by storing the frequency of keyword occurrences in each file. The frequency data is kept in an array, sorted in descending order, and only the top 50 files are displayed. The time complexity is O(m*n).

### Search Frequency

- **Data Structure Used**: TreeMap
- **Description**: Searches for a word's frequency in a CSV file and loads the data into a TreeMap. It also checks for spelling mistakes using the Spellchecking class. The TreeMap arranges elements by their natural ordering or a specified comparator.

### Spell Checking

- **Data Structure Used**: HashSet
- **Algorithm**: Edit Distance
- **Description**: Stores a dictionary of acceptable words and generates spelling suggestions based on edit distance. The time complexity is O(m*n), where m and n are the lengths of the two strings being compared.

### Word Completion

- **Data Structure Used**: TreeSet
- **Description**: Retrieves words from a dictionary that match a given prefix using a simple string matching technique. The time complexity depends on the dictionary size and the prefix length.

### Inverted Indexing

- **Data Structure Used**: Trie
- **Description**: Efficiently searches a large text corpus for words by creating an inverted index. The time complexity is O(n*m), where n is the number of documents and m is the average word count per document.

### Finding Patterns using Regular Expressions (RE)

- **Description**: Extracts the cost of a flight from an HTML document and formats it to remove decimal points and currency symbols.

### Frequency Count

- **Data Structure Used**: ArrayList
- **Algorithm**: Boyer-Moore
- **Description**: Holds objects representing file names and the frequency of pattern occurrences. The time complexity is O(m*n).

### Data Validation using Regular Expressions (RE)

- **Description**: Verifies the flight departure date using basic data structures and control flow concepts. The time complexity is O(n), where n is the length of the input string.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Maven or Gradle for dependency management
- Selenium WebDriver
- JSOUP library

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/Aeroquest.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd Aeroquest
   ```
3. **Install dependencies using Maven:**
   ```bash
   mvn install
   ```

### Usage

1. **Run the main program:**
   ```bash
   mvn exec:java -Dexec.mainClass="com.yourpackage.AEROQUEST"
   ```
2. **Parse the HTML data:**
   ```bash
   mvn exec:java -Dexec.mainClass="com.yourpackage.HTMLParser"
   ```
3. **Execute other features (Page Ranking, Search Frequency, etc.) by running their respective main classes.**

### Project Structure

```
Aeroquest/
├── bin/
├── libs/
├── src/
│   ├── Crawled_Files_Booking/
│   ├── Crawled_Files_Cheapflights/
│   ├── Crawled_Files_Kayak/
│   ├── DISNY/
│   ├── parsedFiles/
│   ├── AEROQUEST.java
│   ├── Booking_File_Parser.java
│   ├── BoyerMoore.java
│   ├── Cheapflights_File_Parser.java
│   ├── Flight_Detail.java
│   ├── Frequency_Count.java
│   ├── Kayak_File_Parser.java
│   └── ...
└── pom.xml
```


## Contact

For any questions or suggestions, please reach out to [your.email@example.com](mailto:your.email@example.com).

---

Developed by [Yash Patel](https://github.com/yashpatel458)

---

