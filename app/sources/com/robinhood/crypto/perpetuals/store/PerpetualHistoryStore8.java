package com.robinhood.crypto.perpetuals.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualOrderDetails;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: PerpetualHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$pollOrderDetailsWhileNonFinal$1$1", m3645f = "PerpetualHistoryStore.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$pollOrderDetailsWhileNonFinal$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualHistoryStore8 extends ContinuationImpl7 implements Function3<FlowCollector<? super UiPerpetualOrderDetails>, UiPerpetualOrderDetails, Continuation<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    PerpetualHistoryStore8(Continuation<? super PerpetualHistoryStore8> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super UiPerpetualOrderDetails> flowCollector, UiPerpetualOrderDetails uiPerpetualOrderDetails, Continuation<? super Boolean> continuation) {
        PerpetualHistoryStore8 perpetualHistoryStore8 = new PerpetualHistoryStore8(continuation);
        perpetualHistoryStore8.L$0 = flowCollector;
        perpetualHistoryStore8.L$1 = uiPerpetualOrderDetails;
        return perpetualHistoryStore8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UiPerpetualOrderDetails uiPerpetualOrderDetails;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            UiPerpetualOrderDetails uiPerpetualOrderDetails2 = (UiPerpetualOrderDetails) this.L$1;
            this.L$0 = uiPerpetualOrderDetails2;
            this.label = 1;
            if (flowCollector.emit(uiPerpetualOrderDetails2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            uiPerpetualOrderDetails = uiPerpetualOrderDetails2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uiPerpetualOrderDetails = (UiPerpetualOrderDetails) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().isPending());
    }
}
