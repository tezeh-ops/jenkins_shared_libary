def call(){
    sh  'mvn compile -Dadd-opens=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED'

    sh 'mvn test'
    

}
