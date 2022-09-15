# GeoTrack
The main goal of GeoTrack is to know when the user has entered a geofence, setting by the user, the user will be able to know if a you are entering the geofence, walking around in the geofence or even if you has already exit the geofence.
Restrictions:
You can only make a geofence at the same time.

# Features
* Add a geofence
* Know your position base on the geofence

# Services used
* Firebase
* Google maps API

# Database
The database used for the application is the NOSQL Database Firestore in firebase.

# Structure of the folders
The application uses the following folders:
* **Data:**
    * **Model:** All data clases or models
    * **Network:** This folder is used as sourcedata getting from internet, in this case using firebase
* **Repository:** Here you can find the classes repository that works as intermediary between the source data and the ui, using this we can switch the source data easily.
* **Services:** In this folder you can find the classes who helps with the services needed for the app.
* **Ui:**
    * **Views:** In this folder you can find all the views used for the application

The idea behind this structure folder and the use of repository is to implement the Architecture Clean.

# SO Requeriments
* Android Studio Chipmunk
* Openjdk-18 version 18.0.2
* OpenJDK Runtime Environment (build 18.0.2.1+1-1)
* OpenJDK 64-Bit Server VM (build 18.0.2.1+1-1, mixed mode, sharing)
*
# Installation
For the instalation is neccesary the following actions:
* Create a project in firebase a linked to the project in android studio and then activate the service of firestore.
* Get an API of google, configre it and then set it in the local.properties of our project in android studio.

# Problems with emulator
Is probably that this code does not work using an emulator device to test it. To solve this problem is neccesary to go to settings in the device and check the option of improved location.

**Note:** Not all the devices have this function, is better to test in a real device.

