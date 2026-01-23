package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetLayoutRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetLayoutResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.store.event.EcHubLayoutStore;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EcHubLayoutStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponseDto;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/store/event/EcHubLayoutStore$GetLayoutParams;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EcHubLayoutStore$getEcHubLayoutEndpoint$1", m3645f = "EcHubLayoutStore.kt", m3646l = {60, 53}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EcHubLayoutStore$getEcHubLayoutEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EcHubLayoutStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends EcHubLayoutStore.GetLayoutParams, ? extends IdlPaginationCursor>, Continuation<? super Response<? extends GetLayoutResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EcHubLayoutStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcHubLayoutStore2(EcHubLayoutStore ecHubLayoutStore, Continuation<? super EcHubLayoutStore2> continuation) {
        super(2, continuation);
        this.this$0 = ecHubLayoutStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EcHubLayoutStore2 ecHubLayoutStore2 = new EcHubLayoutStore2(this.this$0, continuation);
        ecHubLayoutStore2.L$0 = obj;
        return ecHubLayoutStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends EcHubLayoutStore.GetLayoutParams, ? extends IdlPaginationCursor> tuples2, Continuation<? super Response<? extends GetLayoutResponseDto>> continuation) {
        return invoke2((Tuples2<EcHubLayoutStore.GetLayoutParams, IdlPaginationCursor>) tuples2, (Continuation<? super Response<GetLayoutResponseDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<EcHubLayoutStore.GetLayoutParams, IdlPaginationCursor> tuples2, Continuation<? super Response<GetLayoutResponseDto>> continuation) {
        return ((EcHubLayoutStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String value;
        LayoutService layoutService;
        GetLayoutRequestDto getLayoutRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            EcHubLayoutStore.GetLayoutParams getLayoutParams = (EcHubLayoutStore.GetLayoutParams) tuples2.component1();
            IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) tuples2.component2();
            LayoutService layoutService2 = this.this$0.layoutService;
            String strSafeToString = Uuids.safeToString(getLayoutParams.getNodeId());
            if (idlPaginationCursor == null || (value = idlPaginationCursor.getValue()) == null) {
                value = "";
            }
            GetLayoutRequestDto getLayoutRequestDto2 = new GetLayoutRequestDto(strSafeToString, value, 100, 0, 8, null);
            PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
            this.L$0 = layoutService2;
            this.L$1 = getLayoutRequestDto2;
            this.label = 1;
            obj = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
            if (obj != coroutine_suspended) {
                layoutService = layoutService2;
                getLayoutRequestDto = getLayoutRequestDto2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        getLayoutRequestDto = (GetLayoutRequestDto) this.L$1;
        layoutService = (LayoutService) this.L$0;
        ResultKt.throwOnFailure(obj);
        Request<GetLayoutRequestDto> request = new Request<>(getLayoutRequestDto, (Map) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objGetLayout = layoutService.GetLayout(request, this);
        return objGetLayout == coroutine_suspended ? coroutine_suspended : objGetLayout;
    }
}
