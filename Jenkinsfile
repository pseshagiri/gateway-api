pipeline{
    environment{
        GITHUBURL = 'https://github.com/pseshagiri/gateway-api.git'        
    }
    agent any
    stages{
        stage('GIT Checkout'){
            steps{
              git branch: 'routes', credentialsId: 'githubUserDetails1', url: 'https://github.com/pseshagiri/gateway-api.git'
            }           
        }
        stage('clean build '){
            steps{
              sh 'gradle clean build'
            }
        stage('clean build '){
            steps{
              sh 'gradle clean build'
            }
        }
    }
}
}
