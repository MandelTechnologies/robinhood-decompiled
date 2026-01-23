package com.robinhood.coroutines.p287rx;

import com.robinhood.coroutines.p287rx.RxFactory;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RxFactory.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JN\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\b0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010\u0010J>\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e\u0012\u0006\u0012\u0004\u0018\u00010\b0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010\u0014JL\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0016\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\n2)\u0010\u000b\u001a%\b\u0001\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\b0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010\u0017JV\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0019\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2/\b\u0001\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e\u0012\u0006\u0012\u0004\u0018\u00010\b0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010\u001bJ&\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0019\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00070\u001eH\u0016R\u0012\u0010\u0002\u001a\u00020\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/coroutines/rx/RxFactoryHost;", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "rxSingle", "Lio/reactivex/Single;", "T", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "rxCompletable", "Lio/reactivex/Completable;", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxMaybe", "Lio/reactivex/Maybe;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "rxObservable", "Lio/reactivex/Observable;", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "convertToObservable", "flow", "Lkotlinx/coroutines/flow/Flow;", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.rx.RxFactoryHost, reason: use source file name */
/* loaded from: classes20.dex */
public interface RxFactory3 extends RxFactory {
    @Override // com.robinhood.coroutines.p287rx.RxFactory
    <T> Observable<T> convertToObservable(Flow<? extends T> flow);

    RxFactory getRxFactory();

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    Completable rxCompletable(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block);

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    <T> Maybe<T> rxMaybe(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block);

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    <T> Observable<T> rxObservable(CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block);

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    <T> Single<T> rxSingle(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block);

    /* compiled from: RxFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.coroutines.rx.RxFactoryHost$DefaultImpls */
    public static final class DefaultImpls {
        public static <T> Observable<T> asObservable(RxFactory3 rxFactory3, Flow<? extends T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return RxFactory.DefaultImpls.asObservable(rxFactory3, receiver);
        }

        public static <T> Single<T> rxSingle(RxFactory3 rxFactory3, CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            return rxFactory3.getRxFactory().rxSingle(context, block);
        }

        public static Completable rxCompletable(RxFactory3 rxFactory3, CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            return rxFactory3.getRxFactory().rxCompletable(context, block);
        }

        public static <T> Maybe<T> rxMaybe(RxFactory3 rxFactory3, CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            return rxFactory3.getRxFactory().rxMaybe(context, block);
        }

        public static <T> Observable<T> rxObservable(RxFactory3 rxFactory3, CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            return rxFactory3.getRxFactory().rxObservable(context, block);
        }

        public static <T> Observable<T> convertToObservable(RxFactory3 rxFactory3, Flow<? extends T> flow) {
            Intrinsics.checkNotNullParameter(flow, "flow");
            return rxFactory3.getRxFactory().convertToObservable(flow);
        }
    }
}
