package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.Relay;
import com.robinhood.models.api.ApiIacStatusBanner;
import com.robinhood.models.api.ApiIacStatusBannerResponse;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: IacStatusBannerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacStatusBannerResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacStatusBannerStore$get$2", m3645f = "IacStatusBannerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.IacStatusBannerStore$get$2, reason: use source file name */
/* loaded from: classes13.dex */
final class IacStatusBannerStore3 extends ContinuationImpl7 implements Function2<Response<ApiIacStatusBannerResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IacStatusBannerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IacStatusBannerStore3(IacStatusBannerStore iacStatusBannerStore, Continuation<? super IacStatusBannerStore3> continuation) {
        super(2, continuation);
        this.this$0 = iacStatusBannerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IacStatusBannerStore3 iacStatusBannerStore3 = new IacStatusBannerStore3(this.this$0, continuation);
        iacStatusBannerStore3.L$0 = obj;
        return iacStatusBannerStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiIacStatusBannerResponse> response, Continuation<? super Unit> continuation) {
        return ((IacStatusBannerStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiIacStatusBannerResponse apiIacStatusBannerResponse = (ApiIacStatusBannerResponse) ((Response) this.L$0).body();
        if (apiIacStatusBannerResponse != null) {
            Relay relay = this.this$0.bannerRelay;
            ApiIacStatusBanner status_banner = apiIacStatusBannerResponse.getStatus_banner();
            relay.accept(Optional3.asOptional(status_banner != null ? status_banner.toUiModel() : null));
        }
        return Unit.INSTANCE;
    }
}
