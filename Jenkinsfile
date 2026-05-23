node {
    def IMAGE_NAME = 'sample-app'
    def CONTAINER_NAME = 'running-sample'

    stage('Checkout Code') {
        checkout scm
    }

    stage('Build JAR') {
        bat 'mvnw clean package'
    }

    stage('Build Docker Image') {
        bat "docker build -t ${IMAGE_NAME} ."
    }

    stage('Deploy Container') {
        try {
            bat "docker rm -f ${CONTAINER_NAME}"
        } catch (Exception e) {
            echo "No existing container found to remove."
        }
        bat "docker run -d -p 8080:8080 --name ${CONTAINER_NAME} ${IMAGE_NAME}"
    }
}
