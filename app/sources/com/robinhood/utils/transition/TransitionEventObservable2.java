package com.robinhood.utils.transition;

import android.transition.Transition;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionEventObservable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"transitionEvents", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/transition/TransitionEvent;", "Landroid/transition/Transition;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.transition.TransitionEventObservableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TransitionEventObservable2 {
    public static final Observable<TransitionEvent> transitionEvents(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        return new TransitionEventObservable(transition);
    }
}
