#  Bender WebDriver Project - Appium - WebDriver IO demo app
=======

Test suite covering the Appium Tests for the WebDriver IO demo app 

Android-NativeDemoApp-0.2.1.apk

## Solution
Automation framework based in Page Object Model using Appium to run few test cases for the WebDriver IO demo app. It includes 3 test cases covering some main functionality in the app. 

## Getting Started
1. Open a terminal window/command prompt.
2. Clone this project.
3. In eclipse or intellij IDE import as an existing maven project.
4. Rebuild.
 
### Prerequisites
1. Appium set up, download and install http://appium.io/ and start it with settings http://127.0.0.1:4723/ and port 4723.
2. Android SDK and set the android environment variables. Android Studio is an easy way: https://developer.android.com/studio/
3. Android device, it is possible to use a real device connected with ADB or create a virtual device with AVD. Config file will have to be updated with the name and version of the device of the repository.

## Running the test suite
1. Appium server running on (http://127.0.0.1:4723/ and port 4723).
2. Device connected.
3. It is a Maven project, so reimporting all the project is the first thing to do. 
4. "BenderSuiteTest", right click, and run.

## Built With
* Appium open source test automation framework. 1.13.0
* Junit
* Maven(https://maven.apache.org/) - Dependency Management.
* Intellij IDEA 2019.1.3


## Framework components
- Maven. This project is created as maven project, all the libraries required are maintained in "pom.xml" file as a dependencies. On importing as a Maven project it will download all the dependencies.
- Selenium and Appium. They have been used for automating UI actions on mobile application.
- Pages - Page Object Model - Every page is a class, the navigation bar is a class, and by using composition we could reuse the navigation bar component.
- TestConfig. In this file which maintains the needed data for setting up the test and run it. Details about the Appium configuration, device chosen, time out, APK, etc.
- Driver. This is the base page of framework in which the main driver is created, used and killed.   

## Contact
If you have any questions about this repo, please do not hesitate to contact me.
