pipelineJob('Pipeline Demo')
{
  definition{
      cps{
       script(readFileFromWorkspace('CI.groovy'))
      def approvals = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
      approvals.approveScript(approvals.hash(script,"groovy")))
    }
  }
}
