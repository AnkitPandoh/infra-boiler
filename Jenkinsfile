pipeline{
	agent{
		docker{
			image 'maven:3-alpine'
			args '-v /root/.m2:/root/.m2'
		}
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
		stage('Execute Java'){
			agent{
				docker {
					image 'java'
				}
			}
			steps{
				echo 'Printing Java Version'
				sh 'java -version'		
			}
		}
	}
}