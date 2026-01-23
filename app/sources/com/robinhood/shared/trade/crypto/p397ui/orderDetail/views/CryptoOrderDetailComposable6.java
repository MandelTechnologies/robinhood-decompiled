package com.robinhood.shared.trade.crypto.p397ui.orderDetail.views;

import com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailDuxo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoOrderDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$9$1", m3645f = "CryptoOrderDetailComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$9$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDetailComposable6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoOrderDetailDuxo $duxo;
    final /* synthetic */ long $fg2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderDetailComposable6(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, long j, Continuation<? super CryptoOrderDetailComposable6> continuation) {
        super(2, continuation);
        this.$duxo = cryptoOrderDetailDuxo;
        this.$fg2 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoOrderDetailComposable6(this.$duxo, this.$fg2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoOrderDetailComposable6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.m25908setFg2Color8_81llA(this.$fg2);
        return Unit.INSTANCE;
    }
}
