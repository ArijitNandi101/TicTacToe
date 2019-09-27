import subprocess, os

def buildfile(dirname):
  for filename in os.listdir(dirname):
    if not os.path.isfile(filename):
      buildfile(dirname+'/'+filename)
    elif filename.endswith(".java"):
      subprocess.call(['javac',filename])
      
buildfile(os.getcwd())
