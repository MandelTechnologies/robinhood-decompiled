package com.robinhood.coroutines.p287rx;

import com.robinhood.coroutines.p287rx.RxFactory;
import dispatch.core.CoroutineScopeExt;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxCompletable2;
import kotlinx.coroutines.rx2.RxConvert;
import kotlinx.coroutines.rx2.RxMaybe2;
import kotlinx.coroutines.rx2.RxObservable2;
import kotlinx.coroutines.rx2.RxSingle2;

/* compiled from: RxFactory.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00032'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010\u0010J>\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00032'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010\u0014JL\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\b0\u0016\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\u00032)\u0010\u000b\u001a%\b\u0001\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010\u0017JV\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\b0\u0019\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00032/\b\u0001\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010\u001bJ&\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\b0\u0019\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\b0\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/coroutines/rx/RealRxFactory;", "Lcom/robinhood/coroutines/rx/RxFactory;", "baseContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "rxSingle", "Lio/reactivex/Single;", "T", "", "context", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "rxCompletable", "Lio/reactivex/Completable;", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxMaybe", "Lio/reactivex/Maybe;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "rxObservable", "Lio/reactivex/Observable;", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "convertToObservable", "flow", "Lkotlinx/coroutines/flow/Flow;", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.rx.RealRxFactory, reason: use source file name */
/* loaded from: classes20.dex */
public final class RxFactory2 implements RxFactory {
    private final CoroutineContext baseContext;

    public RxFactory2(CoroutineContext baseContext) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        this.baseContext = baseContext;
        if (baseContext.get(Job.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(StringsKt.trimIndent(" \n                Flowable context cannot contain job in it.\n                Its lifecycle should be managed via Disposable handle.\n                Had: " + baseContext + "\n            ").toString());
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        return RxFactory.DefaultImpls.asObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return RxSingle2.rxSingle(this.baseContext.plus(context), block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return RxCompletable2.rxCompletable(this.baseContext.plus(context), block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return RxMaybe2.rxMaybe(this.baseContext.plus(context), block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return RxObservable2.rxObservable(this.baseContext.plus(context), block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        CoroutineContext coroutineContext = this.baseContext;
        return RxConvert.asObservable$default(FlowKt.flowOn(flow, coroutineContext.plus(CoroutineScopeExt.getDispatcherProvider(coroutineContext).getUnconfined())), null, 1, null);
    }
}
