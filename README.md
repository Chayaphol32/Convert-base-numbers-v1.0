# Simple Base Converter with LED Display

## Overview
This project implements a simple base conversion system using Java and GPI (General Purpose Input/Output). The system allows the user to input binary values through a set of 8 LED buttons, convert them to decimal, and display the result in hexadecimal format on a 7-segment LED display.

## Features
- **Binary to Decimal Conversion**: Press the LED buttons to input a binary number. The system automatically converts the binary input into a decimal value.
- **Hexadecimal Display**: Enter a 2-digit hexadecimal value in the input box to display it on the LED display.
  
## Technologies Used
- **Java**: For the main application logic and user interface.
- **GPI (General Purpose Input/Output)**: To interact with the hardware, including LED buttons and displays.

## How to Use
1. **Binary Input**: Press the LED buttons to input a binary number. The system will convert it to decimal and display it.
2. **Hexadecimal Input**: Type a 2-digit hexadecimal number into the input field. The corresponding value will be displayed on the LED.

## Installation and Running the Program
1. Install Java and the required GPI Library:
   - Download and install the latest version of [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - Install the GPI library following the documentation for your platform.
   
2. Compile and run the program:
   ```sh
   javac Main.java
   java Main
