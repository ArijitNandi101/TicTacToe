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
        sh "java TicTacToe/src/ArijitNandi/TicTacToe/TicTacToe"
      }
    }
    stage('end'){
      steps{
        echo "done"
      }
    }
  }
}
