package com.robinhood.android.beneficiaries.p067ui;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowType;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryType;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowResponse;
import bonfire.proto.idl.beneficiaries.p031v1.IndividualBeneficiaryFlow;
import bonfire.proto.idl.beneficiaries.p031v1.TrustBeneficiaryFlow;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.beneficiaries.p067ui.introflow.BeneficiaryIntroFlowResult;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiaryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3", m3645f = "BeneficiaryDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ UUID $beneficiaryId;
    final /* synthetic */ BeneficiaryIntroFlowResult $beneficiaryIntroFlowResult;
    int label;
    final /* synthetic */ BeneficiaryDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3(BeneficiaryDuxo beneficiaryDuxo, String str, UUID uuid, BeneficiaryIntroFlowResult beneficiaryIntroFlowResult, Continuation<? super BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryDuxo;
        this.$accountNumber = str;
        this.$beneficiaryId = uuid;
        this.$beneficiaryIntroFlowResult = beneficiaryIntroFlowResult;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3(this.this$0, this.$accountNumber, this.$beneficiaryId, this.$beneficiaryIntroFlowResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3 beneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BeneficiaryStore beneficiaryStore = this.this$0.beneficiaryStore;
            String str = this.$accountNumber;
            UUID uuid = this.$beneficiaryId;
            BeneficiaryType beneficiaryType = this.$beneficiaryIntroFlowResult.getBeneficiaryType();
            BeneficiaryRole beneficiaryRole = this.$beneficiaryIntroFlowResult.getBeneficiaryRole();
            this.label = 1;
            beneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3 = this;
            obj = beneficiaryStore.fetchCreateFlowViewModels(str, uuid, beneficiaryType, beneficiaryRole, beneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            beneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3 = this;
        }
        GetBeneficiaryFlowResponse getBeneficiaryFlowResponse = (GetBeneficiaryFlowResponse) obj;
        BeneficiaryFlowType flow_type = getBeneficiaryFlowResponse.getFlow_type();
        IndividualBeneficiaryFlow individual = flow_type != null ? flow_type.getIndividual() : null;
        BeneficiaryFlowType flow_type2 = getBeneficiaryFlowResponse.getFlow_type();
        TrustBeneficiaryFlow trust = flow_type2 != null ? flow_type2.getTrust() : null;
        if (individual != null) {
            beneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3.this$0.beneficiaryTypeSelectedIndividual(individual);
            return Unit.INSTANCE;
        }
        if (trust != null) {
            beneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3.this$0.beneficiaryTypeSelectedTrust(trust);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
