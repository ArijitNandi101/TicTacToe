pipeline{
  agent any
  stages{
    stage('build'){
      steps{
        sh "find -name *.java > src.txt"
        sh "javac @src.txt"
        echo "build succeeded"
      }
    }
    stage('run'){
      steps{
        sh "cd TicTacToe/src/ArijitNandi/TicTacToe/ && pwd"
      }
    }
    stage('end'){
      steps{
        echo "done"
      }
    }
  }
}
