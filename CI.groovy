node('master')
{
stage('Prepare')
{
Println("Need to prepare ")
}
stage('clone git')
{
Println("Need to Cloning")
}
stage('Build')
{
Println("Need to Building ")
}
stage('Deploy')
{
Println("Need to Deploying")
}
stage('Notify')
{
Println("Need to Notifying")
}

}
