pipeline{
  agent any
  stages{
    stage('build'){
      sh "javac TicTacToe.java"
    }
    stage('run'){
      sh "java TicTacToe"
    }
  }
}
