package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.pluto.ApiMerchantReward;
import com.robinhood.models.api.pluto.ApiRhyReward;
import com.robinhood.models.api.pluto.ApiRoundupReward;
import com.robinhood.models.dao.MerchantRewardDao;
import com.robinhood.models.dao.RoundupRewardDao;
import com.robinhood.models.p320db.MerchantReward3;
import com.robinhood.models.p320db.RoundupReward2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: RhyRewardStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/pluto/ApiRhyReward;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyRewardStore$allRewardsEndpoint$2", m3645f = "RhyRewardStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class RhyRewardStore$allRewardsEndpoint$2 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiRhyReward>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyRewardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyRewardStore$allRewardsEndpoint$2(RhyRewardStore rhyRewardStore, Continuation<? super RhyRewardStore$allRewardsEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = rhyRewardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyRewardStore$allRewardsEndpoint$2 rhyRewardStore$allRewardsEndpoint$2 = new RhyRewardStore$allRewardsEndpoint$2(this.this$0, continuation);
        rhyRewardStore$allRewardsEndpoint$2.L$0 = obj;
        return rhyRewardStore$allRewardsEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaginatedResult<? extends ApiRhyReward> paginatedResult, Continuation<? super Unit> continuation) {
        return ((RhyRewardStore$allRewardsEndpoint$2) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List results = ((PaginatedResult) this.L$0).getResults();
        RoundupRewardDao roundupRewardDao = this.this$0.roundupRewardDao;
        List list = results;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ApiRoundupReward) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(RoundupReward2.toDbModel((ApiRoundupReward) it.next()));
        }
        roundupRewardDao.insert((Iterable) arrayList2);
        MerchantRewardDao merchantRewardDao = this.this$0.merchantRewardDao;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof ApiMerchantReward) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(MerchantReward3.toDbModel((ApiMerchantReward) it2.next()));
        }
        merchantRewardDao.insert((Iterable) arrayList4);
        return Unit.INSTANCE;
    }
}
