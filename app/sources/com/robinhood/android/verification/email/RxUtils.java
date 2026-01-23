package com.robinhood.android.verification.email;

import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"addVerificationIdlingResource", "Lio/reactivex/Single;", "T", "kotlin.jvm.PlatformType", "", "Lio/reactivex/Completable;", "feature-verification_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.RxUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RxUtils {
    public static final <T> Single<T> addVerificationIdlingResource(Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Single<T> singleDoFinally = single.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.verification.email.RxUtilsKt.addVerificationIdlingResource.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.increment(IdlingResourceType.VERIFICATION);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.verification.email.RxUtilsKt.addVerificationIdlingResource.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.decrement(IdlingResourceType.VERIFICATION);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        return singleDoFinally;
    }

    public static final Completable addVerificationIdlingResource(Completable completable) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Completable completableDoFinally = completable.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.verification.email.RxUtilsKt.addVerificationIdlingResource.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.increment(IdlingResourceType.VERIFICATION);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.verification.email.RxUtilsKt.addVerificationIdlingResource.4
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.decrement(IdlingResourceType.VERIFICATION);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        return completableDoFinally;
    }
}
