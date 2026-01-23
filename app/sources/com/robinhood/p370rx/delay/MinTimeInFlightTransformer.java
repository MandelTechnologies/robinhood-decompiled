package com.robinhood.p370rx.delay;

import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.MaybeTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MinTimeInFlightTransformer.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rx/delay/MinTimeInFlightTransformer;", "T", "", "Lio/reactivex/ObservableTransformer;", "Lio/reactivex/CompletableTransformer;", "Lio/reactivex/SingleTransformer;", "Lio/reactivex/MaybeTransformer;", "delayInMillis", "", "<init>", "(J)V", "delay", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)V", "apply", "Lio/reactivex/CompletableSource;", "upstream", "Lio/reactivex/Completable;", "Lio/reactivex/SingleSource;", "Lio/reactivex/Single;", "Lio/reactivex/MaybeSource;", "Lio/reactivex/Maybe;", "Lio/reactivex/Observable;", "lib-rx-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class MinTimeInFlightTransformer<T> implements ObservableTransformer<T, T>, CompletableTransformer, SingleTransformer<T, T>, MaybeTransformer<T, T> {
    private final long delayInMillis;

    public MinTimeInFlightTransformer(long j) {
        this.delayInMillis = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MinTimeInFlightTransformer(long j, TimeUnit timeUnit) {
        this(timeUnit.toMillis(j));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    @Override // io.reactivex.CompletableTransformer
    public CompletableSource apply(Completable upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Observable<T> observable = upstream.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Completable completableIgnoreElements = apply((Observable) observable).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "ignoreElements(...)");
        return completableIgnoreElements;
    }

    @Override // io.reactivex.SingleTransformer
    public SingleSource<T> apply(Single<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Observable<T> observable = upstream.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Single<T> singleLastOrError = apply((Observable) observable).lastOrError();
        Intrinsics.checkNotNullExpressionValue(singleLastOrError, "lastOrError(...)");
        return singleLastOrError;
    }

    @Override // io.reactivex.MaybeTransformer
    public MaybeSource<T> apply(Maybe<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Observable<T> observable = upstream.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Maybe<T> maybeFirstElement = apply((Observable) observable).firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        return maybeFirstElement;
    }

    @Override // io.reactivex.ObservableTransformer
    public Observable<T> apply(Observable<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Observable<T> observableConcatEager = Observable.concatEager(CollectionsKt.listOf((Object[]) new Observable[]{Observable.timer(this.delayInMillis, TimeUnit.MILLISECONDS).doOnSubscribe(new Consumer() { // from class: com.robinhood.rx.delay.MinTimeInFlightTransformer$apply$timer$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.increment(IdlingResourceType.MIN_TIME_IN_FLIGHT);
            }
        }).doFinally(new Action() { // from class: com.robinhood.rx.delay.MinTimeInFlightTransformer$apply$timer$2
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.decrement(IdlingResourceType.MIN_TIME_IN_FLIGHT);
            }
        }).ignoreElements().toObservable(), upstream}));
        Intrinsics.checkNotNullExpressionValue(observableConcatEager, "concatEager(...)");
        return observableConcatEager;
    }
}
