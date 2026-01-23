package com.robinhood.utils.p408rx;

import com.robinhood.Logger;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.LocalTime;

/* compiled from: WallClockPoll.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0018B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011RH\u0010\u0014\u001a6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012(\u0012&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\t0\t \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\t0\t\u0018\u00010\f0\f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015RJ\u0010\u0017\u001a8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012(\u0012&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\t0\t \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\t0\t\u0018\u00010\f0\f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/utils/rx/WallClockPoll;", "T", "Lio/reactivex/ObservableTransformer;", "j$/time/Duration", "interval", "", "delayFirstEmit", "<init>", "(Lj$/time/Duration;Z)V", "", "getDelayTimeMillis", "()J", "Lio/reactivex/Observable;", "upstream", "apply", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "Lj$/time/Duration;", "Z", "Lkotlin/Function1;", "kotlin.jvm.PlatformType", "repeatFunction", "Lkotlin/jvm/functions/Function1;", "", "retryFunction", "Companion", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WallClockPoll<T> implements ObservableTransformer<T, T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long MILLIS_OF_FUZZ = 60000;
    private static final long MILLIS_PAST_MINUTE = 3000;
    private final boolean delayFirstEmit;
    private final Duration interval;
    private final Function1<Observable<?>, Observable<Long>> repeatFunction;
    private final Function1<Observable<Throwable>, Observable<Long>> retryFunction;

    public WallClockPoll(Duration interval, boolean z) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.interval = interval;
        this.delayFirstEmit = z;
        this.repeatFunction = new Function1() { // from class: com.robinhood.utils.rx.WallClockPoll$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WallClockPoll.repeatFunction$lambda$0(this.f$0, (Observable) obj);
            }
        };
        this.retryFunction = new Function1() { // from class: com.robinhood.utils.rx.WallClockPoll$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WallClockPoll.retryFunction$lambda$1(this.f$0, (Observable) obj);
            }
        };
    }

    public /* synthetic */ WallClockPoll(Duration duration, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(duration, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable repeatFunction$lambda$0(final WallClockPoll wallClockPoll, Observable o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return o.flatMap(new Function(wallClockPoll) { // from class: com.robinhood.utils.rx.WallClockPoll$repeatFunction$1$1
            final /* synthetic */ WallClockPoll<T> this$0;

            {
                this.this$0 = wallClockPoll;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Long> apply(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.timer(this.this$0.getDelayTimeMillis(), TimeUnit.MILLISECONDS);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable retryFunction$lambda$1(final WallClockPoll wallClockPoll, Observable o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return o.flatMap(new Function(wallClockPoll) { // from class: com.robinhood.utils.rx.WallClockPoll$retryFunction$1$1
            final /* synthetic */ WallClockPoll<T> this$0;

            {
                this.this$0 = wallClockPoll;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Long> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                if (Throwables.isNetworkRelated(t)) {
                    return Observable.timer(this.this$0.getDelayTimeMillis(), TimeUnit.MILLISECONDS);
                }
                return Observable.error(t);
            }
        });
    }

    @Override // io.reactivex.ObservableTransformer
    public Observable<T> apply(Observable<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        final Function1<Observable<?>, Observable<Long>> function1 = this.repeatFunction;
        Observable<T> observableDoOnError = upstream.repeatWhen(new Function(function1) { // from class: com.robinhood.utils.rx.WallClockPoll$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).doOnError(new Consumer() { // from class: com.robinhood.utils.rx.WallClockPoll$apply$poll$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                Logger.INSTANCE.logErrorContext(th, "Polling encountered a network error.");
            }
        });
        final Function1<Observable<Throwable>, Observable<Long>> function12 = this.retryFunction;
        final Observable<T> observableRetryWhen = observableDoOnError.retryWhen(new Function(function12) { // from class: com.robinhood.utils.rx.WallClockPoll$sam$io_reactivex_functions_Function$0
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
            Observable<T> observable = (Observable<T>) Observable.timer(getDelayTimeMillis(), TimeUnit.MILLISECONDS).flatMap(new Function() { // from class: com.robinhood.utils.rx.WallClockPoll.apply.1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends T> apply(Long it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return observableRetryWhen;
                }
            });
            Intrinsics.checkNotNull(observable);
            return observable;
        }
        Intrinsics.checkNotNull(observableRetryWhen);
        return observableRetryWhen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getDelayTimeMillis() {
        LocalTime localTimeNow = LocalTime.now();
        Companion companion = INSTANCE;
        Intrinsics.checkNotNull(localTimeNow);
        return companion.getWallClockOffset(localTimeNow, this.interval) + ((long) (Math.random() * MILLIS_OF_FUZZ)) + 3000;
    }

    /* compiled from: WallClockPoll.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/rx/WallClockPoll$Companion;", "", "<init>", "()V", "j$/time/LocalTime", "time", "j$/time/Duration", "interval", "", "getWallClockOffset", "(Lj$/time/LocalTime;Lj$/time/Duration;)J", "MILLIS_PAST_MINUTE", "J", "MILLIS_OF_FUZZ", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long getWallClockOffset(LocalTime time, Duration interval) {
            long millis = Duration.ofMinutes(time.getMinute()).toMillis();
            long millis2 = interval.toMillis();
            return millis2 - (millis % millis2);
        }
    }
}
