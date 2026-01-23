package com.robinhood.android.crypto.p094ui.detail.position;

import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.models.api.ApiAmountAvailableInfoScreen;
import com.robinhood.models.crypto.p315ui.staking.AmountAvailableInfoScreen;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CryptoPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$2$1$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {106, 119}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$2$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoPositionDuxo3 extends ContinuationImpl7 implements Function2<FlowCollector<? super GenericAlertContent<? extends GenericAction>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $currencyPairId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoPositionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPositionDuxo3(CryptoPositionDuxo cryptoPositionDuxo, UUID uuid, Continuation<? super CryptoPositionDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoPositionDuxo;
        this.$currencyPairId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoPositionDuxo3 cryptoPositionDuxo3 = new CryptoPositionDuxo3(this.this$0, this.$currencyPairId, continuation);
        cryptoPositionDuxo3.L$0 = obj;
        return cryptoPositionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super GenericAlertContent<? extends GenericAction>> flowCollector, Continuation<? super Unit> continuation) {
        return ((CryptoPositionDuxo3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            CryptoStakingStore cryptoStakingStore = this.this$0.cryptoStakingStore;
            ApiAmountAvailableInfoScreen.Request request = new ApiAmountAvailableInfoScreen.Request(ApiAmountAvailableInfoScreen.IdType.CRYPTO_BALANCE, ApiAmountAvailableInfoScreen.ActionType.CRYPTO_SDUI_GENERIC_ACTION, this.$currencyPairId);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = cryptoStakingStore.getAmountAvailableInfoScreen(request, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        AmountAvailableInfoScreen.InfoSheetData infoSheetData = ((AmountAvailableInfoScreen) obj).getInfoSheetData();
        AmountAvailableInfoScreen.InfoSheetData.SduiGenericActionType sduiGenericActionType = infoSheetData instanceof AmountAvailableInfoScreen.InfoSheetData.SduiGenericActionType ? (AmountAvailableInfoScreen.InfoSheetData.SduiGenericActionType) infoSheetData : null;
        if (sduiGenericActionType == null) {
            throw new IllegalArgumentException(("Expected SduiGenericActionType but got " + infoSheetData).toString());
        }
        GenericAlertContent<GenericAction> content = sduiGenericActionType.getContent();
        this.L$0 = null;
        this.label = 2;
    }
}
