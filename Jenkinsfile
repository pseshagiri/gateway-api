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
              cmd 'gradle clean build'
            }
        }
    }

        /*
        stage('docker server connect '){
           sh xyz.aws.com
        }
        stage('Docker push'){
            docker push  <githubId>/<repo_name>:<tag_name>
        }
        
        stage('Docker run'){
            docker run --name tag_name -p 9000:9000 -d -t <githubId>/<repo_name>:<tag_name>
        }
        stage('docker server connect '){
            sh exit
         }
         */
    }
   /*post{

    }*/
}
