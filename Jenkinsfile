pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                
                    bat 'mvnw.cmd clean compile'
            }
        }

        stage('Test') {
            steps {
                
                    bat 'mvnw.cmd test'
                
            }
        }

        stage('Package') {
            steps {
                
                    bat 'mvnw.cmd package -DskipTests'
                
            }
        }
    }

    post {
        success {
            echo 'Build, tests and packaging completed successfully!'
        }

        failure {
            echo 'Pipeline failed.'
        }
    }
}
