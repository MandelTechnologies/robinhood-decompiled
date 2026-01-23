package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionsV2RequestDto;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionsV2ResponseDto;
import bonfire.proto.idl.portfolio.p037v1.PositionsLocationDto;
import bonfire.proto.idl.portfolio.p037v1.PositionsSortDirectionDto;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.PositionsV22;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection3;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/PositionsV2;", "it", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store$PositionsRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$positionsEndpoint$1", m3645f = "PositionsV2Store.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$positionsEndpoint$1 extends ContinuationImpl7 implements Function2<PositionsV2Store.PositionsRequest, Continuation<? super PositionsV2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$positionsEndpoint$1(PositionsV2Store positionsV2Store, Continuation<? super PositionsV2Store$positionsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsV2Store;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsV2Store$positionsEndpoint$1 positionsV2Store$positionsEndpoint$1 = new PositionsV2Store$positionsEndpoint$1(this.this$0, continuation);
        positionsV2Store$positionsEndpoint$1.L$0 = obj;
        return positionsV2Store$positionsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionsV2Store.PositionsRequest positionsRequest, Continuation<? super PositionsV2> continuation) {
        return ((PositionsV2Store$positionsEndpoint$1) create(positionsRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PositionsSortDirection sortDirection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PositionsV2Store.PositionsRequest positionsRequest = (PositionsV2Store.PositionsRequest) this.L$0;
            BonfirePortfolioService bonfirePortfolioService = this.this$0.bonfirePortfolioService;
            String accountNumber = positionsRequest.getAccountNumber();
            String serverValue = positionsRequest.getInstrumentType().getServerValue();
            PositionsLocationDto proto = PositionsV22.toProto(positionsRequest.getPositionsLocation());
            PositionsSortPreference sortPreference = positionsRequest.getSortPreference();
            PositionsSortDirectionDto proto2 = null;
            String sortQuery = sortPreference != null ? sortPreference.getSortQuery() : null;
            PositionsSortPreference sortPreference2 = positionsRequest.getSortPreference();
            if (sortPreference2 != null && (sortDirection = sortPreference2.getSortDirection()) != null) {
                proto2 = PositionsSortDirection3.toProto(sortDirection);
            }
            GetAccountPositionsV2RequestDto getAccountPositionsV2RequestDto = new GetAccountPositionsV2RequestDto(accountNumber, serverValue, proto, proto2, sortQuery);
            this.label = 1;
            obj = bonfirePortfolioService.GetAccountPositionsV2(getAccountPositionsV2RequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return PositionsV22.toDbModel((GetAccountPositionsV2ResponseDto) obj, this.this$0.moshi.get());
    }
}
