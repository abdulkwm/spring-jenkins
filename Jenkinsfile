pipeline {
    agent any
    tools {
        maven 'Maven-3.9.5'
    }
    environment {
        SCANNER_HOME = tool 'sonar-scanner'
    }
    stages {
        stage('checkout github') {
            steps {
                git branch: 'main', credentialsId: 'github-pat', url: 'https://github.com/abdulkwm/spring-jenkins.git'
            }
        }
        stage('clean and compile') {
            steps {
                sh 'mvn clean compile'
            }
        }
        //  stage('owasp dep-check') {
        //     steps {
        //         dependencyCheck additionalArguments: '--format HTML', odcInstallation: 'Dep-Check'
        //         dependencyCheckPublisher pattern: 'dep-check-report.xml'
        //     }
        // }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
       
        // stage('sonarqube') {
        //     steps {
        //         withSonarQubeEnv('sonar-server') {
        //             sh 'mvn sonar:sonar'
        //         }
        //     }
        // }
         stage('package') {
            steps {
                sh 'mvn package'
            }
        }
        // stage('build docker image') {
        //     steps {
        //         script {
        //             withDockerRegistry(credentialsId: 'docker-cred', toolName: 'Docker') {
        //                 sh 'docker build -t abdu14/myapp .'
        //             }
        //         }
        //     }
        // }
    }
}
