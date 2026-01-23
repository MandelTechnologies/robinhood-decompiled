package com.robinhood.android.event.detail.p129ui.dialog;

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

/* compiled from: EventTradeOverlayDialog.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeOverlayDialog$1$1", m3645f = "EventTradeOverlayDialog.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeOverlayDialog$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventTradeOverlayDialog6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventTradeOverlayDialog6(SnapshotState<Boolean> snapshotState, Continuation<? super EventTradeOverlayDialog6> continuation) {
        super(2, continuation);
        this.$isVisible$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventTradeOverlayDialog6(this.$isVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EventTradeOverlayDialog6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventTradeOverlayDialog4.EventTradeOverlayDialog$lambda$14(this.$isVisible$delegate, true);
        return Unit.INSTANCE;
    }
}
