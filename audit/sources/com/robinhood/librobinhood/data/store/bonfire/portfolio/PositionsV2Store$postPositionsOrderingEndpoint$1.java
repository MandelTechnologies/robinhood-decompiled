package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.ApiPositionsReorderRequest;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.models.PositionsOrderingUpdateRequest;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/models/PositionsOrderingUpdateRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$postPositionsOrderingEndpoint$1", m3645f = "PositionsV2Store.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$postPositionsOrderingEndpoint$1 extends ContinuationImpl7 implements Function2<PositionsOrderingUpdateRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$postPositionsOrderingEndpoint$1(PositionsV2Store positionsV2Store, Continuation<? super PositionsV2Store$postPositionsOrderingEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsV2Store;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsV2Store$postPositionsOrderingEndpoint$1 positionsV2Store$postPositionsOrderingEndpoint$1 = new PositionsV2Store$postPositionsOrderingEndpoint$1(this.this$0, continuation);
        positionsV2Store$postPositionsOrderingEndpoint$1.L$0 = obj;
        return positionsV2Store$postPositionsOrderingEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionsOrderingUpdateRequest positionsOrderingUpdateRequest, Continuation<? super Unit> continuation) {
        return ((PositionsV2Store$postPositionsOrderingEndpoint$1) create(positionsOrderingUpdateRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PositionsSortDirection sortDirection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PositionsOrderingUpdateRequest positionsOrderingUpdateRequest = (PositionsOrderingUpdateRequest) this.L$0;
            PortfolioApi portfolioApi = this.this$0.portfolioApi;
            String accountNumber = positionsOrderingUpdateRequest.getAccountNumber();
            List<UUID> instrumentIds = positionsOrderingUpdateRequest.getInstrumentIds();
            PositionInstrumentType instrumentType = positionsOrderingUpdateRequest.getInstrumentType();
            PositionsSortPreference sortPreference = positionsOrderingUpdateRequest.getSortPreference();
            String serverValue = null;
            String sortQuery = sortPreference != null ? sortPreference.getSortQuery() : null;
            PositionsSortPreference sortPreference2 = positionsOrderingUpdateRequest.getSortPreference();
            if (sortPreference2 != null && (sortDirection = sortPreference2.getSortDirection()) != null) {
                serverValue = sortDirection.getServerValue();
            }
            ApiPositionsReorderRequest apiPositionsReorderRequest = new ApiPositionsReorderRequest(instrumentIds, null, instrumentType, sortQuery, serverValue);
            this.label = 1;
            if (portfolioApi.reorderPositions(accountNumber, apiPositionsReorderRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
