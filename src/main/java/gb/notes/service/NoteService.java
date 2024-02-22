package gb.notes.service;


import gb.notes.model.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoteService {

    public List<Note> getAllNotes();

    public Note getNoteById(Long id);

    public Note updateNote(Note note);

    public void deleteNoteById(Long id);

    Note createNote(Note note);
}
