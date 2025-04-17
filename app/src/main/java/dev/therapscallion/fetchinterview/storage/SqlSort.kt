package dev.therapscallion.fetchinterview.storage

enum class SqlSort(val sort: String) {
    ASC("ASC"),
    DESC("DESC");

    fun inverse(): SqlSort = when (this) {
        ASC -> DESC
        DESC -> ASC
    }
}