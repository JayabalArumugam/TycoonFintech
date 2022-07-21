# baseSetup
Base setup is a template just for launching a Mobile App or Web Browser.

To update the application to be tested:
- Step 1: Upload the application to directory: apk
- Step 2: Go to the directory: src\main\java\setup\CoreSetup.java
- Step 3: Update the uploaded application name in "demoApp" like "applicationName.apk"


To select the Real Mobile Device to be used for testing:
- Step 1: Go to the directory: src\main\java\properties\demoAppProperties\demoTestDeviceConfig.properties
- Step 2: Add the name of the device and its UDID like: MiA2=8923b04
- Step 3: Update that newly added device name to "realDeviceIdName=newlyAddedDeviceName"
- Step 4: Ensure that "runOnEmulator=false", to run the test on a real device.

To select the Emulator Device to be used for testing:
- Step 1: Go to the directory: src\main\java\properties\demoAppProperties\demoTestDeviceConfig.properties
- Step 2: Add the name of the device and its UDID like: MiA2=8923b04
- Step 3: Update that newly added device name to "emulatorDeviceIdName=newlyAddedDeviceName"
- Step 4: Ensure that "runOnEmulator=true", to run the test on an emulator device.

===========================================================================

To update the website to be tested:
- Step 1: Go to the directory: src\main\java\setup\CoreSetup.java
- Step 2: Update the url in "testUrl".


To select the browser to be used for testing:
- Step 1: Go to the directory: src\main\java\properties\webPanelProperties\globalWeb.properties
- Step 2: Set browserName to any: chrome, ie, msedge, firefox

Once you've decided the browser for testing then:
- Step 1: Open that respective browser.
- Step 2: Go to that browser setting and check the browser version 
- Step 3: Now download the driver for that brower from the website. For example to use chrome download the respective chrome driver version.
- Step 4: Upload the driver to respective driver folder. For example upload the chromedriver to: drivers\windows\chrome

===========================================================================

The setup has two profiles which allows to either launch Mobile App or Website(or webapp).

Command to launch Mobile App:
- mvn test -PApp

Command to launch Web App:
- mvn test -PWeb

|===========================================================================|
|===========================================================================|

Create Local Archetype in your System from existing project:
- Step 1: Run, mvn archetype:create-from-project
- Step 2: Go to the directory: target\generated-sources\archetype
- Step 3: Run, mvn clean install
- Step 4: After installing, go to Settings in IDE, then search for the maven repository menu option then click update for local repository. This will add your newly generated archetype to the list which will show when creating a project.
