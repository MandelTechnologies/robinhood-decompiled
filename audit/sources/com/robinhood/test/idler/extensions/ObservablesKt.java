package com.robinhood.test.idler.extensions;

import com.robinhood.models.p320db.Instrument;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Observables.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"debounceTracked", "Lio/reactivex/Observable;", "T", "timeout", "", Instrument.TYPE_UNIT, "Ljava/util/concurrent/TimeUnit;", "scheduler", "Lio/reactivex/Scheduler;", "lib-idling-resources_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ObservablesKt {
    public static final <T> Observable<T> debounceTracked(Observable<T> observable, long j, TimeUnit unit, Scheduler scheduler) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Observable<T> observableDoAfterNext = observable.doOnNext(new Consumer() { // from class: com.robinhood.test.idler.extensions.ObservablesKt.debounceTracked.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(T t) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.RX_DEBOUNCE, true);
            }
        }).debounce(j, unit, scheduler).doAfterNext(new Consumer() { // from class: com.robinhood.test.idler.extensions.ObservablesKt.debounceTracked.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(T t) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.RX_DEBOUNCE, false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoAfterNext, "doAfterNext(...)");
        return observableDoAfterNext;
    }
}
