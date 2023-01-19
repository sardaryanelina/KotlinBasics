LOGGING LIBRARY - TIMBER

	Benefits of using Timber:
Generates Automatic Tags so no need to setup manual tags 
Avoid logs in released app apks 
Easy Integration with crash reporting libraries 

	Setup Timber:
1. Add Timber to Gradle 
	implementation "com.jakewharton.timber:timber:$timberVersion"
	timberVersion = '5.0.1' for now
2. Make Application Class 
3. Add Application to Manifest -> android:name= ".YourApplication"
4. Initialise Timber in Application Class -> Timber.plant(Timber.DebugTree())
	- Rebuild the project



--------------------------------------------------------



Timber VS Android's Logging API

Log.i(tag= "MainActivity", msg= "onCreate called")
This logging API will let us output short messages to the console so that we can view them and see the result.

Logs have different levels which are used in different situations. 
The levels and their usages are listed below:
- Verbose: Show all log messages (the default).
- Debug: Show debug log messages that are useful during development only, as well as the message levels lower in this list.
- Info: Show expected log messages for regular usage, as well as the message levels lower in this list.
- Warn: Show possible issues that are not yet errors, as well as the message levels lower in this list.
- Error: Show issues that have caused errors, as well as the message level lower in this list.
- Assert: Show issues that the developer expects should never happen.