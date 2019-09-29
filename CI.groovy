node('master')
{
stage('Projetc parameter')
{
println("Parameterized ")
  echo "pulling changes from branch ${params.branch}"
  echo " The value of A is ${A}"
}
stage('clone git')
{
println("Need to Cloning")
}
stage('Build')
{
println("Need to Building ")
}
stage('Deploy')
{
println("Need to Deploying")
}
stage('Notify')
{
println("Need to Notifying")
}

}
