package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UkQueuedDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onResume$1$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {128}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class UkQueuedDepositDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UkQueuedDepositDataState $it;
    final /* synthetic */ UiPostTransferPage.UkQueuedDeposit $pendingTrueLayerMandate;
    int label;
    final /* synthetic */ UkQueuedDepositDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UkQueuedDepositDuxo4(UkQueuedDepositDuxo ukQueuedDepositDuxo, UkQueuedDepositDataState ukQueuedDepositDataState, UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, Continuation<? super UkQueuedDepositDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = ukQueuedDepositDuxo;
        this.$it = ukQueuedDepositDataState;
        this.$pendingTrueLayerMandate = ukQueuedDeposit;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UkQueuedDepositDuxo4(this.this$0, this.$it, this.$pendingTrueLayerMandate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UkQueuedDepositDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onResume$1$1$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onResume$1$1$1 */
    static final class C308421 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308421(Continuation<? super C308421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308421 c308421 = new C308421(continuation);
            c308421.L$0 = obj;
            return c308421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
            return ((C308421) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, null, false, null, null, null, false, true, null, null, false, 3839, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C308421(null));
            UkQueuedDepositDuxo ukQueuedDepositDuxo = this.this$0;
            UkQueuedDepositDataState ukQueuedDepositDataState = this.$it;
            UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit = this.$pendingTrueLayerMandate;
            this.label = 1;
            obj = ukQueuedDepositDuxo.getMandateStatusAndCreateEvent(ukQueuedDepositDataState, ukQueuedDeposit, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.submit((UkQueuedDepositEvent) obj);
        this.this$0.applyMutation(new C308432(null));
        this.this$0.cardManager.invalidateCardsBestEffort();
        return Unit.INSTANCE;
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onResume$1$1$2", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onResume$1$1$2 */
    static final class C308432 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308432(Continuation<? super C308432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308432 c308432 = new C308432(continuation);
            c308432.L$0 = obj;
            return c308432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
            return ((C308432) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, null, false, null, null, null, false, false, null, null, false, 3839, null);
        }
    }
}
