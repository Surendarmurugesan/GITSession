pipelineJob('Pipeline-1')
{
  definition{
    cps{
      script(readFileFromWorkspace('CI.groovy'))
}
