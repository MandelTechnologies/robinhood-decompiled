package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.equityscreener.models.api.ApiSaveScreenerRequest;
import com.robinhood.equityscreener.models.api.ApiSaveScreenerRequest2;
import com.robinhood.equityscreener.models.api.ApiScreenerResponse;
import com.robinhood.equityscreener.models.p294db.Screener3;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$SaveScreenerResponse;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$SaveScreenerRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$saveScreenerEndpoint$1", m3645f = "ScreenersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class ScreenersStore$saveScreenerEndpoint$1 extends ContinuationImpl7 implements Function2<ScreenersStore.SaveScreenerRequest, Continuation<? super ScreenersStore.SaveScreenerResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScreenersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenersStore$saveScreenerEndpoint$1(ScreenersStore screenersStore, Continuation<? super ScreenersStore$saveScreenerEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = screenersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenersStore$saveScreenerEndpoint$1 screenersStore$saveScreenerEndpoint$1 = new ScreenersStore$saveScreenerEndpoint$1(this.this$0, continuation);
        screenersStore$saveScreenerEndpoint$1.L$0 = obj;
        return screenersStore$saveScreenerEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScreenersStore.SaveScreenerRequest saveScreenerRequest, Continuation<? super ScreenersStore.SaveScreenerResponse> continuation) {
        return ((ScreenersStore$saveScreenerEndpoint$1) create(saveScreenerRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ScreenersStore.SaveScreenerRequest saveScreenerRequest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ScreenersStore.SaveScreenerRequest saveScreenerRequest2 = (ScreenersStore.SaveScreenerRequest) this.L$0;
            ScreenersApi screenersApi = this.this$0.api;
            ApiSaveScreenerRequest saveScreenerRequest3 = ApiSaveScreenerRequest2.toSaveScreenerRequest(saveScreenerRequest2.getScreener(), saveScreenerRequest2.getAlwaysSaveNewCopy());
            this.L$0 = saveScreenerRequest2;
            this.label = 1;
            Object objSaveScreener = screenersApi.saveScreener(saveScreenerRequest3, this);
            if (objSaveScreener == coroutine_suspended) {
                return coroutine_suspended;
            }
            saveScreenerRequest = saveScreenerRequest2;
            obj = objSaveScreener;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            saveScreenerRequest = (ScreenersStore.SaveScreenerRequest) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ApiScreenerResponse apiScreenerResponse = (ApiScreenerResponse) obj;
        Integer numBoxInt = boxing.boxInt(saveScreenerRequest.getScreener().getListIndex());
        numBoxInt.intValue();
        if (saveScreenerRequest.getScreener().isPreset()) {
            numBoxInt = null;
        }
        return new ScreenersStore.SaveScreenerResponse(saveScreenerRequest.getScreener().getId(), Screener3.toDbModel(apiScreenerResponse, numBoxInt != null ? numBoxInt.intValue() : 0));
    }
}
