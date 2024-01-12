package exercice2;

import java.util.ArrayList;
import java.util.List;

public class noteServiceImpl implements noteService{
    public static List<String> listNotes =new ArrayList<>();

    @Override
    public boolean addNote(String note) {
        listNotes.add(note);
        return true ;
    }

    @Override
    public boolean deleteNote(int index) {
        listNotes.remove(index);
        return true ;
    }

    @Override
    public List<String> listNotes() {
        return listNotes;
    }

    @Override
    public boolean updateNote(int index, String updatedNote) {
        if(listNotes.get(index) != null){
            listNotes.set(index, updatedNote);
            return true ;
        }
            return false ;
    }
}
