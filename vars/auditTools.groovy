def call() {
    node {
        sh '''
            git version
            docker-compose --version
            node --version
            npm version
        '''
    }
}