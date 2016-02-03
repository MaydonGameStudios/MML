import subprocess
import sys

def run():
    if(len(sys.argv) > 1):
        if(len(sys.argv) == 2):
            subprocess.call(['java', '-jar', 'mml.jar', sys.argv[1]])
        elif(len(sys.argv) == 3):
            subprocess.call(['java', '-jar', 'mml.jar', sys.argv[1]], sys.argv[2])
        else:
            print("Too many arguments!")
    else:
        print("You must provide a file path")

run()
