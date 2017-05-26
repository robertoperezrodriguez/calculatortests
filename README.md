# Prerequisites
Install Android Studio. Create an emulated virtual device. Install Appium and run the Appium server.

# Adjust Appium configuration
The ```serenity.properties``` file contains the configuration for Appium, which has to be adapted to your environment.
For instance the location of the apk, and the emulated device to be used

# Launch the tests
The acceptance tests can be launched via the command line by issuing the following command
```
mvn clean install
```



