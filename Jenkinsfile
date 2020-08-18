pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                dir("/var/lib/jenkins/workspace/marvin/target") {
                    sh 'unzip -o marvin.war -d /home/luan/wildfly-19.0.0.Final/standalone/deployments/marvin.war'    
                }
                dir("/home/luan/wildfly-19.0.0.Final/standalone/deployments") {
                    touch marvin.war.dodeploy   
                }
            }
        }
    }
}
