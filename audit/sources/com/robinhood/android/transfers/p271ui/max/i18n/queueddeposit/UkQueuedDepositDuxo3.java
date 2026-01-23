package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UkQueuedDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleSubmitClick$1$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {200}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleSubmitClick$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class UkQueuedDepositDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UkQueuedDepositDataState $state;
    int label;
    final /* synthetic */ UkQueuedDepositDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UkQueuedDepositDuxo3(UkQueuedDepositDuxo ukQueuedDepositDuxo, UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = ukQueuedDepositDuxo;
        this.$state = ukQueuedDepositDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UkQueuedDepositDuxo3(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UkQueuedDepositDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleSubmitClick$1$1$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleSubmitClick$1$1$1 */
    static final class C308361 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308361(Continuation<? super C308361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308361 c308361 = new C308361(continuation);
            c308361.L$0 = obj;
            return c308361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
            return ((C308361) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, null, false, null, null, null, true, false, null, null, false, 3967, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Money expectedValue;
        ApiFxQuote fxQuote;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C308361(null));
            UkQueuedDepositDuxo ukQueuedDepositDuxo = this.this$0;
            if (Intrinsics.areEqual(this.$state.getAmount().getCurrency(), Currencies.GBP)) {
                expectedValue = this.$state.getAmount();
            } else {
                expectedValue = this.$state.getExpectedValue();
            }
            if (this.$state.isMcwEnabled()) {
                fxQuote = null;
            } else {
                fxQuote = this.$state.getFxQuote();
                if (fxQuote == null) {
                    throw new IllegalStateException("FX quote must be set");
                }
            }
            this.label = 1;
            obj = ukQueuedDepositDuxo.linkInstrumentAndSubmitDeposit(expectedValue, fxQuote, this);
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
        this.this$0.applyMutation(new C308372(null));
        this.this$0.cardManager.invalidateCardsBestEffort();
        return Unit.INSTANCE;
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleSubmitClick$1$1$2", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleSubmitClick$1$1$2 */
    static final class C308372 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308372(Continuation<? super C308372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308372 c308372 = new C308372(continuation);
            c308372.L$0 = obj;
            return c308372;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
            return ((C308372) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, null, false, null, null, null, false, false, null, null, false, 3967, null);
        }
    }
}
