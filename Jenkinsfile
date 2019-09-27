pipeline{
  agent any
  stages{
    stage('build'){
      steps{
        sh "python TicTacToe/TicTacToe/src/ArijitNandi/TicTacToe/build.py"
      }
    }
    stage('run'){
      steps{
        sh "java TicTacToe/TicTacToe/src/ArijitNandi/TicTacToe/TicTacToe"
      }
    }
    stage('end'){
      steps{
        sh "rm -rf TicTacToe*"
      }
    }
  }
}
