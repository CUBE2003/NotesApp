package com.example.notes.presentation.notes

import com.example.notes.domain.model.Note
import com.example.notes.domain.util.NoteOrder
import com.example.notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
