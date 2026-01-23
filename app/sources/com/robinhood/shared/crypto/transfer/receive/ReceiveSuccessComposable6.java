package com.robinhood.shared.crypto.transfer.receive;

import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ReceiveSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$Content$5$1", m3645f = "ReceiveSuccessComposable.kt", m3646l = {224}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$Content$5$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ReceiveSuccessComposable6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $bitmapSize;
    final /* synthetic */ SnapshotState<ImageBitmap> $qrCodeBitmap$delegate;
    final /* synthetic */ CryptoTransferReceiveViewState.Success $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReceiveSuccessComposable6(CryptoTransferReceiveViewState.Success success, int i, SnapshotState<ImageBitmap> snapshotState, Continuation<? super ReceiveSuccessComposable6> continuation) {
        super(2, continuation);
        this.$state = success;
        this.$bitmapSize = i;
        this.$qrCodeBitmap$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReceiveSuccessComposable6(this.$state, this.$bitmapSize, this.$qrCodeBitmap$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReceiveSuccessComposable6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SnapshotState<ImageBitmap> snapshotState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SnapshotState<ImageBitmap> snapshotState2 = this.$qrCodeBitmap$delegate;
            String address = this.$state.getAddress();
            int i2 = this.$bitmapSize;
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            this.L$0 = snapshotState2;
            this.label = 1;
            Object qrCodeBitmap = ReceiveSuccessComposable4.getQrCodeBitmap(address, i2, i2, coroutineDispatcher, this);
            if (qrCodeBitmap == coroutine_suspended) {
                return coroutine_suspended;
            }
            snapshotState = snapshotState2;
            obj = qrCodeBitmap;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            snapshotState = (SnapshotState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        snapshotState.setValue((ImageBitmap) obj);
        return Unit.INSTANCE;
    }
}
