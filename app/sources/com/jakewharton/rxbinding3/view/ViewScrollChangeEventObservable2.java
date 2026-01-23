package com.jakewharton.rxbinding3.view;

import android.view.View;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewScrollChangeEventObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"scrollChangeEvents", "Lio/reactivex/Observable;", "Lcom/jakewharton/rxbinding3/view/ViewScrollChangeEvent;", "Landroid/view/View;", "rxbinding_release"}, m3637k = 5, m3638mv = {1, 1, 15}, m3641xs = "com/jakewharton/rxbinding3/view/RxView")
/* renamed from: com.jakewharton.rxbinding3.view.RxView__ViewScrollChangeEventObservableKt, reason: use source file name */
/* loaded from: classes27.dex */
final /* synthetic */ class ViewScrollChangeEventObservable2 {
    public static final Observable<ViewScrollChangeEvent> scrollChangeEvents(View scrollChangeEvents) {
        Intrinsics.checkParameterIsNotNull(scrollChangeEvents, "$this$scrollChangeEvents");
        return new ViewScrollChangeEventObservable(scrollChangeEvents);
    }
}
