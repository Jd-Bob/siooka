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
      sh 'nohup java -jar target/demo-0.0.1-SNAPSHOT.jar -Dserver.port=9090 &'
      sh 'netstat -ntpl'
    }
  }
}