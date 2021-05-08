pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checkout the code from SCM..'
                git credentialsId: 'cf9a1af8-441d-4015-ba43-350154b8ca6c', url: 'https://github.com/ravikiranmaroju/Jenkins-Repo.git'
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
                sh "mvn package"
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
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
