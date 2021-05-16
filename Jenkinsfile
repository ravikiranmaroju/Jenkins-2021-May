pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checkout the code from SCM..'
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '7616dfee-a19c-485a-9d3b-74924e87f231', url: 'https://github.com/ravikiranmaroju/Jenkins-Repo.git']]])
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
