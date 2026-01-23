package com.robinhood.rhc.upsells;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Emission;", "it", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$call$1", m3645f = "RhcUpsellsDataProviderService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$call$1 */
/* loaded from: classes26.dex */
final class C36182xdb645c9d extends ContinuationImpl7 implements Function2<RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney.Arguments, Continuation<? super RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C36182xdb645c9d(RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney endpoint_formatMoney, Continuation<? super C36182xdb645c9d> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_formatMoney;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C36182xdb645c9d c36182xdb645c9d = new C36182xdb645c9d(this.this$0, continuation);
        c36182xdb645c9d.L$0 = obj;
        return c36182xdb645c9d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney.Arguments arguments, Continuation<? super RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney.Emission> continuation) {
        return ((C36182xdb645c9d) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney.Arguments arguments = (RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney.Arguments) this.L$0;
            RhcUpsellsDataProviderService rhcUpsellsDataProviderService = this.this$0.service;
            String currencyCode = arguments.getCurrencyCode();
            String amount = arguments.getAmount();
            Integer minimumFractionDigits = arguments.getMinimumFractionDigits();
            this.label = 1;
            obj = rhcUpsellsDataProviderService.formatMoney(currencyCode, amount, minimumFractionDigits, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney.Emission.m23891boximpl(RhcUpsellsDataProviderService_Adapter.Endpoint_formatMoney.Emission.m23892constructorimpl((String) obj));
    }
}
