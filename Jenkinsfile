node {
checkout scm
    environment {
        registry = "siooka/demo"
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }
  stage("Clone") {
    git branch: 'master', url: 'https://github.com/Jd-Bob/siooka.git'
  }

  stage("Build") {
    stage("java package") {
        sh "./mvnw clean install"
     }
    stage("docker image") {


        def customImage = docker.build("demo", ".")

        customImage.inside {
            sh 'echo "test"'
        }

         }
  }

  stage("Continue Integration") {
    stage("Runing unit tests") {
        sh "./mvnw test -Punit"
     }
  }
  stage("Continue Deployment") {
    stage("Deployment") {
        sh "docker run -p 8081:8080 demo "
      }
  }
}