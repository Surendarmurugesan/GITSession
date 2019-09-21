pipelineJob('Pipeline-1')
{
  definition{
    cps{
      script(readFileFromWorkspace('Stages1.groovy'))
}
