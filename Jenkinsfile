pipeline{
    agent any

    tools{
        maven 'Maven 3.6.3'
    }
    
    environment{
        ARTIFACT_ID = readMavenPom().getArtifactId()
        VERSION = readMavenPom().getVersion()
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

        stage('Test'){
            steps{
                sh 'mvn -B test'
            }
        }

        stage('Code Coverage'){
            steps{
                sh 'mvn -B verify'
            }
        }

        stage('Docker Artifacts'){
            steps{
                withDockerRegistry([credentialsId: "docker_hub_id", url: ""]){
                    sh 'docker build -t rkvodde/${ARTIFACT_ID}:${VERSION} .'
                    sh 'docker push rkvodde/${ARTIFACT_ID}:${VERSION}'
                }
            }
        }
    }
}