pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checkout the code from SCM..'
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'cf9a1af8-441d-4015-ba43-350154b8ca6c', url: 'https://github.com/ravikiranmaroju/Jenkins-2021-May.git']]])
            }
        }
        stage('Prepare') {
            steps {
                echo 'Prepared Succesfully..'
            }
        }
        stage('Compile') {
            steps {
                echo 'Compiled Succesfully..'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('QA') {
            steps {
                echo 'QA..'
            }
        }
        stage('UnitTesting') {
            steps {
                echo 'Unit Testing is in Progress..'
            }
        }
        stage('Monitor') {
            steps {
                echo 'Monitoring..'
            }
        }
        stage('Build Docker Image') {
            steps {
                echo 'Building'
                sh 'docker build .'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'mv /var/lib/jenkins/workspace/job1-pipeline/target/*war /opt/tomcat/webapps/'
            }
        }
    }
}
