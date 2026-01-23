package com.robinhood.utils.p408rx;

import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Poll.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00040\u0004 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u000e\u001a6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012(\u0012&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00040\u0004 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\f0\f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000RD\u0010\u0010\u001a8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012(\u0012&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00040\u0004 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\f0\f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/rx/Poll;", "T", "Lio/reactivex/ObservableTransformer;", "interval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "delayFirstEmit", "", "<init>", "(JLjava/util/concurrent/TimeUnit;Z)V", "delay", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "repeatFunction", "Lkotlin/Function1;", "retryFunction", "", "apply", "Lio/reactivex/ObservableSource;", "upstream", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Poll<T> implements ObservableTransformer<T, T> {
    private final Observable<Long> delay;
    private final boolean delayFirstEmit;
    private final long interval;
    private final Function1<Observable<?>, Observable<Long>> repeatFunction;
    private final Function1<Observable<Throwable>, Observable<Long>> retryFunction;
    private final TimeUnit timeUnit;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Poll(long j, TimeUnit timeUnit) {
        this(j, timeUnit, false, 4, null);
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    @JvmOverloads
    public Poll(long j, TimeUnit timeUnit, boolean z) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.interval = j;
        this.timeUnit = timeUnit;
        this.delayFirstEmit = z;
        this.delay = Observable.timer(j, timeUnit);
        this.repeatFunction = new Function1() { // from class: com.robinhood.utils.rx.Poll$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Poll.repeatFunction$lambda$0(this.f$0, (Observable) obj);
            }
        };
        this.retryFunction = new Function1() { // from class: com.robinhood.utils.rx.Poll$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Poll.retryFunction$lambda$1(this.f$0, (Observable) obj);
            }
        };
    }

    public /* synthetic */ Poll(long j, TimeUnit timeUnit, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, timeUnit, (i & 4) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable repeatFunction$lambda$0(final Poll poll, Observable o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return o.flatMap(new Function(poll) { // from class: com.robinhood.utils.rx.Poll$repeatFunction$1$1
            final /* synthetic */ Poll<T> this$0;

            {
                this.this$0 = poll;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Long> apply(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ((Poll) this.this$0).delay;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable retryFunction$lambda$1(final Poll poll, Observable o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return o.flatMap(new Function(poll) { // from class: com.robinhood.utils.rx.Poll$retryFunction$1$1
            final /* synthetic */ Poll<T> this$0;

            {
                this.this$0 = poll;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Long> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                if (Throwables.isNetworkRelated(t)) {
                    return ((Poll) this.this$0).delay;
                }
                return Observable.error(t);
            }
        });
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource<T> apply(Observable<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        final Function1<Observable<?>, Observable<Long>> function1 = this.repeatFunction;
        Observable<T> observableRepeatWhen = upstream.repeatWhen(new Function(function1) { // from class: com.robinhood.utils.rx.Poll$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        final Function1<Observable<Throwable>, Observable<Long>> function12 = this.retryFunction;
        final Observable<T> observableRetryWhen = observableRepeatWhen.retryWhen(new Function(function12) { // from class: com.robinhood.utils.rx.Poll$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function12, "function");
                this.function = function12;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        if (this.delayFirstEmit) {
            ObservableSource<T> observableSourceFlatMap = Observable.timer(this.interval, this.timeUnit).flatMap(new Function() { // from class: com.robinhood.utils.rx.Poll.apply.1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends T> apply(Long it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return observableRetryWhen;
                }
            });
            Intrinsics.checkNotNull(observableSourceFlatMap);
            return observableSourceFlatMap;
        }
        Intrinsics.checkNotNull(observableRetryWhen);
        return observableRetryWhen;
    }
}
