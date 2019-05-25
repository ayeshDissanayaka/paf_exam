# paf_lab
How to open and configure the project

01. Open Eclipse IDE and configure the workspace in the GIT Hub project folder downloaded in this way.
For example: if your downloaded Project Folder is in the 'C: \' drive, the path should be set as shown below.

'C: \ paf_labOnline \ paf_lab \ Client \ paf_onlineProject'

02. Now open the control panel of the XAMPP server and then,
- Start the Apache web server
- Start MySQL Server

03. Then click on the 'Admin' button next to 'MySQL' and go to the PhpMyAdmin Control Panel.

04. Create a new database called 'pafproject', select it and import the file 'pafproject.sql' which is
located in 'C: \ paf_labOnline \ paf_lab \ DB \ pafdb'

- In the previous route, 'C' must be replaced with the Unit Route where you downloaded the Project.

05. Now right click on the project and select, >> Execute as >> Run on server >> Choose an existing server >> Next >> Finish

06. The Sever server will now start and the index URL will be displayed in the integrated Eclipse browser.

07. Copy the URL and paste it into your preferred web browser

08. Add the jdbc connector found in 'C: \ paf_labOnline \ paf_lab \ Client \ paf_onlineProject' and then
select mysql-connector-java-5.1.42-bin

How to add the connector: right click on your project >> Create route >> Configure the construction path >> Click on >> Java Build Path >> Add external JAR >> Select connector