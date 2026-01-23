package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.futures.dao.FuturesOrderDao;
import com.robinhood.android.models.futures.p189db.FuturesRealizedPnl2;
import com.robinhood.ceres.p284v1.RealizedPnlForOrderDto;
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

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "realizedPnls", "", "Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$getOrderRealizedPnlEndpoint$2", m3645f = "FuturesOrderStore.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class FuturesOrderStore$getOrderRealizedPnlEndpoint$2 extends ContinuationImpl7 implements Function2<List<? extends RealizedPnlForOrderDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$getOrderRealizedPnlEndpoint$2(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$getOrderRealizedPnlEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderStore$getOrderRealizedPnlEndpoint$2 futuresOrderStore$getOrderRealizedPnlEndpoint$2 = new FuturesOrderStore$getOrderRealizedPnlEndpoint$2(this.this$0, continuation);
        futuresOrderStore$getOrderRealizedPnlEndpoint$2.L$0 = obj;
        return futuresOrderStore$getOrderRealizedPnlEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RealizedPnlForOrderDto> list, Continuation<? super Unit> continuation) {
        return invoke2((List<RealizedPnlForOrderDto>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RealizedPnlForOrderDto> list, Continuation<? super Unit> continuation) {
        return ((FuturesOrderStore$getOrderRealizedPnlEndpoint$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            FuturesOrderDao futuresOrderDao = this.this$0.futuresOrderDao;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesRealizedPnl2.toDbModel((RealizedPnlForOrderDto) it.next()));
            }
            this.label = 1;
            if (futuresOrderDao.insertFuturesRealizedPnls(arrayList, this) == coroutine_suspended) {
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
