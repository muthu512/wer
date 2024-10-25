pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9' // Replace with the name you used in Jenkins Global Tool Configuration
    }
    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/muthu512/wer.git'
            }
        }
        stage('Build') {
            steps {
                withMaven(maven: 'Maven 3.9.9') { // Make sure to use the exact Maven name here
                    bat 'mvn clean package'
                }
            }
        }
        stage('Deploy') {
            steps {
                bat 'java -jar C:\\Users\\Dell-Lap\\Downloads\\online-1.zip_expanded\\online-1\\target'
            }
        }
    }
}
