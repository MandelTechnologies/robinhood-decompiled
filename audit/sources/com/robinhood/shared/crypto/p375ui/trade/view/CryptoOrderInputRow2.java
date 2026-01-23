package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.runtime.SnapshotState;
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

/* compiled from: CryptoOrderInputRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRow$1$1", m3645f = "CryptoOrderInputRow.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRow$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoOrderInputRow2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isCursorVisible$delegate;
    final /* synthetic */ CryptoOrderInputRowState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderInputRow2(CryptoOrderInputRowState cryptoOrderInputRowState, SnapshotState<Boolean> snapshotState, Continuation<? super CryptoOrderInputRow2> continuation) {
        super(2, continuation);
        this.$state = cryptoOrderInputRowState;
        this.$isCursorVisible$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoOrderInputRow2(this.$state, this.$isCursorVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoOrderInputRow2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$state.isFocused()) {
                CryptoOrderInputRow.CryptoOrderInputRow$lambda$2(this.$isCursorVisible$delegate, false);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        do {
            CryptoOrderInputRow.CryptoOrderInputRow$lambda$2(this.$isCursorVisible$delegate, !CryptoOrderInputRow.CryptoOrderInputRow$lambda$1(r6));
            this.label = 1;
        } while (DelayKt.delay(500L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
