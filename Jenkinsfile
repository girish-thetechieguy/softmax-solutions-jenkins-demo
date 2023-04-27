pipeline{
  agent any
  tools{
    maven 'Maven'
  }
  stages{
    stage('initialize'){
      sh '''
            echo "PATH = ${PATH}"
            echo "M2_HOME = ${M2_HOME}"
      '''
    }
    stage('build'){
      sh '''
      mvn clean package
      '''
    }
  }
}
