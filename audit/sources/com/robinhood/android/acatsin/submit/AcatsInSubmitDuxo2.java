package com.robinhood.android.acatsin.submit;

import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInSubmitDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onStart$2$1", m3645f = "AcatsInSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInSubmitDuxo2 extends ContinuationImpl7 implements Function2<AcatsInSubmitDataState, Continuation<? super AcatsInSubmitDataState>, Object> {
    final /* synthetic */ RetirementMatchRate $matchRate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInSubmitDuxo2(RetirementMatchRate retirementMatchRate, Continuation<? super AcatsInSubmitDuxo2> continuation) {
        super(2, continuation);
        this.$matchRate = retirementMatchRate;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInSubmitDuxo2 acatsInSubmitDuxo2 = new AcatsInSubmitDuxo2(this.$matchRate, continuation);
        acatsInSubmitDuxo2.L$0 = obj;
        return acatsInSubmitDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInSubmitDataState acatsInSubmitDataState, Continuation<? super AcatsInSubmitDataState> continuation) {
        return ((AcatsInSubmitDuxo2) create(acatsInSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInSubmitDataState acatsInSubmitDataState = (AcatsInSubmitDataState) this.L$0;
        RetirementMatchRate retirementMatchRate = this.$matchRate;
        return acatsInSubmitDataState.copy((63487 & 1) != 0 ? acatsInSubmitDataState.refId : null, (63487 & 2) != 0 ? acatsInSubmitDataState.brokerageOrDtcNumber : null, (63487 & 4) != 0 ? acatsInSubmitDataState.rhsAccountType : null, (63487 & 8) != 0 ? acatsInSubmitDataState.contraAccountNumber : null, (63487 & 16) != 0 ? acatsInSubmitDataState.namesOnAccount : null, (63487 & 32) != 0 ? acatsInSubmitDataState.assets : null, (63487 & 64) != 0 ? acatsInSubmitDataState.rhsAccountNumber : null, (63487 & 128) != 0 ? acatsInSubmitDataState.selectedAccountType : null, (63487 & 256) != 0 ? acatsInSubmitDataState.selectedAccountManagementType : null, (63487 & 512) != 0 ? acatsInSubmitDataState.acatsTransferRequestState : null, (63487 & 1024) != 0 ? acatsInSubmitDataState.contraBrokerLogo : null, (63487 & 2048) != 0 ? acatsInSubmitDataState.retirementMatchRate : retirementMatchRate != null ? retirementMatchRate.getHighestActiveAcatsInRate() : null, (63487 & 4096) != 0 ? acatsInSubmitDataState.taxableAccountBonusRateString : null, (63487 & 8192) != 0 ? acatsInSubmitDataState.isAcatsBrokerageMatchSupported : false, (63487 & 16384) != 0 ? acatsInSubmitDataState.account : null, (63487 & 32768) != 0 ? acatsInSubmitDataState.requiresCoOwnerSignature : false);
    }
}
