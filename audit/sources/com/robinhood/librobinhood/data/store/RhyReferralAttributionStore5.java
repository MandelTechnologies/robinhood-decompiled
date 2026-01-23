package com.robinhood.librobinhood.data.store;

import com.robinhood.models.rhy.referral.api.ApiRhyReferralAttribution;
import com.robinhood.models.rhy.referral.dao.RhyReferralAttributionDao;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution2;
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

/* compiled from: RhyReferralAttributionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "attributions", "", "Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralAttribution;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$listEndpoint$2", m3645f = "RhyReferralAttributionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$listEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyReferralAttributionStore5 extends ContinuationImpl7 implements Function2<List<? extends ApiRhyReferralAttribution>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyReferralAttributionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralAttributionStore5(RhyReferralAttributionStore rhyReferralAttributionStore, Continuation<? super RhyReferralAttributionStore5> continuation) {
        super(2, continuation);
        this.this$0 = rhyReferralAttributionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyReferralAttributionStore5 rhyReferralAttributionStore5 = new RhyReferralAttributionStore5(this.this$0, continuation);
        rhyReferralAttributionStore5.L$0 = obj;
        return rhyReferralAttributionStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiRhyReferralAttribution> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ApiRhyReferralAttribution>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ApiRhyReferralAttribution> list, Continuation<? super Unit> continuation) {
        return ((RhyReferralAttributionStore5) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            RhyReferralAttributionDao rhyReferralAttributionDao = this.this$0.dao;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(RhyReferralAttribution2.toDbModel$default((ApiRhyReferralAttribution) it.next(), false, 1, null));
            }
            rhyReferralAttributionDao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
