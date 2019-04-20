job('NodeJS example') {
    	scm {
        	git('git://github.com/gvenkat09/nodejs-app.git') {  node -> // is hudson.plugins.git.GitSCM
            	node / gitConfigName('DSL User')
            	node / gitConfigEmail('jenkins-dsl@gmail.com')
        	}
    	}
    	triggers {
        	scm('H/5 * * * *')
    	}
    	wrappers {
        	nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    	}
    	steps {
        	shell("npm install")
    	}
	}
