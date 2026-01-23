package com.robinhood.android.event.trade.explainer;

import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PriceExplainer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.trade.explainer.PriceExplainerKt$PriceExplainerBottomSheet$1$1", m3645f = "PriceExplainer.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.trade.explainer.PriceExplainerKt$PriceExplainerBottomSheet$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class PriceExplainer2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PriceExplainerDuxo $duxo;
    final /* synthetic */ UUID $eventContractId;
    final /* synthetic */ ExchangeSource $exchangeSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceExplainer2(PriceExplainerDuxo priceExplainerDuxo, UUID uuid, ExchangeSource exchangeSource, Continuation<? super PriceExplainer2> continuation) {
        super(2, continuation);
        this.$duxo = priceExplainerDuxo;
        this.$eventContractId = uuid;
        this.$exchangeSource = exchangeSource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriceExplainer2(this.$duxo, this.$eventContractId, this.$exchangeSource, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriceExplainer2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.setArgs(this.$eventContractId, this.$exchangeSource);
        return Unit.INSTANCE;
    }
}
