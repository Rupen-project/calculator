pipeline {

    agent any
    stages {
        stage('stage-1 Git pull') {
            steps {
                 git url: 'https://github.com/Rupen-project/calculator.git', branch: 'master',
                 credentialsId: 'git-cred'
            }
        }
//         stage('stage-2 Build maven project') {
//             steps {
//                 sh "mvn -B -DskipTests clean package"
//             }
//         }

        stage('stage-3 Test build project') {
            steps {
                sh "/opt/homebrew/bin/mvn --version"
            }
        }
    }
}