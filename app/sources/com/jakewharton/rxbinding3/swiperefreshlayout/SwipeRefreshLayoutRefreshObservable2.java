package com.jakewharton.rxbinding3.swiperefreshlayout;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: SwipeRefreshLayoutRefreshObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"com/jakewharton/rxbinding3/swiperefreshlayout/RxSwipeRefreshLayout__SwipeRefreshLayoutRefreshObservableKt"}, m3637k = 4, m3638mv = {1, 1, 15})
/* renamed from: com.jakewharton.rxbinding3.swiperefreshlayout.RxSwipeRefreshLayout, reason: use source file name */
/* loaded from: classes27.dex */
public final class SwipeRefreshLayoutRefreshObservable2 {
    public static final Observable<Unit> refreshes(SwipeRefreshLayout swipeRefreshLayout) {
        return SwipeRefreshLayoutRefreshObservable3.refreshes(swipeRefreshLayout);
    }
}
