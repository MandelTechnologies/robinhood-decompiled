package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore;
import com.robinhood.models.api.ApiAcceptSlipAgreementsRequestBody;
import com.robinhood.models.p355ui.UiSlipAgreements;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore$PostSlipAgreementParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$postSlipAgreementsEndpoint$1", m3645f = "SlipAgreementsStore.kt", m3646l = {89}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$postSlipAgreementsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipAgreementsStore6 extends ContinuationImpl7 implements Function2<SlipAgreementsStore.PostSlipAgreementParams, Continuation<? super Unit>, Object> {
    final /* synthetic */ SlipApi $slipApi;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlipAgreementsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipAgreementsStore6(SlipApi slipApi, SlipAgreementsStore slipAgreementsStore, Continuation<? super SlipAgreementsStore6> continuation) {
        super(2, continuation);
        this.$slipApi = slipApi;
        this.this$0 = slipAgreementsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipAgreementsStore6 slipAgreementsStore6 = new SlipAgreementsStore6(this.$slipApi, this.this$0, continuation);
        slipAgreementsStore6.L$0 = obj;
        return slipAgreementsStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SlipAgreementsStore.PostSlipAgreementParams postSlipAgreementParams, Continuation<? super Unit> continuation) {
        return ((SlipAgreementsStore6) create(postSlipAgreementParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Collection collectionEmptyList;
        Object next;
        Object next2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SlipAgreementsStore.PostSlipAgreementParams postSlipAgreementParams = (SlipAgreementsStore.PostSlipAgreementParams) this.L$0;
            List<UiSlipAgreements.Agreement> agreements = postSlipAgreementParams.getAgreements();
            SlipAgreementsStore slipAgreementsStore = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreements, 10));
            for (UiSlipAgreements.Agreement agreement : agreements) {
                arrayList.add(new ApiAcceptSlipAgreementsRequestBody.AgreementSigningDetails(agreement.getId(), agreement.getType(), slipAgreementsStore.getSha256(agreement.getBodyMarkdown())));
            }
            List<UiSlipAgreements.AgreementV2> agreementsV2 = postSlipAgreementParams.getAgreementsV2();
            if (agreementsV2 != null) {
                List<UiSlipAgreements.AgreementV2> list = agreementsV2;
                SlipAgreementsStore slipAgreementsStore2 = this.this$0;
                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (UiSlipAgreements.AgreementV2 agreementV2 : list) {
                    collectionEmptyList.add(new ApiAcceptSlipAgreementsRequestBody.AgreementSigningDetails(agreementV2.getId(), agreementV2.getType(), slipAgreementsStore2.getSha256(agreementV2.getMarkdown())));
                }
            } else {
                collectionEmptyList = CollectionsKt.emptyList();
            }
            List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) collectionEmptyList);
            List list2 = listPlus;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((ApiAcceptSlipAgreementsRequestBody.AgreementSigningDetails) next).getAgreement_type(), "stock_loan_customer_agreement_v2")) {
                    break;
                }
            }
            ApiAcceptSlipAgreementsRequestBody.AgreementSigningDetails agreementSigningDetails = (ApiAcceptSlipAgreementsRequestBody.AgreementSigningDetails) next;
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.areEqual(((ApiAcceptSlipAgreementsRequestBody.AgreementSigningDetails) next2).getAgreement_type(), "stock_loan_custodian_agreement")) {
                    break;
                }
            }
            ApiAcceptSlipAgreementsRequestBody.AgreementSigningDetails agreementSigningDetails2 = (ApiAcceptSlipAgreementsRequestBody.AgreementSigningDetails) next2;
            ApiAcceptSlipAgreementsRequestBody apiAcceptSlipAgreementsRequestBody = new ApiAcceptSlipAgreementsRequestBody(postSlipAgreementParams.getAccountNumber(), agreementSigningDetails != null ? agreementSigningDetails.getAgreement_id() : null, agreementSigningDetails != null ? agreementSigningDetails.getSha256() : null, agreementSigningDetails2 != null ? agreementSigningDetails2.getAgreement_id() : null, agreementSigningDetails2 != null ? agreementSigningDetails2.getSha256() : null, listPlus);
            SlipApi slipApi = this.$slipApi;
            this.label = 1;
            if (slipApi.acceptSlipAgreements(apiAcceptSlipAgreementsRequestBody, this) == coroutine_suspended) {
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
