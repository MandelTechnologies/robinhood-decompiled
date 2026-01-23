package com.robinhood.android.lib.conversations;

import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxErrorExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0002\u001a,\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0007¨\u0006\b"}, m3636d2 = {"ignoreChatException", "Lio/reactivex/Completable;", "Lio/reactivex/Observable;", "T", "", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "Lio/reactivex/Maybe;", "lib-conversations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.RxErrorExtensionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class RxErrorExtensions {
    public static final Completable ignoreChatException(Completable completable) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Completable completableOnErrorResumeNext = completable.onErrorResumeNext(new Function() { // from class: com.robinhood.android.lib.conversations.RxErrorExtensionsKt.ignoreChatException.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return t instanceof ChatException ? Completable.complete() : Completable.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "onErrorResumeNext(...)");
        return completableOnErrorResumeNext;
    }

    public static final <T> Observable<T> ignoreChatException(Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<T> observableOnErrorResumeNext = observable.onErrorResumeNext(new Function() { // from class: com.robinhood.android.lib.conversations.RxErrorExtensionsKt.ignoreChatException.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends T> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return t instanceof ChatException ? Observable.empty() : Observable.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    public static final <T> Single<Optional<T>> ignoreChatException(Single<Optional<T>> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Single<Optional<T>> singleOnErrorResumeNext = single.onErrorResumeNext(new Function() { // from class: com.robinhood.android.lib.conversations.RxErrorExtensionsKt.ignoreChatException.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<T>> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return t instanceof ChatException ? Single.just(Optional2.INSTANCE) : Single.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorResumeNext, "onErrorResumeNext(...)");
        return singleOnErrorResumeNext;
    }

    public static final <T> Maybe<T> ignoreChatException(Maybe<T> maybe) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Maybe<T> maybeOnErrorResumeNext = maybe.onErrorResumeNext(new Function() { // from class: com.robinhood.android.lib.conversations.RxErrorExtensionsKt.ignoreChatException.4
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends T> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return t instanceof ChatException ? Maybe.empty() : Maybe.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeOnErrorResumeNext, "onErrorResumeNext(...)");
        return maybeOnErrorResumeNext;
    }
}
