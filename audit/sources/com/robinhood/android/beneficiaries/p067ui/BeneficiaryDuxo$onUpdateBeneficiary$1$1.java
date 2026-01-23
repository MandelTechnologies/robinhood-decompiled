package com.robinhood.android.beneficiaries.p067ui;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowType;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowResponse;
import bonfire.proto.idl.beneficiaries.p031v1.IndividualBeneficiaryFlow;
import bonfire.proto.idl.beneficiaries.p031v1.TrustBeneficiaryFlow;
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
@DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onUpdateBeneficiary$1$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class BeneficiaryDuxo$onUpdateBeneficiary$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ UUID $beneficiaryId;
    int label;
    final /* synthetic */ BeneficiaryDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BeneficiaryDuxo$onUpdateBeneficiary$1$1(BeneficiaryDuxo beneficiaryDuxo, String str, UUID uuid, Continuation<? super BeneficiaryDuxo$onUpdateBeneficiary$1$1> continuation) {
        super(2, continuation);
        this.this$0 = beneficiaryDuxo;
        this.$accountNumber = str;
        this.$beneficiaryId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BeneficiaryDuxo$onUpdateBeneficiary$1$1(this.this$0, this.$accountNumber, this.$beneficiaryId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BeneficiaryDuxo$onUpdateBeneficiary$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BeneficiaryDuxo$onUpdateBeneficiary$1$1 beneficiaryDuxo$onUpdateBeneficiary$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C96611(this.$accountNumber, this.$beneficiaryId, null));
            BeneficiaryStore beneficiaryStore = this.this$0.beneficiaryStore;
            String str = this.$accountNumber;
            UUID uuid = this.$beneficiaryId;
            this.label = 1;
            beneficiaryDuxo$onUpdateBeneficiary$1$1 = this;
            obj = beneficiaryStore.fetchCreateFlowViewModels(str, uuid, null, null, beneficiaryDuxo$onUpdateBeneficiary$1$1);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            beneficiaryDuxo$onUpdateBeneficiary$1$1 = this;
        }
        GetBeneficiaryFlowResponse getBeneficiaryFlowResponse = (GetBeneficiaryFlowResponse) obj;
        BeneficiaryFlowType flow_type = getBeneficiaryFlowResponse.getFlow_type();
        IndividualBeneficiaryFlow individual = flow_type != null ? flow_type.getIndividual() : null;
        BeneficiaryFlowType flow_type2 = getBeneficiaryFlowResponse.getFlow_type();
        TrustBeneficiaryFlow trust = flow_type2 != null ? flow_type2.getTrust() : null;
        if (individual != null) {
            beneficiaryDuxo$onUpdateBeneficiary$1$1.this$0.beneficiaryTypeSelectedIndividual(individual);
            return Unit.INSTANCE;
        }
        if (trust != null) {
            beneficiaryDuxo$onUpdateBeneficiary$1$1.this$0.beneficiaryTypeSelectedTrust(trust);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onUpdateBeneficiary$1$1$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onUpdateBeneficiary$1$1$1 */
    static final class C96611 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $beneficiaryId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C96611(String str, UUID uuid, Continuation<? super C96611> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$beneficiaryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96611 c96611 = new C96611(this.$accountNumber, this.$beneficiaryId, continuation);
            c96611.L$0 = obj;
            return c96611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
            return ((C96611) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, this.$accountNumber, this.$beneficiaryId, null, null, 3, null);
        }
    }
}
