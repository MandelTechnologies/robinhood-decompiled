package com.robinhood.shared.crypto.staking.staking.input;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStakingInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onNumpadKeyPress$1$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onNumpadKeyPress$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoStakingInputDuxo2 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
    final /* synthetic */ CryptoStakingInputDataState $keyEventMutation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoStakingInputDuxo2(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDuxo2> continuation) {
        super(2, continuation);
        this.$keyEventMutation = cryptoStakingInputDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoStakingInputDuxo2(this.$keyEventMutation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
        return ((CryptoStakingInputDuxo2) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.$keyEventMutation;
    }
}
