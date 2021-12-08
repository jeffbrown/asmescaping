package asmescaping

class SomeClass {

    static void main(String[] args) {
        def inputStream = SomeClass.getResourceAsStream('/info.txt')
        inputStream.eachLine { line ->
            String path = line.replaceAll('\\\\', '/')
            println "Path: $path"
        }
    }
}
