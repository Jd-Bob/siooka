node {
  stage("Clone") {
    git branch: 'master', url: 'https://github.com/Jd-Bob/siooka.git'
  }

  stage("Build") {
    sh "./mvnw clean install"
  }

  stage("Continue Integration/Continue Deployment") {
    stage("Runing unit tests") {
        sh "./mvnw test -Punit"
     }
    stage("Deployment") {
      sh 'nohup ./mvnw spring-boot:run &'
    }
  }
}