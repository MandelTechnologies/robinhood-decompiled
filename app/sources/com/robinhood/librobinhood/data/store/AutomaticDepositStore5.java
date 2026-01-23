package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.bonfire.ApiSkipAchDepositScheduleRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: AutomaticDepositStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiAutomaticDeposit;", "id", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AutomaticDepositStore$skipEndpoint$1", m3645f = "AutomaticDepositStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AutomaticDepositStore$skipEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AutomaticDepositStore5 extends ContinuationImpl7 implements Function2<String, Continuation<? super Response<ApiAutomaticDeposit>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AutomaticDepositStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticDepositStore5(AutomaticDepositStore automaticDepositStore, Continuation<? super AutomaticDepositStore5> continuation) {
        super(2, continuation);
        this.this$0 = automaticDepositStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutomaticDepositStore5 automaticDepositStore5 = new AutomaticDepositStore5(this.this$0, continuation);
        automaticDepositStore5.L$0 = obj;
        return automaticDepositStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Response<ApiAutomaticDeposit>> continuation) {
        return ((AutomaticDepositStore5) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
            ApiSkipAchDepositScheduleRequest apiSkipAchDepositScheduleRequest = new ApiSkipAchDepositScheduleRequest(str);
            this.label = 1;
            obj = transfersBonfireApi.skipAchDepositSchedule(apiSkipAchDepositScheduleRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Response response = (Response) obj;
        if (response.isSuccessful()) {
            return obj;
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        Intrinsics.checkNotNull(responseBodyErrorBody);
        throw new HttpException(Response.error(responseBodyErrorBody, response.raw()));
    }
}
