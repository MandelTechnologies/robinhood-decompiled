package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetRealizedPnlForOrdersRequestDto;
import com.robinhood.ceres.p284v1.GetRealizedPnlForOrdersResponseDto;
import com.robinhood.ceres.p284v1.RealizedPnlForOrderDto;
import com.robinhood.utils.extensions.Uuids;
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

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;", "orderIds", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$getOrderRealizedPnlEndpoint$1", m3645f = "FuturesOrderStore.kt", m3646l = {239, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class FuturesOrderStore$getOrderRealizedPnlEndpoint$1 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super List<? extends RealizedPnlForOrderDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$getOrderRealizedPnlEndpoint$1(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$getOrderRealizedPnlEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderStore$getOrderRealizedPnlEndpoint$1 futuresOrderStore$getOrderRealizedPnlEndpoint$1 = new FuturesOrderStore$getOrderRealizedPnlEndpoint$1(this.this$0, continuation);
        futuresOrderStore$getOrderRealizedPnlEndpoint$1.L$0 = obj;
        return futuresOrderStore$getOrderRealizedPnlEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super List<? extends RealizedPnlForOrderDto>> continuation) {
        return invoke2((List<UUID>) list, (Continuation<? super List<RealizedPnlForOrderDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UUID> list, Continuation<? super List<RealizedPnlForOrderDto>> continuation) {
        return ((FuturesOrderStore$getOrderRealizedPnlEndpoint$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r11 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            list = (List) this.L$0;
            FuturesAccountStore futuresAccountStore = this.this$0.futuresAccountStore;
            this.L$0 = list;
            this.label = 1;
            obj = FuturesAccountStore.getFuturesAccountIdString$default(futuresAccountStore, null, this, 1, null);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((GetRealizedPnlForOrdersResponseDto) obj).getRealized_pnl_for_orders();
        }
        list = (List) this.L$0;
        ResultKt.throwOnFailure(obj);
        String str = (String) obj;
        Ceres ceres = this.this$0.ceres;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Uuids.safeToString((UUID) it.next()));
        }
        GetRealizedPnlForOrdersRequestDto getRealizedPnlForOrdersRequestDto = new GetRealizedPnlForOrdersRequestDto(str, arrayList, null, 4, null);
        this.L$0 = null;
        this.label = 2;
        obj = ceres.GetRealizedPnlForOrders(getRealizedPnlForOrdersRequestDto, this);
    }
}
