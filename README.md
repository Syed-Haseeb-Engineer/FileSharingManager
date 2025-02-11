Here is a description for your github repository:


# Filesharingmanager

**Filesharingmanager** is a web application designed to streamline the file-sharing process. Built using HTML, CSS, Java and Spring Boot, this app provides a user friendly interface to upload, share and manage files easily.

## features

- **Home Page**: Provides an introduction and observation of the functionality of the application.
- **User authentication**: Users can log in using their Google or Github accounts.
- **File uploaded**: After logging in, users can upload files, can see their most recent uploads, and manage them.
- **File share sharing**: For those files, generate shared URLs that can be downloaded without other logs.
- **File Management**: Easily remove files that are no longer needed.

## Use

1. **Homepage**: Navigate on the homepage to learn more about the application.
2. **Login**: Click on the login button to sign in to sign in using your Google or Github account.
3. **Upload files**: Once logged in, reach the file upload page to upload new files.
4. **Manage files**: Look and manage your uploaded files, including the options for sharing or removing them.
5. **Share files**: Click on a file to generate a shared URL. Share this URL with others so that they can be allowed to download the file without the need to log in.

## used technologies

- **Frontnd**: HTML, CSS
- **Backand**: Java, Spring Boot

## launch

To start with the project, clone the repository and follow the installation instructions provided in the Reidme file.i will add later.


