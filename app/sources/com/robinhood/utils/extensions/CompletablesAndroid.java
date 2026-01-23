package com.robinhood.utils.extensions;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompletablesAndroid.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"observeOnMainThread", "Lio/reactivex/Completable;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.CompletablesAndroidKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CompletablesAndroid {
    public static final Completable observeOnMainThread(Completable completable) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Completable completableObserveOn = completable.observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(completableObserveOn, "observeOn(...)");
        return completableObserveOn;
    }
}
