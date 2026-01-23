package com.jakewharton.rxbinding3.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecyclerViewScrollStateChangeObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"scrollStateChanges", "Lio/reactivex/Observable;", "", "Landroidx/recyclerview/widget/RecyclerView;", "rxbinding-recyclerview_release"}, m3637k = 5, m3638mv = {1, 1, 15}, m3641xs = "com/jakewharton/rxbinding3/recyclerview/RxRecyclerView")
/* renamed from: com.jakewharton.rxbinding3.recyclerview.RxRecyclerView__RecyclerViewScrollStateChangeObservableKt, reason: use source file name */
/* loaded from: classes27.dex */
final /* synthetic */ class RecyclerViewScrollStateChangeObservable3 {
    public static final Observable<Integer> scrollStateChanges(RecyclerView scrollStateChanges) {
        Intrinsics.checkParameterIsNotNull(scrollStateChanges, "$this$scrollStateChanges");
        return new RecyclerViewScrollStateChangeObservable(scrollStateChanges);
    }
}
