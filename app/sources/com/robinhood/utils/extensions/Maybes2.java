package com.robinhood.utils.extensions;

import com.robinhood.utils.p408rx.ExponentialRetry;
import com.robinhood.utils.p408rx.Poll;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;

/* compiled from: Maybes.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aA\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000f\u001aE\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"", "T", "Lio/reactivex/Maybe;", "ignoreNetworkExceptions", "(Lio/reactivex/Maybe;)Lio/reactivex/Maybe;", "", "interval", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "", "delayFirstEmit", "Lio/reactivex/Observable;", "poll", "(Lio/reactivex/Maybe;JLjava/util/concurrent/TimeUnit;Z)Lio/reactivex/Observable;", "j$/time/Duration", "(Lio/reactivex/Maybe;Lj$/time/Duration;Z)Lio/reactivex/Observable;", "", "maxRetries", "Lkotlin/Function1;", "", "predicate", "retryExponential", "(Lio/reactivex/Maybe;ILkotlin/jvm/functions/Function1;)Lio/reactivex/Maybe;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.MaybesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Maybes2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryExponential$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static final <T> Maybe<T> ignoreNetworkExceptions(Maybe<T> maybe) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Maybe<T> maybeOnErrorResumeNext = maybe.onErrorResumeNext(new Function() { // from class: com.robinhood.utils.extensions.MaybesKt.ignoreNetworkExceptions.1
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends T> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return Throwables.isNetworkRelated(t) ? Maybe.empty() : Maybe.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeOnErrorResumeNext, "onErrorResumeNext(...)");
        return maybeOnErrorResumeNext;
    }

    public static /* synthetic */ Observable poll$default(Maybe maybe, long j, TimeUnit timeUnit, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return poll(maybe, j, timeUnit, z);
    }

    public static final <T> Observable<T> poll(Maybe<T> maybe, long j, TimeUnit timeUnit, boolean z) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Observable<T> observable = maybe.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<T> observable2 = (Observable<T>) observable.compose(new Poll(j, timeUnit, z));
        Intrinsics.checkNotNullExpressionValue(observable2, "compose(...)");
        return observable2;
    }

    public static /* synthetic */ Observable poll$default(Maybe maybe, Duration duration, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return poll(maybe, duration, z);
    }

    public static final <T> Observable<T> poll(Maybe<T> maybe, Duration interval, boolean z) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Observable<T> observable = maybe.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return ObservablesKt.poll(observable, interval, z);
    }

    public static /* synthetic */ Maybe retryExponential$default(Maybe maybe, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.utils.extensions.MaybesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(Maybes2.retryExponential$lambda$0((Throwable) obj2));
                }
            };
        }
        return retryExponential(maybe, i, function1);
    }

    public static final <T> Maybe<T> retryExponential(Maybe<T> maybe, int i, Function1<? super Throwable, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Maybe<T> maybeRetryWhen = maybe.retryWhen(new ExponentialRetry(i, predicate));
        Intrinsics.checkNotNullExpressionValue(maybeRetryWhen, "retryWhen(...)");
        return maybeRetryWhen;
    }
}
