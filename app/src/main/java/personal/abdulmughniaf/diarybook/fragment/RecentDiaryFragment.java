package personal.abdulmughniaf.diarybook.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class RecentDiaryFragment extends PostListFragment {

    public RecentDiaryFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        Query recentPostsQuery = databaseReference.child("posts")
                .limitToFirst(100);
        return recentPostsQuery;
    }
}
