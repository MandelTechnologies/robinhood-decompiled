package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$1$1", m3645f = "CryptoTransferSendAmountComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$1$1 */
/* loaded from: classes6.dex */
final class C38296x9971ffc3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoTransferSendAmountDuxo $duxo;
    final /* synthetic */ SnapshotState4<CryptoTransferSendAmountViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C38296x9971ffc3(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, SnapshotState4<CryptoTransferSendAmountViewState> snapshotState4, Continuation<? super C38296x9971ffc3> continuation) {
        super(2, continuation);
        this.$duxo = cryptoTransferSendAmountDuxo;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C38296x9971ffc3(this.$duxo, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C38296x9971ffc3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$0(this.$viewState$delegate).getOverTransferLimit()) {
                this.label = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.resetAmountOverLimitErrorState();
        return Unit.INSTANCE;
    }
}
