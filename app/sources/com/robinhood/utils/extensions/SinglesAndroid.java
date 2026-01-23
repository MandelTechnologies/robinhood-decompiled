package com.robinhood.utils.extensions;

import com.robinhood.utils.p408rx.scheduler.FastPathHandlerScheduler;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SinglesAndroid.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"observeOnMainThread", "Lio/reactivex/Single;", "T", "", "observeOnFastPath", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.SinglesAndroidKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class SinglesAndroid {
    public static final <T> Single<T> observeOnMainThread(Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Single<T> singleObserveOn = single.observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(singleObserveOn, "observeOn(...)");
        return singleObserveOn;
    }

    public static final <T> Single<T> observeOnFastPath(Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Single<T> singleObserveOn = single.observeOn(FastPathHandlerScheduler.INSTANCE.getMainThread());
        Intrinsics.checkNotNullExpressionValue(singleObserveOn, "observeOn(...)");
        return singleObserveOn;
    }
}
