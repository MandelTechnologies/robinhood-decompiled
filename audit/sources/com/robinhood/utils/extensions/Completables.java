package com.robinhood.utils.extensions;

import com.robinhood.utils.p408rx.ExponentialRetry;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Completables.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0005\u001a(\u0010\f\u001a\u00020\u0001\"\b\b\u0000\u0010\r*\u00020\u000e*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00110\u0010\u001a<\u0010\f\u001a\u00020\u0001\"\b\b\u0000\u0010\r*\u00020\u000e*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00110\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0005¨\u0006\u0013"}, m3636d2 = {"retryExponential", "Lio/reactivex/Completable;", "maxRetries", "", "predicate", "Lkotlin/Function1;", "", "", "ignoreNetworkExceptions", "onErrorResumeNext", "errorMapper", "", "checkFallbackOrError", "T", "", "fallback", "Lkotlin/Function0;", "Lio/reactivex/Maybe;", "doOnError", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.CompletablesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Completables {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryExponential$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static /* synthetic */ Completable retryExponential$default(Completable completable, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.utils.extensions.CompletablesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(Completables.retryExponential$lambda$0((Throwable) obj2));
                }
            };
        }
        return retryExponential(completable, i, function1);
    }

    public static final Completable retryExponential(Completable completable, int i, Function1<? super Throwable, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Completable completableRetryWhen = completable.retryWhen(new ExponentialRetry(i, predicate));
        Intrinsics.checkNotNullExpressionValue(completableRetryWhen, "retryWhen(...)");
        return completableRetryWhen;
    }

    public static final Completable ignoreNetworkExceptions(Completable completable) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Completable completableOnErrorResumeNext = completable.onErrorResumeNext(new Function() { // from class: com.robinhood.utils.extensions.CompletablesKt.ignoreNetworkExceptions.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return Throwables.isNetworkRelated(t) ? Completable.complete() : Completable.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "onErrorResumeNext(...)");
        return completableOnErrorResumeNext;
    }

    public static final Completable onErrorResumeNext(Completable completable, final Function1<? super Throwable, Unit> errorMapper) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Completable completableOnErrorResumeNext = completable.onErrorResumeNext(new Function() { // from class: com.robinhood.utils.extensions.CompletablesKt.onErrorResumeNext.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(final Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final Function1<Throwable, Unit> function1 = errorMapper;
                return Completable.fromCallable(new Callable() { // from class: com.robinhood.utils.extensions.CompletablesKt.onErrorResumeNext.1.1
                    @Override // java.util.concurrent.Callable
                    public /* bridge */ /* synthetic */ Object call() {
                        call();
                        return Unit.INSTANCE;
                    }

                    @Override // java.util.concurrent.Callable
                    public final void call() {
                        Function1<Throwable, Unit> function12 = function1;
                        Throwable th = it;
                        Intrinsics.checkNotNull(th);
                        function12.invoke(th);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "onErrorResumeNext(...)");
        return completableOnErrorResumeNext;
    }

    public static final <T> Completable checkFallbackOrError(Completable completable, final Function0<? extends Maybe<T>> fallback) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        Completable completableOnErrorResumeNext = completable.onErrorResumeNext(new Function() { // from class: com.robinhood.utils.extensions.CompletablesKt.checkFallbackOrError.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(final Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                if (Throwables.isNetworkRelated(t)) {
                    return fallback.invoke().isEmpty().flatMap(new Function() { // from class: com.robinhood.utils.extensions.CompletablesKt.checkFallbackOrError.1.1
                        @Override // io.reactivex.functions.Function
                        public final SingleSource<? extends Unit> apply(Boolean empty) {
                            Intrinsics.checkNotNullParameter(empty, "empty");
                            if (empty.booleanValue()) {
                                return Single.error(t);
                            }
                            return Single.just(Unit.INSTANCE);
                        }
                    }).ignoreElement();
                }
                return Completable.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "onErrorResumeNext(...)");
        return completableOnErrorResumeNext;
    }

    public static final <T> Completable checkFallbackOrError(Completable completable, final Function0<? extends Maybe<T>> fallback, final Function1<? super Throwable, Unit> doOnError) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        Intrinsics.checkNotNullParameter(doOnError, "doOnError");
        Completable completableOnErrorResumeNext = completable.onErrorResumeNext(new Function() { // from class: com.robinhood.utils.extensions.CompletablesKt.checkFallbackOrError.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(final Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                if (Throwables.isNetworkRelated(t)) {
                    return fallback.invoke().isEmpty().flatMap(new Function() { // from class: com.robinhood.utils.extensions.CompletablesKt.checkFallbackOrError.2.1
                        @Override // io.reactivex.functions.Function
                        public final SingleSource<? extends Unit> apply(Boolean empty) {
                            Intrinsics.checkNotNullParameter(empty, "empty");
                            if (empty.booleanValue()) {
                                return Single.error(t);
                            }
                            return Single.just(Unit.INSTANCE);
                        }
                    }).ignoreElement();
                }
                doOnError.invoke(t);
                return Completable.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "onErrorResumeNext(...)");
        return completableOnErrorResumeNext;
    }
}
