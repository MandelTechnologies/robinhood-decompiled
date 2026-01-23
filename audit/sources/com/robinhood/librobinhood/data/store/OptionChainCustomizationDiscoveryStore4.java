package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.models.api.ApiIacAlertSheetResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: OptionChainCustomizationDiscoveryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacAlertSheetResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore$iacAlertSheetForInvestingOptionChainCustomizationGtmEndpoint$1", m3645f = "OptionChainCustomizationDiscoveryStore.kt", m3646l = {40}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore$iacAlertSheetForInvestingOptionChainCustomizationGtmEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionChainCustomizationDiscoveryStore4 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Response<ApiIacAlertSheetResponse>>, Object> {
    int label;
    final /* synthetic */ OptionChainCustomizationDiscoveryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainCustomizationDiscoveryStore4(OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, Continuation<? super OptionChainCustomizationDiscoveryStore4> continuation) {
        super(2, continuation);
        this.this$0 = optionChainCustomizationDiscoveryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainCustomizationDiscoveryStore4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Response<ApiIacAlertSheetResponse>> continuation) {
        return ((OptionChainCustomizationDiscoveryStore4) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        OptionsBonfireApi optionsBonfireApi = this.this$0.bonfireApi;
        this.label = 1;
        Object iacAlertSheetForInvestingOptionChainCustomizationGtm = optionsBonfireApi.getIacAlertSheetForInvestingOptionChainCustomizationGtm(this);
        return iacAlertSheetForInvestingOptionChainCustomizationGtm == coroutine_suspended ? coroutine_suspended : iacAlertSheetForInvestingOptionChainCustomizationGtm;
    }
}
