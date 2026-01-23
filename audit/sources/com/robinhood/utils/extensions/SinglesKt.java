package com.robinhood.utils.extensions;

import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.p408rx.ExponentialRetry;
import com.robinhood.utils.p408rx.Poll;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: Singles.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001a>\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u001a=\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00030\r\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0086\b\u001a,\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0015\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\u001aI\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00012'\u0010\u0017\u001a#\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\t¨\u0006\u001c"}, m3636d2 = {"mapToOptional", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "T", "", "retryExponential", "maxRetries", "", "predicate", "Lkotlin/Function1;", "", "", "poll", "Lio/reactivex/Observable;", "interval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "delayFirstEmit", "ignoreNetworkExceptions", "unwrapOptional", "Lio/reactivex/Maybe;", "recoverFromRefIdConflict", "fetchConflictingResource", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "conflictingResourceId", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SinglesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryExponential$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static final <T> Single<Optional<T>> mapToOptional(Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Single<Optional<T>> single2 = (Single<Optional<T>>) single.map(new Function() { // from class: com.robinhood.utils.extensions.SinglesKt.mapToOptional.1
            @Override // io.reactivex.functions.Function
            public final Optional<T> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C419541<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(single2, "map(...)");
        return single2;
    }

    public static /* synthetic */ Single retryExponential$default(Single single, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.utils.extensions.SinglesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(SinglesKt.retryExponential$lambda$0((Throwable) obj2));
                }
            };
        }
        return retryExponential(single, i, function1);
    }

    public static final <T> Single<T> retryExponential(Single<T> single, int i, Function1<? super Throwable, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Single<T> singleRetryWhen = single.retryWhen(new ExponentialRetry(i, predicate));
        Intrinsics.checkNotNullExpressionValue(singleRetryWhen, "retryWhen(...)");
        return singleRetryWhen;
    }

    public static /* synthetic */ Observable poll$default(Single single, long j, TimeUnit timeUnit, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Observable observable = single.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable observableCompose = observable.compose(new Poll(j, timeUnit, z));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    public static final <T> Observable<T> poll(Single<T> single, long j, TimeUnit timeUnit, boolean z) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Observable<T> observable = single.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<T> observable2 = (Observable<T>) observable.compose(new Poll(j, timeUnit, z));
        Intrinsics.checkNotNullExpressionValue(observable2, "compose(...)");
        return observable2;
    }

    public static final <T> Single<Optional<T>> ignoreNetworkExceptions(Single<Optional<T>> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Single<Optional<T>> singleOnErrorResumeNext = single.onErrorResumeNext(new Function() { // from class: com.robinhood.utils.extensions.SinglesKt.ignoreNetworkExceptions.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<T>> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return Throwables.isNetworkRelated(t) ? Single.just(Optional2.INSTANCE) : Single.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorResumeNext, "onErrorResumeNext(...)");
        return singleOnErrorResumeNext;
    }

    public static final <T> Maybe<T> unwrapOptional(Single<Optional<T>> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Maybe<T> maybe = (Maybe<T>) single.flatMapMaybe(new Function() { // from class: com.robinhood.utils.extensions.SinglesKt.unwrapOptional.1
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends T> apply(Optional<? extends T> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                T tComponent1 = optional.component1();
                if (tComponent1 == null) {
                    return Maybe.empty();
                }
                return Maybe.just(tComponent1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybe, "flatMapMaybe(...)");
        return maybe;
    }

    public static final <T> Single<T> recoverFromRefIdConflict(Single<T> single, final Function1<? super UUID, ? extends Single<T>> fetchConflictingResource) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(fetchConflictingResource, "fetchConflictingResource");
        Single<T> singleOnErrorResumeNext = single.onErrorResumeNext(new Function() { // from class: com.robinhood.utils.extensions.SinglesKt.recoverFromRefIdConflict.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends T> apply(Throwable t) {
                String strLastNonEmptyPathSegment;
                Intrinsics.checkNotNullParameter(t, "t");
                HttpUrl httpConflictUrl = Throwables.getHttpConflictUrl(t);
                UUID uuid = null;
                if (httpConflictUrl != null && (strLastNonEmptyPathSegment = HttpUrls.lastNonEmptyPathSegment(httpConflictUrl)) != null) {
                    try {
                        uuid = StringsKt.toUuid(strLastNonEmptyPathSegment);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (uuid != null) {
                    return fetchConflictingResource.invoke(uuid);
                }
                return Single.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorResumeNext, "onErrorResumeNext(...)");
        return singleOnErrorResumeNext;
    }
}
