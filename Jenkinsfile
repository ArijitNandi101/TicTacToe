pipeline{
  agent any
  stages{
    stage('build'){
      steps{
        sh "python TicTacToe/src/ArijitNandi/TicTacToe/build.py"
      }
    }
    stage('run'){
      steps{
        sh "java TicTacToe/src/ArijitNandi/TicTacToe/TicTacToe"
      }
    }
    stage('end'){
      steps{
        sh "rm -rf TicTacToe*"
      }
    }
  }
}
