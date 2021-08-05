package interfaces

import FileSystem

class MemoryFileSystem(val files: List<String>,val fileContents:String): FileSystem {
    override fun readDir(): List<String> {
        return files
    }

    override fun readFile(): String {
       return fileContents
    }
}