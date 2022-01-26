object FileUtil:
    def create(directory : String, name : String) : Unit =
        println(s"File $name created in the directory $directory")

FileUtil.create("/test/", "test.txt")
