pipelineJob('Pipeline Demo')
{
  definition{
      cps{
       script(readFileFromWorkspace('CI.groovy'))
        echo "${params.branch}"
        echo "$A"
    }
  }
}
