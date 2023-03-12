pipeline {

    environment {
            registry = "rupen28/calculator-devopstools-webapp"
            registryCredential = 'docker-cred'
            dockerImage = ''
        }

    agent any
    stages {
        stage('stage-1 Git pull') {
            steps {
                 git url: 'https://github.com/Rupen-project/calculator.git', branch: 'master',
                 credentialsId: 'git-cred'
            }
        }
        stage('stage-2 Build maven project') {
            steps {
                sh "/opt/homebrew/bin/mvn -B -DskipTests clean package"
            }
        }

        stage('stage-3 Test build project') {
            steps {
                sh "/opt/homebrew/bin/mvn test"
            }
        }

        stage('stage-4 Build docker image in local machine') {
                    steps{
                        script {
//                                 docker=sh'/usr/local/bin/docker'
//                             dockerImage = docker.build (registry + ":latest")
                                dockerImage = sh '/usr/local/bin/docker build -t' + registry +':latest .'
                        }
                    }
                }

        stage('stage- 5 Push docker image to dockerhub') {
            steps{
                script {

                    sh '/usr/local/bin/docker login -u "rupen28" -p "Rupen2812@"'
                    sh '/usr/local/bin/docker push registry:latest'
//                     docker.withRegistry( '', registryCredential ) {
//                     dockerImage.push()
//                     }`
                }
            }
        }
    }
}
