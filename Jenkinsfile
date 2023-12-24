// pipeline {
//     agent any
//     tools {
//         maven 'Maven-3.9.6'
//         jdk 'jdk-20.0.2'
//     }
//     environment {
//         SONAR_SCANNER= tool 'sonar-scanner'
//     }

//     stages {
//         stage('git checkout') {
//             steps {
//                 git branch: 'main', credentialsId: 'github-pat', url: 'https://github.com/abdulkwm/spring-jenkins.git'
//             }
//         }
//         stage('compile') {
//             steps {
//                 sh 'mvn compile'
//             }
//         }
//         stage('test') {
//             steps {
//                 sh 'mvn test'
//             }
//         }
//         stage('sonar qube') {
//             steps {
//                 withSonarQubeEnv(installationName: 'sonar-server')
//                 sh 'mvn clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.90.2155:sonar'
//             }
//         }
//         // stage('sonarqube analysis') {
//         //     environment {
//         //         SCANNER_HOME= tool 'SONAR_SCANNER'
//         //     }
//         //     steps {
//         //         withSonarQubeEnv('SONAR_SCANNER') {
//         //             sh ''' ${SCANNER_HOME}/bin/sonar-scanner -Dsonar.projectName=spring-jenkins \
//         //                     -Dsonar.projectKey=spring-jenkins '''
//         //         }
//         //     }
//         // }
        
//         // stage('owasp scan') {
//         //     steps {
//         //         dependencyCheck additionalArguments: '--scan . ', odcInstallation: 'Dep-Check'
//         //         dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
//         //     }
//         // }
        
//         stage('build') {
//             steps {
//                 sh 'mvn package'
//             }
//         }
//         // stage('build docker image') {
//         //     steps {
//         //         script {
//         //             withDockerRegistry(credentialsId: 'docker-cred', toolName: 'Docker') {
//         //                 sh 'docker build -t spring-jenkins:latest .'
//         //             }
//         //         }
//         //     }
//         // }
//         // stage('tag & push docker image') {
//         //     steps {
//         //         script {
//         //             withDockerRegistry(credentialsId: 'docker-cred', toolName: 'Docker') {
//         //                 sh 'docker tag spring-jenkins:latest abdu14/spring-jenkins:latest'
//         //                 sh 'docker push abdu14/spring-jenkins:latest'
//         //             }
//         //         }
//         //     }
//         // }
//         // stage('deploy image in docker container') {
//         //     steps {
//         //         script {
//         //             withDockerRegistry(credentialsId: 'docker-cred', toolName: 'Docker') {
//         //                 sh 'docker run -d --name spring-jenkins-cont -p 8090:8080 abdu14/spring-jenkins:latest'
//         //             }
//         //         }
//         //     }
//         // }
//     }
// }


pipeline {
    agent any
    
    tools {
        maven 'Maven-3.9.6'
        jdk 'jdk-20.0.2'
    }
    
    stages {
        stage('git checkout') {
            steps {
                git branch: 'main', credentialsId: 'github-pat', url: 'https://github.com/abdulkwm/spring-jenkins.git'
            }
        }
        stage('compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('build') {
            steps {
                sh 'mvn package'
            }
        }
        // stage('build docker image') {
        //     steps {
        //         script {
        //           withDockerRegistry(credentialsId: 'docker-cred') {
        //               sh 'docker build -t abdu14/myapp .'
        //             }
        //         }
        //     }
        // }
    }
    post {
            always {
                emailext body: 'this is test email', recipientProviders: [developers()], subject: 'test', to: 'abdu0921@hotmail.com'
            }
    }
}
