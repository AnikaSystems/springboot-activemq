pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
         stage('Clone repository') { 
            steps { 
                script{
                checkout scm
                }
            }
        }
        
        stage('Build') { 
            steps { 
                script{
                 //app = docker.build("springboot-activemq")
                 sh './gradlew clean bootJar'
                }
            }
        }
        stage('Test'){
            steps {
                // Run Gradle tests
                sh './gradlew clean test --no-daemon'
            }
        }
        stage('SonarQube Analysis') {
            withSonarQubeEnv() {
            sh "./gradlew sonar"
            }
        }
    }
}