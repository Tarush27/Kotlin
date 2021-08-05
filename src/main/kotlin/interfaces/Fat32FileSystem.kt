package interfaces

import FileSystem

class Fat32FileSystem: FileSystem {
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return ""
    }
}