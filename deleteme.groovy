pipeline {
    agent any
    stages {
        stage('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = &{M2_HOME}"
                    '''
            }
        }
        stage('Build') {
            steps {
                echo 'Building ...'
            }
        }
        stage ('Deploy'){
            steps {
                echo 'Code deployrd.'
            }
        }

    }

}
