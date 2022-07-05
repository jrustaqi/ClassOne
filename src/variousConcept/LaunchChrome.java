package variousConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[]args) throws InterruptedException {
		
//	Selenium:
//	What is Selenium?
//	Selenium is basically a set of tools or libraries, that automates web browser action. We talking about actions like click, input, 
//	select, navigate, pretty much whatever we can with our mouse, we can do through selenium. It’s not a tool only, library of tools. 
//	Selenium is free and open source.
		
//	Features:
//	It supports multiple languages, like Java, Python, Ruby, Java Script, .Net umbrella (C, C++, C#).
//	It supports multiple browsers, like Chrome, Edge, Safari, Firefox.
//	It supports multiple operating systems, like Windows, Mac OS, Linux.
//	It supports only Web applications, not desktop app or mobile app.
		
//	Appium is another tool, same like Selenium and used for mobile applications. Another popular one is Detox. For desktop app we need 
//	UTF (Unicode Transformation Format), LeanFT to automate it.
		
//	Selenium is flexible and Extensible, has the capability to work with other tools like cucumber and TestNG.

//	Types or Components of Selenium:
//	When selenium came into market was 4 different types, Selenium IDE, Selenium RC, Web driver and Selenium Grid. Later on, Selenium RC 
//	and Web driver combined together and made Selenium 2. Right now, selenium 4 is the newest version.  When selenium 2 was in the market 
//	it had Firefox as default browser. With selenium 3 there was no default browser and you have option to choose any browser you want. 
//	With selenium we can’t run our test in multiple browser parallel, only with selenium grid we can do so. There is another tool that we 
//	can test in multiple browser parallel, called Sauce lab.

//	How it works?
//	Let’s say if there is a login page. If we test manually or try to login we take these steps,
//	-	Open the page
//	-	Pass the username and password
//	-	Click login
		
//	If we automate this scenario, what we need to do?
//	We have to do perform 2 different tests, the first one is passing username then passing password and then click. What we do is identify
//	the username element, password element and login element. Then we add some actions, when passing the data, we inserting the data and it
//	is action, when we click on login, it is action. We combine actions.

//	We need to install Moven and Chrome Driver.
		
//	Steps for installing:
//	-	Go to http://autotechnotes.weebly.com/
//	-	Click of PREREQ
//	-	Scroll down locate “download Maven”, click on download file.
//	-	Open Downloads folder, create a new folder and name it Selenium in Desktop and copy the file there.
//	-	Extract all the zip file.
//	-	Go inside folder apache-mave-3.6.1 and copy it.
//	-	Go to C drive under Program file, create a new folder, name it Maven and paste the apache-mave-3.6.1 there.
//	-	Go inside the folder, click the bin folder and highlight the address bar, right click on mouse and copy the address (path).
//	-	Go to this PC, right click on it, go to properties, advanced system setting, then hit the Environment Variable, system variable, 
//		look for path and highlight it, click on edit, new, go to the white part of it and paste the address we copied early, OK, OK, and OK.
			
//	To check if we have the Maven installed properly, go to Command Prompt, type “mvn -version” and enter. You should see the info for maven.

//	Now we go to www.selenium.dev website, click on downloads, scroll down to “Selenium Clients and WebDriver Language Bindings”, locate the 
//	Java icon and download the version 4.2.1.
			
//	Now launch eclipse, in workspace we create another one for selenium. How? When eclipse opened, go to file, switch workspace, click on other, 
//	give a new name (C:\\user\\123\\workSpace_selenium), and launch.

//	Now go inside workspace_selenium folder.
//	Once selenium launched, go and click on white space under Project Explorer and create a project and name it class1, click on finish, 
//	for “Open Associated Perspective window” say NO. now we have a project (folder) named class1.
		
//	Under src go ahead and create a package, name it variousConcepts. Under variousConcepts create a class name it LaunchChrome. Make it main 
//	method (type main and then press ctrl + space bar). Under main method write,
		
//		WebDrive driver = new ChromeDriver();
		
//	It will show errors for WebDriver and ChromeDriver, now let’s make a Scanner,
				
//		Scanner scan = new Scanner (System.in);
		
//	It will show error too, but when go on the top of it, it gives us the option to import it. but for WebDriver we don’t have import options, why?
//	Because the library has the jar file for scanner but we don’t have it for WebDriver and ChromeDriver.
			
//	Now we make a folder named lib under project (1st_selenium), then from folder selenium-java-4.2.1 (in File Explorer) we copy all jar files and 
//	paste it into lib folder in eclipse.
			
//	Now refresh the folder by right click on lib and hit the refresh (in eclipse) or just hit the F5 key.
//	Go back to File Explorer, click on lib folder, there is more jar files, we select and copy all to lib folder in eclipse.
//	The next step is to refer all jar files to JRE system library inside lib folder in eclipse. Select all and highlight them then right click on 
//	mouse, click on Built Path and add to Build Path.
			
//	Now if we go over WebDriver in eclipse it gives us the option to import it. 
//	It means Selenium is not a part of JRE and we have to add the jar files this way (which normally no one does in real life). Selenium is a 
//	separate library which need to import it in order to work with java.


//	A Question:
//	Why for an object like Scanner both sides say Scanner, but for WebDriver the other side is ChromeDriver which is not the same? Because, in here
//	we are using the concept of polymorphism (creating an object of any class with the reference of the mother class).
			
//	Now we have created the instance, it should give us the option to do something. We can run it by hitting the run icon or do a right click on 
//	any space, click on Run As, Java application and OK.
//	Now we see some issues in console area, so let’s focus on the issue and see what does it say? “java.long.Illegal StateException”. Let’s break 
//	up the exception message. The message has 3 parts,
			
//	1-	The path to the driver executable
//	2-	By the webDriver
//	3-	System property
		
//	What is the executable file? If we double click on any application icon it will launch the application (exe file or executable file), so we 
//	need that executable file, where to get them?
//	Let’s go back to the download page (www.selenium.dev/donwloads) and scroll down to (+ Browsers), open it and go to Chrome, you will see 
//	“documentation”, open it. You will see all versions available under downloads. Click on it and you will see all old versions also available in 
//	here. Which one to download? The right one! How? We have to figure out what version of chrome we are using. 
		
//	To find it, click on 3 dots on the right top of address bar, go to help and click on “About Google Chrome”. Now we should be able to see the 
//	version of our google in our machine, note the first 3 number (in my case 101).
//	Go back to download page and find the 101 download, click on it and pick the one which is for windows (Chromedriver-win32.zip). once the 
//	download finished, go to Download Folder and copy it, go to selenium folder and make a new folder there and name it “chrome driver” paste it 
//	and extract the zip file in there.
//	Go inside the folder and copy the file, take it to eclipse and there make a new folder under project and name it driver. Paste the files inside
//	driver folder.
		
//	Now let’s go back to exceptions, in there it asks for System Property and that should happen on the top of object creation and type 
//	“System.setProperty (String key, String value) for String key “ “ and inside it copy and paste "webdriver.chrome.driver" and for value which is
//	also String double quote and value is the path to the driver executable, so we go to the driver folder in eclipse, right click on chromeDriver.exe,
//	then click on properties and copy the location which is the path in this case "C:\\Users\\***\\Selenium_Workspace\\1st_Selenium\\driver\\chromedriver.exe".
//	Copy and paste it in value part inside double quote.
		
//	After run, it will launch the chrome browser and say “Chrome is being controlled by automated test software”. We launched the browser successfully,
//	but if now want to go to google page we need to copy the www.google.com in to the code. Go back to eclipse use the “driver.get(“”); get is a 
//	method and takes a string argument, so paste the google address inside two double quotes, 
				
//		driver.get("https://www.google.com/");
		
//	After run, it will launch the google homepage but it is not the full size, so we go with manage, window & max methods,
		
//		driver.manage().window().maximize();
				
//	Now, we don’t want to close it manually so we use the close method,
		
//		driver.close();
				
//	Now when we run, we see the code closes the page so fast, we can tell to the code to wait like a 3 second and then close the google page. 
//	The method called “thread.sleep”,
				
//		Thread.sleep(3000);
			
//	After writing code click on “add throws declaration” and “Interupted Exception.Java.long”, and now we have to have this code before 
//	“driver.close” code.

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jrust\\Selenium_Workspace\\class1\\driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//driver.close();
		
		
// NOTE:
// for the rest of notes for class 1, go to "class1b\src\main\java\variousConcepts" there will be 3 classes
	}	
	
}
