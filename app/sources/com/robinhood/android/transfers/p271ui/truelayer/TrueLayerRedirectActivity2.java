package com.robinhood.android.transfers.p271ui.truelayer;

import com.robinhood.android.transfers.contracts.TrueLayerRedirect;
import com.robinhood.android.truelayer.TrueLayerEvent;
import com.robinhood.android.truelayer.TrueLayerSession;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TrueLayerRedirectActivity.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.truelayer.TrueLayerRedirectActivity$onCreate$1$1", m3645f = "TrueLayerRedirectActivity.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.truelayer.TrueLayerRedirectActivity$onCreate$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TrueLayerRedirectActivity2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TrueLayerRedirect $this_with;
    final /* synthetic */ TrueLayerSession $trueLayerSession;
    int label;
    final /* synthetic */ TrueLayerRedirectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrueLayerRedirectActivity2(TrueLayerSession trueLayerSession, TrueLayerRedirect trueLayerRedirect, TrueLayerRedirectActivity trueLayerRedirectActivity, Continuation<? super TrueLayerRedirectActivity2> continuation) {
        super(2, continuation);
        this.$trueLayerSession = trueLayerSession;
        this.$this_with = trueLayerRedirect;
        this.this$0 = trueLayerRedirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrueLayerRedirectActivity2(this.$trueLayerSession, this.$this_with, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrueLayerRedirectActivity2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<TrueLayerEvent> stateFlowStartAndListenToNewTrueLayerSession = this.$trueLayerSession.startAndListenToNewTrueLayerSession(this.$this_with.getPaymentId(), this.$this_with.getResourceToken(), "https://applink.robinhood.com/truelayer_redirect", this.$this_with.isQueuedDeposit());
            C310921 c310921 = new C310921(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowStartAndListenToNewTrueLayerSession, c310921, this) == coroutine_suspended) {
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

    /* compiled from: TrueLayerRedirectActivity.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "trueLayerEvent", "Lcom/robinhood/android/truelayer/TrueLayerEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.truelayer.TrueLayerRedirectActivity$onCreate$1$1$1", m3645f = "TrueLayerRedirectActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.truelayer.TrueLayerRedirectActivity$onCreate$1$1$1 */
    static final class C310921 extends ContinuationImpl7 implements Function2<TrueLayerEvent, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TrueLayerRedirectActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310921(TrueLayerRedirectActivity trueLayerRedirectActivity, Continuation<? super C310921> continuation) {
            super(2, continuation);
            this.this$0 = trueLayerRedirectActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310921 c310921 = new C310921(this.this$0, continuation);
            c310921.L$0 = obj;
            return c310921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TrueLayerEvent trueLayerEvent, Continuation<? super Unit> continuation) {
            return ((C310921) create(trueLayerEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerEvent trueLayerEvent = (TrueLayerEvent) this.L$0;
            if (Intrinsics.areEqual(trueLayerEvent, TrueLayerEvent.Succeeded.INSTANCE) || Intrinsics.areEqual(trueLayerEvent, TrueLayerEvent.Failure.INSTANCE)) {
                this.this$0.finish();
            }
            return Unit.INSTANCE;
        }
    }
}
