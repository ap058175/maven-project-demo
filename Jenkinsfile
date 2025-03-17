pipeline
{
	
    agent any
    tools
    {
		maven 'MAVEN_HOME'
	}
	
	stages
	{
		  stage('Welcome Stage')
		  {
			steps
			{
				echo 'Welcome to Jenkisn Pipline'
			}
		  }
		  stage('Clean Stage')
		  {
			steps
			{
				sh 'mvn clean'
			}
		  }
		  stage('Build Stage')
		  {
			steps
			{
				sh 'mvn install'
			}
		  }
		  stage('Build Success')
		  {
			steps
			{
				echo 'Build Successful'
			}
		  }
	}
}