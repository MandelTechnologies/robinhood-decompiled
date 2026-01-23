package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$16$1", m3645f = "CryptoTransferSendAmountComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$16$1 */
/* loaded from: classes6.dex */
final class C38298x94ce3acd extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoTransferSendAmountFragment.Callbacks $callbacks;
    final /* synthetic */ CryptoTransferSendAmountDuxo $duxo;
    final /* synthetic */ SnapshotState4<CryptoTransferSendAmountViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C38298x94ce3acd(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoTransferSendAmountFragment.Callbacks callbacks, SnapshotState4<CryptoTransferSendAmountViewState> snapshotState4, Continuation<? super C38298x94ce3acd> continuation) {
        super(2, continuation);
        this.$duxo = cryptoTransferSendAmountDuxo;
        this.$callbacks = callbacks;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C38298x94ce3acd(this.$duxo, this.$callbacks, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C38298x94ce3acd) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$duxo.saveAmountState(CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$0(this.$viewState$delegate).getAmountState$feature_crypto_transfer_externalDebug());
            this.$callbacks.saveLastEnteredAmount(CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$0(this.$viewState$delegate).getAmountState$feature_crypto_transfer_externalDebug());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
