package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.api.ApiSlipUpsellResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipPostTradeUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiSlipUpsellResponse;", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipPostTradeUpsellStore$slipUpsellEndpoint$1", m3645f = "SlipPostTradeUpsellStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipPostTradeUpsellStore$slipUpsellEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipPostTradeUpsellStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super ApiSlipUpsellResponse>, Object> {
    final /* synthetic */ SlipApi $slipApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipPostTradeUpsellStore2(SlipApi slipApi, Continuation<? super SlipPostTradeUpsellStore2> continuation) {
        super(2, continuation);
        this.$slipApi = slipApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipPostTradeUpsellStore2 slipPostTradeUpsellStore2 = new SlipPostTradeUpsellStore2(this.$slipApi, continuation);
        slipPostTradeUpsellStore2.L$0 = obj;
        return slipPostTradeUpsellStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super ApiSlipUpsellResponse> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super ApiSlipUpsellResponse> continuation) {
        return ((SlipPostTradeUpsellStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        String str2 = (String) tuples2.component2();
        SlipApi slipApi = this.$slipApi;
        this.label = 1;
        Object slipUpsell = slipApi.getSlipUpsell(str, str2, this);
        return slipUpsell == coroutine_suspended ? coroutine_suspended : slipUpsell;
    }
}
