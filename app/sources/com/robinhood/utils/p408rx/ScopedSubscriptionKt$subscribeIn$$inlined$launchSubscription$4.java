package com.robinhood.utils.p408rx;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.Maybe;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScopedSubscription.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/utils/rx/ScopedSubscriptionKt$launchSubscription$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.rx.ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$4", m3645f = "ScopedSubscription.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RxErrorCheckpoint $checkpoint$inlined;
    final /* synthetic */ Function0 $onComplete$inlined;
    final /* synthetic */ Function1 $onSuccess$inlined;
    final /* synthetic */ Maybe $this_subscribeIn$inlined;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$4(Continuation continuation, Maybe maybe, Function1 function1, RxErrorCheckpoint rxErrorCheckpoint, Function0 function0) {
        super(2, continuation);
        this.$this_subscribeIn$inlined = maybe;
        this.$onSuccess$inlined = function1;
        this.$checkpoint$inlined = rxErrorCheckpoint;
        this.$onComplete$inlined = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$4(continuation, this.$this_subscribeIn$inlined, this.$onSuccess$inlined, this.$checkpoint$inlined, this.$onComplete$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            final Disposable disposableSubscribe = this.$this_subscribeIn$inlined.doFinally(new ScopedSubscriptionKt$sam$io_reactivex_functions_Action$0(new Function0<Unit>() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$4.1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
                }
            })).subscribe(new ScopedSubscriptionKt$sam$io_reactivex_functions_Consumer$0(this.$onSuccess$inlined), this.$checkpoint$inlined, new ScopedSubscriptionKt$sam$io_reactivex_functions_Action$0(this.$onComplete$inlined));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.robinhood.utils.rx.ScopedSubscriptionKt$subscribeIn$$inlined$launchSubscription$4.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    disposableSubscribe.dispose();
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
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
}
