package personal.abdulmughniaf.diarybook.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyTopDiaryFragment extends PostListFragment {

    public MyTopDiaryFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        String myUserId = getUid();
        Query myTopPostsQuery = databaseReference.child("user-posts").child(myUserId)
                .orderByChild("starCount");
        return myTopPostsQuery;
    }
}
