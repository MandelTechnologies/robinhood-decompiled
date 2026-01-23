package com.robinhood.utils.p408rx;

import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.flowable;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExponentialRetry.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/rx/ExponentialRetry;", "Lio/reactivex/functions/Function;", "Lio/reactivex/Flowable;", "", "maxRetries", "", "predicate", "Lkotlin/Function1;", "", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "getMaxRetries", "()I", "getPredicate", "()Lkotlin/jvm/functions/Function1;", "apply", "errors", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ExponentialRetry implements Function<Flowable<Throwable>, Flowable<?>> {
    private final int maxRetries;
    private final Function1<Throwable, Boolean> predicate;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExponentialRetry(int i, Function1<? super Throwable, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.maxRetries = i;
        this.predicate = predicate;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public /* synthetic */ ExponentialRetry(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new Function1() { // from class: com.robinhood.utils.rx.ExponentialRetry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ExponentialRetry._init_$lambda$0((Throwable) obj));
            }
        } : function1);
    }

    public final Function1<Throwable, Boolean> getPredicate() {
        return this.predicate;
    }

    @Override // io.reactivex.functions.Function
    public Flowable<?> apply(Flowable<Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Flowable<Integer> flowableRange = Flowable.range(1, this.maxRetries + 1);
        Intrinsics.checkNotNullExpressionValue(flowableRange, "range(...)");
        Flowable flowableZip = Flowable.zip(errors, flowableRange, new BiFunction() { // from class: com.robinhood.utils.rx.ExponentialRetry$apply$$inlined$zipWith$default$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(Throwable t, Integer u) {
                Intrinsics.checkNotNullParameter(t, "t");
                Intrinsics.checkNotNullParameter(u, "u");
                Throwable th = t;
                if (u.intValue() <= this.this$0.getMaxRetries() && this.this$0.getPredicate().invoke(th).booleanValue()) {
                    R r = (R) Flowable.timer((long) Math.pow(2.0d, r4.intValue()), TimeUnit.MILLISECONDS, Schedulers.computation());
                    Intrinsics.checkNotNull(r);
                    return r;
                }
                R r2 = (R) Flowable.error(th);
                Intrinsics.checkNotNull(r2);
                return r2;
            }
        }, false, 1);
        Intrinsics.checkNotNullExpressionValue(flowableZip, "zip(...)");
        return flowable.mergeAll(flowableZip);
    }
}
