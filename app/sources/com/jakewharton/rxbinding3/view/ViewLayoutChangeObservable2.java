package com.jakewharton.rxbinding3.view;

import android.view.View;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewLayoutChangeObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"layoutChanges", "Lio/reactivex/Observable;", "", "Landroid/view/View;", "rxbinding_release"}, m3637k = 5, m3638mv = {1, 1, 15}, m3641xs = "com/jakewharton/rxbinding3/view/RxView")
/* renamed from: com.jakewharton.rxbinding3.view.RxView__ViewLayoutChangeObservableKt, reason: use source file name */
/* loaded from: classes17.dex */
final /* synthetic */ class ViewLayoutChangeObservable2 {
    public static final Observable<Unit> layoutChanges(View layoutChanges) {
        Intrinsics.checkParameterIsNotNull(layoutChanges, "$this$layoutChanges");
        return new ViewLayoutChangeObservable(layoutChanges);
    }
}
