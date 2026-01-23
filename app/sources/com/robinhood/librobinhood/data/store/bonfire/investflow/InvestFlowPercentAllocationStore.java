package com.robinhood.librobinhood.data.store.bonfire.investflow;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.investFlow.retrofit.InvestFlowApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.investflow.models.api.allocation.ApiInvestFlowPercentAllocationRequest;
import com.robinhood.investflow.models.api.allocation.ApiInvestFlowPercentAllocationResponse;
import com.robinhood.models.util.Money;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestFlowPercentAllocationStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowPercentAllocationStore;", "Lcom/robinhood/store/Store;", "investFlowApi", "Lcom/robinhood/api/investFlow/retrofit/InvestFlowApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/investFlow/retrofit/InvestFlowApi;Lcom/robinhood/store/StoreBundle;)V", "percentSplitAllocation", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/investflow/models/api/allocation/ApiInvestFlowPercentAllocationRequest;", "Lcom/robinhood/investflow/models/api/allocation/ApiInvestFlowPercentAllocationResponse;", "getDollarAmountAllocationsByPercent", "Lio/reactivex/Single;", "", "Lcom/robinhood/investflow/models/api/allocation/ApiInvestFlowPercentAllocationResponse$Amount;", "totalAmount", "Lcom/robinhood/models/util/Money;", "assetWeights", "", "Ljava/util/UUID;", "", "lib-store-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InvestFlowPercentAllocationStore extends Store {
    private final InvestFlowApi investFlowApi;
    private final Endpoint<ApiInvestFlowPercentAllocationRequest, ApiInvestFlowPercentAllocationResponse> percentSplitAllocation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestFlowPercentAllocationStore(InvestFlowApi investFlowApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(investFlowApi, "investFlowApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.investFlowApi = investFlowApi;
        this.percentSplitAllocation = Endpoint.Companion.create$default(Endpoint.INSTANCE, new InvestFlowPercentAllocationStore2(investFlowApi), getLogoutKillswitch(), new InvestFlowPercentAllocationStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: InvestFlowPercentAllocationStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/investflow/models/api/allocation/ApiInvestFlowPercentAllocationResponse$Amount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowPercentAllocationStore$getDollarAmountAllocationsByPercent$1", m3645f = "InvestFlowPercentAllocationStore.kt", m3646l = {32}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowPercentAllocationStore$getDollarAmountAllocationsByPercent$1 */
    static final class C346461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ApiInvestFlowPercentAllocationResponse.Amount>>, Object> {
        final /* synthetic */ Map<UUID, Float> $assetWeights;
        final /* synthetic */ Money $totalAmount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346461(Money money, Map<UUID, Float> map, Continuation<? super C346461> continuation) {
            super(2, continuation);
            this.$totalAmount = money;
            this.$assetWeights = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowPercentAllocationStore.this.new C346461(this.$totalAmount, this.$assetWeights, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ApiInvestFlowPercentAllocationResponse.Amount>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ApiInvestFlowPercentAllocationResponse.Amount>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ApiInvestFlowPercentAllocationResponse.Amount>> continuation) {
            return ((C346461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = InvestFlowPercentAllocationStore.this.percentSplitAllocation;
                Money money = this.$totalAmount;
                Map<UUID, Float> map = this.$assetWeights;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<UUID, Float> entry : map.entrySet()) {
                    arrayList.add(new ApiInvestFlowPercentAllocationRequest.Assets(entry.getKey(), entry.getValue().floatValue()));
                }
                ApiInvestFlowPercentAllocationRequest apiInvestFlowPercentAllocationRequest = new ApiInvestFlowPercentAllocationRequest(money, arrayList);
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, apiInvestFlowPercentAllocationRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((ApiInvestFlowPercentAllocationResponse) obj).getAmounts();
        }
    }

    public final Single<List<ApiInvestFlowPercentAllocationResponse.Amount>> getDollarAmountAllocationsByPercent(Money totalAmount, Map<UUID, Float> assetWeights) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(assetWeights, "assetWeights");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346461(totalAmount, assetWeights, null), 1, null);
    }
}
