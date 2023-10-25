pipeline {
    agent any
    stages {
        stage ('pull') {
            steps{
                echo 'pull success'}
        }
        stage ('build') {
            steps{
                echo 'congrats! build is done'}
        }
        stage ('test') {
            steps{echo 'test successful'
            }
        }
        stage ('deploy'){
            steps{echo 'deploy successful '
                
            }
        }
    }
}