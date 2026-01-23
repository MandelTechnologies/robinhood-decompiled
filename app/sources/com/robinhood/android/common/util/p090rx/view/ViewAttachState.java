package com.robinhood.android.common.util.p090rx.view;

import android.view.View;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewAttachState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"attachState", "Lio/reactivex/Observable;", "", "Landroid/view/View;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.rx.view.ViewAttachStateKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class ViewAttachState {
    public static final Observable<Boolean> attachState(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new ViewAttachState2(view);
    }
}
