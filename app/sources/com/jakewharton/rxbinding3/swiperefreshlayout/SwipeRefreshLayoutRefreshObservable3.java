package com.jakewharton.rxbinding3.swiperefreshlayout;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeRefreshLayoutRefreshObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"refreshes", "Lio/reactivex/Observable;", "", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "rxbinding-swiperefreshlayout_release"}, m3637k = 5, m3638mv = {1, 1, 15}, m3641xs = "com/jakewharton/rxbinding3/swiperefreshlayout/RxSwipeRefreshLayout")
/* renamed from: com.jakewharton.rxbinding3.swiperefreshlayout.RxSwipeRefreshLayout__SwipeRefreshLayoutRefreshObservableKt, reason: use source file name */
/* loaded from: classes27.dex */
final /* synthetic */ class SwipeRefreshLayoutRefreshObservable3 {
    public static final Observable<Unit> refreshes(SwipeRefreshLayout refreshes) {
        Intrinsics.checkParameterIsNotNull(refreshes, "$this$refreshes");
        return new SwipeRefreshLayoutRefreshObservable(refreshes);
    }
}
