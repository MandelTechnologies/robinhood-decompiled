package com.robinhood.android.crypto.costbasis.hub;

import com.robinhood.models.crypto.p315ui.transfer.UiCostBasisDetails;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoCostBasisHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$refreshConfirmedSection$1$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$refreshConfirmedSection$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoCostBasisHubDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoCostBasisHubDataState $dataState;
    int label;
    final /* synthetic */ CryptoCostBasisHubDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCostBasisHubDuxo4(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, Continuation<? super CryptoCostBasisHubDuxo4> continuation) {
        super(2, continuation);
        this.$dataState = cryptoCostBasisHubDataState;
        this.this$0 = cryptoCostBasisHubDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoCostBasisHubDuxo4(this.$dataState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoCostBasisHubDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ImmutableList<UiCostBasisDetails> details$feature_crypto_cost_basis_externalDebug = this.$dataState.getSectionConfirmed().getDetails$feature_crypto_cost_basis_externalDebug();
        this.this$0.load(CryptoCostBasisHubSection.CONFIRMED, RangesKt.coerceAtLeast(Math.min(details$feature_crypto_cost_basis_externalDebug != null ? details$feature_crypto_cost_basis_externalDebug.size() : 5, 50), 5), true);
        return Unit.INSTANCE;
    }
}
