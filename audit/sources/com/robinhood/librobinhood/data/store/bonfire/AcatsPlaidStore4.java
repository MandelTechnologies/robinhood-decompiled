package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenResponse;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsPlaidLinkTokenQueryParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsPlaidStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidTokenResponse;", "queryParams", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsPlaidLinkTokenQueryParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore$plaidLinkTokenEndpoint$1", m3645f = "AcatsPlaidStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore$plaidLinkTokenEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AcatsPlaidStore4 extends ContinuationImpl7 implements Function2<ApiAcatsPlaidLinkTokenQueryParams, Continuation<? super ApiAcatsInPlaidTokenResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsPlaidStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsPlaidStore4(AcatsPlaidStore acatsPlaidStore, Continuation<? super AcatsPlaidStore4> continuation) {
        super(2, continuation);
        this.this$0 = acatsPlaidStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsPlaidStore4 acatsPlaidStore4 = new AcatsPlaidStore4(this.this$0, continuation);
        acatsPlaidStore4.L$0 = obj;
        return acatsPlaidStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAcatsPlaidLinkTokenQueryParams apiAcatsPlaidLinkTokenQueryParams, Continuation<? super ApiAcatsInPlaidTokenResponse> continuation) {
        return ((AcatsPlaidStore4) create(apiAcatsPlaidLinkTokenQueryParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiAcatsPlaidLinkTokenQueryParams apiAcatsPlaidLinkTokenQueryParams = (ApiAcatsPlaidLinkTokenQueryParams) this.L$0;
        AcatsApi acatsApi = this.this$0.acatsApi;
        String rhAccountNumber = apiAcatsPlaidLinkTokenQueryParams.getRhAccountNumber();
        String contraDtccNumber = apiAcatsPlaidLinkTokenQueryParams.getContraDtccNumber();
        String plaidInstitutionId = apiAcatsPlaidLinkTokenQueryParams.getPlaidInstitutionId();
        String androidPackageName = apiAcatsPlaidLinkTokenQueryParams.getAndroidPackageName();
        this.label = 1;
        Object plaidLinkToken = acatsApi.getPlaidLinkToken(rhAccountNumber, contraDtccNumber, plaidInstitutionId, androidPackageName, this);
        return plaidLinkToken == coroutine_suspended ? coroutine_suspended : plaidLinkToken;
    }
}
