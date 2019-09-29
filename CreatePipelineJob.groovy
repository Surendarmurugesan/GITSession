pipelineJob('Pipeline Demo')
{
  definition{
      cps{
       script(readFileFromWorkspace('CI.groovy'))
       
    }
  }
}
