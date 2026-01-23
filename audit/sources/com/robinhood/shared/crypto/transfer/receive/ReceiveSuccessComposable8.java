package com.robinhood.shared.crypto.transfer.receive;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReceiveSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$ReceiveSuccessComposable$4$1", m3645f = "ReceiveSuccessComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$ReceiveSuccessComposable$4$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ReceiveSuccessComposable8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<CryptoTransferConfig.TransferWarnings.Stage.Warning> $initialWarningSheet$delegate;
    final /* synthetic */ CryptoTransferReceiveViewState.Success $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReceiveSuccessComposable8(CryptoTransferReceiveViewState.Success success, SnapshotState<CryptoTransferConfig.TransferWarnings.Stage.Warning> snapshotState, Continuation<? super ReceiveSuccessComposable8> continuation) {
        super(2, continuation);
        this.$state = success;
        this.$initialWarningSheet$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReceiveSuccessComposable8(this.$state, this.$initialWarningSheet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReceiveSuccessComposable8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet = this.$state.getInitialWarningSheet();
        if (initialWarningSheet != null) {
            this.$initialWarningSheet$delegate.setValue(initialWarningSheet);
        }
        return Unit.INSTANCE;
    }
}
