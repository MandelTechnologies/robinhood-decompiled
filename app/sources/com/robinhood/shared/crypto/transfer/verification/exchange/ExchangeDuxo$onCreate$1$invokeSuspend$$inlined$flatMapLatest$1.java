package com.robinhood.shared.crypto.transfer.verification.exchange;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "ExchangeDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super ApiCryptoVaspResponse>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ExchangeDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, ExchangeDuxo exchangeDuxo) {
        super(3, continuation);
        this.this$0 = exchangeDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super ApiCryptoVaspResponse> flowCollector, String str, Continuation<? super Unit> continuation) {
        ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1 exchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1 = new ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        exchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        exchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return exchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            String str = (String) this.L$1;
            this.this$0.applyMutation(new ExchangeDuxo3(null));
            CryptoTransfersStore cryptoTransfersStore = this.this$0.cryptoTransfersStore;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = cryptoTransfersStore.getVasps(str, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 2;
    }
}
