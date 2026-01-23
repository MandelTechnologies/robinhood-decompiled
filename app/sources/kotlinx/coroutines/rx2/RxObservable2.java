package kotlinx.coroutines.rx2;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineContext3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: RxObservable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aX\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022/\b\u0001\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\u000b\u0010\f\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0002\b\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"", "T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/reactivex/Observable;", "rxObservable", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "rxObservableInternal", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "kotlinx-coroutines-rx2"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.rx2.RxObservableKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class RxObservable2 {
    public static final <T> Observable<T> rxObservable(CoroutineContext coroutineContext, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(Job.INSTANCE) != null) {
            throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
        }
        return rxObservableInternal(CoroutineScope3.INSTANCE, coroutineContext, function2);
    }

    private static final <T> Observable<T> rxObservableInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return Observable.create(new ObservableOnSubscribe() { // from class: kotlinx.coroutines.rx2.RxObservableKt$$ExternalSyntheticLambda0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                RxObservable2.rxObservableInternal$lambda$1(coroutineScope, coroutineContext, function2, observableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxObservableInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, ObservableEmitter observableEmitter) {
        RxObservable rxObservable = new RxObservable(CoroutineContext3.newCoroutineContext(coroutineScope, coroutineContext), observableEmitter);
        observableEmitter.setCancellable(new RxCancellable(rxObservable));
        rxObservable.start(CoroutineStart.DEFAULT, rxObservable, function2);
    }
}
