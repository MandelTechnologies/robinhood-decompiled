package com.robinhood.rhc.upsells;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_streamCryptoOrders$Emission;", "it", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$Endpoint_streamCryptoOrders$call$1", m3645f = "RhcUpsellsDataProviderService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$Endpoint_streamCryptoOrders$call$1 */
/* loaded from: classes26.dex */
final class C36189x7dae7412 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super RhcUpsellsDataProviderService_Adapter.Endpoint_streamCryptoOrders.Emission>, Object> {
    int label;
    final /* synthetic */ RhcUpsellsDataProviderService_Adapter.Endpoint_streamCryptoOrders this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C36189x7dae7412(RhcUpsellsDataProviderService_Adapter.Endpoint_streamCryptoOrders endpoint_streamCryptoOrders, Continuation<? super C36189x7dae7412> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_streamCryptoOrders;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C36189x7dae7412(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super RhcUpsellsDataProviderService_Adapter.Endpoint_streamCryptoOrders.Emission> continuation) {
        return ((C36189x7dae7412) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RhcUpsellsDataProviderService rhcUpsellsDataProviderService = this.this$0.service;
            this.label = 1;
            obj = rhcUpsellsDataProviderService.getCryptoOrders(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return RhcUpsellsDataProviderService_Adapter.Endpoint_streamCryptoOrders.Emission.m23919boximpl(RhcUpsellsDataProviderService_Adapter.Endpoint_streamCryptoOrders.Emission.m23920constructorimpl((List) obj));
    }
}
