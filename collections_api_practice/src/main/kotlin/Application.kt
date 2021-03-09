data class Song(val id: Int, val title: String, val duration: String)
data class SongMetadata(val id: Int, val album: String, val artist: String)
data class SongWithMetadata(val id: Int, val title: String, val duration: String, val album: String, val artist: String)

fun main() {
    val songDAO = SongDAO()
    songDAO.getAllSongs().take(5).forEach { println(it) }
    println("\n-------------------------\n")

    val songMetadataDAO = SongMetadataDAO()
    println(songMetadataDAO.getSongMetadata(3))
    println()
    songMetadataDAO.getAllSongsMetadata().take(5).forEach { println(it) }
    println("\n-------------------------\n")

    val service = Helper(songDAO, songMetadataDAO)
    service.getAllSongsWithMetadata().take(5).forEach { println(it) }
    println("-----")
    service.getAllSongsWithMetadataSortBy { it.album }.take(10).forEach { println(it.album) }
    println("-----")
    for ((key, value) in service.getAllSongsWithMetadataGroupBy { it.artist }) {
        println("$key = $value")
    }
    println("-----")
    println(service.getSongsWithMetadataCount { it.artist == "Breaking Benjamin" })
}