pipeline{
	
	agent {
		dockerfile true
	}
	
	stages{
		stage('Build'){
			steps{
				echo 'Executing Build step..'
				sh 'mvn -B -DskipTests clean package'
			}
		}
		stage('Test'){
			steps{
				sh 'mvn test'
			}
			post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
		}
		stage('sonar'){
		withSonarQubeEnv('Sonar-Qube'){
			steps{
				sh 'sonar-scanner'
			}
		}
	}
  }
}