
pipeline {
    agent any
     tools {
    maven 'maven-3.9.2' 
  }
  stages{

    stage('Build'){
        steps{
          echo 'Building the application ....'
             sh 'mvn clean package'
        }
    }
    stage('Test'){
        steps{
          echo 'Running tests ....'
        }
    }
    stage('Deploy'){
        steps{
          echo 'Deploying the application ....'
        }
    }
  }
}
