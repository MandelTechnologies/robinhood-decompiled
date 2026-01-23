package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionsV2RequestDto;
import bonfire.proto.idl.portfolio.p037v1.GetAccountPositionsV2ResponseDto;
import bonfire.proto.idl.portfolio.p037v1.PositionsLocationDto;
import bonfire.proto.idl.portfolio.p037v1.PositionsSortDirectionDto;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.PositionsV22;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/PositionsV2;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$positionsEndpointMultipleAccounts$1$1$1$1$1", m3645f = "PositionsV2Store.kt", m3646l = {105}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$positionsEndpointMultipleAccounts$1$1$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PositionsV2>, Object> {
    final /* synthetic */ PositionInstrumentType $instrumentType;
    final /* synthetic */ String $number;
    final /* synthetic */ PositionsV2Store.PositionsRequestMultipleAccounts $request;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$positionsEndpointMultipleAccounts$1$1$1$1$1(PositionsV2Store positionsV2Store, PositionInstrumentType positionInstrumentType, PositionsV2Store.PositionsRequestMultipleAccounts positionsRequestMultipleAccounts, String str, Continuation<? super PositionsV2Store$positionsEndpointMultipleAccounts$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsV2Store;
        this.$instrumentType = positionInstrumentType;
        this.$request = positionsRequestMultipleAccounts;
        this.$number = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsV2Store$positionsEndpointMultipleAccounts$1$1$1$1$1(this.this$0, this.$instrumentType, this.$request, this.$number, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PositionsV2> continuation) {
        return ((PositionsV2Store$positionsEndpointMultipleAccounts$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PositionsSortDirection sortDirection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BonfirePortfolioService bonfirePortfolioService = this.this$0.bonfirePortfolioService;
            String serverValue = this.$instrumentType.getServerValue();
            PositionsLocationDto proto = PositionsV22.toProto(this.$request.getPositionsLocation());
            PositionsSortPreference sortPreference = this.$request.getSortPreference();
            PositionsSortDirectionDto proto2 = null;
            String sortQuery = sortPreference != null ? sortPreference.getSortQuery() : null;
            PositionsSortPreference sortPreference2 = this.$request.getSortPreference();
            if (sortPreference2 != null && (sortDirection = sortPreference2.getSortDirection()) != null) {
                proto2 = PositionsSortDirection3.toProto(sortDirection);
            }
            GetAccountPositionsV2RequestDto getAccountPositionsV2RequestDto = new GetAccountPositionsV2RequestDto(this.$number, serverValue, proto, proto2, sortQuery);
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
