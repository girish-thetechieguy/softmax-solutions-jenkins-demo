pipeline{
  agent any
  tools{
    maven 'Maven'
  }
  stages{
    stage('initialize'){
      steps{
            sh '''
              echo "PATH = ${PATH}"
              echo "M2_HOME = ${M2_HOME}"
              '''
      }
    }
    stage('build'){
      steps{
        sh 'mvn clean package'
      }
    }
    stage('Deploy to tomcat'){
      steps{
        sshagent(['tomcat1']){
          sh 'scp -o StrictHostKeyChecking=no target/*.war ubuntu@50.19.58.214:/home/ubuntu/prod/apache-tomcat-9.0.74/webapps/softmax-solutions-jenkins-demo.war'
        }
      }
    }
  }
}
