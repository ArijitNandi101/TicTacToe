pipeline{
  agent any
  stages{
    stage('pull'){
      steps{
        sh "git clone https://github.com/ArijitNandi101/TicTacToe.git"
      }
    }
    stage('build'){
      steps{
        sh "javac TicTacToe/TicTacToe/src/ArijitNandi/TicTacToe/TicTacToe.java"
      }
    }
    stage('run'){
      steps{
        sh "java TicTacToe/TicTacToe/src/ArijitNandi/TicTacToe/TicTacToe"
      }
    }
    stage('end'){
      steps{
        sh "rm -rf TicTacToe"
      }
  }
}
