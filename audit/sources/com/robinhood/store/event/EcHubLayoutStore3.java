package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.event.p186db.dao.EcHubLayoutDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubLayout;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubLayout2;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetLayoutResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutResultsDto;
import com.robinhood.store.event.EcHubLayoutStore;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: EcHubLayoutStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/store/event/EcHubLayoutStore$GetLayoutParams;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "result", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EcHubLayoutStore$getEcHubLayoutEndpoint$4", m3645f = "EcHubLayoutStore.kt", m3646l = {69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EcHubLayoutStore$getEcHubLayoutEndpoint$4, reason: use source file name */
/* loaded from: classes12.dex */
final class EcHubLayoutStore3 extends ContinuationImpl7 implements Function3<Tuples2<? extends EcHubLayoutStore.GetLayoutParams, ? extends IdlPaginationCursor>, Response<? extends GetLayoutResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EcHubLayoutStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcHubLayoutStore3(EcHubLayoutStore ecHubLayoutStore, Continuation<? super EcHubLayoutStore3> continuation) {
        super(3, continuation);
        this.this$0 = ecHubLayoutStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends EcHubLayoutStore.GetLayoutParams, ? extends IdlPaginationCursor> tuples2, Response<? extends GetLayoutResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<EcHubLayoutStore.GetLayoutParams, IdlPaginationCursor>) tuples2, (Response<GetLayoutResponseDto>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<EcHubLayoutStore.GetLayoutParams, IdlPaginationCursor> tuples2, Response<GetLayoutResponseDto> response, Continuation<? super Unit> continuation) {
        EcHubLayoutStore3 ecHubLayoutStore3 = new EcHubLayoutStore3(this.this$0, continuation);
        ecHubLayoutStore3.L$0 = tuples2;
        ecHubLayoutStore3.L$1 = response;
        return ecHubLayoutStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IdlPaginationCursor idlPaginationCursor;
        EcHubLayoutStore.GetLayoutParams getLayoutParams;
        EcHubLayoutStore ecHubLayoutStore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            Response response = (Response) this.L$1;
            EcHubLayoutStore.GetLayoutParams getLayoutParams2 = (EcHubLayoutStore.GetLayoutParams) tuples2.component1();
            IdlPaginationCursor idlPaginationCursor2 = (IdlPaginationCursor) tuples2.component2();
            LayoutResultsDto results = ((GetLayoutResponseDto) response.getData()).getResults();
            if (results != null) {
                EcHubLayoutStore ecHubLayoutStore2 = this.this$0;
                EcHubLayoutDao ecHubLayoutDao = ecHubLayoutStore2.ecHubLayoutDao;
                UUID nodeId = getLayoutParams2.getNodeId();
                List<EcHubLayout> dbModel = EcHubLayout2.toDbModel(results);
                this.L$0 = getLayoutParams2;
                this.L$1 = idlPaginationCursor2;
                this.L$2 = ecHubLayoutStore2;
                this.label = 1;
                if (ecHubLayoutDao.updateComponentsByNodeId(nodeId, dbModel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                idlPaginationCursor = idlPaginationCursor2;
                getLayoutParams = getLayoutParams2;
                ecHubLayoutStore = ecHubLayoutStore2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ecHubLayoutStore = (EcHubLayoutStore) this.L$2;
        idlPaginationCursor = (IdlPaginationCursor) this.L$1;
        getLayoutParams = (EcHubLayoutStore.GetLayoutParams) this.L$0;
        ResultKt.throwOnFailure(obj);
        EcHubSessionTracker ecHubSessionTracker = ecHubLayoutStore.ecHubSessionTracker;
        String strGenerateRefId = ecHubLayoutStore.generateRefId(getLayoutParams.getNodeId(), idlPaginationCursor);
        Instant instant = ecHubLayoutStore.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        ecHubSessionTracker.updateRecordUpdatedTimestamp$lib_store_event_externalDebug(strGenerateRefId, instant);
        return Unit.INSTANCE;
    }
}
