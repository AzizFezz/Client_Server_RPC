package exercice2;

import java.util.List;

public interface noteService {
    boolean addNote(String note);
    boolean deleteNote(int index);
    public List<String> listNotes();
    boolean updateNote(int index, String updatedNote);
}
