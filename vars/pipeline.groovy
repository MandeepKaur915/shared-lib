def call(def stageName)
{

  

  if ("${stageName}"== "Build")

     {

       sh "mvn clean package"

     }

  elseif ("${stageName}"== "SonarQube Report")

     {

       sh "mvn clean sonar:sonar"

     }

  elseif ("${stageName}"== "Upload Into Nexus")

     {

       sh "mvn clean deploy"

     }
  
  else
  {
    error("please provide valid stagename")
  }

}
