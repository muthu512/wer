pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/muthu512/wer.git'
            }
        }
        stage('Build') {
            steps {
                // Assuming you are using Maven
                bat 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                // For simplicity, just run the Spring Boot jar file
                bat 'java -jar target/your-spring-boot-app.jar'
            }
        }
    }
}
