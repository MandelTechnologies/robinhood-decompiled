package com.robinhood.iac.alertsheet;

import com.robinhood.models.api.ApiIacAlertSheetRequest;
import com.robinhood.models.api.ApiIacAlertSheetResponse;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.shared.api.iac.IacAlertSheetApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: IacAlertSheetStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacAlertSheetResponse;", "request", "Lcom/robinhood/models/api/ApiIacAlertSheetRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.iac.alertsheet.IacAlertSheetStore$endpoint$1", m3645f = "IacAlertSheetStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.iac.alertsheet.IacAlertSheetStore$endpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
final class IacAlertSheetStore2 extends ContinuationImpl7 implements Function2<ApiIacAlertSheetRequest, Continuation<? super Response<ApiIacAlertSheetResponse>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IacAlertSheetStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IacAlertSheetStore2(IacAlertSheetStore iacAlertSheetStore, Continuation<? super IacAlertSheetStore2> continuation) {
        super(2, continuation);
        this.this$0 = iacAlertSheetStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IacAlertSheetStore2 iacAlertSheetStore2 = new IacAlertSheetStore2(this.this$0, continuation);
        iacAlertSheetStore2.L$0 = obj;
        return iacAlertSheetStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiIacAlertSheetRequest apiIacAlertSheetRequest, Continuation<? super Response<ApiIacAlertSheetResponse>> continuation) {
        return ((IacAlertSheetStore2) create(apiIacAlertSheetRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiIacAlertSheetRequest apiIacAlertSheetRequest = (ApiIacAlertSheetRequest) this.L$0;
        IacAlertSheetStore.logAlertSheetGetCall$default(this.this$0, apiIacAlertSheetRequest.getLocation(), apiIacAlertSheetRequest.getInstrument_id(), apiIacAlertSheetRequest.getCurrency_pair_id(), apiIacAlertSheetRequest.getOption_chain_id(), apiIacAlertSheetRequest.getOption_strategy(), null, 32, null);
        IacAlertSheetApi iacAlertSheetApi = this.this$0.iacAlertSheetApi;
        IacAlertSheetLocation location = apiIacAlertSheetRequest.getLocation();
        UUID instrument_id = apiIacAlertSheetRequest.getInstrument_id();
        UUID currency_pair_id = apiIacAlertSheetRequest.getCurrency_pair_id();
        UUID option_chain_id = apiIacAlertSheetRequest.getOption_chain_id();
        String option_strategy = apiIacAlertSheetRequest.getOption_strategy();
        this.label = 1;
        Object iacAlertSheet = iacAlertSheetApi.getIacAlertSheet(location, instrument_id, currency_pair_id, option_chain_id, option_strategy, this);
        return iacAlertSheet == coroutine_suspended ? coroutine_suspended : iacAlertSheet;
    }
}
