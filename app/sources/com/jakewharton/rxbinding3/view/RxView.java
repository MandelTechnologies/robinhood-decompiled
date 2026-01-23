package com.jakewharton.rxbinding3.view;

import android.view.View;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(m3635d1 = {"com/jakewharton/rxbinding3/view/RxView__ViewClickObservableKt", "com/jakewharton/rxbinding3/view/RxView__ViewFocusChangeObservableKt", "com/jakewharton/rxbinding3/view/RxView__ViewLayoutChangeEventObservableKt", "com/jakewharton/rxbinding3/view/RxView__ViewLayoutChangeObservableKt", "com/jakewharton/rxbinding3/view/RxView__ViewScrollChangeEventObservableKt", "com/jakewharton/rxbinding3/view/RxView__ViewTreeObserverGlobalLayoutObservableKt", "com/jakewharton/rxbinding3/view/RxView__ViewTreeObserverPreDrawObservableKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {1, 4, 0})
/* loaded from: classes17.dex */
public final class RxView {
    public static final Observable<Unit> clicks(View view) {
        return ViewClickObservable2.clicks(view);
    }

    public static final InitialValueObservable<Boolean> focusChanges(View view) {
        return ViewFocusChangeObservable2.focusChanges(view);
    }

    public static final Observable<Unit> globalLayouts(View view) {
        return ViewTreeObserverGlobalLayoutObservable2.globalLayouts(view);
    }

    public static final Observable<ViewLayoutChangeEvent> layoutChangeEvents(View view) {
        return ViewLayoutChangeEventObservable2.layoutChangeEvents(view);
    }

    public static final Observable<Unit> layoutChanges(View view) {
        return ViewLayoutChangeObservable2.layoutChanges(view);
    }

    public static final Observable<Unit> preDraws(View view, Function0<Boolean> function0) {
        return ViewTreeObserverPreDrawObservable2.preDraws(view, function0);
    }

    public static final Observable<ViewScrollChangeEvent> scrollChangeEvents(View view) {
        return ViewScrollChangeEventObservable2.scrollChangeEvents(view);
    }
}
