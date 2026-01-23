package kotlinx.coroutines.rx2;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RxConvert.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"", "T", "Lio/reactivex/ObservableSource;", "Lkotlinx/coroutines/flow/Flow;", "asFlow", "(Lio/reactivex/ObservableSource;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lio/reactivex/Observable;", "asObservable", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/Observable;", "kotlinx-coroutines-rx2"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.rx2.RxConvertKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class RxConvert {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxConvert.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", m3645f = "RxConvert.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1 */
    static final class C461351<T> extends ContinuationImpl7 implements Function2<Produce4<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ObservableSource<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C461351(ObservableSource<T> observableSource, Continuation<? super C461351> continuation) {
            super(2, continuation);
            this.$this_asFlow = observableSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C461351 c461351 = new C461351(this.$this_asFlow, continuation);
            c461351.L$0 = obj;
            return c461351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super T> produce4, Continuation<? super Unit> continuation) {
            return ((C461351) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Produce4 produce4 = (Produce4) this.L$0;
                final AtomicReference atomicReference = new AtomicReference();
                this.$this_asFlow.subscribe(new Observer<T>() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1$observer$1
                    @Override // io.reactivex.Observer
                    public void onComplete() {
                        Channel9.DefaultImpls.close$default(produce4, null, 1, null);
                    }

                    @Override // io.reactivex.Observer
                    public void onSubscribe(Disposable d) {
                        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(atomicReference, null, d)) {
                            return;
                        }
                        d.dispose();
                    }

                    @Override // io.reactivex.Observer
                    public void onNext(T t) {
                        try {
                            ChannelsKt.trySendBlocking(produce4, t);
                        } catch (InterruptedException unused) {
                        }
                    }

                    @Override // io.reactivex.Observer
                    public void onError(Throwable e) {
                        produce4.close(e);
                    }
                });
                Function0 function0 = new Function0() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RxConvert.C461351.invokeSuspend$lambda$0(atomicReference);
                    }
                };
                this.label = 1;
                if (Produce.awaitClose(produce4, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(AtomicReference atomicReference) {
            Disposable disposable = (Disposable) atomicReference.getAndSet(Disposables.disposed());
            if (disposable != null) {
                disposable.dispose();
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> Flow<T> asFlow(ObservableSource<T> observableSource) {
        return FlowKt.callbackFlow(new C461351(observableSource, null));
    }

    public static final <T> Observable<T> asObservable(final Flow<? extends T> flow, final CoroutineContext coroutineContext) {
        return Observable.create(new ObservableOnSubscribe() { // from class: kotlinx.coroutines.rx2.RxConvertKt$$ExternalSyntheticLambda0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                RxConvert.asObservable$lambda$0(coroutineContext, flow, observableEmitter);
            }
        });
    }

    public static /* synthetic */ Observable asObservable$default(Flow flow, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = CoroutineContextImpl6.INSTANCE;
        }
        return asObservable(flow, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asObservable$lambda$0(CoroutineContext coroutineContext, Flow flow, ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new RxCancellable(BuildersKt.launch(CoroutineScope3.INSTANCE, Dispatchers.getUnconfined().plus(coroutineContext), CoroutineStart.ATOMIC, new RxConvert3(flow, observableEmitter, null))));
    }
}
