pipeline{
    tools{
        maven 'Maven 3.6.3'
    }

    stages{
        stage('Clean'){
            steps{
                sh 'mvn clean'
            }
        }

        stage('Build'){
            steps{
                sh 'mvn -B -DskipTests package'
            }
        }
    }
}