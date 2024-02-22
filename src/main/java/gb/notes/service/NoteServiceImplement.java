package gb.notes.service;

import gb.notes.model.Note;
import gb.notes.repositories.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoteServiceImplement implements NoteService{
    private final NoteRepository noteRepository;
    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNoteById(Long id) {
        Note noteById = getNoteById(id);
        noteRepository.delete(noteById);
    }

    @Override
    public Note createNote(Note note) {
        return null;
    }
}
