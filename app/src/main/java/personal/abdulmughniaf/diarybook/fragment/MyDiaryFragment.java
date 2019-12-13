package personal.abdulmughniaf.diarybook.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyDiaryFragment extends PostListFragment {

    public MyDiaryFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        return databaseReference.child("user-posts")
                .child(getUid());
    }
}
