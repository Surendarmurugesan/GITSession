freeStyleJob('DSL Script in freestyle'){
	description('DSL script in folder')
	 scm {
        github('Surendarmurugesan/GITSession')
    	}
    steps {
        dsl {
            external('folderfile2.groovy')
            removeAction('DISABLE')
            ignoreExisting()
            additionalClasspath('lib')
        }
    }
}
