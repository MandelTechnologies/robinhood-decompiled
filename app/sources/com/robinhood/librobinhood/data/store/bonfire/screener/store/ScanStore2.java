package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.equityscreener.models.api.ApiScanRequest;
import com.robinhood.equityscreener.models.api.ApiScanRequest2;
import com.robinhood.equityscreener.models.api.ApiScanResultResponse;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse2;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ScanStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore$ScanRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore$scanEndpoint$1", m3645f = "ScanStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore$scanEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ScanStore2 extends ContinuationImpl7 implements Function2<ScanStore.ScanRequest, Continuation<? super ScanResultResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScanStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScanStore2(ScanStore scanStore, Continuation<? super ScanStore2> continuation) {
        super(2, continuation);
        this.this$0 = scanStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScanStore2 scanStore2 = new ScanStore2(this.this$0, continuation);
        scanStore2.L$0 = obj;
        return scanStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScanStore.ScanRequest scanRequest, Continuation<? super ScanResultResponse> continuation) {
        return ((ScanStore2) create(scanRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ScanStore.ScanRequest scanRequest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ScanStore.ScanRequest scanRequest2 = (ScanStore.ScanRequest) this.L$0;
            ScreenersApi screenersApi = this.this$0.api;
            ApiScanRequest apiScanRequest = ApiScanRequest2.toApiScanRequest(scanRequest2.getScreener(), scanRequest2.getAccountNumber(), scanRequest2.getDefaultColumns(), scanRequest2.getShouldPoll());
            this.L$0 = scanRequest2;
            this.label = 1;
            Object screenersScan = screenersApi.getScreenersScan(apiScanRequest, this);
            if (screenersScan == coroutine_suspended) {
                return coroutine_suspended;
            }
            scanRequest = scanRequest2;
            obj = screenersScan;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scanRequest = (ScanStore.ScanRequest) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return ScanResultResponse2.toDbModel((ApiScanResultResponse) obj, scanRequest.getScreener().getId(), scanRequest.toString());
    }
}
