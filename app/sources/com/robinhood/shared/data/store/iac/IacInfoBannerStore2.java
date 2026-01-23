package com.robinhood.shared.data.store.iac;

import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.api.ApiIacInfoBannerBatchResponse;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.api.iac.IacInfoBannerApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: IacInfoBannerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacInfoBannerBatchResponse;", "params", "Lcom/robinhood/shared/data/store/iac/IacInfoBannersBatchParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacInfoBannerStore$getBatch$1", m3645f = "IacInfoBannerStore.kt", m3646l = {41}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.data.store.iac.IacInfoBannerStore$getBatch$1, reason: use source file name */
/* loaded from: classes6.dex */
final class IacInfoBannerStore2 extends ContinuationImpl7 implements Function2<IacInfoBannersBatchParams, Continuation<? super Response<ApiIacInfoBannerBatchResponse>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IacInfoBannerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IacInfoBannerStore2(IacInfoBannerStore iacInfoBannerStore, Continuation<? super IacInfoBannerStore2> continuation) {
        super(2, continuation);
        this.this$0 = iacInfoBannerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IacInfoBannerStore2 iacInfoBannerStore2 = new IacInfoBannerStore2(this.this$0, continuation);
        iacInfoBannerStore2.L$0 = obj;
        return iacInfoBannerStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IacInfoBannersBatchParams iacInfoBannersBatchParams, Continuation<? super Response<ApiIacInfoBannerBatchResponse>> continuation) {
        return ((IacInfoBannerStore2) create(iacInfoBannersBatchParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        IacInfoBannersBatchParams iacInfoBannersBatchParams = (IacInfoBannersBatchParams) this.L$0;
        IacInfoBannerApi iacInfoBannerApi = this.this$0.iacInfoBannerApi;
        List<IacInfoBannerLocation> locations = iacInfoBannersBatchParams.getLocations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(locations, 10));
        Iterator<T> it = locations.iterator();
        while (it.hasNext()) {
            arrayList.add(((IacInfoBannerLocation) it.next()).getServerValue());
        }
        CommaSeparatedList<String> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(arrayList);
        UUID instrumentId = iacInfoBannersBatchParams.getInstrumentId();
        UUID currencyPairId = iacInfoBannersBatchParams.getCurrencyPairId();
        UUID perpetualContractId = iacInfoBannersBatchParams.getPerpetualContractId();
        UUID optionChainId = iacInfoBannersBatchParams.getOptionChainId();
        UUID listId = iacInfoBannersBatchParams.getListId();
        UUID eventId = iacInfoBannersBatchParams.getEventId();
        UUID futuresContractId = iacInfoBannersBatchParams.getFuturesContractId();
        String optionStrategyCode = iacInfoBannersBatchParams.getOptionStrategyCode();
        String accountNumber = iacInfoBannersBatchParams.getAccountNumber();
        UUID orderId = iacInfoBannersBatchParams.getOrderId();
        this.label = 1;
        Object batchIacInfoBanner = iacInfoBannerApi.getBatchIacInfoBanner(commaSeparatedList, instrumentId, currencyPairId, perpetualContractId, optionChainId, listId, eventId, futuresContractId, optionStrategyCode, accountNumber, orderId, this);
        return batchIacInfoBanner == coroutine_suspended ? coroutine_suspended : batchIacInfoBanner;
    }
}
