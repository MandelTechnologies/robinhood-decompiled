package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore;
import com.robinhood.models.api.ApiSlipAgreements;
import com.robinhood.models.api.ApiSlipOnboardingFlow;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.p355ui.UiSlipAgreements2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/UiSlipAgreements;", "params", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore$SlipAgreementsParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$getSlipAgreementsEndpoint$1", m3645f = "SlipAgreementsStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$getSlipAgreementsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipAgreementsStore2 extends ContinuationImpl7 implements Function2<SlipAgreementsStore.SlipAgreementsParams, Continuation<? super UiSlipAgreements>, Object> {
    final /* synthetic */ SlipApi $slipApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipAgreementsStore2(SlipApi slipApi, Continuation<? super SlipAgreementsStore2> continuation) {
        super(2, continuation);
        this.$slipApi = slipApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipAgreementsStore2 slipAgreementsStore2 = new SlipAgreementsStore2(this.$slipApi, continuation);
        slipAgreementsStore2.L$0 = obj;
        return slipAgreementsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SlipAgreementsStore.SlipAgreementsParams slipAgreementsParams, Continuation<? super UiSlipAgreements> continuation) {
        return ((SlipAgreementsStore2) create(slipAgreementsParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SlipAgreementsStore.SlipAgreementsParams slipAgreementsParams = (SlipAgreementsStore.SlipAgreementsParams) this.L$0;
            String accountNumber = slipAgreementsParams.getAccountNumber();
            String source = slipAgreementsParams.getSource();
            ApiSlipOnboardingFlow onboardingFlow = slipAgreementsParams.getOnboardingFlow();
            boolean zIsQuickEnrollment = slipAgreementsParams.isQuickEnrollment();
            SlipApi slipApi = this.$slipApi;
            Boolean boolBoxBoolean = boxing.boxBoolean(zIsQuickEnrollment);
            this.label = 1;
            obj = slipApi.getSlipAgreements(accountNumber, source, boolBoxBoolean, onboardingFlow, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return UiSlipAgreements2.toUiModel((ApiSlipAgreements) obj);
    }
}
