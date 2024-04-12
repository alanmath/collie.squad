pipeline {
    agent any
    stages {
        stage ('Jenkins Squad') {
            steps {
                echo 'Squad interface'
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}