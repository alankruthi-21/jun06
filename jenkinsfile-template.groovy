pipeline {
    agent any
    stages {
        stage("clone code") {
            steps {
                println "here I'm clonning the code"
            }
        }
    

        stage("Build code") {
            steps {
                println "Here I'm buildling the code using --- mvn clean package"
            }
        }
       
        stage("upload artifacts") {
            steps {
                println "Here I'm upload artifacts to --s3 bucket"
            }
        }
         
        stage("Deployment") {
            steps {
                println "Here I'm deploying the code to tomcat servers"
            }
        }
     }
}