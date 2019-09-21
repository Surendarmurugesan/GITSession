pipelineJob('Pipeline-1')
{
  definition{
    cps{
      script(readFileFromWorkspace('CI.groovy'))
      def approvals = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
      approvals.approveScript(approvals.hash(jobScript,"groovy"))
}
