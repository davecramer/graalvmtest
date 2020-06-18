@groovy.transform.CompileStatic

class TestPostgres {
    static void main(String[] args) {
        TestPostgres testPostgres = new TestPostgres()
        testPostgres.runSomeFunction()
    }
    public void runSomeFunction() {
        println "hello world"
    }
}
