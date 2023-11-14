// vars/myStep.groovy
def call(body) {
    // Wrap the provided block of code with custom steps
    echo "Start of myStep"
    body()
    echo "End of myStep"
}

