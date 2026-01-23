package com.jakewharton.rxbinding3.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Observable;
import kotlin.Metadata;

@Metadata(m3635d1 = {"com/jakewharton/rxbinding3/recyclerview/RxRecyclerView__RecyclerViewScrollEventObservableKt", "com/jakewharton/rxbinding3/recyclerview/RxRecyclerView__RecyclerViewScrollStateChangeObservableKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {1, 4, 0})
/* loaded from: classes27.dex */
public final class RxRecyclerView {
    public static final Observable<RecyclerViewScrollEvent> scrollEvents(RecyclerView recyclerView) {
        return RecyclerViewScrollEventObservable4.scrollEvents(recyclerView);
    }

    public static final Observable<Integer> scrollStateChanges(RecyclerView recyclerView) {
        return RecyclerViewScrollStateChangeObservable3.scrollStateChanges(recyclerView);
    }
}
