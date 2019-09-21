pipelineJob('First_PipelineJob')
{
  scm {
    git{
      remote{
        name('origin')
        url('https://github.com/Surendarmurugesan/GITSession.git')
      }
    }

    }
}
