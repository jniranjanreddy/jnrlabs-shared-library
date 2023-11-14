@Library('jnrlabs-shared-library') _

//myStep {
    //echo "Inside myStep"
//}
//echo "This is my main jenkinsfile"
//echo "Outside myStep"
pipeline {
    agent { 
          node { 
            label 'master'
            customWorkspace "/tmp/${JOB_NAME}"
        }  
    }  
    environment {
      CURRENTDATE=sh(script: "date '+%Y%m%d%H%M%S'", , returnStdout: true).trim()
      Server="windows"
    }
    stages {
        stage("Env Variables") {
            steps {
             sh "echo This is for Ramesh"
             echo "${BUILD_NUMBER}"
             echo "${CURRENTDATE}"
             echo "${Server}"
            }
        }
	}
}
