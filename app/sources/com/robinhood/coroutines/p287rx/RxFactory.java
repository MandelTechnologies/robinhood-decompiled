package com.robinhood.coroutines.p287rx;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RxFactory.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\b\u000bH&¢\u0006\u0002\u0010\fJ@\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\b\u000bH&¢\u0006\u0002\u0010\u0010JN\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0012\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062)\u0010\u0007\u001a%\b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\b\u000bH&¢\u0006\u0002\u0010\u0013JX\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0015\"\b\b\u0000\u0010\u0004*\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\b\u000bH&¢\u0006\u0002\u0010\u0017J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0015\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00040\u001aH&J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0015\"\b\b\u0000\u0010\u0004*\u00020\u0001*\b\u0012\u0004\u0012\u0002H\u00040\u001aH\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/coroutines/rx/RxFactory;", "", "rxSingle", "Lio/reactivex/Single;", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "rxCompletable", "Lio/reactivex/Completable;", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxMaybe", "Lio/reactivex/Maybe;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "rxObservable", "Lio/reactivex/Observable;", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "convertToObservable", "flow", "Lkotlinx/coroutines/flow/Flow;", "asObservable", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface RxFactory {
    <T> Observable<T> asObservable(Flow<? extends T> flow);

    <T> Observable<T> convertToObservable(Flow<? extends T> flow);

    Completable rxCompletable(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block);

    <T> Maybe<T> rxMaybe(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block);

    <T> Observable<T> rxObservable(CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block);

    <T> Single<T> rxSingle(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block);

    /* compiled from: RxFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Single rxSingle$default(RxFactory rxFactory, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rxSingle");
            }
            if ((i & 1) != 0) {
                coroutineContext = CoroutineContextImpl6.INSTANCE;
            }
            return rxFactory.rxSingle(coroutineContext, function2);
        }

        public static /* synthetic */ Completable rxCompletable$default(RxFactory rxFactory, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rxCompletable");
            }
            if ((i & 1) != 0) {
                coroutineContext = CoroutineContextImpl6.INSTANCE;
            }
            return rxFactory.rxCompletable(coroutineContext, function2);
        }

        public static /* synthetic */ Maybe rxMaybe$default(RxFactory rxFactory, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rxMaybe");
            }
            if ((i & 1) != 0) {
                coroutineContext = CoroutineContextImpl6.INSTANCE;
            }
            return rxFactory.rxMaybe(coroutineContext, function2);
        }

        public static /* synthetic */ Observable rxObservable$default(RxFactory rxFactory, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rxObservable");
            }
            if ((i & 1) != 0) {
                coroutineContext = CoroutineContextImpl6.INSTANCE;
            }
            return rxFactory.rxObservable(coroutineContext, function2);
        }

        public static <T> Observable<T> asObservable(RxFactory rxFactory, Flow<? extends T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return rxFactory.convertToObservable(receiver);
        }
    }
}
