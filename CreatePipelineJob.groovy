pipelineJob('Pipeline-2')
{
  definition{
    cpsScm{
      scm {
        github('Surendarmurugesan/GITSession', 'master')
        scriptPath('CI.groovy')
        def approvals = org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get()
        approvals.approveScript(approvals.hash(scriptPath,"groovy"))
    }
    }
  }
}