![Screenshot (13)](https://github.com/user-attachments/assets/ef4fc71b-e76b-4f66-ad12-a0cfb4ffe13f)
![Screenshot (14)](https://github.com/user-attachments/assets/31ab7eae-5319-4723-af6f-8a82eca554a6)
![Screenshot (15)](https://github.com/user-attachments/assets/6592219b-4f22-4cad-8a6f-c8a69ca8ed1c)
![Screenshot (16)](https://github.com/user-attachments/assets/43ccb906-7e5d-4d86-b36f-ee557387f6c5)
![Screenshot (17)](https://github.com/user-attachments/assets/ee57aefc-89d8-4b3f-be22-039e9daa33cc)
![Screenshot (18)](https://github.com/user-attachments/assets/5c17ee2d-c9db-4b20-867f-e37c809ce636)
![Screenshot (19)](https://github.com/user-attachments/assets/2cbc04f8-4178-4004-a105-94fb8fdd8956)
![Screenshot (20)](https://github.com/user-attachments/assets/c9271911-039f-4809-b244-81c95e474cd5)
![Screenshot (21)](https://github.com/user-attachments/assets/4e1253f1-56aa-497b-927d-3450da5e743b)
![Screenshot (23)](https://github.com/user-attachments/assets/a72bb52c-ca17-4896-bee4-1be97a945cde)
![Screenshot (24)](https://github.com/user-attachments/assets/9c45c149-eae7-4ec3-8d37-fc8a142a69ea)
![Screenshot (25)](https://github.com/user-attachments/assets/f271ed0e-24cc-4a2c-9a55-a4f42456d262)
![Screenshot (26)](https://github.com/user-attachments/assets/0ee3fe76-9edd-41c4-808f-f0945790b335)

Here is an explanation of the project structure:

**Project-Root/**: This is the route directory of your project.

, MVN/**: This directory includes the Maven Wrapping Files, which allow you to run the Maven command without the need to install manually.
  - **Rapper/**: The script required for mahen rapper and 'MVN-Wrappper.jar` file are included.

- **MVN- Wrapper.Properties**: Configuration properties for maven cover.

- **SRC/**: The main source directory for the project.
  - **Main/**: The main application code is included.
    - **Java/**: Java sources include files.
      - **com/example/Filesharingapp/**: Aadhaar package for your application.
        - **Configuration/**: Configuration classes include.
          - **Scheduling Konfig. Jawa**: Configuration for scheduling works.
          - **Securityconfig.java**: Configuration for safety settings.
          - **webconfig.java**: Configuration for web settings.
        - **Controller/**: Controller Classes include HTTP requests.
          - **Filecontroller.java**: Controller for file-related operation.
        - **Unit/**: Included unit classes that represent data models.
          - **Filentity.java**: Unit class for file data.
        - **Exception/**: Exceptions include handling classes.
          - **FilenotFoundexception.java**: Custom exception for file not found errors.
          - **Globalexceptionhandler.java**: Handles global exceptions.
        - **Model/**: Model classes include.
          - **Filemodel.java**: Model class for file data.
        - **Repository/**: Repository interfaces for database operations.
          - **Filerepository.java**: Repository interface for file data.
        - Service/: Services include classes that apply business logic.
            **Fileservice.java**: Service Interface for File Operations.
            **Fileserviceimpl.java**: Implementation of Filesvice Interface.
        - Filesharingapppplication.java: The main application class that bootes the spring boot application.
- Resources/: Application Resources.
    - **Static/**: includes static resources such as CSS and images.
        - **Styles/**: This includes CSS style and assets.
          - **Property/**: Image property is involved.
          - **Leftpc.png**: left PC image.
          - **Rightpc.png**: Right PC Image.
        - **CSS/**: CSS files are included.
          - **Homestyle.CSS**: CSS for home page.
          - **List-Files.css**: CSS for list files.
          - **Share Files.CSS**: CSS for share file page.
    - **Templates/**: The thymelf templates to provide HTML page.
      - **Home.html**: Template for home page.
      - **List- Files.html**: Template page for list files.
      - **Share-File.html**: Template for share file page.
    - **Application.Properties**: Configuration properties for spring boot application.
Testing/: Testing sources are included in files.
  - **Java/**: includes Java test files.
      - **com/company/Filesharingapp/**: base package for your tests.
          - **Filesharingappplicationtests.java**: test class for main applications.
**.Gitignore**: Specifies files and directors to be ignored by GIT.
**Readme.MD**: Project documentation.
**MVNW**: Maven wrappers script for Unix-based systems.
**MVNW.CMD**: Maven Wrapping Script for Windows.
**POM.XML**: The Project Object Model File is used by Maven to manage project dependence and create configurations.



# Project Structure

**Project-root/**
├── .mvn/
│   └── wrapper/
├── mvn-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── fileSharingApp/
│   │   │               ├── configuration/
│   │   │               │   ├── SchedulingConfig.java
│   │   │               │   ├── SecurityConfig.java
│   │   │               │   ├── WebConfig.java
│   │   │               ├── controller/
│   │   │               │   ├── fileController.java
│   │   │               ├── entity/
│   │   │               │   ├── FileEntity.java
│   │   │               ├── exception/
│   │   │               │   ├── FileNotFoundException.java
│   │   │               │   ├── GlobalExceptionHandler.java
│   │   │               ├── model/
│   │   │               │   ├── FileModel.java
│   │   │               ├── repository/
│   │   │               │   ├── FileRepository.java
│   │   │               ├── service/
│   │   │               │   ├── FileService.java
│   │   │               │   ├── FileServiceImpl.java
│   │   │               ├── FileSharingAppApplication.java
│   ├── resources/
│   │   ├── static/
│   │   │   ├── styles/
│   │   │   │   ├── assets/
│   │   │   │   │   ├── leftpc.png
│   │   │   │   │   ├── rightpc.png
│   │   │   │   ├── css/
│   │   │   │   │   ├── homestyle.css
│   │   │   │   │   ├── list-files.css
│   │   │   │   │   ├── share-files.css
│   │   ├── templates/
│   │   │   ├── home.html
│   │   │   ├── list-files.html
│   │   │   ├── share-file.html
│   │   ├── application.properties
├── test/
│   ├── java/
│   │   └── com/
│   │       └── company/
│   │           └── fileSharingApp/
│   │               ├── FileSharingAppApplicationTests.java
├── .gitignore
├── Readme.md
├── mvnw
├── mvnw.cmd
├── pom.xml


