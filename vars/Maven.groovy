defcall(StringmavenGoal){

  

  if ("${mavenGoal}"== "Clean")

     {

       sh "mvn clean"

     }

  elseif ("${mavenGoal}"== "Compile")

     {

       sh "mvn clean compile"

     }

  elseif ("${mavenGoal}"== "Test")

     {

       sh "mvn clean test"

     }

   elseif ("${mavenGoal}"== "Package")

      {

        sh "mvn clean package"

     }

}
