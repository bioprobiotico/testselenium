# testselenium

the basic tests that were implemented as acceptance test were:

- Accept cookies
- Register (in implementation this test is skipped because the receiving the code verification requires more deep implementation)
- Get voicemod for Mac and PCN
- Navigation through the main pages

NOTE: in requierements I had to use Base Model Page Object. Since its my first project on java selenium I created a code and then wanted to create Base class with wrappers for driver but I realized that due to the time limits I need more time for it.

The main tests are implemented in the java class voicetest.java. pom.xml file contains dependencies and plugins for launching the sonarqube tests.

On run test opens the Firefox browser and executes one by one the tests that have been implemented. After accepting the cookies the test navigates through the main links of the heared and assert that the new page where user gonna be redirrected is correct. Also test checks that the main buttons for getting the voicemod for Mac and PC are correct.









