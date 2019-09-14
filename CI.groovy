node('master')
{
stage('Prepare')
{
println("Need to prepare ")
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
