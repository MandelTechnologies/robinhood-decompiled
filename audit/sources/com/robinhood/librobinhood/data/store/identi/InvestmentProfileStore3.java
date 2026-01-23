package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.models.api.bonfire.ApiInvestmentProfileSettingsRequest;
import com.robinhood.models.api.bonfire.investmentprofilesettings.ApiInvestmentProfileSettingsResponse;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileSettingsResponse;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileSettingsResponse2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: InvestmentProfileStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/models/api/bonfire/ApiInvestmentProfileSettingsRequest;", "profile", "Lcom/robinhood/models/api/bonfire/investmentprofilesettings/ApiInvestmentProfileSettingsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$bonfireInvestmentProfileEndpoint$2", m3645f = "InvestmentProfileStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$bonfireInvestmentProfileEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class InvestmentProfileStore3 extends ContinuationImpl7 implements Function3<ApiInvestmentProfileSettingsRequest, ApiInvestmentProfileSettingsResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InvestmentProfileStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestmentProfileStore3(InvestmentProfileStore investmentProfileStore, Continuation<? super InvestmentProfileStore3> continuation) {
        super(3, continuation);
        this.this$0 = investmentProfileStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ApiInvestmentProfileSettingsRequest apiInvestmentProfileSettingsRequest, ApiInvestmentProfileSettingsResponse apiInvestmentProfileSettingsResponse, Continuation<? super Unit> continuation) {
        InvestmentProfileStore3 investmentProfileStore3 = new InvestmentProfileStore3(this.this$0, continuation);
        investmentProfileStore3.L$0 = apiInvestmentProfileSettingsRequest;
        investmentProfileStore3.L$1 = apiInvestmentProfileSettingsResponse;
        return investmentProfileStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiInvestmentProfileSettingsRequest apiInvestmentProfileSettingsRequest = (ApiInvestmentProfileSettingsRequest) this.L$0;
        UiInvestmentProfileSettingsResponse uiModel = UiInvestmentProfileSettingsResponse2.toUiModel((ApiInvestmentProfileSettingsResponse) this.L$1);
        this.this$0.investmentProfileCache.put(apiInvestmentProfileSettingsRequest, uiModel);
        this.this$0.investmentProfileRelay.accept(Tuples4.m3642to(apiInvestmentProfileSettingsRequest, uiModel));
        return Unit.INSTANCE;
    }
}
