package com.robinhood.utils.extensions;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlowablesAndroid.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"observeOnMainThread", "Lio/reactivex/Flowable;", "T", "", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.FlowablesAndroidKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FlowablesAndroid {
    public static final <T> Flowable<T> observeOnMainThread(Flowable<T> flowable) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Flowable<T> flowableObserveOn = flowable.observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(flowableObserveOn, "observeOn(...)");
        return flowableObserveOn;
    }
}
