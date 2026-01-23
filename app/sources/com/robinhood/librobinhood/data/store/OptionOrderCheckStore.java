package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiOptionOrderCheck;
import com.robinhood.models.api.ApiOptionOrderPostBody;
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

/* compiled from: OptionOrderCheckStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderCheckStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "optionsBonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;)V", "getOptionOrderCheck", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/ApiOptionOrderPostBody;", "Lcom/robinhood/models/api/ApiOptionOrderCheck;", "getGetOptionOrderCheck", "()Lcom/robinhood/android/moria/network/PostEndpoint;", "optionOrderCheckSingle", "Lio/reactivex/Single;", "req", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionOrderCheckStore extends Store {
    private final PostEndpoint<ApiOptionOrderPostBody, ApiOptionOrderCheck> getOptionOrderCheck;
    private final OptionsBonfireApi optionsBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderCheckStore(StoreBundle storeBundle, OptionsBonfireApi optionsBonfireApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
        this.optionsBonfireApi = optionsBonfireApi;
        this.getOptionOrderCheck = PostEndpoint.INSTANCE.create(new OptionOrderCheckStore2(optionsBonfireApi), new OptionOrderCheckStore3(null));
    }

    public final PostEndpoint<ApiOptionOrderPostBody, ApiOptionOrderCheck> getGetOptionOrderCheck() {
        return this.getOptionOrderCheck;
    }

    /* compiled from: OptionOrderCheckStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionOrderCheck;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderCheckStore$optionOrderCheckSingle$1", m3645f = "OptionOrderCheckStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderCheckStore$optionOrderCheckSingle$1 */
    static final class C340531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptionOrderCheck>, Object> {
        final /* synthetic */ ApiOptionOrderPostBody $req;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340531(ApiOptionOrderPostBody apiOptionOrderPostBody, Continuation<? super C340531> continuation) {
            super(2, continuation);
            this.$req = apiOptionOrderPostBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderCheckStore.this.new C340531(this.$req, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptionOrderCheck> continuation) {
            return ((C340531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint<ApiOptionOrderPostBody, ApiOptionOrderCheck> getOptionOrderCheck = OptionOrderCheckStore.this.getGetOptionOrderCheck();
            ApiOptionOrderPostBody apiOptionOrderPostBody = this.$req;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(getOptionOrderCheck, apiOptionOrderPostBody, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiOptionOrderCheck> optionOrderCheckSingle(ApiOptionOrderPostBody req) {
        Intrinsics.checkNotNullParameter(req, "req");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C340531(req, null), 1, null);
    }
}
