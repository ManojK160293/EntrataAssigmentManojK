!!Configuration Setup!!
-Language -Java
-Framework/Tool/Platform- Selenium ,TestNG ,Maven ,Eclipse IDE and Github .
------------------------------------------------------------------------------------------------------------------------------------------
!!Configuration Code Information!!
-Selenium and TestNG Dependency added into POM.Xml
-Import all required file at the time of code Writing .
------------------------------------------------------------------------------------------------------------------------------------------
!!Code Sequence and information!!
-Create class and declare Variable for Webdriver ,WebdriverWait and softassert.
-Used TestNG annotation @BeforeTest and crate 1 method under method used implicit wait for webdriverand created object.
-Test case 1
-Used @Test annotation and set Priority 1 to control the next method to be executed 
-Crated method under method Launch browser and maximize window 
Test case 2 
-Used @Test annotation and set Priority 2 to control the next method to be executed 
-Create method under method accpet cookies ,find and click on watch demo button and wait until next elemnt visible 
Test case 3
-Used @Test annotation and set Priority 3 to control the next method to be executed 
-Create method under method find text box ,select drop down value and send data after data send find Watch demo buttom but we not click .
(As per Assigment  we submit form but not click on watch demo button.)
-Navigate to previous page 
Test case 4
-Used @Test annotation and set Priority 4 to control the next method to be executed
-Create method and click on signIn button ->click on Resident login ->Verify View the app button display or not (compare expected result vs actual result)
-Navigate to home page  
Test case 5
-Used @Test annotation and set Priority 5 
-On homepage click on solution and select student from dropdown .
-Used Wait and compare result
Last method 
-Used @AfterTest annotation this method executed  after the execution of all test methods.
-here we quit the open browser and end program 

------------------------------------------------------------------------------------------------------------------------------------------
!!How to Open Java file  !!
-Open Eclipse IDE
-Click on File->Select Open project from file system ->Select Folder that provided on Github repository and Open
-Open folder in Eclipse->Navigate to Src->Default Package->Open EntrataAssignment.java file 
Note :- Comments are added infront of code  
----------------------------------------------------------------------------------------------------------------------------------------
!!Follow below step to Run code!!
-Right click on code ->Select Run as ->Click on 1 TestNG Test/Run Configuration  
OR
-Direct Click on Run(Green Button) present on top .
----------------------------------------------------------------------------------------------------------------------------------------
