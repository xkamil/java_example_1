pipeline {
  agent {
    node {
      label 'linux'
    }

  }
  stages {
    stage('test') {
      steps {
        sh '''chmod 777 mvnw
./mvnw clean test'''
      }
    }

    stage('error') {
      steps {
        junit '**/target/surefire-report/*.xml'
      }
    }

  }
}