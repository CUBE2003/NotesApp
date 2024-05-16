package com.example.notes.domain.use_case

import com.example.notes.domain.model.InvalidNoteException
import com.example.notes.domain.model.Note
import com.example.notes.domain.repository.NoteRepository

class AddNote(
    private val noteRepository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note:Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("the title of the note should not be empty")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("the content of the note should not be empty")
        }
        noteRepository.insertNote(note)
    }
}