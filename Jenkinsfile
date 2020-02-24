pipeline {
  agent {
    docker {
      image 'openjdk:8'
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