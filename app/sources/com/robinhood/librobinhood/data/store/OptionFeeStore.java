package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.models.api.ApiCollateralCash;
import com.robinhood.models.api.ApiOptionOrderFee;
import com.robinhood.models.api.ApiOptionOrderFeeRequest;
import com.robinhood.models.api.ApiOrderFeeLeg;
import com.robinhood.models.p355ui.UiOptionOrderFee;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: OptionFeeStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionFeeStore;", "Lcom/robinhood/store/Store;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "legListAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/models/api/ApiOrderFeeLeg;", "apiCollateralCashAdapter", "Lcom/robinhood/models/api/ApiCollateralCash;", "getOptionOrderFeeEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiOptionOrderFeeRequest;", "Lcom/robinhood/models/api/ApiOptionOrderFee;", "forceFetchOptionOrderFee", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/UiOptionOrderFee;", "request", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionFeeStore extends Store {
    private final JsonAdapter<ApiCollateralCash> apiCollateralCashAdapter;
    private final Endpoint<ApiOptionOrderFeeRequest, ApiOptionOrderFee> getOptionOrderFeeEndpoint;
    private final JsonAdapter<List<ApiOrderFeeLeg>> legListAdapter;
    private final OptionsApi optionsApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionFeeStore(OptionsApi optionsApi, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionsApi = optionsApi;
        Types types = Types.INSTANCE;
        this.legListAdapter = moshi.adapter(new TypeToken<List<? extends ApiOrderFeeLeg>>() { // from class: com.robinhood.librobinhood.data.store.OptionFeeStore$special$$inlined$getAdapter$1
        }.getType());
        this.apiCollateralCashAdapter = moshi.adapter(new TypeToken<ApiCollateralCash>() { // from class: com.robinhood.librobinhood.data.store.OptionFeeStore$special$$inlined$getAdapter$2
        }.getType());
        this.getOptionOrderFeeEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new OptionFeeStore2(this, null), getLogoutKillswitch(), new OptionFeeStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: OptionFeeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/ui/UiOptionOrderFee;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionFeeStore$forceFetchOptionOrderFee$1", m3645f = "OptionFeeStore.kt", m3646l = {57, 57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionFeeStore$forceFetchOptionOrderFee$1 */
    static final class C340301 extends ContinuationImpl7 implements Function2<FlowCollector<? super UiOptionOrderFee>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiOptionOrderFeeRequest $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340301(ApiOptionOrderFeeRequest apiOptionOrderFeeRequest, Continuation<? super C340301> continuation) {
            super(2, continuation);
            this.$request = apiOptionOrderFeeRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340301 c340301 = OptionFeeStore.this.new C340301(this.$request, continuation);
            c340301.L$0 = obj;
            return c340301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super UiOptionOrderFee> flowCollector, Continuation<? super Unit> continuation) {
            return ((C340301) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C340301 c340301;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Endpoint endpoint = OptionFeeStore.this.getOptionOrderFeeEndpoint;
                ApiOptionOrderFeeRequest apiOptionOrderFeeRequest = this.$request;
                this.L$0 = flowCollector;
                this.label = 1;
                c340301 = this;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, apiOptionOrderFeeRequest, null, c340301, 2, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            c340301 = this;
            UiOptionOrderFee uiModel = ((ApiOptionOrderFee) obj).toUiModel();
            c340301.L$0 = null;
            c340301.label = 2;
        }
    }

    public final Flow<UiOptionOrderFee> forceFetchOptionOrderFee(ApiOptionOrderFeeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Flow flow = FlowKt.flow(new C340301(request, null));
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return ErrorHandling3.ignoreNetworkExceptions(flow, durationOfSeconds);
    }
}
