def call(String gitUrl, String gitBranch) {
    def call(String gitUrl, String gitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: main]],
        userRemoteConfigs: [[url: https://github.com/Krishna8074123/jenkins-yt.git ]]
    ])
}
}