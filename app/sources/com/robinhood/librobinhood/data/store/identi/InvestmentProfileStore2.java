package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.api.onboarding.investmentprofilesettings.InvestmentProfileApi;
import com.robinhood.models.api.bonfire.ApiInvestmentProfileSettingsRequest;
import com.robinhood.models.api.bonfire.investmentprofilesettings.ApiInvestmentProfileSettingsResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentProfileStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/investmentprofilesettings/ApiInvestmentProfileSettingsResponse;", "request", "Lcom/robinhood/models/api/bonfire/ApiInvestmentProfileSettingsRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$bonfireInvestmentProfileEndpoint$1", m3645f = "InvestmentProfileStore.kt", m3646l = {58}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$bonfireInvestmentProfileEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InvestmentProfileStore2 extends ContinuationImpl7 implements Function2<ApiInvestmentProfileSettingsRequest, Continuation<? super ApiInvestmentProfileSettingsResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InvestmentProfileStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestmentProfileStore2(InvestmentProfileStore investmentProfileStore, Continuation<? super InvestmentProfileStore2> continuation) {
        super(2, continuation);
        this.this$0 = investmentProfileStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestmentProfileStore2 investmentProfileStore2 = new InvestmentProfileStore2(this.this$0, continuation);
        investmentProfileStore2.L$0 = obj;
        return investmentProfileStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiInvestmentProfileSettingsRequest apiInvestmentProfileSettingsRequest, Continuation<? super ApiInvestmentProfileSettingsResponse> continuation) {
        return ((InvestmentProfileStore2) create(apiInvestmentProfileSettingsRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ApiInvestmentProfileSettingsRequest apiInvestmentProfileSettingsRequest = (ApiInvestmentProfileSettingsRequest) this.L$0;
        InvestmentProfileApi investmentProfileApi = this.this$0.investmentProfileApi;
        String productContext = apiInvestmentProfileSettingsRequest.getProductContext();
        String accountNumber = apiInvestmentProfileSettingsRequest.getAccountNumber();
        this.label = 1;
        Object investmentProfile = investmentProfileApi.getInvestmentProfile(productContext, accountNumber, this);
        return investmentProfile == coroutine_suspended ? coroutine_suspended : investmentProfile;
    }
}
