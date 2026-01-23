package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoLimitOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$applyMutationIfLoaded$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$applyMutationIfLoaded$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoLimitOrderDuxo2 extends ContinuationImpl7 implements Function2<CryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState>, Object> {
    final /* synthetic */ Function1<CryptoLimitOrderDataState.Loaded, CryptoLimitOrderDataState.Loaded> $mutator;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CryptoLimitOrderDuxo2(Function1<? super CryptoLimitOrderDataState.Loaded, CryptoLimitOrderDataState.Loaded> function1, Continuation<? super CryptoLimitOrderDuxo2> continuation) {
        super(2, continuation);
        this.$mutator = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoLimitOrderDuxo2 cryptoLimitOrderDuxo2 = new CryptoLimitOrderDuxo2(this.$mutator, continuation);
        cryptoLimitOrderDuxo2.L$0 = obj;
        return cryptoLimitOrderDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoLimitOrderDataState cryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState> continuation) {
        return ((CryptoLimitOrderDuxo2) create(cryptoLimitOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoLimitOrderDataState cryptoLimitOrderDataState = (CryptoLimitOrderDataState) this.L$0;
        if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loaded) {
            return (CryptoLimitOrderDataState) this.$mutator.invoke(cryptoLimitOrderDataState);
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Should be in loaded state"), false, null, 6, null);
        return cryptoLimitOrderDataState;
    }
}
