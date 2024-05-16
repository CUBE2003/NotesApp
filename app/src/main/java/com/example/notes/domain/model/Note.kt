package com.example.notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notes.ui.theme.BabyBlue
import com.example.notes.ui.theme.Lilac
import com.example.notes.ui.theme.Mauve
import com.example.notes.ui.theme.SageGreen
import com.example.notes.ui.theme.SteelGray

@Entity
data class Note(
    val title: String,
    val content: String,
    val color: Int,
    val timestamp: Long,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(BabyBlue,SageGreen,Lilac,Mauve,SteelGray)
    }
}

class InvalidNoteException(message:String):Exception(message)
