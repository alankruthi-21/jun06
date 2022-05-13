pipeline {
    agent any
    stages {
        stage("name") {
            steps {
                println "my name is pinky"
            }
        }
                stage("age"){
                    steps{
                        println "i dont wont to reveal"
                    
            }
        }
    }
}