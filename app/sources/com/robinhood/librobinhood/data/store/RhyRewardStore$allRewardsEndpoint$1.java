package com.robinhood.librobinhood.data.store;

import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.pluto.ApiRhyReward;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyRewardStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/pluto/ApiRhyReward;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyRewardStore$allRewardsEndpoint$1", m3645f = "RhyRewardStore.kt", m3646l = {58}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class RhyRewardStore$allRewardsEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiRhyReward>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyRewardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyRewardStore$allRewardsEndpoint$1(RhyRewardStore rhyRewardStore, Continuation<? super RhyRewardStore$allRewardsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = rhyRewardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyRewardStore$allRewardsEndpoint$1 rhyRewardStore$allRewardsEndpoint$1 = new RhyRewardStore$allRewardsEndpoint$1(this.this$0, continuation);
        rhyRewardStore$allRewardsEndpoint$1.L$0 = obj;
        return rhyRewardStore$allRewardsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiRhyReward>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiRhyReward>> continuation) {
        return ((RhyRewardStore$allRewardsEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaginationCursor paginationCursor = (PaginationCursor) ((Tuples2) this.L$0).component2();
            PlutoApi plutoApi = this.this$0.pluto;
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            this.label = 1;
            obj = plutoApi.getRewards(value, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        PaginatedResult paginatedResult = (PaginatedResult) obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : paginatedResult) {
            if (((ApiRhyReward) obj2).getType() != ApiRhyReward.Type.UNKNOWN) {
                arrayList.add(obj2);
            }
        }
        return new PaginatedResult(arrayList, paginatedResult.getPrevious(), paginatedResult.getNext());
    }
}
