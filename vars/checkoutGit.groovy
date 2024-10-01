def call(String gitUrl, String gitBranch) {
   checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Krishna8074123/jenkins-yt.git']])

