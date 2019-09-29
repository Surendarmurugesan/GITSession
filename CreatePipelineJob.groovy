pipelineJob('Pipeline Demo')
{
  definition{
      cpsScm {
        scriptPath('CI.groovy')
        def approvals = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
        approvals.approveScript(approvals.hash(scriptPath,"groovy"))
    }
  }
}
