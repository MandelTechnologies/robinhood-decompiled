package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiOptionOrderPostBody;
import com.robinhood.models.api.marketability.ApiOptionOrderMarketability;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionMarketabilityStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionMarketabilityStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "getBonfireApi", "()Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "getOptionOrderMarketability", "Lio/reactivex/Single;", "Lcom/robinhood/models/api/marketability/ApiOptionOrderMarketability;", CarResultComposable2.BODY, "Lcom/robinhood/models/api/ApiOptionOrderPostBody;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionMarketabilityStore extends Store {
    private final OptionsBonfireApi bonfireApi;

    public final OptionsBonfireApi getBonfireApi() {
        return this.bonfireApi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionMarketabilityStore(OptionsBonfireApi bonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
    }

    /* compiled from: OptionMarketabilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/marketability/ApiOptionOrderMarketability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionMarketabilityStore$getOptionOrderMarketability$1", m3645f = "OptionMarketabilityStore.kt", m3646l = {20}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionMarketabilityStore$getOptionOrderMarketability$1 */
    static final class C340481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptionOrderMarketability>, Object> {
        final /* synthetic */ ApiOptionOrderPostBody $body;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340481(ApiOptionOrderPostBody apiOptionOrderPostBody, Continuation<? super C340481> continuation) {
            super(2, continuation);
            this.$body = apiOptionOrderPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionMarketabilityStore.this.new C340481(this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptionOrderMarketability> continuation) {
            return ((C340481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            OptionsBonfireApi bonfireApi = OptionMarketabilityStore.this.getBonfireApi();
            ApiOptionOrderPostBody apiOptionOrderPostBody = this.$body;
            this.label = 1;
            Object optionOrderMarketability = bonfireApi.getOptionOrderMarketability(apiOptionOrderPostBody, this);
            return optionOrderMarketability == coroutine_suspended ? coroutine_suspended : optionOrderMarketability;
        }
    }

    public final Single<ApiOptionOrderMarketability> getOptionOrderMarketability(ApiOptionOrderPostBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C340481(body, null), 1, null);
    }
}
