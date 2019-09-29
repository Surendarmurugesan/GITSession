node("master") {
    stage("Prepare"){
        println("Preparing...")
        git(
			url: "git@github.com:srikrishnaprakash/pls.git",
			branch: "master"
	    )
    }
    stage("Clone Application"){
        load 'app/clne.groovy'
    }
    stage("Build"){
    }
    stage("Test"){
        println("Testing...")
    }
    stage("Deploy"){
        println("Deploying...")
    }
}
